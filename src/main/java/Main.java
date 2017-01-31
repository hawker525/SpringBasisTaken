import be.vdab.entities.Persoon;
import be.vdab.views.PersoonViewer;
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
            Persoon a = new Persoon(0, "maarten", "westelinck", 1);
            Persoon b = new Persoon(1, "test", "tester", 2);
            List<Persoon> personen = new ArrayList<>();
            personen.add(a);
            personen.add(b);
            PersoonViewer persoonViewer = context.getBean("persoonViewer", PersoonViewer.class);
            persoonViewer.afbeelden(personen);
        }
    }
}
