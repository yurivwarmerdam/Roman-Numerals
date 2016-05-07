package com.company;

public class Main {

    public static void main(String[] args) {
        int number = (int)(Math.random()*10000+1);
        int subNumber = number;
        String roman = "";
        System.out.println(number);

        //Thousands (M)
        while (subNumber>=1000){
            roman+="M";
            subNumber -=1000;
        }
        //Nine hundred (CM)
        while (subNumber>=900){
            roman+="CM";
            subNumber -=900;
        }
        //Eight hundred (CCM)
        while (subNumber>=800){
            roman+="CCM";
            subNumber -=800;
        }
        //five hundred (D)
        while (subNumber>=500){
            roman+="D";
            subNumber -=500;
        }
        //four hundred (CD)
        while (subNumber>=400){
            roman+="CD";
            subNumber -=400;
        }
        //hundred (C)
        while (subNumber>=100){
            roman+="C";
            subNumber -=100;
        }
        //ninety (XC)
        while (subNumber>=90){
            roman+="XC";
            subNumber -=90;
        }
        //eighty (XXC)
        while (subNumber>=80){
            roman+="XXC";
            subNumber -=80;
        }
        //fifty (L)
        while (subNumber>=50){
            roman+="L";
            subNumber -=50;
        }
        //forty (XL)
        while (subNumber>=40){
            roman+="XL";
            subNumber -=40;
        }
        //ten (X)
        while (subNumber>=10){
            roman+="X";
            subNumber -=10;
        }
        //five (V)
        while (subNumber>=5){
            roman+="V";
            subNumber -=5;
        }
        //four (IV)
        while (subNumber>=4){
            roman+="V";
            subNumber -=4;
        }
        //one (I)
        while (subNumber>=1){
            roman+="I";
            subNumber -=1;
        }

        if (subNumber<0){
            System.out.println("error");
        }

        System.out.println(subNumber);
        System.out.println(roman);
    }
}
