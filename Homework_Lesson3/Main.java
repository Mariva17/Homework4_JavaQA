package Homework_Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cardsForPlayer = 5;
        int players = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] suits = {CardsSuits.CLUBS.getValue(), CardsSuits.DIAMONDS.getValue(),CardsSuits.HEARTS.getValue(), CardsSuits.SPADES.getValue()};
        String[] rank = {CardsRanks.TWO.getValue(), CardsRanks.THREE.getValue(), CardsRanks.FOUR.getValue(), CardsRanks.FIVE.getValue(), CardsRanks.SIX.getValue(), CardsRanks.SEVEN.getValue(), CardsRanks.EIGHT.getValue(), CardsRanks.NINE.getValue(), CardsRanks.TEN.getValue(), CardsRanks.JACK.getValue(), CardsRanks.QEEN.getValue(), CardsRanks.KING.getValue(), CardsRanks.ACE.getValue()};

        int numberOfcards = rank.length * suits.length;
        int maxPlayers = numberOfcards / cardsForPlayer;

        do {
            System.out.println("Пожалуйста введите количество игроков, от 2 до " + maxPlayers);
            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }

        } while (players < 2 || players > maxPlayers);

        String[] cards = new String[numberOfcards];
        int index = 0;

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[index++] = rank[i] + " " + suits[j];
            }
        }
        for (int i = 0; i < cards.length; i++) {
            String currentCard = cards[i];
            int randomIndex = random.nextInt(numberOfcards);
            String randomCard = cards[randomIndex];
            cards[i] = randomCard;
            cards[randomIndex] = currentCard;

        }
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cards[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1) {
                System.out.println();
            }
        }



    }
}
