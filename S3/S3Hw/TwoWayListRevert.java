package S3Hw;

public class TwoWayListRevert {
    public static void main(String[] args) {

        TwoWayList<Integer> integerTwoWayList = new TwoWayList<>();
        integerTwoWayList.add(1);
        integerTwoWayList.add(2);
        integerTwoWayList.add(3);
        integerTwoWayList.add(4);
        System.out.printf("Двухсвязный список до разворота: " + integerTwoWayList.printList());
        System.out.println();
        integerTwoWayList.revert();
        System.out.printf("Двухсвязный список после разворота: " + integerTwoWayList.printList());
    }
}