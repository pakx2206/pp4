import java.util.Collections;
public class App {
public static void main(String[] args){
    var name = "Patryk";
    var message = String.format("Hello %s",name);
    var names = Collections.singletonList("Patryk Pacocha");
    System.out.println(message);
}
}
