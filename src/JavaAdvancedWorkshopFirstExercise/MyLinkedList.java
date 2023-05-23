package JavaAdvancedWorkshopFirstExercise;

import java.util.function.Consumer;

public class MyLinkedList {
    private Integer[] arr= new Integer[4];
    private int size;


    public void addFirst(int element){
        if(this.arr.length<=size){
            grow();
        }
        if(size!=0) {
            for (int i = this.size-1; i >= 0; i--) {
                this.arr[i+1]=this.arr[i];
            }
        }
        this.arr[0]=element;
        this.size++;
    }

    public void addLast(int element){
        if(this.arr.length<=size){
            grow();
        }
        this.arr[size]=element;
        this.size++;
    }
    public int get(int index){
        if(isIndexOutOfBounds(index)==true){
            throw new IndexOutOfBoundsException();
        }
        else{
            return this.arr[index];
        }
    }

    private boolean isIndexOutOfBounds(int index) {
            if(this.size<=index || index<0){
                return true;
            }
            else {
                return false;
            }
    }

    private void grow() {
        int newArrayLength=this.arr.length*2;
        Integer [] newArray= new Integer[newArrayLength];
        for (int i = 0; i < this.arr.length; i++) {
            newArray[i]=this.arr[i];
        }
        this.arr=newArray;
    }
    public void removeFirst(){
        if(size!=0) {
            for (int i = 1; i <= this.size-1; i++) {
                this.arr[i-1]=this.arr[i];
            }
            this.arr[this.size-1]=null;
        }
        this.size--;
    }
    public void removeLast(){
        this.arr[size-1]=null;
        this.size--;
    }
    public void forEach(Consumer<Integer> consumer){
        for (Integer i : this.arr) {
            consumer.accept(i);
        }
    }

    public Integer[] toArray(){
        int lengthOfNewArray=0;
        for (int i = 0; i < arr.length; i++) {
            if(this.arr[i]!=null){
                lengthOfNewArray++;
            }
        }
        Integer[] newArray = new Integer [lengthOfNewArray];
        for (int i = 0; i < lengthOfNewArray; i++) {
            newArray[i]=this.arr[i];
        }
        return newArray;
    }

}
