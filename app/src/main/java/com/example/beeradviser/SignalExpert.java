package com.example.beeradviser;

public class SignalExpert {
    public static String getSignals(String color){
        switch (color){
            case "Reglamentarias":
                return "No pase, Pare, Prohibido girar, Prohibido parquear, Velocidad máxima";
            case "Preventivas":
                return "Curva peligrosa, Glorieta, Resalto, Zona de derrumbe, Riesgo de accidente";
            case "Informativas":
                return "Sitio de parqueo, Aeropuerto, Hospedaje, Restaurante";
            case "Transitorias":
                return "Hombres trabajando, Conos, Delineadores, Estrechamientos";
            default:
                return  "Por favor seleccione un tipo de señal";
        }
    }
}