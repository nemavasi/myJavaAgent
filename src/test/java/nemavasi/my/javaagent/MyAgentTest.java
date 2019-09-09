package nemavasi.my.javaagent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MyAgentTest {
    public static void main(String[] args) {
        System.out.println("App is starting...");
        printObjectSize(new Object());
        printObjectSize(new Locale("ru"));
        printObjectSize(1);
        printObjectSize("string");
        printObjectSize(Calendar.getInstance());
        printObjectSize(new BigDecimal("999999999999999.999"));
        printObjectSize(new ArrayList<String>());
        printObjectSize(new Integer[100]);

    }

    public static void printObjectSize(Object obj) {
        System.out.println(String.format("%s, size=%s", obj.getClass().getSimpleName(), MyAgent.objSize(obj)));
    }
}
