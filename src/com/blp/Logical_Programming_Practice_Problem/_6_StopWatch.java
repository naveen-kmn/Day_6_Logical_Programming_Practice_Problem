package com.blp.Logical_Programming_Practice_Problem;

import java.util.Scanner;

public class _6_StopWatch
{
    public long startTimer=0;
    public long stopTimer=0;
    public long start=1;
    public long stop=2;
    public long elapsed;

    void start()
    {
        start=System.currentTimeMillis();
    }
    void stop()
    {
        stop=System.currentTimeMillis();
    }

    long getElapsedTime()
    {
        elapsed= stop-start;
        return elapsed;
    }
    public static void main(String[] args)
    {
        _6_StopWatch s=new _6_StopWatch();
        Scanner inp=new Scanner(System.in);

        System.out.println("Press '0' to start the time: ");
        int start=inp.nextInt();
        s.start();

        System.out.println("Press '0' to stop the time: ");
        int stop = inp.nextInt();
        s.stop();

        long l=s.getElapsedTime();
        System.out.println("Total time elapsed in seconds: "+(l/1000)+" sec");
        System.out.println("Total time elapsed in minutes: "+(l/60000)+" min");
        System.out.println("Total time elapsed in hours: "+(l/3600000)+" hrs");
    }
}
