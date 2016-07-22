/**
 * Created by Sharipov91 on 7/20/16.
 */
public class WaitFunction {
    public static void ForceWait(int sec){
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
