import javax.swing.*;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Adam {
    public static void main(String[] args) {
        welcomeText();

    }

    private static void welcomeText() {
        System.out.println("----------------\n" +
                "BOYFRIEND EXPERIENCE\n" +
                "Version: ALPHA 1.0\n" +
                "----------------");

        //insert input for different behaviour modes?

        System.out.println("Connecting to: Adam");
    }
    private static void getTime() throws InterruptedException {
        Timer timer = new Timer();
        long interval = (1000); // 1 sec

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalTime now = LocalTime.now();
                CharSequence nowParsed = 

                LocalTime morningGreeting = LocalTime.parse("09:00");
                LocalTime afternoonLunch = LocalTime.parse("12:00");
                LocalTime nightDinner = LocalTime.parse("20:00");
                LocalTime nightSleep = LocalTime.parse("23:00");

                switch(now){
                    case morningGreeting:
                        JOptionPane.showMessageDialog(null, "You have a new message.");
                        System.out.print("Adam: Good morning! You're awake early today.\n" +
                                "Let's hope today will be a great one!");
                        break;
                    case
                }

            }
        }, 0, interval);
    }

    private static void reminders(){
        //ALPHA 1.0: Only contains pre-made reminders

    }

    private static void userBank(){

    }

    private static void responseBank() {

    }
}
