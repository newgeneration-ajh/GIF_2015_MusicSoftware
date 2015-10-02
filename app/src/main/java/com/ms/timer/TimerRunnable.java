package com.ms.timer;

import android.util.Log;

/**
 * Created by Ahn on 2015-10-02.
 */
public class TimerRunnable implements Runnable {

    private Thread mThread = null;
    private Integer mTempo = 62;
    private boolean mRunning = false;

    public TimerRunnable ( ) {
        this.mThread = new Thread(this);
    }

    public void setmTempo ( int inTempo ) {
        synchronized ( mTempo ) {
            this.mTempo = inTempo;
        }
    }

    public void startThread ( ) {
        this.mRunning = true;
        this.mThread.start();
    }

    @Override
    public void run() {

        while( true ) {
            try {
                if ( mRunning == true ) {
                    Thread.sleep(mTempo);
                    /* work proccess */

                }
                else {
                    Thread.sleep(1000);
                }
            }
            catch ( java.lang.InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}

