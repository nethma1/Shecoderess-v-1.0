Binary Stream to Text
Max. Marks: 10

A system is needed to be developed to read a stream of bits and converts each read 8 bits at a time into text .

The number of bit streams to read is given in the first line of the input

Constraints - The first line inputs the number of lines to be read. - Each 8 bits starting from the 1st bit in the stream represents a character. - Each of the input bit stream lines are of variable size. - If the last set of bits to be read in a line is less than 8,those bits are to be ignored.

SAMPLE INPUT 
2
011100000111100101110100011010000110111101101110
0110110001110101011000
SAMPLE OUTPUT 
python
lu

import java.util.Scanner;
class Binary{
    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        for(int i=0;i<y;i++){
            String m=s.next();
            String[] c=m.split("(?<=\\G.{8})");
            for(String d:c){
                if(d.length()==8){
                //System.out.println(d);
                int dec=Integer.parseInt(d,2);
                
                char v=(char)dec;
                System.out.print(v);
                }
                //System.out.println(); 
               
               
            
            }
             System.out.println();
        }
        //System.out.println();
    
    }
    
}
