package com.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class Rotten {

    public final static int ROW = 3;
    public final static int COLUMN = 5;

    static boolean isValid(int i, int j) {
        return (i >= 0 && j >= 0 && i < ROW && j < COLUMN);
    }

    static boolean isDelim(Element temp) {
        return (temp.x == -1 && temp.y == -1);
    }

    static boolean checkAll(int[][] arr) {
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COLUMN; j++)
                if (arr[i][j] == 1)
                    return true;
        return false;
    }

    static int rotOrange(int[][] arr) {
        Queue<Element> queue = new LinkedList<Element>();
        Element temp;
        int answar = 0;
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COLUMN; j++)
                if (arr[i][j] == 2)
                    queue.add(new Element(i, j));
        queue.add(new Element(-1, -1));
        while (!queue.isEmpty()) {
            boolean flag = false;
            while (!isDelim(queue.peek())) {
                temp = queue.peek();
                if (isValid(temp.x, temp.y) && arr[temp.x + 1][temp.y] == 1) {
                    if (!flag) {
                        answar++;
                        flag = true;
                    }
                    arr[temp.x + 1][temp.y] = 2;
                    temp.x++;
                    queue.add(new Element(temp.x, temp.y));
                    temp.x--;
                }
                if (isValid(temp.x, temp.y) && arr[temp.x - 1][temp.y] == 1) {
                    if (!flag) {
                        answar++;
                        flag = true;
                    }
                    arr[temp.x - 1][temp.y] = 2;
                    temp.x--;
                    queue.add(new Element(temp.x, temp.y));
                    temp.x++;
                }
                if (isValid(temp.x, temp.y) && arr[temp.x][temp.y + 1] == 1) {
                    if (!flag) {
                        answar++;
                        flag = true;
                    }
                    arr[temp.x][temp.y + 1] = 2;
                    temp.y++;
                    queue.add(new Element(temp.x, temp.y));
                    temp.y--;
                }
                if (isValid(temp.x, temp.y) && arr[temp.x][temp.y - 1] == 1) {
                    if (!flag) {
                        answar++;
                        flag = true;
                    }
                    arr[temp.x][temp.y - 1] = 2;
                    temp.y--;
                    queue.add(new Element(temp.x, temp.y));
                    temp.y++;
                }
                queue.remove();
            }
            if (!queue.isEmpty()) {
                queue.add(new Element(-1, -1));
            }
        }
        return (checkAll(arr)) ? -1 : answar;

    }

    static class Element {
        int x = 0;
        int y = 0;

        Element(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
