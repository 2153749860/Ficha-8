/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

/**
 *
 * @author tiago
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura da gestão de bicicletas
 * </p>
 */
public class BicycleManagment {
    /**
     * Número máximo de bicicletas
     */
    private static final int MAX_BIKES = 20;
    /**
     * Vetor de bicicletas
     */
    private Bicycle[] bikes;
    /**
     * Número de bicicletas
     */
    private int numBikes = 0;

    /**
     * Método Construtor
     * Apenas inicializa o vetor de bicicletas
     */
    public BicycleManagment() {
        this.bikes = new Bicycle[MAX_BIKES];
    }

    /**
     * 
     * @return o {@link BicycleManagment#numBikes numBikes} de bicicletas
     */
    public int getNumBikes() {
        return numBikes;
    }

    /**
     * 
     * @param numBikes {@link BicycleManagment#numBikes numBikes} de bicicletas 
     */
    public void setNumBikes(int numBikes) {
        this.numBikes = numBikes;
    }
    
    /**
     * Método que adiciona uma bicicleta
     * <p>
     * Este método verifica se o vetor de bicicletas está cheio e caso nao 
     * esteja, coloca a bicicleta na primeira posição livre
     * </p>
     * @param bike - bicicleta a adicionar
     * <p>
     * primeiro if verifica se o numero de bicicletas é menor que o numero 
     * maximo, e caso seja a bicicleta é colocada na primeira posição livre
     * </p>
     */
    public void addBike(Bicycle bike){
        if(this.numBikes < MAX_BIKES){
            this.bikes[numBikes] = bike;
            this.numBikes++;
        }
        else{
            System.out.println("Cheio!");
        }
    }
    
    /**
     * Método que remove uma bicicleta
     * <p>
     * Este método verifica se o id da bicicleta a remover existe e caso se 
     * confirme, esta é removida do vetor
     * </p>
     * @param id - id da bicicleta a remover
     * <p>
     * incialização da variavel pos para guardar o indice da bicicleta a ser removida
     * primeiro for vai percorrer o vetor de bicicletas
     * primeiro if verifica se o id da bicicleta na posição i é igual ao id da bicicleta a ser removida
     * pos guarda esse indice
     * segundo for vai percorrer o vetor de bicicletas a partir de pos
     * bicicleta na posição j é substituida pela bicicleta na posição seguinte
     * numero de bicicletas é decrementado
     * ultima posição do vetor é colocada a null
     * </p>
     */
    public void removeBike(int id){
        int pos = -1;
        for(int i=0; i<this.numBikes; i++){
            if(this.bikes[i].getId() == id){
                pos = i;
            }
        }
        for(int j=pos; j<this.numBikes-1; j++){
            this.bikes[j] = this.bikes[j+1];
        }
        this.numBikes--;
        this.bikes[numBikes] = null;
    }
    
    /**
     * Método que edita uma bicicleta
     * <p>
     * Este método vai substituir uma bicicleta existente no vetor por outra 
     * recebida como parametro
     * </p>
     * @param idExistente - id da bicicleta a ser substituida
     * @param bike - bicicleta substituta
     * <p>
     * ciclo for vai percorrer o vetor de bicicletas
     * if vai verificar se o id da bicicleta na posição i é igual ao id da bicicleta a ser substituida
     * caso seja a bicicleta na posição i +e substituida pela bicicleta pretendida
     * </p>
     */
    public void editBike(int idExistente, Bicycle bike){
        for(int i=0; i<this.numBikes; i++){
            if(this.bikes[i].getId() == idExistente){
                this.bikes[i] = bike;
                break;
            }
        }
    }

    /**
     * Método toString()
     * @return uma String com todas as informações da classe BicycleManagment
     */
    @Override
    public String toString() {
        String s = "";
        s+= "Nº de bicicletas: " + this.numBikes + "\n";
        for(int i=0; i<this.numBikes; i++){
            if(this.bikes[i] != null){
                s+= this.bikes[i];
            }
        }
        return s;
    }
    
    
}
