package com.example.respuit.pencilspacehiplooptest;

public class loopHandler extends Thread{
    @Override
    public void run() {
        sleep();
    }

    private void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
