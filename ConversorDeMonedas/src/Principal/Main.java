package Principal;

import com.aluracursos.conversor.Conversor;
import com.aluracursos.conversor.Menu;

public class Main {
    public static void main(String[] args) {

            Conversor converter = new Conversor();
            converter.setApiKey("2887e43184707d20c1381c0b");

            Menu menu = new Menu(converter);
            menu.displayMenu();

    }
}
