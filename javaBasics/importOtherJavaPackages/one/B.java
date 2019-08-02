package one;

public class B {

    public void m1() {
        A a = new A();
        a.m1(); // Class B.A

        one.A a2 = new one.A();
        a2.m1(); // Class B.A
    }
}

// Compile error
// class A {

//     public void m1() {
//         System.out.println("Class B.A");
//     }
// }
