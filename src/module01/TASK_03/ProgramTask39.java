package module01.TASK_03;

public class ProgramTask39 {
    public static void main(String[] args) {
        /*
        Primitive data types are stored directly on the stack.
        Reference data types are stored on the heap,
        and references to the data themselves (class objects) are stored on the stack.

        In general, the heap memory used by a Wrapper classes for primitive data types (objects) in Hotspot consists of:
         - an object header, consisting of a few bytes of "housekeeping" information;
         - memory for primitive data type, according to their size (int n -> 32 bits);
         - memory for reference field (4 bytes);
         - padding: potentially a few "wasted" unused bytes after the object data,
           to make every object start at an address that is a convenient multiple of bytes
           and reduce the number of bits required to represent a pointer to an object;

        When using a wrapper class over primitive types, you can use the methods implemented by these classes.
         */
        Double d = 47.77;
        System.out.println(d.hashCode()); // Prints hashcode for variable d.

    }
}
