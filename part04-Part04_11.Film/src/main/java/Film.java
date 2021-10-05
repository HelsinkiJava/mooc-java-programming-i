public class Film {
    private String name;
    private int ageRating;
    public Film(String fileName, int filmAgeRating){
        name = fileName;
        ageRating = filmAgeRating;
    }
    public String name(){
        return name;
    }
    public int ageRating(){
        return ageRating;
    }
}
