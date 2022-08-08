package br.com.dio.Cliente;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "000000";
        // dados do endereço

        Cliente cliente = new Cliente();
        // dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar o endereço: " + e.getMessage());
        }
    }
}
