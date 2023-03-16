package Homework_Lesson3;

public enum CardsSuits {

    CLUBS("трефы"),
    DIAMONDS("бубны"),
    HEARTS("черви"),
    SPADES("пики");

    private String value;
    CardsSuits(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
