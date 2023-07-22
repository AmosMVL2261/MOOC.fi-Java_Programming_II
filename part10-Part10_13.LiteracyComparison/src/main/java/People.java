public class People implements Comparable<People> {
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public People(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent(){
        return this.literacyPercent;
    }

    @Override
    public int compareTo(People o) {
        int lit = (int) (this.literacyPercent * 100000);
        int litP = (int) (o.getLiteracyPercent()*100000);
        
        return lit - litP;
    }

    public String toString(){
        String genre;
        if(this.gender.contains("female")){
            genre="female";
        }else{
            genre="male";
        }
        
        return this.country+" ("+this.year+"), "+genre+", "+this.literacyPercent;
    }
}
