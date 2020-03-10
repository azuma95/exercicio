/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Date;

/**
 *
 * @author Azuma
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public class Navio{
            private int cod;
            private float comprimento;
            private String nome, matricula;
        
    
    public void Porto(int c, float co){
        cod = c;
        comprimento = co;
    }
    
    public void setcomprimento(float co){
        comprimento = co;
    }
    
    public void setnome(String m){
        nome = m;
    }
    
    public int getCod(){
        return cod;
    }
    
    public float getcomprimento(){
        return comprimento;
    }
    
    public String getnome(){
        return nome;
    }
    }
    
    public class PassagemVPesado extends Navio{
        private int eixos;
        
        public PassagemVPesado(int c){
            super(c);
        }
        public void setEixos(int e){
            eixos = e;
        }
        public int getEixos(){
            return eixos;
        }
    }
}