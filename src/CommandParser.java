import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommandParser
{
        private Scanner scanner;

        public CommandParser(String file)
        {
                try
                {
                        scanner = new Scanner(new File(file));
                }
                catch (FileNotFoundException e)
                {
                        e.printStackTrace();
                } // Create our new scanner
        }

        public void parse()
        {
                while (scanner.hasNext())
                {// While the scanner has information to read
                        String cmd = scanner.next();// Read the next term
                        System.out.println(cmd);
                }
        }
}
