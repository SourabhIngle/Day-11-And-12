package com.day11_12;
import java.util.Random;

public class DeckOfCards {
    static final int NUM_CARDS = 52;
    static final int NUM_PLAYERS = 4;
    static final int NUM_CARDS_PER_PLAYER = 9;

    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

    static String[] deck = new String[NUM_CARDS];

    public static void main(String[] args) {
        initializeDeck();
        shuffleDeck();
        String[][] players = distributeCards();
        printCards(players);
    }

    static void initializeDeck() {
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
    }

    static void shuffleDeck() {
        Random rd = new Random();
        for (int i = 0; i < NUM_CARDS; i++) {
            int shuffleIndex = rd.nextInt(NUM_CARDS);
            String temp = deck[i];
            deck[i] = deck[shuffleIndex];
            deck[shuffleIndex] = temp;
        }
    }

    static String[][] distributeCards() {
        String[][] players = new String[NUM_PLAYERS][NUM_CARDS_PER_PLAYER];
        int deckIndex = 0;
        for (int i = 0; i < NUM_PLAYERS; i++) {
            for (int j = 0; j < NUM_CARDS_PER_PLAYER; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }

    static void printCards(String[][] players) {
        for (int i = 0; i < NUM_PLAYERS; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < NUM_CARDS_PER_PLAYER; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
