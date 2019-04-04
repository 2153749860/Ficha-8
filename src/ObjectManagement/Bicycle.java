package ObjectManagement;

import EnumBicycle.BrakeType;
import EnumBicycle.Material;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta
 * </p>
 */

public class Bicycle {
    /**
     * Identificador numérico da bicicleta
     */
    private int id;
    /**
     * Número de velocidades
     */
    private int numberOfGears;
    /**
     * Cor da bicicleta
     */
    private String mainColor;
    /**
     * Diâmetro das rodas
     */
    private float weelSize;
   
    /**
     * Tipo de travões
     * TODO: BrakeType
     */
    private BrakeType brakes;
   
    /**
     * Tipo de material
     * TODO: Material
     */
    private Material material;
    
    /**
     * Preço da bicicleta
     */
    private float price;
    
    /**
     * Número de anos de garantia
     */
    private int guaranteeYears;

    /**
     * Método construtor para a criação de uma instância de
     * {@link Bicycle bicicleta}.
     * 
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guaranteeYears Anos de garantia da bicicleta
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize, 
            BrakeType brakes, Material material, float price, int guaranteeYears) {
        this.setId(id);
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guaranteeYears=guaranteeYears;
    }

    /**
     *  
     * @return o {@link Bicycle#id id} de uma bicicleta 
     */
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @param id {@link Bicycle#id id} de uma bicicleta 
     */
    public final void setId(int id) {
        this.id = id;
    }
    
    /**
     * 
     * @return o {@link Bicycle#numberOfGears numberOfGears} de uma bicicleta
     */
    public int getNumberOfGears() {
        return numberOfGears;
    }
    
    /**
     * 
     * @param numberOfGears {@link Bicycle#numberOfGears numberOfGears} de uma bicicleta
     */
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    
    /**
     * 
     * @return o {@link Bicycle#mainColor mainColor} de uma bicicleta
     */
    public String getMainColor() {
        return mainColor;
    }
    
    /**
     * 
     * @param mainColor {@link Bicycle#mainColor mainColor} de uma bicicleta
     */
    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }
    
    /**
     * 
     * @return o {@link Bicycle#weelSize weelSize} de uma bicicleta
     */
    public float getWeelSize() {
        return weelSize;
    }
    
    /**
     * 
     * @param weelSize {@link Bicycle#weelSize weelSize} de uma bicicleta
     */
    public void setWeelSize(float weelSize) {
        this.weelSize = weelSize;
    }
    
    /**
     * 
     * @return o {@link Bicycle#brakes brakes} de uma bicicleta
     */
    public BrakeType getBrakes() {
        return brakes;
    }
    
    /**
     * 
     * @param brakes {@link Bicycle#brakes brakes} de uma bicicleta
     */
    public void setBrakes(BrakeType brakes) {
        this.brakes = brakes;
    }
    
    /**
     * 
     * @return o {@link Bicycle#material material} de uma bicicleta
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * 
     * @param material {@link Bicycle#material material} de uma bicicleta
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * 
     * @return o {@link Bicycle#price price} de uma bicicleta
     */
    public float getPrice() {
        return price;
    }

    /**
     * 
     * @param price {@link Bicycle#price price} de uma bicicleta
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 
     * @return o {@link Bicycle#guaranteeYears guaranteeYears} de uma bicicleta
     */
    public int getGuaranteeYears() {
        return guaranteeYears;
    }

    /**
     * 
     * @param guaranteeYears {@link Bicycle#guaranteeYears guaranteeYears} de uma bicicleta
     */
    public void setGuaranteeYears(int guaranteeYears) {
        this.guaranteeYears = guaranteeYears;
    }

    /**
     * Método toString()
     * @return uma String com todas as informações da Bicycle
     */
    @Override
    public String toString() {
        String s = "";
        s+= "ID: " + this.getId() + "\n";
        s+= "Número de mudanças: " + this.getNumberOfGears() + "\n";
        s+= "Cor: " + this.getMainColor() + "\n";
        s+= "Tamanho da roda: " + this.getWeelSize() + "\n";
        s+= "Travões: " + this.getBrakes() + "\n";
        s+= "Material: " + this.getMaterial() + "\n";
        s+= "Preço: " + this.getPrice() + "\n";
        s+= "Garantia: " + this.getGuaranteeYears() + "\n";
        return s;
    }

}
