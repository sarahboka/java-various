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
public class LongMiddle {
//        Given 2 Strings, a and b, return a String of the form short+long+short, with the shorter String on the outside 
//    and the longer String on the inside. The Strings will not be the same length, but they may be empty (length 0). 
//
//    longInMiddle("Hello", "hi") -> "hiHellohi"
//    longInMiddle("hi", "Hello") -> "hiHellohi"
//    longInMiddle("aaa", "b") -> "baaab"

    public String longInMiddle(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return a;
        }else if (a.length() == b.length()){
            return "error";
        } else if (a.length() > b.length()){
            return b+a+b;
        } else if (a.length() < b.length()) {
            return a+b+a;
        } else {
            return "error";
        }
    }
}
