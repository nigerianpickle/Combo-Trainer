import java.util.concurrent.TimeUnit;
public class ComboTrainer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        String b="Left jab";
        String c="Right jab";
        String d="Duck";
        String[] move=new String[3];
        move[0]=b;
        move[1]=c;
        move[2]=d;


        LeftRightCombo(move, 100);
        // System.out.println(a.getAgeInSeconds());
    }

    public static class MyObj {
        private final long createdMillis = System.currentTimeMillis();
    
        public int getAgeInSeconds() {
            long nowMillis = System.currentTimeMillis();
            return (int)((nowMillis - this.createdMillis) / 1000);
        }
    }

    public static void LeftRightCombo (String[] move,int num) throws InterruptedException {
        while (num!=0) {
            int random=(int)Math.floor(Math.random() * (2 - 0 + 1) + 0);
            System.out.println(move[random]);
            num--;
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
