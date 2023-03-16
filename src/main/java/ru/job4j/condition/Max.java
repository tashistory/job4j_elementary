package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int first) {
        return max(left, right) > first ? max(left, right) : first; }

    public static int max(int left, int right, int first, int second) {
        return max(max(left, right), first) > second ? max(left, right, first) : second; }
}

