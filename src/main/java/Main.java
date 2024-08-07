import model.Man;
import model.service.ManService;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        ManService manService = new ManService();
        manService.work(man);
    }
}
