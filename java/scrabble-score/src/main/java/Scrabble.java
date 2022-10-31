class Scrabble {

    private int score;
    char[] word;

    public Scrabble(String word){
        this.word = word.toUpperCase().toCharArray();
        setScore();
    }

    private void setScore(){

        int value = 0;

        for (char c : word) {

            switch (c) {

                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'R':
                case 'S':
                case 'T':
                    value ++;
                    break;

                case 'D':
                case 'G':
                    value += 2;
                    break;

                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    value += 3;
                    break;

                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    value += 4;
                    break;

                case 'K':
                    value += 5;
                    break;

                case 'J':
                case 'X':
                    value += 8;
                    break;

                case 'Q':
                case 'Z':
                    value += 10;
                    break;
            }
        }

        this.score = value;

    }

    int getScore() {
        return this.score;
    }

}
