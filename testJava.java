package Solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MyJava {
    public static Map<String, String> add() {
        Map<String, String> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("/home/milon/Downloads/data-file.txt"));
            while (sc.hasNextLine()) {
                String[] split_string = sc.nextLine().split(" ");
                List<String> l=Arrays.asList(split_string);
                Person p = new Person(l);
                map.put(p.NID, p.Passport_Number);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return map;
    }
    public static List<Pair<String,String>> sorted(Map<String,String> map)
    {
        List<Pair<String,String>> l=new ArrayList<>();
        TreeMap<String, String> sort = new TreeMap<>();
        sort.putAll(map);
        for (Map.Entry<String, String> entry : sort.entrySet()) {
            l.add(new Pair<>(entry.getKey(),entry.getValue()));
        }
        return l;
    }
    public static void main(String[] args) {
        Map<String,String> m=add();
        for (int i=0;i<sorted(m).size();i++){
            System.out.println(sorted(m).get(i).first+" "+sorted(m).get(i).second);
        }
    }
    public static final class Pair<T1, T2> {
        public T1 first;
        public T2 second;

        public Pair() {
            first = null;
            second = null;
        }
        public Pair(T1 firstValue, T2 secondValue) {
            first = firstValue;
            second = secondValue;
        }
        public Pair(Pair<T1, T2> pair) {
            first = pair.first;
            second = pair.second;
        }
    }
}
