/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.loops;

/**
 *
 * @author apprentice
 */
public class DoubleX {
//        Given a String, return true if the first instance of "x" in the String is immediately followed by another "x". 
//
//    doubleX("axxbb") -> true
//    doubleX("axaxxax") -> false
//    doubleX("xxxxx") -> true

    public boolean doubleX(String str) {
        int insIdx = str.indexOf("x");
        if (str.substring(insIdx, insIdx+2).equalsIgnoreCase("xx")){
            return true;
        } else {
            return false;
        }
    }
}
