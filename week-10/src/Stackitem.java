public class Stackitem {

    private Object data;
    private Stackitem next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Stackitem getNext() {
        return next;
    }

    public void setNext(Stackitem next) {
        this.next = next;
    }

    public Stackitem(Object data) {
        this.data = data;
    }

}
