package collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("selove.jara@gmail.com", "Андрей Морозов");
        map.put("selove.jara@yandex.ru", "Андрей Какой то");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
