package two;

import one.B;

// import java.util.Date; Compile error
import java.sql.Date;
import java.util.*;
import java.lang.System; // Optional

class C {

    Date d1 = new Date(2019, 7, 1);
    java.util.Date d2 = new java.util.Date();
    Date d3 = new Date(2019, 7, 15);

    public static void main(String ...args) {
        // one.A a = new one.A(); Compile error
        // a.m1(); Compile error

        B b = new B();
        b.m1();

        C c = new C();
        System.out.println(c.d1.getClass().getName()); // java.sql.Date
        System.out.println(c.d2.getClass().getName()); // java.util.Date
        System.out.println(c.d3.getClass().getName()); // java.sql.Date

        // D d = new D(); Compile error
        // d.m1(); Compile error
    }
}
