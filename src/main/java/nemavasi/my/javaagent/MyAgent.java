package nemavasi.my.javaagent;

import java.lang.instrument.Instrumentation;

public class MyAgent {
    public static void premain(String arg, Instrumentation instrumentation) {
        System.out.println("Agent is starting...");
        instrumentation.addTransformer(new ClassTransformer());

    }
}
