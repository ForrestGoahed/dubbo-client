package client;

import com.sht.service.service.SayHelloToClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/4/20 15:30
 * @since JRE 1.6.0_22  or higher
 */
public class MyClient {

    public void sayHello(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationConsumer.xml"});

        context.start();

        //获取服务器的bean
        SayHelloToClient demoService = (SayHelloToClient)context.getBean("demoService");

        System.out.println(demoService.sayHello("lisi"));
    }

}
