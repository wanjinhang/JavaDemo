package com.example.thread.practise;

/**
 * 案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
 * <p>
 * 兔子的速度是10米每秒，兔子每跑完10米休眠的时间10秒
 * <p>
 * 乌龟的速度是1米每秒，乌龟每跑完10米的休眠时间是1秒
 * <p>
 * 要求：要等兔子和乌龟的线程结束，主线程（裁判）才能公布最后的结果。
 *
 * @author wansui
 * @date 2023/09/21
 */
public class RaceThread extends Thread {
    private int speed;
    private int breakTime;

    public int getTime() {
        return time;
    }

    private int time;
    @Override
    public void run() {
        super.run();
    }

    public RaceThread(String name,int speed, int breakTime) {
        super(name);
        this.speed = speed;
        this.breakTime = breakTime;
    }
}
