public class MyArrayDataException extends NumberFormatException {


    public MyArrayDataException(int i, int j) {
        System.out.println ("Не удалось преобразовать значения в ячейках "+i+" "+j);
    }
}
