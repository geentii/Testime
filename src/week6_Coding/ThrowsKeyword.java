package week6_Coding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("test started");
        System.out.println("Step 1");
        sleep(2.5);

            Thread.sleep(3000);

//        System.out.println( 9/0 );

        System.out.println("Step 2");

            Thread.sleep(3000);

//        System.out.println("".charAt(-200));

        System.out.println("test completed");

    }

    public static void sleep(double seconds) throws InterruptedException {
        long milliSeconds = (long) (seconds * 1000);
        Thread.sleep(milliSeconds);
    }

}
