import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
       TwoWayList<Integer> IntegerOneWayList = new TwoWayList<>();
        IntegerOneWayList.add(55);
        IntegerOneWayList.add(26);
        IntegerOneWayList.add(13);
        IntegerOneWayList.add(98);
        IntegerOneWayList.add(122, 2);
        IntegerOneWayList.addLast(156);
        System.out.println(IntegerOneWayList.size());
        System.out.println(IntegerOneWayList.get(IntegerOneWayList.size()-1));
        System.out.println(IntegerOneWayList.contains(55));
        System.out.println(IntegerOneWayList.indexOf(55));
        System.out.println();
        }

    }
