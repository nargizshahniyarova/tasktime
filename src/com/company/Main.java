package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String time = in.next();
            String Time[] = time.split(":");
            String hour = Time[0];
            String minutes = Time[1];
            String secounds = Time[2].substring(0, 2);
            String AM_PM = Time[2].substring(2, 4);

            if(AM_PM.equals("PM")) {
                if(!hour.equals("12")){
                    int h = Integer.parseInt(hour);
                    h = h +12;
                    hour =""+h;
                }
                System.out.println(hour+":"+minutes+":"+secounds);
            }else{
                if(hour.equals("12"))
                    hour="00";

                System.out.println(hour+":"+minutes+":"+secounds);
            }}

        }


