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

    @Test
    public void removeDuplicatesTest()throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
       q.removeDuplicates(list);

       Assert.assertTrue(list.size()==7);
    for (int i=0;i<7;i++){
             Assert.assertTrue(list.get(i) == i+1);
        }
    }

    @Test
    public  void findTheKthLastElementLLTest(){
       Node<Integer> list = createLIst();
        Assert.assertTrue(q.findTheKthLastElementLL(list,8).data.intValue()==13);
        Assert.assertTrue(q.findTheKthLastElementLL(list,19).data.intValue()==2);
        Assert.assertTrue(q.findTheKthLastElementLL(list,10).data.intValue()==11);
        Assert.assertTrue(q.findTheKthLastElementLL(list,1).data.intValue()==20);
        Assert.assertTrue(q.findTheKthLastElementLL(null,8)==null);
    }




}
