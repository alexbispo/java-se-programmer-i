package br.alexbispo.certification;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class App {
    public static void main(String ...args) {
        // java -cp classes;lib\commons-lang3-3.9.jar br.alexbispo.certification.App

        String out = "...";

        if (args.length > 0) out = args[0];

        System.out.println(isEmpty(out));
        System.out.println(out);
    }
}
