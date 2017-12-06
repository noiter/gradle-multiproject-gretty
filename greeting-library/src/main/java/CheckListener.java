import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CheckListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent event) {
        ServletContext context = event.getServletContext();
        System.out.println("I am here");
    }

    @Override
    public void contextDestroyed(final ServletContextEvent event) {
        System.out.println("I am there");
    }
}