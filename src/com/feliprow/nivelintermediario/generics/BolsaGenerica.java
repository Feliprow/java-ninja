package com.feliprow.nivelintermediario.generics;

import java.util.ArrayList;
import java.util.List;

/*Colocar o nome da coisa genérica entre o <>
* comum-mente usamos 'T'(type) como boa prática.
* */
public class BolsaGenerica<T> {

    //Inicializando uma List<T> genérica
    private List<T> equipamentos;

    // Adicionar esquipamentos
    void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
