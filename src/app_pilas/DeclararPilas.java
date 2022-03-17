/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pilas;

/**
 *
 * @author 1005640772
 */
public class DeclararPilas {
    
    int totalNodes;
    static final int cantNodes = 10;
    Nodo tope;

    public DeclararPilas() {
        this.totalNodes=0;
    }

    public int getTotalNodes() {
        return totalNodes;
    }

    public void setTotalNodes(int totalNodes) {
        this.totalNodes = totalNodes;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }
    
    public boolean fullPile(){
        return (this.getTotalNodes()==cantNodes);
    }

    public boolean emptyPile(){
        return (this.getTotalNodes()==0);
    }
    
    public void fill(String data){
        if(!fullPile()){
            Nodo newNode = new Nodo();
            newNode.setData(data);
            newNode.setNext(getTope());
            this.tope = newNode;
            this.totalNodes++;
        }
    }
    
    public void remove(){
        if(!fullPile()){
            Nodo temp = getTope();
            this.tope = this.tope.getNext();
            temp = null;
            this.totalNodes--;
        }
    }
}
