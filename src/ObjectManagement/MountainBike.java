package ObjectManagement;

import EnumBicycle.BikeTools;
import EnumBicycle.BrakeType;
import EnumBicycle.Material;
import EnumBicycle.MountainSuspension;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */

public class MountainBike extends Bicycle{
    /**
     * número máximo de tools
     */
    private static final int MAX_TOOLS = 10;
    /**
     * Número de luzes
     */
    private int numberOfLights;
     /**
     * Tipo de suspensão
     */
    private MountainSuspension suspension;
     /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;
    /**
     * número de tools nesta bicicleta
     */
    private int numberOfTools = 0;
    
    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     * 
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainSuspension suspension, 
            int id, int numberOfGears, String mainColor, float weelSize, 
            BrakeType brakes, Material material, float price, int guarantee) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material, 
                price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = new BikeTools[MAX_TOOLS];
    }

    /**
     * 
     * @return o {@link MountainBike#numberOfLights numberOfLights} da bicicleta de montanha
     */
    public int getNumberOfLights() {
        return numberOfLights;
    }
    
    /**
     * 
     * @param numberOfLights {@link MountainBike#numberOfLights numberOfLigths} da bicicleta de montanha
     */
    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }
    
    /**
     * 
     * @return o {@link MountainBike#suspension suspension} da bicicleta de montanha
     */
    public MountainSuspension getSuspension() {
        return suspension;
    }
    
    /**
     * 
     * @param suspension {@link BicycleManagment#numBikes numBikes} de bicicletas
     */
    public void setSuspension(MountainSuspension suspension) {
        this.suspension = suspension;
    }
    
    /**
     * Método que adicona uma tool à MountainBike
     * <p>
     * Este método vai adicionar um novo elemento no vetor de tools na primeira 
     * posição livre caso esta exista
     * </p>
     * @param tool - tool a adicionar
     * primeiro if vai verificar se o numero de tools é menor que o numero máximo de tools
     * caso seja, vai adicionar a tool na primeira posição livre do vetor de tools
     * incrementa o numero de tools
     */
    public void addTool(BikeTools tool){
        if(this.numberOfTools < MAX_TOOLS){
            this.bikeTools[this.numberOfTools] = tool;
            this.numberOfTools++;
        }
        else{
            System.out.println("Bicicleta cheia!");
        }
    }
    
    /**
     * Método que remove uma tool do vetor de tools
     * @param tool - tool a remover
     * pos - variavel que vai guardar a posição da tool a remover
     * primeiro for vai percorrer o vetor de tools
     * primeiro if vai verificar se a tool na posição i é igual à tool a remover
     * pos guarda o indice da posição da tool a remover
     * segundo for vai percorrer o vetor de tools a partir do indice da tool a remover
     * a tool na posição j vai ser substituido pela tool seguinte
     * o numero de tools é decrementado
     * a ultima posição do vetor fica null
     */
    public void removeTool(BikeTools tool){
        int pos=-1;
        for(int i=0; i<this.numberOfTools; i++){
            if(this.bikeTools[i] == tool){
                pos = i;
            }
        }
        for(int j=pos; j<this.numberOfTools-1; j++){
            this.bikeTools[j] = this.bikeTools[j+1];
        }
        this.numberOfTools--;
        this.bikeTools[numberOfTools] = null;
    }
    
    /**
     * Método que edita uma tool
     * <p>
     * Este método vai substituir um elemento existente no vetor de tools e 
     * substituir pelo novo elemente pretendido
     * </p>
     * @param existente - tool a ser substituida
     * @param novo - tool que vai substituir
     * primeiro for vai percorrer o vetor de tools
     * primeiro if verifica se a tool na posição i é igual à tool existente
     * caso seja esta tool é substituida pela tool nova
     * break para nao percorrer o vetor inteiro
     */
    public void editTool(BikeTools existente, BikeTools novo){
        for(int i=0; i<this.numberOfTools; i++){
            if(this.bikeTools[i] == existente){
                this.bikeTools[i] = novo;
                break;
            }
        }
    }
    
    /**
     * Método que vai retornar todas as informações do vetor de tools
     * <p>
     * Este método vai retornar uma String com todas as informações disponíveis 
     * do vetor de tools
     * </p>
     * @return uma String com todas as informações das tools
     */
    public String listarTools(){
        String s = "";
        s+="Tools:\n";
        for(int i=0; i<this.numberOfTools; i++){
            if(this.bikeTools != null){
                s+= this.bikeTools[i] + ",";
            }
        }
        s+="\n";
        return s;
    }
    
    /**
     * Método toString
     * @return uma String com todas as informações da MountainBike
     */
    @Override
    public String toString() {
        String s = "";
        s+= "Número de luzes: " + this.numberOfLights + "\n";
        s+= "Suspensão: " + this.suspension + "\n";
        s+= super.toString();
        s+= this.listarTools();
        
        return s;
    }
}
