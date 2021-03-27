/**
 * Sabiha Khan - B00842047
 * CSCI 2110 - Lab 5 Exercise 2
 * Calculates the union and intersection of the two array lists that is inputted.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class SetAnalyzerTester {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner kb = new Scanner(System.in);
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();

        System.out.println("Will you be analyzing Strings or Integers?");
        String answer = kb.nextLine();
        System.out.println("Enter a filename:");
        String filename = kb.nextLine();
        System.out.println("Enter the second filename:");
        String filename2 = kb.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        File file2 = new File(filename2);
        Scanner inputFile2 = new Scanner(file2);

        //Filling both the arrays with data from the specified files.
        while (inputFile.hasNext()){
            array1.add(inputFile.next());
        }
        while (inputFile2.hasNext()){
            array2.add(inputFile2.next());
        }
        inputFile.close();

        SetAnalyzer<String> setAnalyzer = new SetAnalyzer<String>();

        //Printing the union and intersection of the two array lists.
        System.out.println("Intersection: "+ "\n" +setAnalyzer.intersection(array1,array2));
        System.out.println("Union:" + "\n" + setAnalyzer.union(array1,array2));


    }

}
