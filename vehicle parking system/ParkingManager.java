import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    private static Map<Integer, Boolean> parkingSlots = new HashMap<>();
    private static int totalSlots = 10;

    static {
        // Initialize parking slots
        for (int i = 1; i <= totalSlots; i++) {
            parkingSlots.put(i, false); // False means slot is available
        }
    }

    public static boolean reserveSlot(int slotNumber) {
        if (parkingSlots.containsKey(slotNumber) && !parkingSlots.get(slotNumber)) {
            parkingSlots.put(slotNumber, true);
            return true;
        }
        return false;
    }

    public static boolean freeSlot(int slotNumber) {
        if (parkingSlots.containsKey(slotNumber) && parkingSlots.get(slotNumber)) {
            parkingSlots.put(slotNumber, false);
            return true;
        }
        return false;
    }

    public static Map<Integer, Boolean> getAvailableSlots() {
        return parkingSlots;
    }
}
