import com.example.PropertitesConfig;
import com.example.beans.HelloWorldBean;
import com.example.beans.Knight;
import com.example.beans.MultiTest;
import com.example.beans.aspect.DefaultEncoreable;
import com.example.beans.aspect.Encoreable;
import com.example.beans.aspect.Performance;
import com.example.beans.multi.Dessert;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Created by jt_hu on 2017/5/19.
 */
public class Application {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/knights.xml");

        Performance performance = context.getBean(Performance.class);
        performance.perform("狮子王主题曲");

        Encoreable encoreable = new DefaultEncoreable();
        encoreable.performEncore();

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        PropertitesConfig propertitesConfig = context.getBean(PropertitesConfig.class);
        Environment environment = propertitesConfig.getEnv();
        String msg1 = environment.getProperty("msg1");
        String msg2 = environment.getProperty("msg2");
        String msg3 = environment.getProperty("msg3", "llllllaasss");
        Integer msg4 = environment.getProperty("msg4", Integer.class, 11);

        HelloWorldBean helloWorldBean = context.getBean(HelloWorldBean.class);
        String outPutMsg = helloWorldBean.sayHello();

        MultiTest multiTest = context.getBean(MultiTest.class);
        Dessert dessert = multiTest.getDessert();

        context.close();

    }

}
