//1. Напишите метод, на вход которого подаётся двумерный
// строковый массив размером 4х4, при подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива,
// преобразовать в int, и просуммировать. Если в каком-то
// элементе массива преобразование не удалось (например, в ячейке лежит символ или текст
// вместо числа), должно быть брошено исключение MyArrayDataException,
// с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные
// исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

public class HW_2_2_re {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"1","2","3","4"},
                {"5","6","8","3"},
                {"9","10","11","12"},
                {"13","g","w","4"}};

        String[][] arr2 = new String[][]{
                {"10","20","30","40","PW"},
                {"50","60","70","80"},
                {"90","-10","110","1+2"},
                {"13","1","w","4m"}};

        String[][] arr3= new String[][]{
                {"61","-102","3","4"},
                {"5","-64","7","8"},
                {"9","10","11","12"},
                {"13","3","16","4"}};
        try {
            ArraySummator.sum(arr1);
        } catch (MyArrayDataException e){
            e.printStackTrace();
        } catch (MyArreaySizeException e){
            e.printStackTrace();
        }
        try {
            ArraySummator.sum(arr2);
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            ArraySummator.sum(arr3);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
