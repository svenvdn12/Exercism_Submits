class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = identifier.toCharArray();

        for (int i = 0; i <chars.length ; i++) {

            if (Character.isISOControl(chars[i])) {
                stringBuilder.append("CTRL");
            }
            else if (Character.isWhitespace(chars[i])) {
                stringBuilder.append('_');
            }
            else if (chars[i] == '-') {
                i++;
                if (Character.isAlphabetic(chars[i])){
                    stringBuilder.append(Character.toUpperCase(chars[i]));
                }
            }
            else if ( (int) chars[i] > 880 && (int) chars[i] < 1023) {
                if (Character.isUpperCase(chars[i])){
                    stringBuilder.append(chars[i]);
                }
            }
            else if(Character.isAlphabetic(chars[i])) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}





