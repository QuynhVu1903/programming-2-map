package part02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapExpertsTest {

    private MapExperts mapExperts = new MapExperts();

    @Test
    void testCountLettersFromHello() {
        var counts = mapExperts.countLetters("hello");

        assertEquals(1, counts.get('h'));
        assertEquals(1, counts.get('e'));
        assertEquals(2, counts.get('l'));
        assertEquals(1, counts.get('o'));
    }

    @Test
    void testCountLettersFromLentokonesuihkuturbiinimoottoriapumekaanikkoaliupseerioppilas() {
        String word = "lentokonesuihkuturbiinimoottoriapumekaanikkoaliupseerioppilas";
        var counts = mapExperts.countLetters(word);

        assertEquals(5, counts.get('a'), "There should be 5 a's in the word " + word);
        assertEquals(1, counts.get('b'), "There should be 1 b in the word " + word);
        assertEquals(5, counts.get('e'), "There should be 5 e's in the word " + word);
    }

    @Test
    void testReverseMap() {
        Map<String, Integer> slogans = Map.of(
                "den glider in", 1995,
                "hard rock hallelujah", 2006,
                "cha cha cha", 2023,
                "maailmanmestaruus ja olympiakulta", 2022,
                "Löikö Mörkö sisään?", 2019,
                "torilla tavataan", 2011);

        Map<Integer, String> reversed = mapExperts.reverseMap(slogans);

        assertEquals("den glider in", reversed.get(1995));
        assertEquals("hard rock hallelujah", reversed.get(2006));
        assertEquals("torilla tavataan", reversed.get(2011));
        assertEquals("Löikö Mörkö sisään?", reversed.get(2019));
        assertEquals("maailmanmestaruus ja olympiakulta", reversed.get(2022));
        assertEquals("cha cha cha", reversed.get(2023));

    }

    @Test
    void testCreateMapFromList() {
        Course java = new Course("SOF001AS3A", "Ohjelmointi 2");
        Course python = new Course("SOF004AS2A", "Python-ohjelmointi");

        List<Course> courses = List.of(java, python);

        Map<String, Course> map = mapExperts.createMapFromList(courses);

        assertEquals(java, map.get("SOF001AS3A"));
        assertEquals(python, map.get("SOF004AS2A"));
    }

}
