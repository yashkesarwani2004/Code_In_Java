public class Stringchk {
    
 public static void main(String arg[])
 {
     String str= "abcdef ghijklm  nopqrstuv wxyz";
     str.toLowerCase();
     int ch[]=new int[26];
     for(int i=0;i<str.length();i++)
     {
        if(str.charAt(i)!=' ' )
        {
        int diff= str.charAt(i) - 'a';
        ch[diff]++;
        }
     }
     for(int j=0;j<=25;j++)
     {
        if(ch[j]==0)
        {
            System.out.println((char)(j+'a'));
        }
     }
 }
}
