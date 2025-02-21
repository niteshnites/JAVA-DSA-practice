package interview_prep;

public class Question3_EqualsVsDoubleEquals {
    public static void main(String[] args) {
        // Using == and .equals() with Strings
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println("== with Strings: " + (str1 == str2)); // false (different objects)
        System.out.println("equals() with Strings: " + str1.equals(str2)); // true (same content)
        System.out.println("== with String literals: " + (str3 == str4)); // true (same reference in string pool)

        // Using == and .equals() with Integers
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        Integer num3 = 10;
        Integer num4 = 10;

        System.out.println("== with Integers: " + (num1 == num2)); // false (different objects)
        System.out.println("equals() with Integers: " + num1.equals(num2)); // true (same value)
        System.out.println("== with Integer literals: " + (num3 == num4)); // true (cached values between -128 and 127)

        // Custom class comparison
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);

        System.out.println("== with Custom Objects: " + (p1 == p2)); // false (different objects)
        System.out.println("equals() with Custom Objects: " + p1.equals(p2)); // true (if equals() is overridden)
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}
