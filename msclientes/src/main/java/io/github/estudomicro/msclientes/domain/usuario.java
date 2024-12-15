package io.github.estudomicro.msclientes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class usuario {
    @Id
    Long id;
    String cpf;
    String name;
    int idade;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "usuario [id=" + id + ", cpf=" + cpf + ", name=" + name + ", idade=" + idade + "]";
    }
    

}
