/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.conditionals;

/**
 *
 * @author apprentice
 */
public class Front3 {
//        Given a String, we'll say that the front is the first 3 chars of the String. If the String length is less than 3, the front is whatever is there. Return a new String which is 3 copies of the front. 
//
//    front3("Microsoft") -> "MicMicMic"
//    front3("Chocolate") -> "ChoChoCho"
//    front3("at") -> "atatat"

    public String front3(String str) {
        if (str.length() < 3){
            return str + str +str;
        } else {
            String front = str.substring(0, 3);
            return front + front + front;
        }
    }
}
