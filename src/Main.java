import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        legacyCode();
        legacyHashtableExample();
        legacyThreadExample();
        legacyRandomExample();
    }

    public static void legacyCode() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString());

        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.JANUARY, 1);
        Date oldDate = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Old Date: " + sdf.format(oldDate));

        List<String> names = Arrays.asList("John", "Alice", "Bob");
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted names: " + names);
    }

    public static void legacyHashtableExample() {
        Hashtable<Integer, String> table = new Hashtable<Integer, String>();

        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        System.out.println("Hashtable values: " + table);
    }

    public static void legacyThreadExample() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running...");
            }
        });

        thread.start();
    }

    public static void legacyRandomExample() {
        int randomNumber = ThreadLocalRandom.current().nextInt(100);

        System.out.println("ThreadLocalRandom number: " + randomNumber);
    }

}
