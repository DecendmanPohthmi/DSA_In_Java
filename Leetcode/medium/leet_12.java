package Leetcode.medium;

public class leet_12 {
    public static String value(int n) {
        switch (n) {
            case 1: return "I";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 9: return "IX";
            case 10: return "X";
            case 40: return "XL";
            case 50: return "L";
            case 90: return "XC";
            case 100: return "C";
            case 400: return "CD";
            case 500: return "D";
            case 900: return "CM";
            case 1000: return "M";
        }
        return "";
    }

    public static String intToRoman(int num) {
        String result = "";
        while(num != 0) {
            if(num >= 1000) {
                String letter = value(1000);
                result += letter;
                num -= 1000;
            } else if(num >= 900) {
                String letter = value(900);
                result += letter;
                num -= 900;
            } else if(num >= 500) {
                String letter = value(500);
                result += letter;
                num -= 500;
            } else if(num >= 400) {
                String letter = value(400);
                result += letter;
                num -= 400;
            }else if(num >= 100) {
                String letter = value(100);
                result += letter;
                num -= 100;
            }else if(num >= 90) {
                String letter = value(90);
                result += letter;
                num -= 90;
            }else if(num >= 50) {
                String letter = value(50);
                result += letter;
                num -= 50;
            }else if(num >= 40) {
                String letter = value(40);
                result += letter;
                num -= 40;
            }else if(num >= 10) {
                String letter = value(10);
                result += letter;
                num -= 10;
            }else if(num >= 9) {
                String letter = value(9);
                result += letter;
                num -= 9;
            }else if(num >= 6) {
                String letter = value(6);
                result += letter;
                num -= 6;
            }else if(num >= 5) {
                String letter = value(5);
                result += letter;
                num -= 5;
            }else if(num >= 4) {
                String letter = value(4);
                result += letter;
                num -= 4;
            }else if(num >= 1) {
                String letter = value(1);
                result += letter;
                num -= 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 1994;
        String result = intToRoman(num);
        System.out.println(result);
    }
}
