package java_8;

/*
The Nashorn JavaScript engine was deprecated in Java 11 and removed in Java 15
Java 8 Introduced a new JavaScript engine called Nashorn, which replaced the older Rhino engine.
It allows Java code to execute JavaScript code.
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornExample {
    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        String script = "var greeting = 'Hello from JavaScript'; greeting";
        System.out.println(engine.eval(script));  // Output: Hello from JavaScript
    }
}

