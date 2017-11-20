package Server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScheduleServer {


    public static void main(String[] args){
        ApplicationContext application = new ClassPathXmlApplicationContext("MyServer.xml");
        System.out.println("Server is running.");
    }
}
