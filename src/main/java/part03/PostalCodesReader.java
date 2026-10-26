package part03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * This class reads the postal codes from a JSON file and returns them as a
 * Map. In the map, postal code are keys and names are values.
 */
public class PostalCodesReader {

    // The path to the JSON file containing the postal codes.
    private static final Path jsonFilePath = Path.of("data", "postcode_map_light.json");

    /**
     * Reads the postal codes from the JSON file and returns them as a Map from
     * postal code to postal district name.
     *
     * @return the postal codes {74701=KIURUVESI, 35540=JUUPAJOKI ... 99999=KUUSAMO}
     */
    public static Map<String, String> readPostalCodes() {
        // See https://github.com/google/gson/blob/main/UserGuide.md#maps-examples
        Gson gson = new Gson();
        TypeToken<Map<String, String>> mapType = new TypeToken<Map<String, String>>() {
        };

        try {
            BufferedReader reader = Files.newBufferedReader(jsonFilePath, StandardCharsets.UTF_8);
            return gson.fromJson(reader, mapType);

        } catch (IOException e) {
            // If there's an exception reading the file, we can't continue.
            throw new RuntimeException(e);
        }
    }
}
