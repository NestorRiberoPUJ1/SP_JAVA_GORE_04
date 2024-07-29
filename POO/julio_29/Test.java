package POO.julio_29;

public class Test {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Nissan", "Versa");
        Avestruz avestruz = new Avestruz("Marco", 5);
        Condor  condor = new Condor();

        auto.acelerar(5.0);
        avestruz.acelerar(3.2);

        auto.frenar(2.0);
        avestruz.frenar(1.5);


        avestruz.eclosionar();
        avestruz.alimentarse();
        avestruz.moverse();
        avestruz.hacerNido();

        condor.eclosionar();
        condor.alimentarse();
        condor.moverse();
        condor.hacerNido();

        System.out.println("Conteo de oviparos");
        Avestruz.contarOviparos();
        Oviparos.contarOviparos();

        Condor.contarOviparos();
        Oviparos.contarOviparos();

    }
}
