import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListExe<E> {
    /*Dups: Write code to remove duplicates from an unsorted linked list.*/
    public LinkedList<E> removeDuplicates(LinkedList<E> list){
        HashSet<E> set = new HashSet<E>();
        for(int i =0; i<list.size();i++){
            if(set.contains(list.get(i))){
                list.remove(i);
                i--;
        }else{
                set.add(list.get(i));
            }

        }
        return list;
    }

    //Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
    public Node<E> findTheKthLastElementLL( Node<E>node, int element){
        Node<E> toReturn = node;
        for (int i = 0;i<element && node!=null;i++){
            node = node.next;
        }

        while (node!= null){
            node = node.next;
            toReturn = toReturn.next;
        }
        return toReturn;
    }

}
