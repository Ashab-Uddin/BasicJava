package report;
interface X {
    public void displayX();
}

interface Y {
    public void displayY();
}

class Z implements X, Y {
    @Override
    public void displayX() {
        System.out.println("Class X");
    }

    @Override
    public void displayY() {
        System.out.println("Class Y");
    }

    private void displayZ() {
        System.out.println("Class Z");
    }

    protected void invokeDisplayZ() {
        displayZ();
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Z objZ = new Z();

        objZ.displayX();
        objZ.displayY();
        objZ.invokeDisplayZ();
    }
}
