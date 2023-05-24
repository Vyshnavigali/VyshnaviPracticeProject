public class StringRemoveVowels {
    public static void main(String[] args) {
        String s="Hello, I love my India";
        s=s.replaceAll("[aeiouuAEIOU]","");
        System.out.println(s);
    }
}
