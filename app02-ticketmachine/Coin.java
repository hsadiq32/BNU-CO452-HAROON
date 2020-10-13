
/**
 * Enumeration class Coin - write a description of the enum class here
 *
 * @author Harooon Sadiq
 * @version 11/10/2020
 */
    public enum Coin
    {   
        // The set coins which will be used by the ticket machine
        P10 (10),
        P20 (20),
        P100 (100),
        P200 (200);

        private final int value;

        /**
         * The constructor method
         */
        private Coin(int value)
        {
            this.value = value;
        }

        /**
         * Fetches the value of the coin
         */
        public int getValue()
        {
            return value;
        }
     }
