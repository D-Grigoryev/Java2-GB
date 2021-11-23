public class Array {
    int SIZE = 4;
    String[][] arr = new String[SIZE][SIZE];
    Integer [][] intarr;

    Array(String[][] arr) {
        this.arr = arr;
    }

    public void setArr(String[][] arr) throws MyArraySizeException, MyArrayDataException{

        try {

            int summ = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr.length != SIZE) {
                    throw new MyArraySizeException("Ошибка размерности массива");
                }
                for (int j = 0; j<arr[i].length ; j++){
                    if (arr[i].length != SIZE) {
                        throw new MyArraySizeException("Ошибка размерности массива");
                    }
                    try {
                        summ=summ+Integer.parseInt(arr[i][j]);
                    }catch (NumberFormatException e) {
                        throw new MyArrayDataException(i,j);
                    }
                }
            }
            System.out.println("Результат суммирования значений элементов массива: "+summ);
        } catch (MyArraySizeException e) {
            System.out.println("Массив не соотвествеут разрешенному размеру. Размер массива долен быть " + SIZE + "X" + SIZE);
            e.printStackTrace();
        }
    }

}


