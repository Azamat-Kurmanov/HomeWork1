package homeWork;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
//        list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1);
        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(4);
        list1.next = list1_2;
        list1_2.next = list1_3;

        ListNode list2 = new ListNode(1);
        ListNode list2_2 = new ListNode(3);
        ListNode list2_3 = new ListNode(4);
        list2.next = list2_2;
        list2_2.next = list2_3;

        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println("listNode r1: " + listNode.val + " r2: " + listNode.next.val +" r3 "+ listNode.next.next.val+" r4: " +listNode.next.next.next.val +" r5: "+listNode.next.next.next.next.val+" r6: " + listNode.next.next.next.next.next.val);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        System.out.println("first: " + list1.val + " second: " + list1.next.val + " third: " + list1.next.next.val);
//        System.out.println("first: " + list2.val + " second: " + list2.next.val + " third: " + list2.next.next.val);
//        if (list1==null && list2==null){
//            return null;
//        }
//        if (list1==null || list2==null) {
//            return null;
//        }
        if (list1==null) return list2;
        if (list2==null) return list1;
        if (list1==null && list2==null) return null;
        //----Проверка значений: Если значение из первого list1 больше чем list2, то меняем местами
        if (list1.val>list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode mainResult = list1;
        //--Запускаю бесконечный цикл
        while (list1 != null && list2 != null){
            ListNode nextNode = null;
            //--Проверяю если list1 <= list2 то перебираю list1 и передаю его в nextNode, а затем делаю list1 = list1.next
            while (list1!=null && list1.val<=list2.val){
                nextNode = list1;
                list1 = list1.next;
            }
            nextNode.next = list2;

            ListNode temp = list1;
            list1=list2;
            list2=temp;
        }
        //----
        return mainResult;
    }
}