package Ex22;

import java.util.ArrayList;
import java.util.List;

public abstract class CriancaRepository {
    static List<Crianca> criancas = new ArrayList<>();

    public static void addCriancas(Crianca crianca){
        criancas.add(crianca);
    }

    public static int getPorcentagemMortas(){
        int total = criancas.size();
        int mortes = 0;
        for (int i = 0; i < total; i++) {
           if(criancas.get(i).getViva()){
           }else {
               mortes += 1;
           }
        }
        return total / (mortes * 100);
    }

    public static int getPorcetagemMasculino(){
        int total = criancas.size();
        int porcetagem = 0;
        for (int i = 0; i < total; i ++) {
            if(criancas.get(i).getViva()){
            }else if(criancas.get(i).getSexo().equalsIgnoreCase("masculino")){
                porcetagem += 1;
            }
        }
        return total /(porcetagem * 100);
    }

    public static int getCriancasIdade(){
        int total = 0;
        for (int i = 0; i < criancas.size(); i++) {
            if(criancas.get(i).getIdade() <= 24){
                total += 1;
            }
        }
        return total;
    }
}
