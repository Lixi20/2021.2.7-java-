import java.util.HashMap;

public class time {

    public static HashMap<Integer, String> sss() {

        String[] day = {"周一", "周二", "周三", "周四", "周五"};
        String[] time = {"8:00", "9:00", "10:00", "11:00", "12:00", "11:00", "12:00","13:00","14:00","15:00","16:00"};

        HashMap<Integer, String> ItemMap = new HashMap<>();
        int num = 0;
        //day套time
        for (String item : day) {
            for (String s : time) {
                String pop = item + s;
                ItemMap.put(num, pop);
                num++;
            }
        }
        return ItemMap;
    }
}
