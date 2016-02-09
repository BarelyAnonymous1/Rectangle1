// On my honor:
//
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
// anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.
// 
// Signed: Jonathan DeFreeuw on 01/28/2016
// Signed: Preston Lattimer on 02/01/2015

/**
 * This project takes in a text file and uses it to parse commands relating
 * to rectangles. It then performs operations using rectangles as the objects
 * to demonstrate knowledge of and capability using a SkipList and kv pairs. 
 * 
 * The skip list performs such options as insert, delete, checking for 
 * intersection points, and checking for all of the rectangles within a
 * certain area. 
 * 
 * This class contains the main method, the entry point of the application.
 *
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version Rectangle1
 */
public class Rectangle1
{
    /**
     * Takes in a text file for use with the command input. 
     * this text file can have commands such as insert, remove, regionsearch,
     * search, intersections, and dump. all other commands should not be given
     * and will be treated as garbage by the parser. 
     *
     * @param args
     *            The name of the command file passed in as a command line
     *            argument.
     */
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out
                    .println("Error: Incorrect number of arguments provided\n");
        }
        else
        {
            CommandParser parser = new CommandParser(args[0]);
            parser.parseFile();
        }
    }
}
