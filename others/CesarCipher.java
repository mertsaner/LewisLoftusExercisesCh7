import Prog1Tools.IOTools;

/**
 * Cesar Cipher decodes/encodes given sequence of characters by an offset
 *
 * @author Iman Modarressi
 */
public class CesarCipher {

    public static void main(String[] args) {

        int charArrayLength = IOTools.readInt("Gib die Anzahl der chars ein: ");
        char[] message = readChars(charArrayLength);
        while (getCommand() != 1) {
            int offset = IOTools.readInt("Um wieviele Stellen soll verschoben werden?");
            System.out.println("Dein aktuelles Char-Array:");
            printMessage(message);
            shift(offset, message);
            System.out.println("Dein veranedertes Char-Array:");
            printMessage(message);
        }
        System.out.println("Bye Bye");
    }

    /**
     * prints given char-array
     * @param cArray
     */
    static void printMessage(char[] cArray) {
        for (int i = 0; i < cArray.length; i++) {
            System.out.print(cArray[i]);
        }
        System.out.println();
    }

    /**
     * creates and fills array with characters from the console
     * @param arrayLength   length of array
     * @return              filled array
     */
    static char[] readChars(int arrayLength) {
        char[] arrayToReturn = new char[arrayLength];
        for (int i = 0; i < arrayToReturn.length; i++) {
            arrayToReturn[i] = IOTools.readChar("Geben sie char ein:");
        }
        return arrayToReturn;
    }

    /**
     * shifts every single element of char-array with a give offset
     * @param offset    offset, how many characters to...
     * @param cArray
     */
    static void shift(int offset, char[] cArray) {
        for (int i = 0; i < cArray.length; i++) {
            cArray[i] = (char) (cArray[i] + offset);
        }
    }

    /**
     * checks if input equals either "shift or "exit"
     * @return  0 (if shift), 1 (if exit)
     */
    static int getCommand() {
        while (true) {
            String command = IOTools.readString("Gib ein Command ein: ");
            if (command.equals("shift")) {
                return 0;
            } else if (command.equals("exit")) {
                return 1;
            }
        }
    }


}
