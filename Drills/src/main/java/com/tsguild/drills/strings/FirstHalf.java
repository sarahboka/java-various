/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.strings;

/**
 *
 * @author apprentice
 */
public class FirstHalf {
//        Given a String of even length, return the first half. So the String "WooHoo" yields "Woo". 
//
//    firstHalf("WooHoo") -> "Woo"
//    firstHalf("HelloThere") -> "Hello"
//    firstHalf("abcdef") -> "abc"

    public String firstHalf(String str) {
        
        if (str.length() % 2 == 1 || str.isEmpty()) {
            return "error";
        } else {
            return str.substring(0, str.length()/2);
        }
    }
}
