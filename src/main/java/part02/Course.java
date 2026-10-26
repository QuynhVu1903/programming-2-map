package part02;

/**
 * This class represents a course in a university.
 *
 * The class is implemented as a Record, which is a new feature in Java 16.
 * The Record is a compact class that is used to declare classes that are used
 * mainly for storing data.
 *
 * You don't need to understand the details of the Record class, it's enough
 * that you know that it's a class that has two fields (code and name) and
 * that it has a constructor that takes two parameters (code and name).
 *
 * The code and name can be accessed using the automatically generated
 * code() and name() methods. The Record class also has automatically generated
 * toString(), equals() and hashCode() methods.
 *
 * See more at https://dev.java/learn/records/
 */
public record Course(String code, String name) {
    /*
     * You don't need to modify this class in the exercises. Just use the code() and
     * name() methods to access the code and name of the course:
     *
     * Course c = new Course("SOF001AS3A", "Ohjelmointi 2");
     * String code = c.code();
     * String name = c.name();
     */
}
