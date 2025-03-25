package parallel_execution;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertCsvFile {

    private static final List<String[]> csvData = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {

        // Example: populate csvData list (in your case, this is already filled elsewhere)
        csvData.add(new String[]{"mosaic srvice type", "unique key", "cmdb class", "mosaic attribue key", "itsm attrtibute key", "mocaic count", "itsm staging count", "itsm target table count updated on today", "count matched"});
        csvData.add(new String[]{"ServiceA", "UK123", "ClassA", "Attr1", "Attr2", "5", "10", "8", "8"});
        csvData.add(new String[]{"ServiceB", "UK456", "ClassB", "Attr3", "Attr4", "3", "7", "7", "6"});

        writeFilteredCSV("output_" + java.time.LocalDate.now() + ".csv");
    }

    private static void writeFilteredCSV(String outputCsv) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(outputCsv))) {
            for (int i = 0; i < csvData.size(); i++) {
                String[] row = csvData.get(i);

                // Make sure there are enough columns in the row
                if (row.length < 9) {
                    System.out.println("Skipping malformed row at line: " + (i + 1));
                    continue;
                }

                // Pick required columns only
                String[] filteredRow = new String[]{
                        row[0], // mosaic srvice type
                        row[1], // unique key
                        row[2], // cmdb class
                        row[6], // itsm staging count
                        row[7], // itsm target table count updated on today
                        row[8]  // count matched
                };
                writer.writeNext(filteredRow);
            }

            System.out.println("Filtered CSV written to: " + outputCsv);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
