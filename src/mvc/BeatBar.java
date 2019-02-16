package mvc;

import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable {
    private Thread thread;

    public BeatBar() {
        thread  = new Thread();
        setMaximum(100);
        thread.start();
    }

    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {};
        }
    }
}
