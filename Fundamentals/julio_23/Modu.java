package Fundamentals.julio_23;

import java.util.Date;

import Fundamentals.julio_22.Saludo;


public class Modu {

    public static void main(String[] args) {
        Date fecha = new Date();
        MetodosEstaticos.saludar();
        MetodosEstaticos.saludarPersona("Nestor");
        MetodosEstaticos.felicitarCumple("Nestor", 27);

        Saludo.saludosTotales();
    }
}
