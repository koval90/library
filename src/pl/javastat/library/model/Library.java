package pl.javastat.library.model;

public class Library{

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicatonNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public void addBook(Book book){
        if (publicatonNumber < MAX_PUBLICATIONS){
            publications[publicatonNumber] = book;
            publicatonNumber++;
        } else {
            System.out.println("Maksymalna ilość książek osiągnięta");
        }
    }

    public void printBooks(){
        int countBooks  = 0;
        for (int i = 0; i < publicatonNumber; i++){
            if (publications[i] instanceof Book){
                System.out.println(publications[i]);
                countBooks++;
            }
        }
        if (countBooks == 0){
            System.out.println("Brak książek w bibliotece");
        }
    }

    public void addMagazine(Magazine magazine){
        if (publicatonNumber < MAX_PUBLICATIONS){
            publications[publicatonNumber] = magazine;
            publicatonNumber++;
        } else {
            System.out.println("Maksymalna ilość magazynów osiągnięta");
        }
    }

    public void printMagazines(){
        int countMagazines = 0;
        for (int i = 0; i < publicatonNumber; i++){
            if (publications[i] instanceof Magazine){
                System.out.println(publications[i]);
                countMagazines++;
            }
        }
        if (countMagazines == 0){
            System.out.println("Brak magazynów w bibliotece");
        }
    }
}