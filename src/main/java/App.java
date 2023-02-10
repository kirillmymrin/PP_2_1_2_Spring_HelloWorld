import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld tree =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(tree.getMessage());

        HelloWorld leaf =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(leaf.getMessage());
        System.out.println(tree == leaf);


        Cat one =
                (Cat) applicationContext.getBean("cat");
        System.out.println(one.getMeow());
        Cat two =
                (Cat) applicationContext.getBean("cat");
        System.out.println(two.getMeow());
        System.out.println(one == two);
    }
}