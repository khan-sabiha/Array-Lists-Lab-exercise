/**
 * Sabiha Khan- B00842047
 * CSCI 2110 - Lab 5 Exercise 1
 *Calculates the mean and mode of an array list that is inserted.
  */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class AverageAnalyzerTester {
    public static void main (String[] args) throws FileNotFoundException {

        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("Enter a filename:");
        String filename = kb.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // Filling the array with dat from the file.
        while (inputFile.hasNext()){
            array.add(inputFile.nextInt());
        }
        inputFile.close();

        AverageAnalyzer analyzer = new AverageAnalyzer(array);

        //Printing the the mean and mode of the array.
        System.out.println("Mean:["+ analyzer.mean() + "]");
        System.out.println("Mode:["+ analyzer.mode() + "]");




    }
}
