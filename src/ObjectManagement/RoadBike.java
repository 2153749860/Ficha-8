/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

import EnumBicycle.BrakeType;
import EnumBicycle.Material;

/**
 *
 * @author tiago
 */
/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de estrada
 * </p>
 */
public class RoadBike extends Bicycle {

    /**
     * Atributos da classe RoadBike
     * <p>
     * <strong>Descrição: </strong><br>
     * handle_belt - tipo de fitas da bicicleta de estrada
     * observaçoes - observações da bicicleta de estrada
     * frameSize - tamanho da frame da bicicleta de estrada
     * </p>
     */
    private String handle_belt;
    private String observacoes;
    private int frameSize;

    /**
     * Método Construtor
     * <p>
     * <strong>Descrição: </strong><br>
     * Construtor que nao recebe o tipo de travão nem o tipo de material, sendo 
     * estes colocados com os valores pre-definidos
     * </p>
     * @param id_fitas - identificação das fitas
     * @param observacoes - observações da RoadBike
     * @param frameSize - tamanho do frame
     * @param id - id da RoadBike
     * @param numberOfGears - numero de mudanças
     * @param mainColor - cor da RoadBike
     * @param weelSize - tamanho da roda
     * @param price - preço da RoadBike
     * @param guaranteeYears - anos de garantia
     */
    public RoadBike(String id_fitas, String observacoes, int frameSize, int id, int numberOfGears, String mainColor, float weelSize, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, BrakeType.H, Material.Carbono, price, guaranteeYears);
        this.handle_belt = id_fitas;
        this.observacoes = observacoes;
        this.frameSize = frameSize;
    }

    /**
     * Método Construtor
     * <p>
     * <strong>Descrição: </strong><br>
     * Construtor que recebe todos os parametros
     * </p>
     * @param id_fitas - identificação das fitas
     * @param observacoes - observações da RoadBike
     * @param frameSize - tamanho do frame
     * @param id - id da RoadBike
     * @param numberOfGears - numero de mudanças
     * @param mainColor - cor da RoadBike
     * @param weelSize - tamanho da roda
     * @param brakes - tipo de travão da RoadBike
     * @param material - tipo de material da RoadBike
     * @param price - preço da RoadBike
     * @param guaranteeYears - anos de garantia
     */
    public RoadBike(String id_fitas, String observacoes, int frameSize, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, Material material, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material, price, guaranteeYears);
        this.handle_belt = id_fitas;
        this.observacoes = observacoes;
        this.frameSize = frameSize;
    }

    /**
     * Método Construtor
     * <p>
     * <strong>Descrição: </strong><br>
     * Construtor que nao recebe o tipo de material, sendo este colocado com um 
     * valor pre-definido
     * </p>
     * @param id_fitas - identificação das fitas
     * @param observacoes - observações da RoadBike
     * @param frameSize - tamanho do frame
     * @param id - id da RoadBike
     * @param numberOfGears - numero de mudanças
     * @param mainColor - cor da RoadBike
     * @param weelSize - tamanho da roda
     * @param brakes - tipo de travão da RoadBike
     * @param price - preço da RoadBike
     * @param guaranteeYears - anos de garantia
     */
    public RoadBike(String id_fitas, String observacoes, int frameSize, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, brakes, Material.Carbono, price, guaranteeYears);
        this.handle_belt = id_fitas;
        this.observacoes = observacoes;
        this.frameSize = frameSize;
    }

    /**
     * Método Construtor
     * <p>
     * <strong>Descrição: </strong><br>
     * Construtor que nao recebe o tipo de travões, sendo este colocado com um 
     * valor pre-definido
     * </p>
     * @param id_fitas - identificação das fitas
     * @param observacoes - observações da RoadBike
     * @param frameSize - tamanho do frame
     * @param id - id da RoadBike
     * @param numberOfGears - numero de mudanças
     * @param mainColor - cor da RoadBike
     * @param weelSize - tamanho da roda
     * @param material - tipo de material da RoadBike
     * @param price - preço da RoadBike
     * @param guaranteeYears - anos de garantia
     */
    public RoadBike(String id_fitas, String observacoes, int frameSize, int id, int numberOfGears, String mainColor, float weelSize, Material material, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, BrakeType.H, material, price, guaranteeYears);
        this.handle_belt = id_fitas;
        this.observacoes = observacoes;
        this.frameSize = frameSize;
    }
    
    /**
     * Método que retorna o tipo de handle_belt da bicicleta de estrada
     * @return o tipo de handle_belt da bicicleta de estrada
     */
    public String getHandle_belt() {
        return handle_belt;
    }
    
    /**
     * Método que coloca o tipo de handle_belt da bicicleta de estrada
     * @param handle_belt - tipo de handle_belt da bicicleta de estrada
     */
    public void setId_fitas(String handle_belt) {
        this.handle_belt = handle_belt;
    }
    
    /**
     * Método que retorna as observações da bicicleta de estrada
     * @return as observações da bicicleta de estrada
     */
    public String getObservacoes() {
        return observacoes;
    }
    
    /**
     * Método que coloca as observações da bicicleta de estrada
     * @param observacoes - observações feitas à bicicleta de estrada
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    /**
     * Método que retorna o tamanho da frame da bicicleta de estrada
     * @return o tamanho da frame da bicicleta de estrada
     */
    public int getFrameSize() {
        return frameSize;
    }
    
    /**
     * Método que coloca o tamanho da frame da bicicleta de estrada
     * @param frameSize - tamanho da frame da bicicleta de estrada
     */
    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }
    
    /**
     * Método toString()
     * @return uma String com todas as informações da RoadBike
     */
    @Override
    public String toString() {
        String s = "";
        s+= "ID das fitas: " + this.handle_belt + "\n";
        s+= "Tamanho do Frame: " + this.frameSize + "\n";
        s+= "Observações: " + this.observacoes + "\n";
        s+= super.toString();
        
        return s;
    }
    
    
}
