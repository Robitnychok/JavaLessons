package lesson24_Record;

import java.util.Objects;

public class Human {

    private final int yearOfBirth;
    private final String name;
    private final String surname;

    public Human(int yearOfBirth, String name, String surname) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, surname);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
