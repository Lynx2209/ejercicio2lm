package Controladores;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();

        
        int diaActual = fechaActual.getDayOfMonth();
        int mesActual = fechaActual.getMonthValue();
        int anyoActual = fechaActual.getYear();

        
        LocalDate calendario = LocalDate.of(2024, 2, 28); 

        
        if (calendario.isEqual(fechaActual)) {
            System.out.println("Es hoy");
        } else {
            System.out.println("Aún falta");
        }
    }
}
