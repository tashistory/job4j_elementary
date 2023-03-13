package ru.job4j.array;


import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (!name.isEmpty() && isLowerLatinLetter(name.codePointAt(0))) {
            char[] array = name.toCharArray();
            for (int i = 1; i < array.length; i++) {
                if (!isLowerLatinLetter(name.codePointAt(i)) && !isUpperLatinLetter(name.codePointAt(i))
                        && !isSpecialSymbol(name.codePointAt(i)) && !isDigit(array[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 95 || code == 36;
    }

    public static boolean isUpperLatinLetter(int code) {
        for (int i = 65; i <= 90; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        for (int i = 97; i <= 122; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }
}
