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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Create our new scanner
	}
	public void parse(){
	         while(scanner.hasNext()){//While the scanner has information to read
	            String cmd = scanner.next();//Read the next term
	            double x; double y; double radius;
	            switch(cmd){
	               case "debug" :
	                  System.out.println("debug cmd activated");
	               break;
	               case "add" ://Found an add command
	                  x = scanner.nextDouble();
	                  y = scanner.nextDouble();
	                  String name = scanner.next();
	                  System.out.println("Insert node at "+x+" "+y+" with name "+name);
	               break;
	               case "delete" ://Found a delete command
	                  x = scanner.nextDouble();
	                  y = scanner.nextDouble();
	                  System.out.println("Remove node at "+x+" "+y);
	               break;
	               case "search" ://Found a search command
	                  x = scanner.nextDouble();
	                  y = scanner.nextDouble();
	                  radius = scanner.nextDouble();
	                  System.out.println("Search for node near "+x+" "+y+" within radius of "+radius);
	               break;
	               default ://Found an unrecognized command
	                  System.out.println("Unrecognized input "+cmd);
	               break;
	            }
	         }
	      }
}
