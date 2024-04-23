package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //These are generic methods
        arrayList.add(1);
        arrayList.add(2);
        arrayList.remove(1);
        arrayList.size();
        arrayList.isEmpty();

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.size();
        treeSet.isEmpty();
        treeSet.remove(1);
        treeSet.clear();

        for(Integer no:treeSet){
            //do some operation
        }


        Stack<Integer> st = new Stack<>();
        st.size();
        st.add(1);
        st.add(2);
        st.lastIndexOf(1);
        int lastElement = st.lastElement();

        for(Integer no: st){
            //do some operation
        }

        LinkedList<Integer> linkedList = new LinkedList<>();

        for(Integer no: linkedList){
            //do some operation
        }

        linkedList.add(1);
        linkedList.add(2);

        linkedList.lastIndexOf(1); //List Interface methods
        linkedList.peek(); //Queue Interface
        linkedList.poll();


        ArrayList<Integer> arrayList1 = new ArrayList<>(); //This contains arrayList of Integers

        ArrayList<String> arrayList2 = new ArrayList<>(); //This contains arrayList of string

        ArrayList<Person> arrayList3 = new ArrayList<>();

        for(Integer no:arrayList1) {
            //Do a particular operation
        }




    }
}
class Person{

}
