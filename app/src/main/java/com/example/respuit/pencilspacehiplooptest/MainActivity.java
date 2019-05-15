package com.example.respuit.pencilspacehiplooptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean shouldLoop;
    private TextView myTextView;
    private int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.texto);
        shouldLoop = true;
        gameLoop();
    }



        public void gameLoop(){
            Runnable myRunnable = new Runnable() {
                @Override
                public void run() {
                    while (shouldLoop ) {
                        try {
                            Thread.sleep(1000); // Waits for 1 second (1000 milliseconds)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        myTextView.post(new Runnable() {
                            @Override
                            public void run() {
                                RandomGenerator rg = new RandomGenerator();
                                n = rg.getRandom().nextInt((100 - 1) + 1) + 1;
                                //n++;
                                String s = n + " holamundo";
                                myTextView.setText(s);
                                Log.e("LOOP", s);
                            };
                        });
                    }
                };

                /*while (shouldLoop) {
               /* loopHandler lh = new loopHandler();
                lh.run();
/*
                //n++;
                String s = n + " holamundo";
                //myTextView.setText(s);
                Log.e("LOOP", s);*/


        };
            Thread myThread = new Thread(myRunnable);
            myThread.start();

    }
}
