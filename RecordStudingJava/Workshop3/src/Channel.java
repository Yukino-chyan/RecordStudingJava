public class Channel {
    private static int number = 0;
    private String name;
    private Show[] shows = new Show[5];
    public boolean showAdd(Show show){
        if(number>=5){
            System.out.println("Add Failed");
            return false;
        }
        System.out.println("Add Success");
        shows[number] = show;
        number++;
        return true;
    }
    public boolean showCancel(Show show){
        for(int i=0; i<=number-1; i++){
            if(shows[i].equals(show)){
                shows[i] = null;
                number--;
                System.out.println("Cancel Success");
                return true;
            }
        }
        return false;
    }
    public String getShow(int hour,int min){
        for(int i=0; i<=number-1; i++){
            if(shows[i].judge(hour,min)){
                System.out.println(shows[i].getName());
                return name;
            }
        }
        return "NULL";
    }
}
