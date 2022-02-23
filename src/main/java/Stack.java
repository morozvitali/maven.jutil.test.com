import java.util.Arrays;

public class Stack {

    static int i = 0;
    Object[] objArray = new Object[0];
    boolean ArrayIsEmpty = true;

    public Stack () {
    }

    // добавляем элемент в массив
    // нужно проверить что новый эленет не null
    public void push() {
        Object newObject = new Object();
        if (i < objArray.length) {
            objArray[i] = newObject;
            System.out.println("method push: Object Added to Array, number of Objects in Array: " + (i + 1));

        } else {




            Object[] objNewArray = new Object[objArray.length + 1];
            for (int a = 0; a < objArray.length; a++) {
                objNewArray[a] = objArray[a];
            }
            objNewArray[i] = newObject;
            objArray = objNewArray;
            System.out.println("method push: Array is Full, Object added, number of Objects in Array " + (i + 1));


        }

        {
            i++;
            ArrayIsEmpty = false;
        }
    }

    // забираем отсюда элементы массива, переключаемся между объектами полсе стирания - стертый элемент по номеру в массиве должен получить значение null
    // колчиество "Элементов" в массиве должно стать -1, то есть i должно стать меньше на один
    public void pop() {
        if (!ArrayIsEmpty && i > 1) {
            Object[] objNewArray = new Object[objArray.length - 1];
            for (int a = 1; a < objArray.length; a++) {
                objNewArray[a - 1] = objArray[a];
            }
            i--;
            objArray = objNewArray;
            System.out.println("method pop: Object Deleted from Array, Array has elements: " + (i));
        }


        else if (!ArrayIsEmpty) {
            objArray = new Object[0];
            System.out.println("method pop: Object deleted, Array is empty now");
            ArrayIsEmpty = true;
            i = 0;
        } else {
            ArrayIsEmpty = true;
            System.out.println("method pop: Array is empty");
        }
    }
    // проверить количество обьектов в массиве до и после
    //



    // здесь добавили переменные метода
    public boolean isArrayIsEmpty(Object [] array) {
        if (ArrayIsEmpty) {
            return true;
        } else
        return false;
    }



    // сюда передать массив, метод должен принять массив!
        // тестируем Assert.arrayIsEmpty походу
        // кидаем два массива, один пустой один нет
    // возвращает булеан




    @Override // раскладем toString
   public String toString() {

        return "method toString Stack {" +
                "Objects in Array: " + Arrays.toString(objArray) +
                ", Array is empty: " + ArrayIsEmpty +
                '}';
    }//// конец toString
    // в тесте вызвать toString() на массиве класса Stack
    // методы теста еквивалентно, сумма, булеан
}


class Object {
    static int id;
    int myId;

    public Object() {
        this.myId = id;
        id++;
    }

    @Override
    public String toString() {
        return "id: " + myId;
    }
}