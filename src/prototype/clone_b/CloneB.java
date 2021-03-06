package prototype.clone_b;

class CloneB implements Cloneable {
    public int aInt;
    public UnCloneA unCA = new UnCloneA(111);

    public Object clone() {
        CloneB o = null;
        try {
            o = (CloneB) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        o.unCA = (UnCloneA) unCA.clone();
        return o;
    }
} 