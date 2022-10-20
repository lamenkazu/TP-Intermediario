import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioAdmin extends Usuario{

    private String setor;

    public UsuarioAdmin(String nome, String setor){
        this.setNome(nome);
        this.setSetor(setor);

    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    /* Reservar uma sala */
    public boolean reservarSala(ArrayList<Sala> salas, int numSala, String data) throws ParseException {

        for(Sala i : salas){
            if(i.getNumSala() == numSala){

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date dataFormatada = formato.parse((String)data);

                for(Date j: i.getListaDeReservas()){

                    if(j == dataFormatada){
                        JOptionPane.showMessageDialog(null, "Horario Indisponivel para reserva", "Indisponivel", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                }

                if(i.getReservas() < 20){
                    i.getListaDeReservas().add(dataFormatada);
                    i.setReservas();
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Limite de Reservas Alcançado para esta sala", "Indisponivel", JOptionPane.ERROR_MESSAGE);

                }

            }else{
                JOptionPane.showMessageDialog(null, "Sala não listada, tente novamente", "Indisponivel", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }


}
