import java.util.ArrayList;

class RotationalCipher {

    private static final int _MIN_VALUE_LETTER_ = 97;
    private static final int _MAX_VALUE_LETTER_ = 122;
    private final int shift;
    private ArrayList<Integer> indexUppercase;

    public RotationalCipher(int shiftKey) {
        this.shift = shiftKey;
    }

    public String rotate(String data) {

        String s = shiftString(data);

        if (indexUppercase.isEmpty()){
            return s;
        }
        else {
            char[] chr = s.toCharArray();

            for (int i = 0; i <indexUppercase.size() ; i++) {

                chr[indexUppercase.get(i)] = Character.toUpperCase(chr[indexUppercase.get(i)]);
            }

            return String.copyValueOf(chr);
        }

    }





    private String shiftString(String data) {

        indexUppercase = new ArrayList<>();

        char[] chars = data.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (Character.isUpperCase(chars[i])){
                    indexUppercase.add(i);
            }
            int counter = (int) chars[i] + shift;

            if (Character.isAlphabetic(chars[i])) {
                if (counter > _MAX_VALUE_LETTER_) {
                    int remainder = counter - _MAX_VALUE_LETTER_; //1
                    int value = _MIN_VALUE_LETTER_ + remainder - 1; //98
                    chars[i] = (char) value;
                } else {
                    chars[i] = (char) ((int) chars[i] + shift);
                }
            }
        }

        return String.copyValueOf(chars);

    }
}