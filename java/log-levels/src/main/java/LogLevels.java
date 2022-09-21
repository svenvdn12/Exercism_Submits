public class LogLevels {

    private static String header;
    private static String trailer;

    public static String message(String logLine) {

        String[] message = logLine.split(":", 2);
        header = message[0].replaceAll("\\W", "");
        trailer = message[1].trim();

        return trailer;
    }

    public static String logLevel(String logLine) {

        message(logLine);
        header = header.toLowerCase();
        return header;

    }

    public static String reformat(String logLine) {
        logLevel(logLine);
        return trailer + " ("+header+")";

    }
}
