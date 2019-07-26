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

class B {

    B() { return; }

    // m1() {} Compile error.
    void m1() {}

    // String m1() {} Compile error because its signature already defined.

    void m1(int b) { System.out.println(b); }
}

class Class {
    public void m1() {
        System.out.println("This run and compile.");
    }
}

class c { void m1() { System.out.println("Hello from c."); } }

// class class {} Compile error.

// d {} Compile error

interface E {
    // int x; Compile error
    int x = 0;

    class F { public String toString() { return "From F"; } }

    // private void m10(); Compile error

    // protected void m10(); Compile error

    public void m9();

    void m10();

    // String m11() { return "F"; } Compile error

    default F m11() { return new F(); }
}

// class G implements E { } Compile error

class H implements E {
    // void m9() { } Compile error
    // void m10() {} Compile error

    public void m9() {}

    public void m10() {
        // x = 10; Compile error
        System.out.println("From H: " + x);
    }

    public F m12() { return new F(); }
}

// public interface i {} Compile error because must have only one public interface or class by file
// public class j {} Compile error because must have only one public interface or class by file

interface i {}

public class Classes {

    private final static class D {}

    public static void main(String[] args) {
        A a = new A();
        a.A();

        B b = new B();
        b.m1(2);

        Class clazz = new Class();
        // Class class = new Class(); Compile error
        clazz.m1();

        c c = new c();
        c.m1();

        H h = new H();
        h.m10();
        System.out.println(h.m11());
        System.out.println(h.m12());
        System.out.println(h.x);
        System.out.println(new H.F());
    }
}
