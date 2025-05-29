enum Status {
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    FAILED;
}
enum Laptop{
    DELL("XPS 13"),
    HP("Spectre x360"),
    LENOVO("ThinkPad X1"),
    ASUS("ZenBook 14");

    private String model;
    private Laptop() {
        this.model = "Unknown Model";
    }

    private Laptop(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
public class Enum{
    public static void main(String[] args) {
        Status[] ss= Status.values();
        for (Status s : ss) {
            System.out.println(s+" : "+s.ordinal());
        }

        Status s1 = Status.PENDING;
        
        switch(s1) {
            case PENDING:
                System.out.println("Status is pending.");
                break;
            case IN_PROGRESS:
                System.out.println("Status is in progress.");
                break;
            case COMPLETED:
                System.out.println("Status is completed.");
                break;
            case FAILED:
                System.out.println("Status has failed.");
                break;
            default:
                System.out.println("Unknown status.");
        }

        for(Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getModel());
        }
    }
}