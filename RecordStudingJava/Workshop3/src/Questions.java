public class Questions {
    public void Question1(){
        String Initial = "LeAgUe oF LeGeNdS";
        String Final = "";
        for(int i=0;i<Initial.length();i++){
            if( i==0 || ( Initial.charAt(i-1) == ' ' )) Final+=Initial.charAt(i);
        }
        System.out.println("Final is "+Final);
    }
    public void Question2(){
        System.out.println("The answer has in the Drone Class");
    }
    public void Question3(){
        System.out.println("The answer has in the Student Class");
    }
    public void Question4(){
        Channel channel = new Channel();
        Show show1 = new Show(30,9,30,"Yukinochyan");
        channel.showAdd(show1);
        channel.getShow(9,45);
        channel.showCancel(show1);
        System.out.println("The answer has in the Channel and Show Class");
    }
}
