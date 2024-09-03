import java.util.HashMap;
import java.util.Map;

public class AdminManager {
    private static Map<String, String> users = new HashMap<>();

    static {
        // Initialize with one admin user
        users.put("admin", "admin");
    }

    public static boolean addUser(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            return true;
        }
        return false;
    }

    public static boolean removeUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            return true;
        }
        return false;
    }

    public static Map<String, String> getUsers() {
        return users;
    }
}
