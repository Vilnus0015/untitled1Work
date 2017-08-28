package com.company;



public class Main {
    private static String[] array = new String[]{"Мама", "Мыла", "Раму"};
    private static final int N = array.length;

    public static void main(String[] args) {
        Step(0);
    }

    private static void Step(int count) {
        if (count == N-1) {
            for (int i = 0; i < N; i++) {
                System.out.print(array[i]);
            }
            System.out.print("\n");
        }

        for (int j = count; j < N; j++) {
            Swap(j, count);
            Step(count+1);
            Swap(j, count);
        }
    }

    private static void Swap(int j, int count) {
        String c = array[j];
        array[j] = array[count];
        array[count] = c;
    }
}













