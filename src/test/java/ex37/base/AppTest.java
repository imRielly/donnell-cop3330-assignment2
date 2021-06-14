package ex37.base;

import org.junit.jupiter.api.Test;

import static ex37.base.App.generatePassword;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generatePassword_test() {
        int len = 10;
        int symb = 2;
        int numb = 2;

        String password = generatePassword(len, symb, numb);
        int countSymb = 0;
        int countNumb = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                countNumb++;
            }
            if(!Character.isDigit(c) && !Character.isAlphabetic(c)) countSymb++;
        }

        boolean metLength = false;
        boolean metSymb = false;
        boolean metNumb = false;

        if(password.length() >= len) {
            metLength = true;
        }
        if(countSymb >= symb) {
            metSymb = true;
        }
        if(countNumb >= numb) {
            metNumb = true;
        }

        assertTrue(metLength && metSymb && metNumb);
    }

    @Test
    void generatePassword_test2() {
        int len = 4;
        int symb = 2;
        int numb = 2;

        String password = generatePassword(len, symb, numb);
        int countSymb = 0;
        int countNumb = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                countNumb++;
            }
            if(!Character.isDigit(c) && !Character.isAlphabetic(c)) countSymb++;
        }

        boolean metLength = false;
        boolean metSymb = false;
        boolean metNumb = false;

        if(password.length() >= len) {
            metLength = true;
        }
        if(countSymb >= symb) {
            metSymb = true;
        }
        if(countNumb >= numb) {
            metNumb = true;
        }

        assertTrue(metLength && metSymb && metNumb);
    }
}