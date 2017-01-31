import be.vdab.entities.Persoon;
import be.vdab.services.PersoonService;
import be.vdab.services.PersoonServiceImpl;
import be.vdab.viewers.PersoonViewer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public class Main {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")){
            PersoonService service = context.getBean("persoonServiceImpl", PersoonService.class);
            System.out.println(service.findAll());
        }
    }
}
