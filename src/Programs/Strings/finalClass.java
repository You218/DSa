package Programs.Strings;

final class finalClass {
    private final int rollNo;
    private final String name;

    public finalClass(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "finalClass{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

}

