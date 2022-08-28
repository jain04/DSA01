package arrays;

public class searhstring {
    public static void main(String[] args) {
        String d="Aditya";
        char v='z';
        System.out.println(strsearch(d,v));
    }

    static int strsearch(String s,char a){

        for (int i = 0; i < s.length(); i++) {
            if (a==s.charAt(i)){
                return 1;
            }
        }
        return -1;
    }
}
