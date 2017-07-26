Fightclub mails
Max. Marks: 25

This challenge is powered by UWU CodeMasters

Sandu is the captain of Fightclub which is association of girls for women rights. She developed a system for new member registration using new programming language ballerina by WSO2. Suppose she hired you to her association as software engineer to build email validator,

Fight club email validation has these constrains

an email if valid only if

Mail domain is from this whitelist

www.fightclub.uk

www.fightclub.com
www.fightclub.lk
www.fightclub.sa
www.fightclub.cc
www.fightclub.jp
www.fightclub.se
www.fightclub.xy
www.fightclub.gi
www.fightclub.rl
www.fightclub.ss

Username has 3 to 6 (inclusive 3,6) characters (Only lowercase English letters and numbers)

First line is number of testcases T each T line has email to validate. each line print VALID or INVALID according to above constraints

SAMPLE INPUT 
2
sonia6@fightclub.com
am@fightclub2.lk
SAMPLE OUTPUT 
VALID
INVALID
Explanation
sonia6@fightclub.com passed all constraints then we print VALID am@fightclub2.lk has invalid domain and not passed username constraint then we print INVALID

public class Mails {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        for(int i=0;i<x;i++){
            String y=s.next();
            String[] h=y.split("[\\@]");
            int fg=0;
            int dg=0;
            for(String l:h){
            System.out.println(l);
                
            }
            //if(((h[0].length()>=3 && h[0].length()<=6)&& (h[0].matches(".*[a-z].*")))||(h[0].contains("[0-9]+")) ){
            String[] dom={""};    
               //if(h[1].equals("fightclub")){
                   if((( h[0].length()<=6 &&(h[0].length()>=3))&& (h[0].matches(".*[a-z].*")) )){
                       if(h[1].matches("fightclub.com|fightclub.lk|fightclub.sa|fightclub.cc|fightclub.jp|fightclub.se|fightclub.xy|fightclub.gi|fightclub.rl|fightclub.ss")){
                           System.out.println("VALID");
                       }else{
                           System.out.println("INVALID");
                       }
                       
                   }else{
                   
                    System.out.println("INVALID");}
        }
    }
}
                      

    

