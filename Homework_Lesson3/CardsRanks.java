package Homework_Lesson3;

public enum CardsRanks {

    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Валет"),
    QEEN("Королева"),
    KING("Король"),
    ACE("Туз");
    private String value;

    CardsRanks(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
