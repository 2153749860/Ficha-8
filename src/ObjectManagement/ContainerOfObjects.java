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
public class ContainerOfObjects {
    /**
     * tamanho pré-definido do vetor de objetos
     */
    private final int DEFAULT_SIZE = 100;
    /**
     * Vetor de objetos
     */
    private Object objects[];

    /**
     * Construtor que permita a instanciação da classe tendo por base 
     * um vetor de elementos recebido
     * 
     * @param objects Lista de objetos sem tamanho fixo
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Construtor que permite a instanciação da classe tendo por base um valor 
     * por defeito (100)
     * 
     */
    public ContainerOfObjects() {
        this.objects = new Object[DEFAULT_SIZE];
    }
    
    /**
     * Construtor que permite a instanciação da classe definindo um valor 
     * máximo do elementos
     * 
     * @param maxSize número máximo de elementos permitidos no vetor
     */
    public ContainerOfObjects(int maxSize){
        this.objects = new Object[maxSize];
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }
    
    /**
     * Método que procura a primeira posição livre no vetor de objetos
     * 
     * @return primeira posição livre no vetor
     */
    protected int procuraPosicaoLivre(){
        int pos = -1;
        boolean sair = false;
        for(int i=0; i<this.objects.length && sair == false; i++){
            if(this.objects[i] == null){
                pos = i;
                sair = true;
            }
        }
        return pos;
    }
      
    /**
     * Método responsável por inserir um {@link Object objeto} na coleção de 
     * {@link ContainerOfObjects#objects objetos}
     * 
     * @param newObject {@link Object objeto} a inserir no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    protected boolean addObject(Object newObject){
        int pos = procuraPosicaoLivre();
        if(pos == -1){
            return false;
        }
        else{
            this.objects[pos] = newObject;
            return true;
        }
    }
    
    /**
     * Método responsável por remover um {@link Object objeto} do vetor de 
     * {@link ContainerOfObjects#objects objetos}
     * 
     * @param position indice correspondente ao elemento a eliminar
     * 
     * @return o {@link Object objeto} eliminado
     */
    protected Object removeObject(int position){
        int i;
        Object obj = this.objects[position];
        if(this.objects[position] == null){
            return null;
        }
        else{
            for(i=position; i<this.objects.length-1 && this.objects[i]!=null; i++){
                this.objects[i] = this.objects[i+1];
            }
            this.objects[i] = null;
            return obj;
        }
    }
    
    /**
     * Método responsável por substituir um {@link Object objeto} no vetor de
     * {@link CountainerOfObjects#objects objetos}
     * 
     * @param position indice correspondente ao elemento a modificar
     * @param newObject novo objeto a colocar no vetor
     * 
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    protected boolean setObject(int position, Object newObject){
        if(this.objects[position] != null){
            this.objects[position] = newObject;
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Método responsável por encontrar um {@link Object objeto} no vetor 
     * de objetos
     * 
     * @param obj obleto a encontrar
     * @return posição do objeto no vetor
     * 
     */
    protected int findObject(Object obj){
        for(int i=0; i<this.objects.length && this.objects[i]!=null; i++){
            if(this.objects[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Método responsável por retornar um objeto numa dada posição
     * 
     * @param position posição do objeto a retornar
     * @return objeto na posição dada
     */
    protected Object getObject(int position){
        return this.objects[position];
    }
    
    /**
     * Método responsável por retornar quantos objetos estão inseridos no vetor
     * 
     * @return 
     */
    protected int size(){
        return this.procuraPosicaoLivre();
    }
    
    /**
     * Método responsável por retornar o vetor de objetos
     * 
     * @return vetor de objetos
     */
    protected Object[] getAllObj(){
        return this.objects;
    }

    /**
     * Método toString()
     * 
     * @return uma String com todas as informações da classe
     */
    @Override
    public String toString() {
        String s= "";
        int pos = procuraPosicaoLivre();
        for(int i=0; i<pos; i++){
            s+="----===----\n";
            s+=this.objects[i];
        }
        return s;
    }
    
    
}
