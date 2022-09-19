class ReverseString {

    String reverse(String inputString) {

        char[] charArray = inputString.toCharArray();
        int index = charArray.length;
        StringBuilder s = new StringBuilder();

        for (int i = index; i > 0 ; i--) {
            s.append(charArray[i - 1]);
        }
        return s.toString();
    }
}
