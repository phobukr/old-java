import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        dateExample();
        comparatorExample();
        syncMapExample();
        randomExample();
        loopExample();
    }

    public static void dateExample() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.DECEMBER, 31, 23, 59, 59);
        Date oldDate = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Old Date: " + sdf.format(oldDate));
    }

    public static void comparatorExample() {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(names);
    }

    public static void syncMapExample() {
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
        synchronized (map) {
            map.put("key1", 1);
            map.put("key2", 2);
        }
        System.out.println(map);
    }

    public static void randomExample() {
        Random random = new Random();
        System.out.println("Random number: " + random.nextInt(100));
    }

    public static void loopExample() {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

}
