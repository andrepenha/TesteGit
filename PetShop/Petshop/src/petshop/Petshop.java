/*
    Testando o envio para GITHUB
 */
package petshop;

import util.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import util.DateTimeUtil;
/**
 * 
 *
 * @author Dj The Source
 */
public class Petshop {
    
    private static ArrayList<Clientes> listaClientes;
    private static ArrayList<Animais> listaAnimais;
    private static ArrayList<tipoServicos> listaServicos;
    private static ArrayList<vendaServicos> listavendaDeServicos;

    
    public static void main(String[] args) {
        
        listaClientes = new ArrayList<>();
        listaAnimais = new ArrayList<>();
        listaServicos = new ArrayList<>();
        listavendaDeServicos = new ArrayList<>();
        int opcao = 0;
        
        do{
            try{
                System.out.println("\n\n** PETSHOP - MUNDO ANIMAL **");
                System.out.println("\n|||||||| MENU ||||||||\n ");
               
                System.out.println("     (( Inclusões ))");
                System.out.println("   1 - Cliente");
                System.out.println("   2 - Pet");
                System.out.println("   3 - Tipos de serviços");
                System.out.println("   4 - Venda de serviços");
                System.out.println("\n   (( Relatórios ))");
                System.out.println("   5 - Clientes");
                System.out.println("   6 - Pets");
                System.out.println("   7 - Tipos de serviços");
                System.out.println("   8 - Listagem geral - NULL");
                System.out.println("\n   0 - Sair");
                opcao = Console.scanInt("\n==> Digite a opção: ");
                
                switch(opcao){
                    case 1: adicionarCliente(); break;
                    case 2: adicionarPets(); break;
                    case 3: adicionarTipoServico(); break;
                    case 4: adicionarVendaServicos(); break;
                    case 5: listarClientes(); break;
                    case 6: listarPets(); break;
                    case 7: listarTipoServico(); break;
                    case 8: relatorioGeral(); break;
                    case 0: System.out.println("Saindo do Sistema ..."); break;
                    
                    default:
                        System.err.println("Erro: Escolha a opcao correta!!!");
                }
            }catch (InputMismatchException e){
               System.err.println("Erro: Escolha a opcao correta!!!");

            }
        }while (opcao != 0);
    }
 
    private static void adicionarCliente(){
        System.out.println("\n\nAdicionando Paciente ...");
           
        try{
            String nome = Console.scanString("Cliente: ");
            String rg = Console.scanString("RG: ");
            String telefone = Console.scanString("Telefone: ");

            Clientes clientes = new Clientes(rg, nome, telefone);
            listaClientes.add(clientes);
            System.out.println("Cadastro realizado com sucesso!");
        }catch(Exception e){
            System.out.println(" Teste de opção inválida!");
        }
    }
    
    private static void adicionarPets(){
        System.out.println("\n\nAdicionando Pets ...");
           
        try{
            String nomeAnimal = Console.scanString("Nome do Pet: ");
            String tipoAnimal = Console.scanString("Tipo de animal: ");
            String donoAnimal = Console.scanString("Dono do animal: ");
            
            Animais animais = new Animais(nomeAnimal, tipoAnimal, donoAnimal);
            listaAnimais.add(animais);
            System.out.println("Cadastro realizado com sucesso!");
        }catch(Exception e){
            System.out.println(" Teste de opção inválida!");
        }
    }
    
            
    private static void adicionarTipoServico(){
        System.out.println("\n\nAdicionando Tipos de Serviços ...");
           
        try{
            String numero = Console.scanString("Numero: ");
            String nomeServico = Console.scanString("Nome do Serviço: ");
            System.out.println(" ESCOLHA: Estetico * Clinico ");
            String tipoAtendimento = Console.scanString("Tipo de Atendimento: ");
            String precoServico = Console.scanString("Preço do Serviço: ");
            
            tipoServicos TpServicos = new tipoServicos(numero, nomeServico, tipoAtendimento, precoServico);
            listaServicos.add(TpServicos);
            System.out.println("Cadastro realizado com sucesso!");
        }catch(Exception e){
            System.out.println(" Teste de opção inválida!");
            
          }
    }
            
            
     private static void listarClientes(){
        System.out.println("\nListando Clientes ...");
        if(listaClientes.isEmpty()){
            System.out.println("Não há clientes cadastrados!");
         }else{
                System.out.print(String.format("%-24s","|CLIENTE"));
                System.out.print(String.format("%-20s","|RG"));
                System.out.println(String.format("%-30s","|TELEFONE"));
                for(Clientes c: listaClientes){
                    System.out.print(String.format("\n%-24s",c.getNome()));
                    System.out.print(String.format("%-20s",c.getRg()));
                    System.out.print(String.format("%-10s",c.getTelefone()));
                }
                
            }
        }
    
    
    
