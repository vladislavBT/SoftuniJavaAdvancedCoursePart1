package JavaAdvancedWorkshopFirst;

public class MyStack {
    private class Node{
        int element;
        Node prev;

        public Node(int element) {
            this.element = element;
        }
    }


    private int size;
    private Node top;

    public void push(int element){
        Node newNode = new Node(element);
        if(this.top==null){
            this.top=newNode;
        }else{
            newNode.prev=this.top;
            this.top=newNode;
        }
        this.size++;
    }
    public int  pop(){
        ensureIsNotEmpty("pop");
       Node newNode = this.top.prev;
       int el = this.top.element;
       this.size--;
       this.top=newNode;

       return el;
    }
    public int peek(){
        ensureIsNotEmpty("peek");
        return this.top.element;
    }
    public void ensureIsNotEmpty(String operation){
        if(isEmpty()){
            try {
                throw new IllegalAccessException("Cannot" + operation + " on empty stack");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty(){
        return this.size==0;
    }

}
