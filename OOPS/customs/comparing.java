package OOPS.customs;

public class comparing implements Comparable<comparing> {
    int rno;
    float marks;

    public comparing(int rno,float marks) {
        this.rno = rno;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return ""+marks;

    }

    @Override
    public int compareTo(comparing o) {
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
