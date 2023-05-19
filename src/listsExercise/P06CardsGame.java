package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deckOne = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            Integer parseInt = Integer.parseInt(s);
            deckOne.add(parseInt);
        }
        List<Integer> deckTwo = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            Integer parseInt = Integer.parseInt(s);
            deckTwo.add(parseInt);
        }
        boolean isDeckOneEmpty = deckOne.size() == 0;
        boolean isDeckTwoEmpty = deckTwo.size() == 0;

        while (!isDeckOneEmpty && !isDeckTwoEmpty) {
            int counter = Math.min(deckOne.size(), deckTwo.size());
            for (int i = 0; i < counter; i++) {
                int currentCardFirstPlayer = deckOne.get(i);
                int currentCardSecondPlayer = deckTwo.get(i);
                if (currentCardFirstPlayer > currentCardSecondPlayer) {
                    deckManipulator(deckOne, currentCardSecondPlayer);
                    deckTwo.remove(i);
                    i = -1;
                    counter--;
                } else if (currentCardSecondPlayer > currentCardFirstPlayer) {
                    deckManipulator(deckTwo, currentCardFirstPlayer);
                    deckOne.remove(i);
                    i = -1;
                    counter--;
                } else {
                    deckOne.remove(i);
                    deckTwo.remove(i);
                    i = -1;
                    counter--;
                }
            }
            isDeckOneEmpty = deckOne.size() == 0;
            isDeckTwoEmpty = deckTwo.size() == 0;
        }
        if (!deckOne.isEmpty()) {
            System.out.printf("First player wins! Sum: %d", getSumOfList(deckOne));
        } else {
            System.out.printf("Second player wins! Sum: %d", getSumOfList(deckTwo));
        }
    }

    public static void deckManipulator(List<Integer> deck, int cardTaken) {
        int firstCard = deck.get(0);
        deck.remove(0);
        deck.add(firstCard);
        deck.add(cardTaken);
    }

    public static int getSumOfList(List<Integer> deck) {
        int sum = 0;
        for (int i = 0; i < deck.size(); i++) {
            sum += deck.get(i);
        }
        return sum;
    }
}