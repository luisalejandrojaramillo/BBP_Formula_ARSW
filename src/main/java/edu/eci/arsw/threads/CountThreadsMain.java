/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread countThread = new CountThread(0,99);
        CountThread countThread2 = new CountThread(100,199);
        CountThread countThread3 = new CountThread(200,299);
        countThread.start();
        countThread2.start();
        countThread3.start();

    }
}