     private static void adicionarVendaServicos(){
        System.out.println("\n\nAdicionando Venda de Serviços ...");
           
        try{
            String dataCompra = Console.scanString("Data da compra: ");
            String cliente = Console.scanString("Cliente: ");
            String servicoRealizado = Console.scanString("Servico Realizado: ");
            String vendaTotalServicos = Console.scanString("Venda Total Servicos: ");
            String precoServico = Console.scanString("Preco do servico: ");
            vendaServicos VDServicos = new vendaServicos(dataCompra, cliente, servicoRealizado, vendaTotalServicos, precoServico);
            listavendaDeServicos.add(VDServicos);
            System.out.println("Cadastro realizado com sucesso!");
        }catch(Exception e){
            System.out.println(" Teste de opção inválida!");
            
          }
     }
        
    private static void relatorioGeral(){
        System.out.println("\nListando Relatório geral...");
        if(listaClientes.isEmpty()){
            System.out.println("Não há itens cadastrados!");
         }else{
                System.out.print(String.format("%-24s","|CLIENTE MAIS FREQUENTES"));
                System.out.print(String.format("%-20s","|CLIENTE QUE MAIS GASTAM"));
                System.out.println(String.format("%-30s","|VENDAS POR MÊS"));
                System.out.print(String.format("%-24s","|SERVICOS MAIS VENDIDOS"));
                System.out.print(String.format("%-20s","|RANKING DE PETS - LUCRO"));
                for(Clientes c: listaClientes){
                    System.out.print(String.format("\n%-24s",c.getNome()));
                    System.out.print(String.format("%-20s",c.getRg()));
                    System.out.print(String.format("%-10s",c.getTelefone()));
                    System.out.print(String.format("\n%-24s",c.getNome()));
                    System.out.print(String.format("%-20s",c.getRg()));
                    System.out.print(String.format("%-10s",c.getTelefone()));
                    
                    
                    //clientesMaisGastam, vendasPorMes, servicosMaisVendidos, rankingPetsLucros
                }
                
            }
        }
    
    private static void listarPets(){
        System.out.println("\nListando Pets ...");
        if(listaAnimais.isEmpty()){
            System.out.println("Não há Pets cadastrados!");
         }else{
             System.out.print(String.format("%-24s","|NOME DO PET"));
                System.out.print(String.format("%-20s","|TIPO DE ANIMAL"));
                System.out.println(String.format("%-30s","|DONO DO ANIMAL"));
                for(Animais c: listaAnimais){
                    System.out.print(String.format("\n%-24s",c.getNomeAnimal()));
                    System.out.print(String.format("%-20s",c.getTipoAnimal()));
                    System.out.print(String.format("%-10s",c.getDonoAnimal()));
                }
                
            }
        }

      private static void listarTipoServico(){
        System.out.println("\nListando Tipos de Serviços ...");
        if(listaServicos.isEmpty()){
            System.out.println("Não há serviços cadastrados!");
         }else{
                System.out.print(String.format("%-10s","|NUMERO"));
                System.out.print(String.format("%-20s","|NOME DO SERVIÇO"));
                System.out.print(String.format("%-25s","|TIPO DE ATENDIMENTO"));
                System.out.println(String.format("%-24s","|PREÇO DO SERVIÇO"));
                for(tipoServicos c: listaServicos){
                    System.out.print(String.format("%-14s",c.getNumero()));//colocar o conteúdo de numero no meio
                    System.out.print(String.format("%-20s",c.getNomeServico()));
                    System.out.print(String.format("%-25s",c.getTipoAtendimento()));
                    System.out.print(String.format("%-20s",c.getPrecoServico()));
                }
            }
        }
    }

    

