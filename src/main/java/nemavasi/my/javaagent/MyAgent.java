package nemavasi.my.javaagent;

import java.lang.instrument.Instrumentation;

public class MyAgent {

    private static Instrumentation instrumentation;

    public static void premain(String arg, Instrumentation instrumentation) {
        MyAgent.instrumentation = instrumentation;

        System.out.println("Agent is starting...");
        instrumentation.addTransformer(new ClassTransformer());
    }

    public static long objSize(Object object){
        if (instrumentation == null) {
            throw new RuntimeException("Агент не инициилизирован ");
        }

        return instrumentation.getObjectSize(object);
    }
}
