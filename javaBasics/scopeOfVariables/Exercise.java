public class Exercise {
    static int x = 5;
    static int i = 3;

    public static void main(String[] x) {
        Exercise e = new Exercise();
        System.out.println("Ex 1 ==============================");
        e.e1();
        System.out.println("Ex 2 ==============================");
        e.e2();
        System.out.println("Ex 3 ==============================");
        e.e3();
        System.out.println("Ex 4 ==============================");
        // x = 200; Compile error
        System.out.println(x);
        System.out.println("Ex 5 ==============================");
        e.e5(); // Print from 10 to 99
    }

    public void e1() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        // System.out.println(i); Compile error
    }

    public void e2() {
        for (int i = 20; i < 40; i++)
            System.out.println(i);
            // System.out.println(i); Compile error
    }

    public void e3() {
        for (int i = 40; i < 60; i++) {
            System.out.println(i);
        }

        int i = 15;
        System.out.println(i);
    }

    public void e5() {
        for (new Exercise().i = 10; new Exercise().i < 100; new Exercise().i++)
            System.out.println(i);
    }
}
