class Bichinho {
    void som() {
        System.out.println("O melo latiu");
    }

    void comer() {
        System.out.println("O melo esta comendo");
    }

    void comer(String comida) {
        System.out.println("O melo está comendo " + comida);
    }
}

class Cachorro extends Bichinho {
    @Override
    void som() {
        System.out.println("O melo late");
    }
}

class Gato extends Bichinho {
    @Override
    void som() {
        System.out.println("Mas o amigo gato não miou");
    }
}

public class tarefaduasformas {
    public static void main(String[] args) {
        Bichinho ramelo = new Cachorro();
        ramelo.som();

        Bichinho tick = new Gato();
        tick.som();

        Bichinho bicho = new Bichinho(); 
        bicho.comer();
        bicho.comer("ração");
    }
}
