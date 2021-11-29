public class ArrayClass {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public ArrayClass() {
        this.arr = arr;
    }

    public void firstMetod() {
        for (int i = 0; SIZE > i; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; SIZE > i; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время заполнения массива первым методом: " + (System.currentTimeMillis() - a) + " ms.");

    }

    public void secondMetod() {
        float [] arr1 = new float[HALF];
        float [] arr2 = new float[HALF];
        for (int i = 0; SIZE > i; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0,HALF);
        System.arraycopy(arr,HALF,arr2,0,HALF);
        Thread thread1 = new Thread(()-> {
            for (int i = 0; arr1.length > i; i++) {
                arr1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
            System.out.println("Время заполнения  первой половины массива вторым методом: "
                    + (System.currentTimeMillis() - a) + " ms.");
        });
        Thread thread2 = new Thread(()-> {
            for (int i = 0; arr2.length > i; i++) {
                arr2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.out.println("Время заполнения второй половины массива вторым методом: "
                    + (System.currentTimeMillis() - a) + " ms.");
        });
        thread1.start();
        thread2.start();
        float [] mergeArr = new float[SIZE];
        System.arraycopy(arr1,0,mergeArr,0,arr1.length);
        System.arraycopy(arr2,0,mergeArr,HALF,arr2.length);
        System.out.println("Время склейки массива вторым методом: "
                + (System.currentTimeMillis() - a) + " ms.");

    }
}
