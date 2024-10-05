package ComparableOrComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComparatorTest1 {
    private Long sid;
    private String sname;

    public ComparatorTest1(Long sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

        Comparator<ComparatorTest1> comparableTest1Comparator
               /* = new Comparator<ComparatorTest1>() {
            @Override
            public int compare(ComparatorTest1 o1, ComparatorTest1 o2) {
                return o1.getSname().compareTo(o2.getSname());
            }
        };*/
        = Comparator.comparing(ComparatorTest1::getSname).thenComparing(ComparatorTest1::getSname);
        Comparator<ComparatorTest1> comparableTest1Comparator1
               /* = new Comparator<ComparatorTest1>() {
            @Override
            public int compare(ComparatorTest1 o1, ComparatorTest1 o2) {
                return o1.getSname().compareTo(o2.getSname());
            }
        };*/
                = Comparator.comparing(ComparatorTest1::getSid);

        List<ComparatorTest1> comparatorTest1s = new ArrayList<>();
        comparatorTest1s.add(new ComparatorTest1(100L, "Vinu"));
        comparatorTest1s.add(new ComparatorTest1(15L, "Balu"));
        comparatorTest1s.add(new ComparatorTest1(12L, "Ragav"));
        comparatorTest1s.add(new ComparatorTest1(45L, "Anusree"));
        comparatorTest1s.add(new ComparatorTest1(1L, "Shinu"));

        comparatorTest1s.sort(comparableTest1Comparator);
        for (ComparatorTest1 comparatorTest1 : comparatorTest1s) {
            System.out.println(comparatorTest1.getSid() + "---" + comparatorTest1.getSname());
        }
    }
}
