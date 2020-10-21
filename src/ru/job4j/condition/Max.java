package ru.job4j.condition;

public class Max {

    public int max(int left, int right) {
        return left >= right ? left : right;
    }

    public int max(int left, int right, int up) {
        int temp = max(right, up);
        return max(left, temp);
    }

    public int max(int left, int right, int up, int down) {
        int temp1 = max(left, right);
        int temp2 = max(up, down);
        return max(temp1, temp2);
    }
}
