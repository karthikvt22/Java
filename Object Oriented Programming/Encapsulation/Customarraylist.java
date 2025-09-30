package OOPS.packages.Generics;

import java.util.ArrayList;
import java.util.Arrays;

//import java.util.*;
public class Customarraylist {

    static private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;

    public Customarraylist(){
        this.data = new int [DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length *2];

        for (int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data =temp;
    }
    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList<>();
        arr1.add(45);
        System.out.println(arr1);
        Customarraylist one = new Customarraylist();
        one.add(3);
        one.add(4);
        one.add(6);
        System.out.println((one));
        System.out.println(one);
        System.out.println(one.data);
        System.out.println(Arrays.toString(Customarraylist.data));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(45);
        list1.add(43);
        list1.add(88);
        System.out.println(list1);

    }
}

