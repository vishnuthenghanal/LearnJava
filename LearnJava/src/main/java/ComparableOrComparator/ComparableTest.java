package ComparableOrComparator;

import java.util.*;

class ComparableTest1 implements Comparable<ComparableTest1>{
    private Long sid;
    private String sname;

    public ComparableTest1(Long sid, String sname) {
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

    @Override
    public int compareTo(ComparableTest1 o) {
        return this.sname.compareTo(o.sname);
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        List<ComparableTest1> comparableTest1s = new ArrayList<>();
        comparableTest1s.add(new ComparableTest1(100L, "Vinu"));
        comparableTest1s.add(new ComparableTest1(15L, "Balu"));
        comparableTest1s.add(new ComparableTest1(12L, "Ragav"));
        comparableTest1s.add(new ComparableTest1(45L, "Anusree"));
        comparableTest1s.add(new ComparableTest1(1L, "Shinu"));

        Collections.sort(comparableTest1s);
        for (ComparableTest1 comparableTest1 : comparableTest1s){
            System.out.println(comparableTest1.getSid() + "---" +comparableTest1.getSname());
        }

    }
}
