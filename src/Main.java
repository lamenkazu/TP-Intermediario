import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Sala> salas = new ArrayList<Sala>();

        int op, nSala, cap;
        boolean criar = true;

        do{
            System.out.println("Criação de salas\n1 - Sala Convencional\n2- Laboratorio\n0 - Encerrar Criação");
            op = entrada.nextInt();

            if(op != 0){

                System.out.println("Informe a Capacidade da sala: ");
                cap = entrada.nextInt();

                System.out.println("Informe numero da sala: ");
                nSala = entrada.nextInt();
                for(Sala i: salas){
                    if(i.getNumSala() == nSala){
                        System.out.println("Numero de sala indisponivel");
                        criar = false;
                    }
                }

                if(criar){
                    if(op == 1){

                        SalaConvencional sala = new SalaConvencional(nSala, cap);
                        salas.add(sala);

                    }else if(op == 2){

                        SalaLaboratorio sala = new SalaLaboratorio(nSala, cap);
                        salas.add(sala);

                    }
                }

            }




        }while(op != 0);

        UsuarioAdmin professor = new UsuarioAdmin("Joao", "Dev");
        UsuarioAluno aluno = new UsuarioAluno("Erick");

        professor.reservarSala(salas, 1, "20/10/2022");

        professor.reservarSala(salas, 3, "20/10/2022");



        aluno.exibeSalasDisponiveis(salas);

        aluno.exibeReservas(salas, 1);





    }
}
