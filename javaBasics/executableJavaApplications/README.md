# Some notes about executable Java apps.

## Help
    $ java -help

    $ javac -help

    $ jar -help

## Compile
    $ javac -cp lib\commons-lang3-3.9.jar -d classes src\br\alexbispo\certification\*.java

## Run
    $ java -cp src;lib\commons-lang3-3.9.jar br.alexbispo.certification.App

## Generate a executable Jar
    $ jar cvfm app.jar Manifest.mf classes .

## Run a executable jar
    $ java -jar app.jar

    $ java -cp app.jar;lib\commons-lang3-3.9.jar br.alexbispo.certification.App
