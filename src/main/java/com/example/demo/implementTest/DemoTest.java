package com.example.demo.implementTest;

public class DemoTest {

}


interface Playable {
    void play();
}
interface Bounceable {
    void play();
}
interface Rollable extends Playable, Bounceable {

}
class Ball implements Rollable {
    private String name;
    public String getName() {
        return name;
    }
    public Ball(String name) {
        this.name = name;
    }
    public void play() {
       Ball ball = new Ball("Football");
        System.out.println(ball.getName());
    }
}