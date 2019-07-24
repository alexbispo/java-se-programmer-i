class Cat {
    static int id = 15;
}

public class StaticVariables {
    public static void main(String[] args) {
        Cat c = new Cat();

        // instance reference access
        System.out.println(c.id);

        // class reference access
        System.out.println(Cat.id);
    }
}
