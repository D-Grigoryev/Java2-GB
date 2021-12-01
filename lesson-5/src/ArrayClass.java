import java.util.Arrays;

public class ArrayClass {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public ArrayClass() {
        this.arr = arr;
    }

    public void firstMetod() {
        Arrays.fill(arr,1.0f);
        long a = System.currentTimeMillis();
        for (int i = 0; arr.length > i; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println("Время заполнения массива первым методом: "+(b-a)+" ms.");

    }

    public void secondMetod() throws InterruptedException {
        float [] arr1 = new float[HALF];
        float [] arr2 = new float[HALF];
        Arrays.fill(arr,1.0f);
        long a = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0,HALF);
        System.arraycopy(arr,HALF,arr2,0,HALF);
        long b = System.currentTimeMillis();
        System.out.println("Время разбивки массива во втором методе: "+(b-a)+" ms.");

        Thread thread1 = new Thread(()-> {
            long a1start = System.currentTimeMillis();
            for (int i = 0; arr1.length > i; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
            long a1end = System.currentTimeMillis();
            System.out.println("Время заполнения первой половины массива первым методом: "
                    + (a1end-a1start) + " ms.");
        });
        Thread thread2 = new Thread(()-> {
            long a2start = System.currentTimeMillis();
            for (int i = 0; arr2.length > i; i++) {
               int j=i+HALF;
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));

            }
            long a2end = System.currentTimeMillis();
            System.out.println("Время заполнения второй половины массива вторым методом: "
                    + (a2end-a2start) + " ms.");
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long c = System.currentTimeMillis();
        System.arraycopy(arr1,0,arr,0,HALF);
        System.arraycopy(arr2,0,arr,HALF,HALF);
               long d = System.currentTimeMillis();
        System.out.println("Время склейки массива вторым методом: "
                + (d - c) + " ms.");
        System.out.println("Общее время работы: "
                + (d - a) + " ms.");

    }
}
