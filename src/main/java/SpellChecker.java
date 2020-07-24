import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker {

    Set<String> reference;

    public String parse(File f){
        // parse all the text into the HashSet
        try {
            reference = new HashSet<String>();  // initialize a new hashset
            Scanner fileRead = new Scanner(f);
            while (fileRead.hasNext()) { // iter thru the file
                String currWord = fileRead.next().replaceAll("[^a-zA-Z0-9]", ""); // removes all punctuation and crap from the current word
//                if (!reference.contains(currWord.toLowerCase())) {    // if reference doesnt contain currWord, then add it to the set
//                    reference.add(currWord.toLowerCase());
//                }
                reference.add(currWord.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reference.toString();
    }

//    public String getSet(){
//        Object[] arr = reference.toArray();
//        String setValues = "";
//        for (int i = 0; i < arr.length; i++){
//            setValues += arr[i];
//            if(i < arr.length - 1){
//                setValues = setValues + ", ";
//            }
//        }
//        return "[" + setValues + "]";
//    }

    public static void main(String[] args) {
        File f = new File("letters_from_gandhi_v2.txt");
        File g = new File("words_alpha.txt");
        SpellChecker sc = new SpellChecker();
        System.out.println(sc.parse(g));
    }

    // words_alpha.txt works
    // letter_from_gandhi.txt has the wrong input stream apparently
}
