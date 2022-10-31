import java.util.ArrayList;
import java.util.Random;

class Robot{

    private static ArrayList<String> knownNames;
    private String name;

    public Robot(){
        knownNames = new ArrayList<>();
        String s = generateRandomName();
        knownNames.add(s);
        this.name = s;
    }

    public void reset(){

        knownNames.remove(this.name);
        String s = generateRandomName();
        if (checkNameDoesntExists(s)) {
            knownNames.add(s);
            this.name = s;
        }
    }

    private boolean checkNameDoesntExists(String name){
        return !knownNames.contains(name);
    }

    private String generateRandomName(){
        Random r = new Random();
        char[] robotName = new char[5];

        for (int i = 0; i < robotName.length; i++) {

            if (i >= 2) {
                robotName[i] = (char) (48 + r.nextInt(10));
                continue;
            }

            robotName[i] = (char) (65 + r.nextInt(26));
        }

        return String.copyValueOf(robotName);
    }

    public String getName() {
        return name;
    }
}
