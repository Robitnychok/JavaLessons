package lesson9_Inheritance.practice_constants;

public class Country {
    private long peoplePeoples;
    private String language;
    private String continent;

    public Country(long peoplePeoples, String language, String continent) {
        this.peoplePeoples = peoplePeoples;
        this.language = language;
        this.continent = continent;
    }

    public long getPeoplePeoples() {
        return peoplePeoples;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }
}
