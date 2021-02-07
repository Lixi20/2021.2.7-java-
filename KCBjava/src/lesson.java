import java.util.ArrayList;
import java.util.Collections;

public class lesson {
    public static ArrayList<String> getLesson() {
        ArrayList<String> sites = new ArrayList<>();
        sites.add(0,"语文   A老师");
        sites.add(1,"数学   B老师");
        sites.add(2,"英语   c老师");
        sites.add(3,"日语   D老师");
        sites.add(4,"德语   E老师");
        sites.add(5,"法语   F老师");
        sites.add(6,"休息");

        Collections.shuffle(sites);

        return sites;
    }
}