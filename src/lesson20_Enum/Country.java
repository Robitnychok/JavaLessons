package lesson20_Enum;

public enum Country {
    GREECE ( "Greece", 20_000_000, "greece"),
    JAPAN( "Japan", 50_000_000, "japanese"),
    ARGENTINA ("Arg", 500_000_000, "spanish");

    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleCount=" + peopleCount +
                ", language='" + language + '\'' +
                '}';
    }

    private String name;
    private long peopleCount;
    private String language;

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }


}
