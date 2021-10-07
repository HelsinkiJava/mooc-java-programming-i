
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public boolean equals(Object compared){
        Book book = (Book) compared;
        if(this == compared){
            return true;
        }else if(!(compared instanceof Book)){
            return false;
        }else{
            return this.name.equals(book.name) && this.publicationYear == book.publicationYear;
        }
    }

}
