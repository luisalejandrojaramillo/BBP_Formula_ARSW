package edu.eci.arsw.math;

public class PiThread extends Thread {
    PiDigits piDigits = new PiDigits();
    int inicio, count, n;
    private static int DigitsPerSum = 8;

    public PiThread(int inicio, int count, int n) {
        this.inicio = inicio;
        this.count = count;
        this.n = n;
    }

    @Override
    public void run() {
        double sum = 0;
        byte[] digits = new byte[count];
        for (int i = 0; i < count+n; i++) {
            if (i % DigitsPerSum == 0) {
                sum = 4 * piDigits.sum(1, inicio)
                        - 2 * piDigits.sum(4, inicio)
                        - piDigits.sum(5, inicio)
                        - piDigits.sum(6, inicio);
                inicio += DigitsPerSum;
            }
            sum = 16 * (sum - Math.floor(sum));
            digits[i] = (byte) sum;
        }
    }
}