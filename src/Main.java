import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet <String> set1 = new HashSet<String>();
        HashSet <String> set2 = new HashSet<String>();
        HashSet <String> set3 = new HashSet<String>();
        set1.add("str1");
        set1.add("str2");
        set1.add("str3");
        set1.add("str4");
        System.out.println(set1.toString());

        set2.add("str6");
        set2.add("str2");
        set2.add("str5");
        set2.add("str4");
        System.out.println(set2.toString());

        set3.addAll(set1);
        set3.retainAll(set2);
        set1.removeAll(set3);
        set2.removeAll(set3);


        System.out.println(set1.toString());
        System.out.println(set2.toString());
    }
}
