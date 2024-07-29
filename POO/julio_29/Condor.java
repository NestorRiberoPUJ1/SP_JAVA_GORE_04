package POO.julio_29;

public class Condor extends Oviparos {



    /* CONSTRUCTORES */
    public Condor() {
        Condor.contadorOviparos++;
    }


    /* METODOS DE CLASE ABSTRACTA */
    @Override
    void alimentarse() {
        // TODO Auto-generated method stub
        System.out.println("El condor se alimenta de carroña");        
    }

    @Override
    void moverse() {
        // TODO Auto-generated method stub
        System.out.println("El condor vuela");        
    }

    
    
}
