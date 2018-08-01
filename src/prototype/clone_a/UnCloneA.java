package prototype.clone_a;

class UnCloneA {
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
} 