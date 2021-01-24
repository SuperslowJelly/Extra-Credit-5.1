package io.github.superslowjelly.extracredit51;

public class Hand {

    public enum Choice {
        ROCK,
        PAPER,
        SCISSORS
    }

    public enum Result {
        WIN,
        LOSE,
        TIE
    }

    public static Result compareChoices(Choice playerChoice, Choice computerChoice) {

        switch (playerChoice) {
            case ROCK:
                switch (computerChoice) {
                    case ROCK:
                        return Result.TIE;
                    case PAPER:
                        return Result.LOSE;
                    case SCISSORS:
                        return Result.WIN;
                }
            case PAPER:
                switch (computerChoice) {
                    case ROCK:
                        return Result.WIN;
                    case PAPER:
                        return Result.TIE;
                    case SCISSORS:
                        return Result.LOSE;
                }
            case SCISSORS:
                switch (computerChoice) {
                    case ROCK:
                        return Result.LOSE;
                    case PAPER:
                        return Result.WIN;
                    case SCISSORS:
                        return Result.TIE;
                }
            default:
                return Result.valueOf(null); // Should never happen!
        }

    }

}
