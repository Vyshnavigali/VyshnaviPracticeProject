public class StringConcat {
    public static void main(String[] args) {
        String s1="Vyshnavi";
        String s2="Gali";
        //s1.concat(s2); //It will not concat directly as it needs some variable to store the data.
        String s3=s1.concat(s2);
        System.out.println(s3);
    }
}
