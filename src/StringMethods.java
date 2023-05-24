public class StringMethods {
    public static void main(String[] args) {
        String s1="Hello";
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        System.out.println(s1.indexOf('o')); //Index number of o in Hello
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.substring(0,3));
        System.out.println(s1.substring(0)); //It will print all the word as we didnt give the last index


    }
}
