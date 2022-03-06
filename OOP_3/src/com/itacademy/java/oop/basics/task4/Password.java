package com.itacademy.java.oop.basics.task4;

public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public void Validation() {
        char[] ch;
        ch = password.toCharArray();
        if (password.length() >= 10) {
            int digits = 0;
            int letters =0;
            for (int chars = 0; chars < password.length(); chars++) {
                if (Character.isDigit(ch[chars])) {
                    digits++;
                } else if (Character.isLetter(ch[chars])) {
                    letters++;
                } else {
                    System.out.println("Password must contain only numbers and characters.");
                    return;
                }
            }
            if (digits < 2) {
                System.out.println("Password must contain at least 2 numbers.");
            }else if(letters < 1){
                System.out.println("Password must contain at least 1 letter.");
            }else {
                System.out.println("Password is valid " + password);
            }
        } else {
            System.out.println("Password must contain at least 10 characters.");
        }

    }

    @Override
    public String toString() {
        return "password is valid'" + password;
    }
}
