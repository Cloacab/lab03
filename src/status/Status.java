package status;

public enum Status{
    GREAT ("Feels amazing, as it possile in this situation"),
    HEALTHY ("Seems pretty healthy"),
    INJURED ("Got some wounds"),
    BADLY_INJURED ("Badly injured, near-death condition"),
    DEAD ("R.I.P.");

    private String status;

    Status(String status){
        this.status = status;
    } 

    @Override
    public String toString(){
        return this.status;
    }
};