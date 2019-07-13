package com.t3h.prime;

public class MyPrime {
    private int numberCheck;
    private int numberN;


    public boolean primeCheck(int numberCheck) {
        this.numberCheck = numberCheck;
        if (numberCheck == 1) return false;
        if (numberCheck == 2) return true;
        for (int i = 2; i < numberCheck; i++) {
            if (numberCheck % i == 0) return false;
        }
        return true;
    }

    public String primerListed(int numberN) {
        this.numberN = numberN;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numberN; i++) {
            if (primeCheck(i)) sb.append(i + ",");
        }
        sb.deleteCharAt(sb.length()-1);
        String str = sb.toString();
        return str;
    }
    public boolean check(String nbCheck){
        for (int i = 0; i < nbCheck.length(); i++) {
            if (nbCheck.charAt(i) < '0' || nbCheck.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
