class Super {
    void meth1() {
        System.out.println("Super meth1");
    }

    void meth2() {
        System.out.println("Super meth2");
    }
}

class Sub extends Super {
    @Override
    void meth2() {
        System.out.println("Sub meth2");
    }

    void meth3() {
        System.out.println("Sub meth3");
    }
}

public class DMD{
    public static void main(String[] args) {

        Super s = new Sub();  // parent reference, child object

        s.meth1();  // from Super
        s.meth2();  // overridden → from Sub=>dynamic method dispatch
        // s.meth3(); ❌ not allowed(sice the reference is of parent)
    }
}