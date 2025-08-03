public final class Style {

    // Prevent instantiation
    private Style() {}

    // --- Reset ---
    public static final String RESET = "\u001B[0m";

    // --- Basic Text Colors ---
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // --- Background Colors ---
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    // --- Text Styles ---
    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";

    // --- Semantic Presets (like Bootstrap) ---
    public static final String SUCCESS = GREEN + BOLD;
    public static final String INFO = BLUE + BOLD;
    public static final String WARNING = YELLOW + BOLD;
    public static final String DANGER = RED + BOLD;

    public static final String BG_SUCCESS = BG_GREEN + BLACK;
    public static final String BG_INFO = BG_BLUE + WHITE;
    public static final String BG_WARNING = BG_YELLOW + BLACK;
    public static final String BG_DANGER = BG_RED + WHITE;

}
