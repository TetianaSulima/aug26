/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mygrade;

/**
 *
 * @author Administrator
 */
public class Grade {
    private String name;
    private int math;
    private int sci;
    private int eng;

//    public Grade(String tom_90_100_80) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
     
    
 @Override
    public String toString() {
        return "Grade{" + "name=" + name + ", math=" + math + ", sci=" + sci + ", eng=" + eng + '}';
    }
    
    public Grade(String name, int math, int sci, int eng) {
        this.name = name;
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }  
        
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

   

    public String getGrade(){
        int total = this.math + this.eng + this.sci;
        int avg = total / 3;
        if (avg < 60) {
            return "Fail";
        }
        else {
        return "Pass";
        }
    }
}

