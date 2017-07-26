Vowely Words
Max. Marks: 10



Shanu likes to make words. She likes to find Vowely Words from Novels. If word has even number of total vowel letters (a,e,i,o,u) and vowel letter count is less than or equal square root of total character count then only it is named as Vowely Word.

First line input has T number of test queries For each T lines there is a word

For each word you need to print YES if word is Vowely and otherwise NO

SAMPLE INPUT 
love
wow
SAMPLE OUTPUT 
Yes
No
Explanation
T is 2 therefore there will be 2 words wow - vowel count is odd. We print NO love - vowel count is even and 2<=2 is true (vowel letter count is less than or equal square root of total character count). We print YES

import java.util.*;
class Vowely {
    public static void main(String args[] ){
       
       Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int j=0;j<t;j++){
            String h=s.next();
            int count=0;
            char[] v=new char[h.length()];
            for(int k=0;k<h.length();k++){
                v[k]=h.charAt(k);
                if(v[k]=='a'|v[k]=='e'|v[k]=='i'|v[k]=='o'|v[k]=='u'|v[k]=='A'|v[k]=='E'|v[k]=='I'|v[k]=='O'|v[k]=='U'){
                    count++;
                }
                
                
            }
            int g=h.length();
            
            
            if(((count%2)==0)&&(count<=(int)(Math.sqrt(g)))){
                System.out.println("YES");
            
            }else{
             System.out.println("NO");
            }
        


    }
    }
}
