package com.feliprow.nivelintermediario.records;

public record NinjaRecord(String nome, String email, int telefone) {

    // Todos os atributos são final em records
    // records não tem setter.
    // Podemos usa-los como classes normais, mas lembre-se que são final.
    // Não precisa ser acessado pelo getter, pode acessar diretamente pelo nome do atributo

    /* Ex de uso, um record de funcionario (String nome, int idFuncionario)
    * é um exemplo basico*/


}
