public class Blackjack {

    public static final String STAND = "S";
    public static final String HIT = "H";
    public static final String SPLIT = "P";
    public static final String AUTOMATICALLYWIN = "W";

    public int parseCard(String card) {
        switch(card){

            case "ace":
            case "ACE":
                return 11;

            case "two":
            case "TWO":
                return 2;

            case "three":
            case "THREE":
                return 3;

            case "four":
            case "FOUR":
                return 4;

            case "five":
            case "FIVE":
                return 5;

            case "six":
            case "SIX":
                return 6;

            case "seven":
            case "SEVEN":
                return 7;

            case "eight":
            case "EIGHT":
                return 8;

            case "nine":
            case "NINE":
                return 9;

            case "TEN":
            case "ten":
            case "JACK":
            case "jack":
            case "QUEEN":
            case "queen":
            case "KING":
            case "king":
                return 10;

            default:
                return  0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if (!isBlackjack){
            return SPLIT;
        }
        else if (dealerScore < 10){
            return AUTOMATICALLYWIN;
        }
        else return STAND;

    }

    public String smallHand(int handScore, int dealerScore) {

        if (handScore >= 17){
            return STAND;
        }
        else if (handScore <= 11){
            return HIT;
        }
        else if (dealerScore >= 7){
            return HIT;
        }
        else
            return STAND;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
