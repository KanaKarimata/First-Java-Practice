package com.example.test;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /* byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;*/

        /* byte age = 30;
        Date now = new Date();
        System.out.println(now);*/

        /*byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);*/

        /*Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);*/

//        String message = "   Hello World!" + "!!   ";

//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("sky"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);
        //Replace method does not modify the original original string.
        //It returns a new string.

//          System.out.println(message.toLowerCase());
        //It returns a new string.
//          System.out.println(message.trim());
          //this method can get rig of white space at the beginning or end

//        String message = "c:\twindows\\...";
//        //\n insert a new line
//        //\t insert a space
//        System.out.println(message);

//        int[] numbers = {2, 3, 5 ,1, 4};
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        numbers[0] = 1;
//        numbers[1] = 2;

//        System.out.println(Arrays.toString(numbers));
        //this returns address of the memory

        /*int[][] numbers ={ {1, 2, 3}, {4, 5, 6 }};
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));*/

//        final float PI = 3.14F;
        //final makes the valuables are constant,
        // and constant valuables should be Upper letters

//        double result = (double)10 / (double)3;
        /*int x = (10 + 3) * 2;
        System.out.println(x);*/

        //Implicit casting
        //byte > short > int > long > float > double
        /*String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);*/

        /*int result = (int)Math.random() * 100;
        System.out.println(result);*/


        /*String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);*/

        /*int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);*/

        /*boolean result = true;
        char letter = '翔';
        final double PI = 3.14;
        long number = 314159265853979L;
        String message = "ミナトの攻撃！的に１５ポイントのダメージを与えた！";
        System.out.println(result);
        System.out.println(letter);
        System.out.println(PI);
        System.out.println(number);
        System.out.println(message);*/

        /*float f = 3;
        double d = f;
        System.out.println(f);
        System.out.println(d);

        int age = (int)3.2;
        System.out.println(age);*/

        /*double d = 8.5 / 2;
        long l = 5 + 2L;
        System.out.println(d);
        System.out.println(l);

        String msg = "私の年齢は" + 23;
        System.out.println(msg);*/

        /*int a = 5;
        int b = 3;
        int m = Math.max(a, b);
        System.out.println("比較実験：" + a + "と" + b + "とで大lいいほうは…" + m);*/

        /*String age = "31";
        int n = Integer.parseInt(age);
        System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");*/

        /*int r = new java.util.Random().nextInt(90);
        System.out.println(r);

        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ、" + age + "歳の" + name + "さん");*/

        /*int x = 5;
        int y = 10;
        String ans = "x+yは" + (x + y);
        System.out.println(ans);*/

        /*String welcome = "ようこそ占いの館へ";
        System.out.println(welcome);
        String inputNameMessage = "あなたの名前を入力してください";
        System.out.println(inputNameMessage);
        String name = new java.util.Scanner(System.in).nextLine();

        String inputAgeMessage = "あなたの年齢を入力してください";
        System.out.println(inputAgeMessage);
        String ageString = new java.util.Scanner(System.in).nextLine();

        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(3);
        fortune++;
        String resultMessage = "占いの結果が出ました！";
        System.out.println(resultMessage);

        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉　2:中吉 3:吉 4:凶");*/

        /*boolean weather = true;
        if (weather == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("DVDを見ます");
        }*/

        /*boolean doorClose = true;
        while (doorClose == true) {
            System.out.println("ノックする");
            System.out.println("1分待つ");
        }*/

        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch (fortune) {
            case 1:
            case 2:
                System.out.println("いいね！");
                break;
            case 3:
                System.out.println("普通です！");
                break;
            case 4:
            case 5:
                System.out.println("うーーーん");
        }


    }
}

