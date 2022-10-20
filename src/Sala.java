import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public abstract class Sala {

    public static int reservas = 0;
    private int numSala;
    private int capacidade;
    private String tipoSala;
    private ArrayList<Date> listaDeReservas = new ArrayList<Date>();

    @Override
    public String toString() {
        return "Sala: " + this.getNumSala() +" | Tipo: " + this.getTipoSala() + "\nCapacidade: " + this.getCapacidade();
    }



    /*Como usuario, gostaria de visualizar as reservas realizadas em uma sala*/
    public String exibeReservas(){
        String saida = "";
        for(Date i: listaDeReservas){
            saida = saida.concat(i.toString()).concat("\n\n");
        }
        return saida;
    }

    //get


    public static int getReservas() {
        return reservas;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNumSala() {
        return numSala;
    }

    public ArrayList<Date> getListaDeReservas() {
        return listaDeReservas;
    }


    //set


    public static void setReservas() {
        Sala.reservas++;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setListaDeReservas(ArrayList listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }





}


