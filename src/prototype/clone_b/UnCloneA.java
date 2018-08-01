package prototype.clone_b;

class UnCloneA implements Cloneable {
    private int i;

    public UnCloneA(int ii) {
        i = ii;
    }

    public void doublevalue() {
        i *= 2;
    }

    public String toString() {
        return Integer.toString(i);
    }

    public Object clone() {
        UnCloneA o = null;
        try {
            o = (UnCloneA) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
} 