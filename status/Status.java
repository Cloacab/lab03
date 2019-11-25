package status;

public enum Status{
    HEALTHY ("Seems preaty healthy"),
    INJURED ("Got some wounds"),
    BADLY_INJURED ("Badly injured, near-death condition"),
    DEAD ("R.I.P.");
    private String status;

    Status(String status){
        this.status = status;
    }

    

    @Override
    public String toString(){
        switch (this){
            case HEALTHY:
                System.out.println("The creature: " + status);
                break;
            case INJURED:
                System.out.println("The creature: " + status);
                break;
            case BADLY_INJURED:
                System.out.println("The creature: " + status);
                break;
            case DEAD:
                System.out.println("The creature: " + status);
                break;
        }
        return super.toString();
    }
};