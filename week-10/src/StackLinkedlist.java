public class StackLinkedlist implements  Stack {

    Stackitem top;

    @Override
    public void push(Object item) {
        Stackitem newBox = new Stackitem(item);
        Stackitem previousTop = top;
        top = newBox;
        top.setNext(previousTop);



    }

    @Override
    public Object pop() {
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "+ this.top.getData());

    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

}
