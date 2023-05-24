import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String s1="Vyshnavi Gali";
        String[] array=s1.split(" ");
        System.out.println(Arrays.toString(array));


        String s2="Hi How are you doing";
                String[] array1=s2.split(" ");
        System.out.println(Arrays.toString(array1));


        String s3="Hi@How@are you doing";
        String[] array2=s3.split("@");
        System.out.println(Arrays.toString(array2));
    }
}
