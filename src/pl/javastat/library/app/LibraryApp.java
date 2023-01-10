package pl.javastat.library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Bibliotek v.0.9";
        System.out.println(appName);

        LibraryControl libControl = new LibraryControl();
        libControl.centralLoop();
    }
}
