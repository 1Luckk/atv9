/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author alunocmc
 */
public class Empregado {

   protected String nome;
   protected String endereco;
   protected double salario;
   // Construtor 
   
   public Empregado(String nome, String endereco) {
   this.nome = nome;
   this.endereco = endereco;
   }
    
   public String getNome(){
   return nome;
   }
   
   public void setNome(String nome){
     this.endereco = endereco;
   }
   
   public String getEndereco(){
   return nome;
   }
   
    public void setEndereco (String endereco){
     this.endereco = endereco;
   }
   
    public double getSalario(){
      return salario;
   }
    
    public void setSalario(double salario){
    this.salario = salario;
    }
    
    public double calcularIrpf() {
    double aux;
    if (salario < 1800){
    aux = 0.1 * salario;
    }else { aux = 0.27 * salario;
    
    }
    return (aux);
    }
    public double calcularInss(){
      return (0.11 * salario);
    }
   
}
