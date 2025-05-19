package N7;

public class Watch {
    public Pointer hour;
    public Pointer minute;
    public Pointer second;

    public void setTime (int hour, int minute, int second){
        //criação dos Pointers
        Pointer hourPointer  = new Pointer();
        Pointer minutePointer  = new Pointer();
        Pointer secondPointer  = new Pointer();
        hourPointer.number = hour;
        minutePointer.number = minute / 5;
        secondPointer.number = second / 5;
        this.hour = hourPointer;
        this.minute = minutePointer;
        this.second = secondPointer;

    }
    public int readHour(){
        return this.hour.number;
    }
    public int readMinute(){
        return this.minute.number * 5;
    }
    public int readSecond (){
        return this.second.number * 5;
    }
    public void show (){
        System.out.println(this.readHour()+" : "+this.readMinute()+ " : "+this.readSecond());
    }
}
