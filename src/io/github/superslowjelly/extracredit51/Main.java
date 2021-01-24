package io.github.superslowjelly.extracredit51;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Enter your choice here.
        Hand.Choice playerChoice = Hand.Choice.PAPER;

        // Pick random choice for computer.
        Hand.Choice[] choices = Hand.Choice.values();
        Hand.Choice computerChoice = choices[new Random().nextInt(choices.length)];

        // Build output of choices.
        StringBuilder output = new StringBuilder();
        output.append("Your Choice: ").append(playerChoice)
                .append("\nComputer's Choice: ").append(computerChoice)
                .append("\nYou ");

        // Calculate result and append it to output.
        switch (Hand.compareChoices(playerChoice, computerChoice)) {
            case WIN:
                output.append("won!");
                break;
            case TIE:
                output.append("tied!");
                break;
            case LOSE:
                output.append("lost!");
                break;
            default:
                output.append("errored! ...wait, what?");
                break;
        }

        // Output.
        System.out.print(output);

    }

}
