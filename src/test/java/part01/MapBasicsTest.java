package part01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapBasicsTest {

    private static final Map<String, String> ips = Map.of(
            "home", "127.0.0.1",
            "google", "8.8.8.8",
            "cloudflare", "1.1.1.1");

    private static final Map<String, String> hexColors = Map.of(
            "red", "#ff0000",
            "green", "#00ff00",
            "blue", "#0000ff",
            "pink", "#ff00ff",
            "yellow", "#ffff00");

    // The class under test:
    private MapBasics mapBasics = new MapBasics();

    @Test
    void testCreateMap() {
        Map<String, String> map = mapBasics.createMap();

        assertTrue(map != null, "The returned map should not be null.");
        assertTrue(map instanceof Map, "The returned map should be an instance of Map.");
    }

    @Test
    void testAddEntry() {
        Map<String, String> map = new HashMap<>();

        mapBasics.addEntry(map, "hello", "world");
        mapBasics.addEntry(map, "terve", "maailma");

        assertEquals(2, map.size(), "The map should have two entries.");
        assertEquals("world", map.get("hello"), "The map should have an entry with key 'hello' and value 'world'.");
    }

    @Test
    void testGetPopulations() {
        Map<String, Integer> populations = mapBasics.getPopulations();

        assertEquals(5, populations.size(), "The map should have five entries.");
        assertEquals(5_894_687, populations.get("Denmark"), "The population of Denmark should be 5894687.");
        assertEquals(5_587_442, populations.get("Finland"), "The population of Finland should be 5587442.");
        assertEquals(354_234, populations.get("Iceland"), "The population of Iceland should be 354234.");
        assertEquals(5_509_591, populations.get("Norway"), "The population of Norway should be 5509591.");
        assertEquals(10_261_767, populations.get("Sweden"), "The population of Sweden should be 10261767.");
    }

    @Test
    void testGetValue() {
        assertEquals("127.0.0.1", mapBasics.getValue(ips, "home"));
        assertEquals("8.8.8.8", mapBasics.getValue(ips, "google"));
        assertEquals("1.1.1.1", mapBasics.getValue(ips, "cloudflare"));
        assertEquals(null, mapBasics.getValue(ips, "unknown"));
    }

    @Test
    void testHasKey() {
        assertTrue(mapBasics.hasKey(ips, "home"));
        assertFalse(mapBasics.hasKey(ips, "unknown"));
    }

    @Test
    void testHasValue() {

        assertTrue(mapBasics.hasValue(hexColors, "#ff0000"));
        assertFalse(mapBasics.hasKey(hexColors, "#000000"));
    }

    @Test
    void testAddIfNotPresent() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");

        mapBasics.addIfNotPresent(map, "hello", "THIS SHOULD NOT BE ADDED");
        mapBasics.addIfNotPresent(map, "terve", "maailma");

        assertEquals(2, map.size(), "The map should have two entries.");
        assertEquals("world", map.get("hello"), "should have an entry with key 'hello' and original value 'world'.");
        assertEquals("maailma", map.get("terve"), "should have an entry with key 'terve' and value 'maailma'.");
    }

    @Test
    void testRemoveEntry() {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Finland", "Helsinki");
        capitals.put("Sweden", "Stockholm");
        capitals.put("Norway", "Oslo");

        mapBasics.removeEntry(capitals, "Sweden");

        assertFalse(capitals.containsKey("Sweden"));
        assertEquals(2, capitals.size());
    }

    @Test
    void testCountEntries() {
        assertEquals(3, mapBasics.countEntries(ips));
    }

    @Test
    void testIsEmpty() {
        assertTrue(mapBasics.isEmpty(Collections.emptyMap()));
        assertFalse(mapBasics.isEmpty(hexColors));

    }

    @Test
    void testLargestValue() {
        Map<String, Integer> numbers = Map.of(
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4);
        assertEquals(4, mapBasics.largestValue(numbers));
    }

    @Test
    void testSumOfValues() {
        Map<String, Integer> numbers = Map.of(
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4);
        assertEquals(10, mapBasics.sumOfValues(numbers));
    }

    @Test
    void testCombineMaps() {
        Map<String, String> capitals1 = Map.of(
                "Finland", "Helsinki",
                "Sweden", "Stockholm",
                "Norway", "Oslo");
        Map<String, String> capitals2 = Map.of(
                "Finland", "TURKU", // this should not override the value from the first map
                "Denmark", "Copenhagen",
                "Iceland", "Reykjavik");

        Map<String, String> combined = mapBasics.combineMaps(capitals1, capitals2);

        assertEquals(5, combined.size());
        assertEquals("Helsinki", combined.get("Finland"), "should use the value from the first map");
    }

    @Test
    void testIncrementValues() {
        Map<String, Integer> numbers = new HashMap<>(Map.of(
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4));

        mapBasics.incrementValues(numbers, 100);

        assertEquals(101, numbers.get("one"));
        assertEquals(102, numbers.get("two"));
        assertEquals(103, numbers.get("three"));
    }

}
