class VariablesWithSameName {
    static int a = 2;
    // int a; Compile error
    // int a; Compile error

    String b = "Bispo";

    public void m1(){
        int b;
        // int b = 1; Compile errror
    }

    public void m2(String b) {
        // String b = "Alex"; Compile error
        this.b = b;
    }

    public void m3(int a) {
        VariablesWithSameName.a = a;
    }

    public void m4() {
        int a = 5;
        String b = "Oliveira";

        System.out.println(a); // 5
        System.out.println(b); // Oliveira

        System.out.println(VariablesWithSameName.a); // 2
        System.out.println(this.b); // Bispo
    }

    public static void main(String[] args) {
        VariablesWithSameName vsn = new VariablesWithSameName();
        vsn.m4();
    }
}
