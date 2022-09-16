public class Twofer {


    public static final String forMe = ", one for me.";
    public static final String forOther = "One for ";


    public String twofer(String name) {


        if (name == null){

            return forOther+"you"+forMe;

        }else
        return forOther+name+forMe;

    }
}
