//Find out repeated characters number? String is java, char is a, o/p=2
public class ExamStringRepeatCount {
    public static void main(String[] args) {
        String s="java";
        char ch='a';
        //This method using string to array conversion
        /*
        char arr[]=s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                count++;
            }
        }
        System.out.println(count);
        */
        //This using direct approach
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
