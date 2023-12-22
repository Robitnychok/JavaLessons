package lesson20_Enum;

public class CountryOLD {
    private String countryName;
    private long countryPopulation;
    private String countryLanguage;

    public CountryOLD(String countryName, long countryPopulation, String countryLanguage) {
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.countryLanguage = countryLanguage;
    }

    public String getCountryName() {
        return countryName;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }
}
