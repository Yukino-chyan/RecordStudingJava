public class Show {
    private int durition,air_time_hour,air_time_min;
    private String name;
    public Show (int durition, int air_time_hour, int air_time_min, String name) {
        this.durition = durition;
        this.air_time_hour = air_time_hour;
        this.air_time_min = air_time_min;
        this.name = name;
    }
    public boolean equals(Show show){
        return this.name == show.name;
    }
    public boolean judge(int hour,int min){
        if((hour*60+min)<(air_time_hour*60+air_time_min)){
            return false;
        }
        if((hour*60+min)>((air_time_hour*60+air_time_min)+durition)){
            return false;
        }
        return true;
    }
    public String getName(){
        return name;
    }
}
