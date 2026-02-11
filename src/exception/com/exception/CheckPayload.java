package exception.com.exception;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class CheckPayload {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void validate(File file) {

        // Step 1: Check file extension
        if (!file.getName().endsWith(".json")) {
            throw new JSONException("File is not a JSON file");
        }

        // Step 2: Validate JSON structure
        try {
            mapper.readTree(file);
        } catch (Exception e) {
            throw new JSONException("Invalid JSON format", e);
        }
    }
}
