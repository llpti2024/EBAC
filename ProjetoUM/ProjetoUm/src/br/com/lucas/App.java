package br.com.lucas;

import br.com.lucas.dao.ClienteMapDAO;
import br.com.lucas.dao.IClienteDAO;
import br.com.lucas.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();


       String opcao = JOptionPane.showInputDialog(null,"                               Menu \n\n"+
                " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 - Alteração\n" +
                " 5 - Sair\n\n Digite sua opção:","Cadastro",JOptionPane.INFORMATION_MESSAGE );

        while(!isOpcaoValida(opcao)){
            JOptionPane.showMessageDialog(null,"Opção invalida");
            opcao = JOptionPane.showInputDialog(null,"                               Menu \n\n"+
                    " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 - Alteração\n" +
                    " 5 - Sair\n\n Digite sua opção:","Cadastro",JOptionPane.INFORMATION_MESSAGE );
        }


        while(isOpcaoValida(opcao)) {
             String dados;
            if (isOpcaoCadastro(opcao)) {
                dados = JOptionPane.showInputDialog(null, "Cadastro de Cliente\n\n Digite suas informaçoes separadas por (,)\n Nome completo\n CPF (somente números)\n Telefone (somente números)\n Endereco (Logradouro e nome do logradouro) \n Numero da casa (somente números)\n Cidade\n Estado (Sigla) \n\nExemplo:\n (   Carlos Alberto, 12345678900, 1122223333,Rua A, 000,São Paulo,SP   )", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);

            } else if (isOpcaoConsultar(opcao)) {
                dados = JOptionPane.showInputDialog(null, "Consulta de Cliente\n\nDigite o CPF do cliente (Somente números)\n Ex: 12345678901", "Consulta", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);

            } else if (isOpcaoExclusao(opcao)) {
                dados = JOptionPane.showInputDialog(null, "Exclusao de Cliente\n\nDigite o CPF do cliente (Somente números)\n Ex: 12345678901", "Exclusao", JOptionPane.INFORMATION_MESSAGE);
               exclusao(dados);

            } else if (isOpcaoAlteracao(opcao)) {
                dados = JOptionPane.showInputDialog(null, "Alteração de Cliente\n\n Digite suas informaçoes separadas por (,)\n Nome completo\n CPF (somente números)\n Telefone (somente números)\n Endereco (Logradouro e nome do logradouro) \n Numero da casa (somente números)\n Cidade\n Estado (Sigla) \n\nExemplo:\n (   Carlos Alberto, 12345678900, 1122223333,Rua A, 000,São Paulo,SP   )", "Alteracao", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);

            } else if (isOpcaoSair(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,"                               Menu \n\n"+
                    " 1 - Cadastro\n 2 - Consultar\n 3 - Exclusão\n 4 - Alteração\n" +
                    " 5 - Sair\n\n Digite sua opção:","Cadastro",JOptionPane.INFORMATION_MESSAGE );
        }




    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void exclusao(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso ", "EXCLUIDO", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado :\n" + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado ", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {

        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null,"Cliente já se encontra cadastrado","OPS!!",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Lucas Levy Peruchi, 36864689808, 19999501304,Alameda das flores,252,Cordeirópolis,SP

    private static void sair() {
        JOptionPane.showMessageDialog(null,"Saindo do Menu de Cadastro","SAIR",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }  

    private static boolean isOpcaoCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isOpcaoConsultar(String opcao) {
        return "2".equals(opcao);
    }

    private static boolean isOpcaoExclusao(String opcao) {
        return "3".equals(opcao);
    }

    private static boolean isOpcaoAlteracao(String opcao) {
        return "4".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }


    


}
