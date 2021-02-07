import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {

        HashMap<Integer, String> time1 = time.sss();
        int chineseNum1 = 0;
        int mathNum1 = 0;
        int englishNum1 = 0;
        int JapanNum1 = 0;
        int germanNum1 = 0;
        int frenchNum1 = 0;
        int chineseNum2 = 0;
        int mathNum2 = 0;
        int englishNum2 = 0;
        int JapanNum2 = 0;
        int germanNum2 = 0;
        int frenchNum2 = 0;
        int chineseNum3 = 0;
        int mathNum3 = 0;
        int englishNum3 = 0;
        int JapanNum3 = 0;
        int germanNum3 = 0;
        int frenchNum3 = 0;

        //调用班级，教室，课程，老师

        List<String> timea1 = new ArrayList<>();
        List<Integer> CA = new ArrayList<>();

        int CAnum = 2;
        for (int timea = 0; timea < 54; timea++) {
            //单独打印时间
            System.out.println(time1.get(timea) + "\n");
            ArrayList<String> clazz1 = clazz.getClazz();
            ArrayList<String> room1 = room.getRoom();
            ArrayList<String> lesson1 = lesson.getLesson();

            for (int i = 0; i < 3; i++) {
                System.out.println(clazz1.get(i) + "  " + room1.get(i) + "  " + lesson1.get(i) + "\n");
                //每个班课时
                if (clazz1.get(i).equals("19届一班")) {
                    switch (lesson1.get(i)) {
                        case "语文   A老师":                 //如果是语文   A老师
                            CA.add(timea);
                            if (chineseNum1 < 8) {           //最大课时8
                                chineseNum1++;
                            }
                            else {
                                if (CA.get(CAnum) - CA.get(CAnum-1) == 1 && CA.get(CAnum-1) -CA.get(0) ==1){            //不重复三节课
                                    lesson1.remove("语文   A老师");
                                }else {
                                    chineseNum1++;
                                }
                            }
                        case "数学   B老师":
                            if (mathNum1 < 8) {
                                mathNum1++;
                            } else {
                                lesson1.remove("数学   B老师");
                            }
                            break;
                        case "英语   c老师":
                            if (englishNum1 < 8) {
                                englishNum1++;
                            } else {
                                lesson1.remove("英语   c老师");
                            }
                            break;
                        case "日语   D老师":
                            if (JapanNum1 < 8) {
                                JapanNum1++;
                            } else {
                                lesson1.remove("日语   D老师");
                            }
                            break;
                        case "德语   E老师":
                            if (germanNum1 < 8) {
                                germanNum1++;
                            } else {
                                lesson1.remove("德语   E老师");
                            }
                            break;
                        case "法语   F老师":
                            if (frenchNum1 < 8) {
                                frenchNum1++;
                            } else {
                                lesson1.remove("法语   F老师");
                            }
                            break;
                    }

                }

                if (clazz1.get(i).equals("19届二班")) {
                    switch (lesson1.get(i)) {
                        case "语文   A老师":
                            if (chineseNum2 < 8) {
                                chineseNum2++;
                            } else {
                                lesson1.remove("语文   A老师");
                            }
                            break;
                        case "数学   B老师":
                            if (mathNum2 < 8) {
                                mathNum2++;
                            } else {
                                lesson1.remove("数学   B老师");
                            }
                            break;
                        case "英语   c老师":
                            if (englishNum2 < 8) {
                                englishNum2++;
                            } else {
                                lesson1.remove("英语   c老师");
                            }
                            break;
                        case "日语   D老师":
                            if (JapanNum2 < 8) {
                                JapanNum2++;
                            } else {
                                lesson1.remove("日语   D老师");
                            }
                            break;
                        case "德语   E老师":
                            if (germanNum2 < 8) {
                                germanNum2++;
                            } else {
                                lesson1.remove("德语   E老师");
                            }
                            break;
                        case "法语   F老师":
                            if (frenchNum2 < 8) {
                                frenchNum2++;
                            } else {
                                lesson1.remove("法语   F老师");
                            }
                            break;
                    }
                }
                if (clazz1.get(i).equals("19届三班")) {
                    switch (lesson1.get(i)) {
                        case "语文   A老师":
                            if (chineseNum3 < 8) {
                                chineseNum3++;
                            } else {
                                lesson1.remove("语文   A老师");
                            }
                            break;
                        case "数学   B老师":
                            if (mathNum3 < 8) {
                                mathNum3++;
                            } else {
                                lesson1.remove("数学   B老师");
                            }
                            break;
                        case "英语   c老师":
                            if (englishNum3 < 8) {
                                englishNum3++;
                            } else {
                                lesson1.remove("英语   c老师");
                            }
                            break;
                        case "日语   D老师":
                            if (JapanNum3 < 8) {
                                JapanNum3++;
                            } else {
                                lesson1.remove("日语   D老师");
                            }
                            break;
                        case "德语   E老师":
                            if (germanNum3 < 8) {
                                germanNum3++;
                            } else {
                                lesson1.remove("德语   E老师");
                            }
                            break;
                        case "法语   F老师":
                            if (frenchNum3 < 8) {
                                frenchNum3++;
                            } else {
                                lesson1.remove("法语   F老师");
                            }
                            break;
                    }
                }
            }

        }
            System.out.println(CA);

            System.out.println("19届一班");
            System.out.println("语文课时" + "   " + chineseNum1);
            System.out.println("数学课时" + "   " + mathNum1);
            System.out.println("英语课时" + "   " + englishNum1);
            System.out.println("日语课时" + "   " + JapanNum1);
            System.out.println("德语课时" + "   " + germanNum1);
            System.out.println("法语课时" + "   " + frenchNum1 + "\n");

            System.out.println("19届二班");
            System.out.println("语文课时" + "   " + chineseNum2);
            System.out.println("数学课时" + "   " + mathNum2);
            System.out.println("英语课时" + "   " + englishNum2);
            System.out.println("日语课时" + "   " + JapanNum2);
            System.out.println("德语课时" + "   " + germanNum2);
            System.out.println("法语课时" + "   " + frenchNum2 + "\n");

            System.out.println("19届三班");
            System.out.println("语文课时" + "   " + chineseNum3);
            System.out.println("数学课时" + "   " + mathNum3);
            System.out.println("英语课时" + "   " + englishNum3);
            System.out.println("日语课时" + "   " + JapanNum3);
            System.out.println("德语课时" + "   " + germanNum3);
            System.out.println("法语课时" + "   " + frenchNum3 + "\n");
        }
    }






