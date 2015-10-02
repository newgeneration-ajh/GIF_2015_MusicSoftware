package ms.com.musicxml;

import android.app.Activity;
import android.os.Bundle;

import com.ms.timer.TimerRunnable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerRunnable timerRunnable = new TimerRunnable();
        timerRunnable.startThread();

    }

}
