import java.util.Arrays;

public class StringReverseEachWord {
    public static void main(String[] args) {
        String s="Hello My Friend";
       String[] s1= s.split(" ");
       for(int i=0; i<s1.length; i++){
           StringBuilder sb = new StringBuilder(s1[i]);
           sb.reverse();
           System.out.print(sb + " ");

       }

    }
}
