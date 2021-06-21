import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;


public class LinkedListTests {
    LinkedListExe<Integer> q= new   LinkedListExe<Integer>();

    private Node createLIst() {
        Node<Integer> list = new Node<Integer>(1,null);
        Node<Integer> curr = list;
        for (int i= 2; i<=20;i++){
            Node<Integer> next = new Node<Integer>(i,null);
            curr.next = next;
            curr=next;
        }
        return list;
    }

//    @Test
//    public void removeDuplicatesTest()throws Exception {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(3);
//        list.add(6);
//        list.add(7);
//        list.add(7);
//        list.add(7);
//        list.add(7);
//        list.add(7);q.removeDuplicates(list);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//    }

    @Test
    public  void findTheKthLastElementLLTest(){
       Node list = createLIst();
        System.out.println(q.findTheKthLastElementLL(list,8).data);
        System.out.println(list.data);
//       Assert.assertTrue(q.findTheKthLastElementLL(list,8).data == 13));
    }




}
