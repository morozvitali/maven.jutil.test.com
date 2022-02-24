import java.util.Arrays;

public class Stack {

    static int i = 0;
    Object[] objArray = new Object[0];
    boolean ArrayIsEmpty = true;

    public Stack () {
    }

    public void push() {
        Object newObject = new Object();
        if (i < objArray.length) {
            objArray[i] = newObject;
        } else {
            Object[] objNewArray = new Object[objArray.length + 1];
            for (int a = 0; a < objArray.length; a++) {
                objNewArray[a] = objArray[a];
            }
            objNewArray[i] = newObject;
            objArray = objNewArray;
            System.out.println( objNewArray.length);

        }

        {
            i++;
            ArrayIsEmpty = false;
        }
    }

    public void pop() {
        if (!ArrayIsEmpty && i > 1) {
            Object[] objNewArray = new Object[objArray.length - 1];
            for (int a = 1; a < objArray.length; a++) {
                objNewArray[a - 1] = objArray[a];
            }
            i--;
            objArray = objNewArray;
        }


        else if (!ArrayIsEmpty) {
            objArray = new Object[0];
            ArrayIsEmpty = true;
            i = 0;
        } else {
            ArrayIsEmpty = true;
        }
    }

    public boolean isArrayIsEmpty(Object [] array) {
        if (ArrayIsEmpty) {
            return true;
        } else
        return false;
    }

    @Override
   public String toString() {

        return "Stack {" +
                "Objects: " + Arrays.toString(objArray) +
                ", Array is empty: " + ArrayIsEmpty +
                '}';
    }
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