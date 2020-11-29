
/**
 * Program class which initialises StockApp
 *
 * @author Haroon Sadiq
 * @version 0.1
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
