package student; // the "package", in java folder structure maters and creates packages.


/**
 * This class is a place holder which you will fully implement based on the javadoc.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {

    /** int value of locality. */
    private int localityID;

    /** name of the locality. */
    private String localityName;

    /** greeting using ascii characters. */
    private String asciiGreeting;

    /** greeting using unicode characters. */
    private String unicodeGreeting;

    /** format string for the greeting. */
    private String formatStr;

    /** default greeting in English. */
    private static String defaultGreeting = "Hello";

    /** default format string for the greeting. */
    private static String defaultFormat = "%s, %%s!";


    /**
     * Default greeting that creates "Hello, {name}!".
     *
     * @param localityID id of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, defaultGreeting, defaultGreeting, defaultFormat);
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters assuming the
     * language is already using ascii letters only.
     * It also assumes the format of the greeting to be "{greeting}, {name}!"
     *
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param greeting greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, defaultFormat);
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters.
     * It makes no assumptions and everything needs to be provided.
     *
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param asciiGreeting greeting using ascii characters
     * @param unicodeGreeting greeting using unicode characters
     * @param formatStr format string for the greeting
     */
    public Greeting(
            int localityID,
            String localityName,
            String asciiGreeting,
            String unicodeGreeting,
            String formatStr
    ) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality id number.
     *
     * @return the locality id number */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Returns the locality name.
     *
     * @return the locality id number */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     *
     * @return the ascii greeting */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Returns the unicode greeting. Just the greeting, no formatting.
     *
     * @return the unicode greeting */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the unicode format string.
     * This string will have a %s,
     * so that the name can be inserted into the greeting in the correct location.
     * @param withFormat if true, only ascii characters will be used.
     *
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean withFormat) {
        if (withFormat) {
            return String.format(this.formatStr, this.asciiGreeting);
        }
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Gets the unicode format string.
     * This string will have a %s,
     * so that the name can be inserted into the greeting in the correct location.
     *
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return getFormatStr(false);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes.
     *
     * @return the full greeting details as a string
     */
    public String toString() {
        return String.format(
                "{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID,
                localityName,
                asciiGreeting,
                unicodeGreeting
        );
    }

}
