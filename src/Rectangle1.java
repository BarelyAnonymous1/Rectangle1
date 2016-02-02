<<<<<<< HEAD
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
// PRESTON YOU SHOULD DO THIS THING AT SOME POINT

/**
 * WE NEED TO TYPE OUT A BETTER HEADER COMMENT FOR THE OVERALL PROJECT
 * The class containing the main method, the entry point of the application.
 *
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version Rectangle1
 */
public class Rectangle1
{
    /**
     * NEED A BETTER EXPLANATION HERE TOO
     * The entry point of the application.
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
            String file = args[0].trim();
            CommandParser parser = new CommandParser(file);
            parser.parseFile();
        }
    }
}
=======
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
 * WE NEED TO TYPE OUT A BETTER HEADER COMMENT FOR THE OVERALL PROJECT
 * The class containing the main method, the entry point of the application.
 *
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version Rectangle1
 */
public class Rectangle1
{
    /**
     * NEED A BETTER EXPLANATION HERE TOO
     * The entry point of the application.
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
            parser.parse();
        }
    }
}
>>>>>>> branch 'master' of https://github.com/BarelyAnonymous1/Rectangle1.git
