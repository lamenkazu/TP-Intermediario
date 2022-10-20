import javax.swing.*;
import java.util.ArrayList;

public abstract class Usuario {

    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Como usuario, gostaria de visualizar as salas disponiveis para reserva */
    public void exibeSalasDisponiveis(ArrayList<Sala> salas){
        String disponiveis= "";
        for(Sala i: salas){
            disponiveis = disponiveis.concat((String) i.toString()).concat("\n\n");
        }

        JOptionPane.showMessageDialog(null, disponiveis);

    }

    public void exibeReservas(ArrayList<Sala> salas, int numSala){

        String saida = "";

        for(Sala i: salas){
            if(i.getNumSala() == numSala){
                saida = saida.concat("Reservas da sala" + numSala + "\n" + i.exibeReservas());
            }
        }

        JOptionPane.showMessageDialog(null, saida);



    }
}
