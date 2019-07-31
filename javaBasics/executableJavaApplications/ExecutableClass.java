class main {
    // void main(String ...args) {} // invalid method main

    // static void main(String ...args) {} // invalid method main

    // protected static void main(String[] args) {} // invalid method main

    // private static void main(String[] args) {} // invalid method main

    // public static String main(String ...args) { return "Hello World!"; } // invalid method main

   public static void main(String args) { System.out.println("Hello " + args + "!"); } // invalid method main

    // public static void main(String[] args) {} // valid!

    // public static void main(String args[]) {} // valid!

   public static void main(String... argsNameDoesNotMatter) {
        String name = argsNameDoesNotMatter.length > 0 ? argsNameDoesNotMatter[0] : "World";

        System.out.println(argsNameDoesNotMatter[0]);
        main(name);
    }
}
