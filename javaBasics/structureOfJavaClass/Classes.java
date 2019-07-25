class Simple {}

class A {
    String A; // Instance variable with the same name of the class

    A() {
        System.out.println("This is constructor.");

    }

    void A() {
        System.out.println("Mthod with the same name of the constructor");
    }
}

class Class {
    public void m1() {
        System.out.println("This run and compile.");
    }
}

public class Classes {
    public static void main(String[] args) {
        A a = new A();
        a.A();

        Class clazz = new Class();
        // Class class = new Class(); Compile error
        clazz.m1();
    }
}
