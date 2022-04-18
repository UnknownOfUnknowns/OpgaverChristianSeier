package Christian.OPG4_8;

public class Duration {
    private int start_hour;
    private int end_hour;
    private int start_minute;
    private int end_minute;

    public Duration(int sh, int eh, int sm, int em) {
        this.start_hour = sh;
        this.end_hour = eh;
        this.start_minute = sm;
        this.end_minute = em;
    }

    public int getStart_hour() {
        return start_hour;
    }

    public int getEnd_hour() {
        return end_hour;
    }

    public int getStart_minute() {
        return start_minute;
    }

    public int getEnd_minute() {
        return end_minute;
    }
    public void setStart_hour(int sh) {
        this.start_hour = sh;
    }
    public void setEnd_hour(int eh) {
        this.end_hour = eh;
    }
    public void setStart_minute(int sm) {
        this.start_minute = sm;
    }
    public void setEnd_minute(int em) {
        this.end_minute = em;
    }

    /* public int getLength(){
        return
    }
    */
    @Override
    public String toString() {
        return "Duration" + "[" + start_hour + ":" + start_minute + "]" + end_hour + ":" + start_hour + "]";
    }
}
