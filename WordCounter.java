Word Counter
Max. Marks: 10

Print the number of words in a given paragraph

Assumptions

Numeric values separated by spaces are considered as words (check example)
Words do not require to have a meaning, any set of letters separated by spaces or alphanumeric characters are considered a word
SAMPLE INPUT 
8 universities... 60 teams... 180 competitors....
SAMPLE OUTPUT 
6

import java.util.*;
class WordCounter {
    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        String h=s.nextLine();
         String[] s1=h.split("[^a-zA-Z0-9']+");
          System.out.println(s1.length);

               
          
     
        
    }
}
