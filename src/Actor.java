/**
 * Created by zhangsuixin on 15/12/16.
 */
public class Actor extends Thread{
    public void run(){
        System.out.println(getName() + "yanchukaishi");
        int i=0;
        System.out.println("yanchucishu" + (++i));
        System.out.println(getName() + "yanchukaishi");
    }
    public static void main(String[] args){
        Thread actor = new Actor();
        actor.setName("zhangsuixin");
        actor.start();

    }
}
