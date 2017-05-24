package com.example.beans;

import java.io.PrintStream;

/**
 * Created by jt_hu on 2017/5/19.
 */
public class Minstrel {

    private PrintStream stream;
    private int i = 1;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest() throws Exception {
        stream.println("Fa la la , the knight is so brave!");
    }

    public void singAfterQuest() throws Exception {
        stream.println("Tee hee hee, the brave knight did embark on a quest!");
        throw new Exception("dfasdf");
    }

    public void returning(){
        stream.println("returning");
    }

    public void throwing() {
        stream.println("throwing");
    }

    public void around(){
        stream.println("around: " + (i++));
    }

}
