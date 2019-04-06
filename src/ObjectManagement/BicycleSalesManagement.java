/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

/**
 *
 * @author tiago
 */
public class BicycleSalesManagement extends ContainerOfObjects{
    /**
     * saleId identificação da venda
     */
    private int saleId;
    /**
     * data data da venda
     */
    private SaleDate data;
    /**
     * total valor total da venda
     */
    private double total;
    
    /**
     * Método construtor que permite inicializar a venda com um conjunto 
     * de parâmetros
     * @param SaleId id da venda
     * @param data data da venda
     * @param maxSize tamanho do vetor de bicicletas
     */
    public BicycleSalesManagement(int SaleId, SaleDate data, int maxSize) {
        super(maxSize);
        this.saleId = SaleId;
        this.data = data;
        this.total=0;
    }

    /**
     * Método construtor que permite a instanciação do vetor de bicicletas
     * @param SaleId id da venda
     * @param data data da venda
     * @param bikes vetor de bicicletas
     */
    public BicycleSalesManagement(int SaleId, SaleDate data, Bicycle[] bikes) {
        super(bikes);
        this.saleId = SaleId;
        this.data = data;
        this.total = 0;
    }
    
    /**
     * Método responsável por inserir uma {@link Bicycle bicicleta} na coleção 
     * do {@link ContainorOfObsjects#objects objetos}
     * 
     * @param bike {@link Bicycle bicicleta} a inserir no vetor
     * 
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    public boolean addBicycle(Bicycle bike){
        boolean temp = super.addObject(bike);
        if(temp){
            this.total += bike.getPrice();
        }
        return temp;
    }
    
    /**
     * Método responsável por remover uma {@link Bicycle bicicleta} do vetor 
     * de {@link ContainerOfObjects#objects objetos}
     * 
     * @param bike {@link Bicycle bicicleta}
     * 
     * @return a {@link Bicycle bicicleta} eliminada
     */
    public Bicycle removeBicycle(Bicycle bike){
        int pos = super.findObject(bike);
        if(pos!= -1){
            this.total = this.total - bike.getPrice();
            super.removeObject(pos);
            return bike;
        }
        else{
            System.out.println("Impossivel remover");
            return bike;
        }
    }
    
    /**
     * Método responsável por retornar o vetor de bicicletas
     * 
     * @return vetor de bicicletas
     */
    public Bicycle[] getAllBicycles(){
        Bicycle[] temp = new Bicycle[super.size()];
        for(int i=0; i<super.size(); i++){
            if(super.getObject(i) instanceof Bicycle){
                temp[i] = (Bicycle)super.getObject(i);
            }
        }
        return temp;
    }
 
    
    /**
     * Método toString()
     * 
     * @return uma String com todas as informações da venda
     */
    @Override
    public String toString() {
        String s = "";
        s+= "ID da venda: " + this.saleId + "\n";
        s+= "Data: " + this.data.getDia() + "/" + this.data.getMes() + "/" + this.data.getAno() + "\n";
        s+= "Total: " + this.total + "\n";
        s+= super.toString();
        return s;
    }
    
    
    
    
}
