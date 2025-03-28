package json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectValidation {
    public static JsonNode getJsonNodeByPath(JsonNode root, String path) {
        String[] keys = path.split("\\.");
        JsonNode currentNode = root;

        for (String key : keys) {
            if (currentNode != null) {
                currentNode = currentNode.get(key);
            } else {
                return null;
            }
        }
        return currentNode;
    }

    public static void main(String[] args) throws Exception {
        String json = "{ \"jsonpayload\": { \"name\": \"John Doe\" } }";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        JsonNode result = getJsonNodeByPath(rootNode, "jsonpayload.name");
        System.out.println(result != null ? result.asText() : "Key not found");
    }
}

