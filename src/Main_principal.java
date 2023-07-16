

import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;


import java.util.ArrayList;
import java.util.List;

public class Main_principal {

    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO Auto-generated method stub
        Scanner leia = new Scanner (System.in);
        Cadastro_PESSOA_FISICA pf = new Cadastro_PESSOA_FISICA();
        //	Cadastro_ADVOGADO advogado = new Cadastro_ADVOGADO();


        List<Cadastro_ADVOGADO> listaadvogado = new ArrayList<>();
        List<Cadastro_PESSOA_FISICA> listaCLIENTE = new ArrayList<>();


        int segundosDeLatencia = 2;
        String op20;
        String op40;
        String escolha;
        String escolha1;


        do {
            limpa();

            System.out.println("\n"
                    + "======================================\n"
                    + "BEM VINDO AO SITE DE SUPORTE A CLIENTE!\n"
                    + "  O SITE IDEAL PARA VOCÊ QUE PROCURA\n"
                    + "      AJUDA NA ÁREA DA ADVOGACIA!\n"
                    + "=====================================\n");

            System.out.println(
                    "A)- LOGIN\n"
                            +  "B)- CADASTRADAR\n"
                            +"ESCOLHA UMA DAS OPÇÕES ACIMA:\n");
            op20 = leia.next();




            if(op20.equalsIgnoreCase("A")) {

                String senhaV;
                String oabV;

                do {
                    limpa();
                    System.out.println("____________________\n"
                            + " \n       LOGIN\n"
                            + "____________________\n");

                    System.out.println("A)- ADVOGADO\n"
                            + "B)- CLIENTE\n"
                            + "0)- VOLTAR");
                    op40 = leia.next();

                    if(op40.equalsIgnoreCase("A")) {
                        limpa();
                        System.out.println("DIGITE OS CAMPOS ABAIXO PARA ENTRAR EM SEU PERFIL\n");


                        boolean encontrou = false;
                        System.out.println("OAB: ");
                        oabV = leia.next();

                        System.out.println("\nSENHA: ");
                        senhaV = leia.next();

                        for (Cadastro_ADVOGADO advogado : listaadvogado) {



                            if(advogado.getOAB().equalsIgnoreCase(oabV) && advogado.getSenha().equalsIgnoreCase(senhaV)) {
                                encontrou = true;
                                limpa();

                                String op42;

                                do {
                                    limpa();
                                    System.out.println("\nSEJA BEM VINDO Dr" + " "+ advogado.getNome().toUpperCase()+"\n");
                                    ;
                                    System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:\n"
                                            + "A)- PERFIL \n"
                                            + "B)- CLIENTES\n"
                                            + "0)- VOLTAR"
                                    );
                                    op42 = leia.next();

                                    if(op42.equalsIgnoreCase("A")) {
                                        String opP;

                                        do {
                                            limpa();

                                            System.out.println("\n=================\n"
                                                    +"     PERFIL\n"
                                                    + "==================\n");

                                            System.out.println("NOME : " + advogado.getNome().toUpperCase()+"\n");
                                            System.out.println("OAB : " + advogado.getOAB()+"\n");
                                            System.out.println("CPF : " + advogado.getCpf()+"\n");
                                            System.out.println("ÁREA : " + advogado.getArea().toUpperCase());
                                            System.out.println("_______________________________\n");
                                            System.out.println(
                                                    "DIGITE (1) PARA CONSULTAR SEUS PREÇOS\n"
                                                            + "DIGITE (2) PARA CONSULTAR SEUS HORARIOS\n"
                                                            + "DIGITE (0) PARA VOLTAR");
                                            opP = leia.next();

                                            if(opP.equalsIgnoreCase("1")) {
                                                String aux;

                                                do {
                                                    limpa();

                                                    System.out.println("\nPARTICULAR - " + advogado.getPrecoP()+ "$\n"
                                                            + "\nEMPRESARIAL - "+ advogado.getPrecoE()+ "$\n"
                                                            + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                            + "\n1) - ALTERAR OS PREÇOS\n"
                                                            + "0) - VOLTAR\n"
                                                            + "DIGITE UMA DAS OPÇÕES ACIMA");
                                                    aux = leia.next();

                                                    if(aux.equals("1")) {
                                                        limpa();
                                                        System.out.println("DIGITE OS PREÇOS ABAIXO PARA OS TIPOS DE ATENDIMENTO!\n");

                                                        System.out.println("ATENDIMENTO PARTICULAR:");
                                                        while (!leia.hasNextInt()) {
                                                            System.out.println("\nENTRADA INVÁLIDA! DIGITE APENAS NUMEROS:");
                                                            System.out.println("ATENDIMENTO PARTICULAR:");
                                                            leia.next(); // Descarta o valor iInválido digitado pelo usuário
                                                        }


                                                        advogado.setPrecoP(leia.nextInt());
                                                        System.out.println("\nATENDIMENTO EMPRESARIAL:");
                                                        while (!leia.hasNextInt()) {
                                                            System.out.println("\nENTRADA INVÁLIDA! DIGITE APENAS NUMEROS:");
                                                            System.out.println("\nATENDIMENTO EMPRESARIAL:");
                                                            leia.next(); // Descarta o valor iInválido digitado pelo usuário
                                                        }
                                                        advogado.setPrecoE(leia.nextInt());
                                                        System.out.println("\nATENDIMENTO ESTADUAL:");
                                                        while (!leia.hasNextInt()) {
                                                            System.out.println("\nENTRADA INVÁLIDA! DIGITE APENAS NUMEROS:");
                                                            System.out.println("\nATENDIMENTO ESTADUAL:");
                                                            leia.next(); // Descarta o valor iInválido digitado pelo usuário
                                                        }
                                                        advogado.setPrecoEs(leia.nextInt());


                                                        limpa();
                                                        System.out.println("\n"
                                                                + "\n|| PREÇOS CONFIGURADOS CORRETAMENTE ||\n");
                                                        Thread.sleep(segundosDeLatencia * 500);
                                                    }
                                                    if(!aux.equalsIgnoreCase("1") && !aux.equalsIgnoreCase("0")) {

                                                        System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);

                                                    }

                                                }while(!aux.equals("0"));

                                            }

                                            else if(opP.equalsIgnoreCase("2")) {
                                                String opH;
                                                do {


                                                    System.out.println("\nESCOLHA O DIA QUE DESEJA CONSULTAR SEUS HORARIOS: ");
                                                    System.out.println("A)- SEGUNDA-FEIRA\n"
                                                            + "B)- TERÇA-FEIRA\n"
                                                            + "C)- QUARTA-FEIRA\n"
                                                            + "D)- QUINTA-FEIRA\n"
                                                            + "E)- SEXTA-FEIRA\n"
                                                            + "F)- SABADO\n"
                                                            + "G)- DOMINGO\n"
                                                            + "0)- VOLTAR");
                                                    opH = leia.next();



                                                    if(!opH.equalsIgnoreCase("A") && !opH.equalsIgnoreCase("B") &&  !opH.equalsIgnoreCase("C") &&  !opH.equalsIgnoreCase("D")
                                                            && !opH.equalsIgnoreCase("E") && !opH.equalsIgnoreCase("F") && !opH.equalsIgnoreCase("G") && !opH.equalsIgnoreCase("0")) {

                                                        System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);
                                                        limpa();

                                                    }

                                                    if(opH.equalsIgnoreCase("A")) {

                                                    } else if (opH.equalsIgnoreCase("B")) {

                                                    }else if (opH.equalsIgnoreCase("C")) {

                                                    }else if (opH.equalsIgnoreCase("D")) {

                                                    }else if (opH.equalsIgnoreCase("E")) {

                                                    }else if (opH.equalsIgnoreCase("F")) {

                                                    }else if (opH.equalsIgnoreCase("G")) {

                                                    }


                                                }while(!opH.equalsIgnoreCase("A") && !opH.equalsIgnoreCase("B") &&  !opH.equalsIgnoreCase("C") &&  !opH.equalsIgnoreCase("D")
                                                        && !opH.equalsIgnoreCase("E") && !opH.equalsIgnoreCase("F") && !opH.equalsIgnoreCase("G") && !opH.equalsIgnoreCase("0")  );





                                            }
                                            if(!opP.equalsIgnoreCase("1") && !opP.equalsIgnoreCase("2") && !opP.equalsIgnoreCase("0")) {

                                                System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                Thread.sleep(segundosDeLatencia * 1000);
                                                limpa();

                                            }

                                        }while(!opP.equalsIgnoreCase("0"));
                                    }


                                    if(!op42.equalsIgnoreCase("0") && !op42.equalsIgnoreCase("A") && !op42.equalsIgnoreCase("B")) {

                                        System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }
                                }while(!op42.equalsIgnoreCase("0"));
                            }




                        } //FOR
                        if(!encontrou) {
                            limpa();
                            System.out.println("\nALGUM CAMPO FOI DIGITADO INCORRETAMENTE, TENTE NOVAMENTE!\n");
                            Thread.sleep(segundosDeLatencia * 1000);
                        }




                    }

                    else if(op40.equalsIgnoreCase("b")) {
                        String cpfAut;
                        String senhaV2;
                        boolean encontrou2 = false;

                        limpa();
                        System.out.println("DIGITE OS CAMPOS ABAIXO PARA ENTRAR EM SEU PERFIL\n");

                        System.out.println("\nCPF: ");
                        cpfAut = leia.next();

                        System.out.println("\nSENHA: ");
                        senhaV2 = leia.next();

                        for (Cadastro_PESSOA_FISICA cliente : listaCLIENTE) {
                            if(cliente.getCpf().equalsIgnoreCase(cpfAut) && cliente.getSenha().equalsIgnoreCase(senhaV2)) {
                                encontrou2 = true;


                                do {
                                    limpa();
                                    System.out.println("\nSEJA BEM-VINDO " + cliente.getNome());
                                    System.out.println("\nESCOLHA UM SERVIÇO : \n"
                                            + "A) - CONSULTORIA JURÍDICA\n"
                                            + "B) - CONTENCIOSO\n"
                                            + "C) - DIREITO EMPRESARIAL\n"
                                            + "D) - DIREITO TRABALHISTA\n"
                                            + "E) - DIREITO CIVIL\n"
                                            + "F) - DIREITO PENAL\n"
                                            + "G) - DIREITO IMOBILIÁRIO\n"
                                            + "H) - DIREITO TRIBUTÁRIO\n"
                                            + "I) - DIREITO INTERNACIONAL\n"
                                            + "J) - DIREITO DO CONSUMIDOR\n"
                                            + "0) - VOLTAR\n"
                                            + "DIGITE UMA DAS OPÇÕES ACIMA : ");
                                    escolha1 = leia.next().toUpperCase();

                                    switch (escolha1) {
                                        case "A" :
                                            limpa();
                                            String op2244;
                                            String op3344;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado144 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("CONSULTORIA JURIDICA")) {
                                                        encontrouAdvogado144 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado144) {

                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op2244 = leia.next();

                                                if(op2244.equalsIgnoreCase("SIM")) {




                                                    String op1844;



                                                    System.out.println("\nDIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op1844 = leia.next();
                                                    boolean encontrouOaB = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("CONSULTORIA JURIDICA") && op1844.equals(advogado.getOAB())) {
                                                            String op364;
                                                            encontrouOaB = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op364= leia.next();

                                                                if (op364.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op3344 = leia.next();




                                                                        if (!op3344.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op3344.equals("0"));
                                                                }

                                                            } while(!op364.equalsIgnoreCase("0"));
                                                            break;

                                                        }


                                                    } //for
                                                    if(!encontrouOaB){
                                                        System.out.println("OAB INVÁLIDA, DIGITE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//SE TIVER O OAB DO ADVOGADO
                                                    }


                                                }//if (sim)
                                                if(!op2244.equalsIgnoreCase("SIM") && !op2244.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op2244.equalsIgnoreCase("0"));
                                            break;

                                        case "B":
                                            String op224;
                                            String op334;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado142 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("CONTENCIOSO")) {
                                                        encontrouAdvogado142 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado142) {

                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op224 = leia.next();

                                                if(op224.equalsIgnoreCase("SIM")) {




                                                    String op184;



                                                    System.out.println("DIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op184 = leia.next();
                                                    boolean encontrouoab8 = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("CONTENCIOSO") && op184.equals(advogado.getOAB())) {
                                                            String op36;
                                                            encontrouoab8 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "S) - CONTRATAR\n"
                                                                        + "0) - VOLTAR\n");
                                                                op36= leia.next();

                                                                if (op36.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op334 = leia.next();

                                                                        if (!op334.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op334.equals("0"));
                                                                }  else if(op36.equalsIgnoreCase("B")) {


                                                                }  else if(op36.equalsIgnoreCase("C")) {


                                                                }  else if(op36.equalsIgnoreCase("S")) {


                                                                    System.out.println("ESCREVA OS CAMPOS ABAIXO PARA CONTRATAR ESSE ADVOGADO:"
                                                                            + "");

                                                                }


                                                            } while(!op36.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } //for
                                                    if(!encontrouoab8){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for


                                                }//if (sim)

                                                if(!op224.equalsIgnoreCase("SIM") && !op224.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op224.equalsIgnoreCase("0"));

                                            break;

                                        case "C":

                                            String op222;
                                            String op333;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado11 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO EMPRESARIAL")) {
                                                        encontrouAdvogado11 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado11) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op222 = leia.next();

                                                if(op222.equalsIgnoreCase("SIM")) {




                                                    String op181;



                                                    System.out.println("DIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op181 = leia.next();
                                                    boolean encontrouoab7 = false;

                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO EMPRESARIAL") && op181.equals(advogado.getOAB())) {
                                                            String op361;
                                                            encontrouoab7 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "D) - CONTRATAR"
                                                                        + "0) - VOLTAR\n");
                                                                op361= leia.next();

                                                                if (op361.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op333 = leia.next();

                                                                        if (!op333.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op333.equals("0"));

                                                                } else if (op361.equalsIgnoreCase("D")) {

                                                                    System.out.println("DESEJA CONTRATAR ESSE ADVOGADO?: ");



                                                                }

                                                            } while(!op361.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } //for
                                                    if(!encontrouoab7){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for



                                                }//if (sim)
                                                if(!op222.equalsIgnoreCase("SIM") && !op222.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op222.equalsIgnoreCase("0"));

                                            break;

                                        case "D":

                                            String op220;
                                            String op330;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado10 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO TRABALHISTA")) {
                                                        encontrouAdvogado10 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado10) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op220 = leia.next();

                                                if(op220.equalsIgnoreCase("SIM")) {




                                                    String op180;



                                                    System.out.println("DIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op180= leia.next();
                                                    boolean encontrouoab6 = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO TRABALHISTA") && op180.equals(advogado.getOAB())) {
                                                            String op360;
                                                            encontrouoab6 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op360= leia.next();

                                                                if (op360.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op330 = leia.next();

                                                                        if (!op330.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op330.equals("0"));
                                                                }

                                                            } while(!op360.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } //for
                                                    if(!encontrouoab6){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for


                                                }//if (sim)
                                                if(!op220.equalsIgnoreCase("SIM") && !op220.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op220.equalsIgnoreCase("0"));

                                            break;


                                        case "E":

                                            String op100;
                                            String op200
                                                    ;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado2 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO CIVIL")) {
                                                        encontrouAdvogado2 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado2) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op100 = leia.next();

                                                if(op100.equalsIgnoreCase("SIM")) {




                                                    String op56;



                                                    System.out.println("DIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op56 = leia.next();
                                                    boolean encontrouoab5 = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO CIVIL") && op56.equals(advogado.getOAB())) {
                                                            String op360;
                                                            encontrouoab5 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op360= leia.next();

                                                                if (op360.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op200 = leia.next();

                                                                        if (!op200.equals("0")) {
                                                                            limpa();
                                                                            System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                        }

                                                                    } while (!op200.equals("0"));
                                                                }

                                                            } while(!op360.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } //for
                                                    if(!encontrouoab5){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for


                                                }//if (sim)
                                                if(!op100.equalsIgnoreCase("SIM") && !op100.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op100.equalsIgnoreCase("0"));

                                            break;

                                        case "F":

                                            String opO;
                                            String op10;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");

                                                boolean encontrouAdvogado = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO PENAL")) {
                                                        encontrouAdvogado = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                opO = leia.next();



                                                if(opO.equalsIgnoreCase("SIM")) {




                                                    String op12;





                                                    System.out.println("DIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op12 = leia.next();

                                                    boolean encontrouoab4 = false;

                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO PENAL") && op12.equals(advogado.getOAB())) {
                                                            String op3;

                                                            encontrouoab4 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op3 = leia.next();

                                                                if (op3.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op10 = leia.next();

                                                                        if (!op10.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op10.equals("0"));
                                                                }

                                                            } while(!op3.equalsIgnoreCase("0"));
                                                            break;

                                                        }

                                                    } //for
                                                    if(!encontrouoab4){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for



                                                }//if (sim)

                                                if(!opO.equalsIgnoreCase("SIM") && !opO.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!opO.equalsIgnoreCase("0"));
                                            break;


                                        case "G":
                                            String op22;
                                            String op33;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado1 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO IMOBILIARIO")) {
                                                        encontrouAdvogado1 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado1) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op22 = leia.next();

                                                if(op22.equalsIgnoreCase("SIM")) {




                                                    String op18;



                                                    System.out.println("DIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op18 = leia.next();
                                                    boolean encontrouoab3 = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO IMOBILIARIO") && op18.equals(advogado.getOAB())) {
                                                            String op36;

                                                            encontrouoab3 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("SEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op36= leia.next();

                                                                if (op36.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op33 = leia.next();

                                                                        if (!op33.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op33.equals("0"));
                                                                }

                                                            } while(!op36.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } //for
                                                    if(!encontrouoab3){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for



                                                }//if (sim)
                                                if(!op22.equalsIgnoreCase("SIM") && !op22.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op22.equalsIgnoreCase("0"));

                                            break;

                                        case "H":
                                            String op2241;
                                            String op3341;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado14 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO TRIBUTARIO")) {
                                                        encontrouAdvogado14 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado14) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op2241 = leia.next();

                                                if(op2241.equalsIgnoreCase("SIM")) {




                                                    String op1841;



                                                    System.out.println("\nDIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op1841 = leia.next();
                                                    boolean encontrouoab2 = false;

                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO TRIBUTARIO") && op1841.equals(advogado.getOAB())) {
                                                            String op362;
                                                            encontrouoab2 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("\nSEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op362= leia.next();

                                                                if (op362.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op3341 = leia.next();

                                                                        if (!op3341.equals("0")) {

                                                                            System.out.println("\nENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op3341.equals("0"));
                                                                }

                                                            } while(!op362.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } if(!encontrouoab2){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for



                                                }//if (sim)

                                                if(!op2241.equalsIgnoreCase("SIM") && !op2241.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op2241.equalsIgnoreCase("0"));
                                            break;

                                        case "I":

                                            String op22411;
                                            String op33411;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado141 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO INTERNACIONAL")) {
                                                        encontrouAdvogado141 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado141) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op22411 = leia.next();

                                                if(op22411.equalsIgnoreCase("SIM")) {




                                                    String op18411;



                                                    System.out.println("\nDIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op18411 = leia.next();

                                                    boolean encontrouoab = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO INTERNACIONAL") && op18411.equals(advogado.getOAB())) {
                                                            String op3621;
                                                            encontrouoab = true;






                                                            do {
                                                                limpa();
                                                                System.out.println("\nSEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op3621= leia.next();

                                                                if (op3621.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        limpa();
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op33411 = leia.next();

                                                                        if (!op33411.equals("0")) {
                                                                            limpa();
                                                                            System.out.println("\n ENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                        }

                                                                    } while (!op33411.equals("0"));
                                                                }

                                                            } while(!op3621.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } if(!encontrouoab){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }



                                                }//if (sim)
                                                if(!op22411.equalsIgnoreCase("SIM") && !op22411.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op22411.equalsIgnoreCase("0"));
                                            break;

                                        case "J":
                                            String op224111;
                                            String op334111;

                                            do {
                                                limpa();
                                                System.out.println("\n===================================\n"
                                                        + "      ADVOGADOS DISPONÍVEIS\n"
                                                        + "===================================\n");
                                                boolean encontrouAdvogado141 = false;

                                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                                    if (advogado.getArea().equalsIgnoreCase("DIREITO DO CONSUMIDOR")) {
                                                        encontrouAdvogado141 = true;


                                                        System.out.println("Nome: " + advogado.getNome());
                                                        System.out.println("OAB: " + advogado.getOAB());
                                                        System.out.println("CPF: " + advogado.getCpf());
                                                        System.out.println("IDADE: " + advogado.getIdade());
                                                        System.out.println("SERVIÇO: " + advogado.getArea());

                                                        System.out.println("_______________________________\n");
                                                    }
                                                }

                                                if (!encontrouAdvogado141) {
                                                    System.out.println("NENHUM ADVOGADO DISPONIVEL PARA ESTÁ ÁREA");
                                                    Thread.sleep(segundosDeLatencia * 1000);
                                                    break;
                                                }


                                                System.out.println("DESEJA SABER MAIS SOBRE OS ADVOGADOS (DIGITE SIM)? "
                                                        + "OU DIGITE (0) PARA VOLTAR: \n");
                                                op224111 = leia.next();

                                                if(op224111.equalsIgnoreCase("SIM")) {




                                                    String op184111;



                                                    System.out.println("\nDIGITE O OAB DO ADVOGADO QUE DESEJA CONSULTORIA: ");
                                                    op184111 = leia.next();
                                                    boolean encontrouoab1 = false;
                                                    for (Cadastro_ADVOGADO advogado : listaadvogado) {





                                                        if (advogado.getArea().equalsIgnoreCase("DIREITO DO CONSUMIDOR") && op184111.equals(advogado.getOAB())) {
                                                            String op36212;
                                                            encontrouoab1 = true;
                                                            do {
                                                                limpa();
                                                                System.out.println("\nSEJA BEM VINDO AO PERFIL DO " + advogado.getNome() + "\n"
                                                                        + "O QUE DESEJA SABER:\n"
                                                                        + "A) - PREÇO\n"
                                                                        + "B) - HORARIO\n"
                                                                        + "C) - TELEFONE CELULAR PARA CONTATO\n"
                                                                        + "0) - VOLTAR\n");
                                                                op36212= leia.next();

                                                                if (op36212.equalsIgnoreCase("A")) {

                                                                    do {
                                                                        System.out.println("PARTICULAR - " + advogado.getPrecoE()+ "$\n"
                                                                                + "\nEMPRESARIAL - "+ advogado.getPrecoP()+ "$\n"
                                                                                + "\nESTADO - "+ advogado.getPrecoEs() + "$\n"
                                                                                + "\nDIGITE (0) PARA VOLTAR");
                                                                        op334111 = leia.next();

                                                                        if (!op334111.equals("0")) {

                                                                            System.out.println("\n ENTRADA INVÁLIDA, DIGITE NOVAMENTE");
                                                                            Thread.sleep(segundosDeLatencia * 1000);
                                                                            limpa();
                                                                        }

                                                                    } while (!op334111.equals("0"));
                                                                }

                                                            } while(!op36212.equalsIgnoreCase("0"));
                                                            break;

                                                        } //SE TIVER O OAB DO ADVOGADO


                                                    } if(!encontrouoab1){
                                                        System.out.println("OAB INVÁLIDA, TENTE NOVAMENTE!");
                                                        Thread.sleep(segundosDeLatencia * 1000);//for
                                                    }//for



                                                }//if (sim)
                                                if(!op224111.equalsIgnoreCase("SIM") && !op224111.equalsIgnoreCase("0")) {
                                                    System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                                    Thread.sleep(segundosDeLatencia * 1000);

                                                }
                                            }while(!op224111.equalsIgnoreCase("0"));
                                            break;
                                    }

                                    if(!escolha1.equals("A") && !escolha1.equals("B") && !escolha1.equals("C") &&
                                            !escolha1.equals("D") && !escolha1.equals("E") && !escolha1.equals("F") &&
                                            !escolha1.equals("G") && !escolha1.equals("H") && !escolha1.equals("I") &&
                                            !escolha1.equals("J") && !escolha1.equals("0")) {
                                        System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                                        Thread.sleep(segundosDeLatencia * 1000);




                                    }
                                } while (!escolha1.equals("0"));
                            }

                        }
                        if(!encontrou2) {
                            limpa();
                            System.out.println("\nALGUM CAMPO FOI DIGITADO INCORRETAMENTE, TENTE NOVAMENTE!\n");
                            Thread.sleep(segundosDeLatencia * 1000);
                        }
                    }


                    if(!op40.equalsIgnoreCase("A") && !op40.equalsIgnoreCase("B") && !op40.equalsIgnoreCase("0")) {

                        limpa();
                        System.out.println("\nENTRADA INVÁLIDA, TENTA NOVAMENTE!\n");
                        Thread.sleep(segundosDeLatencia * 1000);

                    }

                }while(!op40.equalsIgnoreCase("0"));




            }






            //CADASTRO

            if(op20.equalsIgnoreCase("B")) {
                do {


                    limpa();
                    System.out.println("_______________________________________\n"
                            + "\n  SEJA BEM VINDO AO MENU DE CADASTRO\n"
                            + "_______________________________________\n");

                    System.out.println("A)- CADASTRO DE CLIENTE\n"
                            + "B)- CADASTRO DE ADVOGADO\n"
                            + "0)- VOLTAR\n");
                    escolha = leia.next();

                    if (escolha.equalsIgnoreCase("A")) {
                        limpa();
                        System.out.println("\n"
                                + "================================================\n"
                                + "           MENU CADASTRO DE CLIENTE\n"
                                + "PREENCHA CORRETAMENTE AS INFORMAÇÕES A SEGUIR!\n"
                                + "================================================\n");

                        Cadastro_PESSOA_FISICA novocliente = new Cadastro_PESSOA_FISICA();

                        String nome;
                        do {


                            System.out.println("DIGITE SEU NOME:");
                            nome = leia.next();
                            if(!nome.matches("^[A-Za-z]+$")) {
                                System.out.println("\nNOME INVÁLIDO, DIGITE APENAS LETRAS!");
                                Thread.sleep(segundosDeLatencia * 1000);
                                limpa();
                            }


                        }while(!nome.matches("^[A-Za-z]+$"));


                        novocliente.setNome(nome.toUpperCase());
                        System.out.println("\n");


                        String senha;
                        System.out.println("DIGITE SUA SENHA:");
                        senha= leia.next();
                        novocliente.setSenha(senha);

                        System.out.println("\n");
                        String cpf;
                        System.out.println("DIGITE SEU CPF:");

                        boolean cpfRepetido;
                        //do {
                        do {
                            cpf = leia.next();
                            cpfRepetido = false;

                            for (Cadastro_PESSOA_FISICA cliente : listaCLIENTE) {
                                if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                                    cpfRepetido = true;
                                    break;
                                }
                            }

                            if (cpfRepetido) {
                                System.out.println("\nCPF JÁ EXISTENTE!");
                                System.out.println("\nDIGITE NOVAMENTE O CPF CORRETAMENTE");
                                Thread.sleep(segundosDeLatencia * 1000);
                                limpa();
                            }
                        } while (cpfRepetido);

                        // if (!cpf.matches("\\d{11}")) {
                        //  System.out.println("\nCPF INVÁLIDO!");
                        //System.out.println("\nDIGITE NOVAMENTE O CPF CORRETAMENTE, NECESSITA TER 11 NUMEROS:  ");
                        //  }
                        //	} while (!cpf.matches("\\d{11}"));




                        novocliente.setCpf(cpf);


                        System.out.println("\n");

                        String dtnsc;
                        System.out.println("DIGITE SUA DATA DE NASCIMENTO : ");
                        dtnsc = leia.next();
                        novocliente.setDatanascimento(dtnsc);
                        System.out.println("\n");


                        listaCLIENTE.add(novocliente);
                        limpa();
                        System.out.println("--------------------------------------------------------------------\n"
                                + "   	             CADASTRO REALIZADO COM SUCESSO!\n"
                                + "		          SEJA BEM-VINDO " + novocliente.getNome().toUpperCase() +" \n"
                                + "           AO SITE DE SUPORTE A CLIENTE NA ÁREA DE ADVOGACIA\n"
                                + "--------------------------------------------------------------------\n");
                        Thread.sleep(segundosDeLatencia * 1000);



                        break;
                    } else if (escolha.equalsIgnoreCase("B")) {


                        limpa();
                        System.out.println("\n"
                                + "================================================\n"
                                + "            MENU CADASTRO DE ADVOGADO\n"
                                + "PREENCHA CORRETAMENTE AS INFORMAÇÕES A SEGUIR!\n"
                                + "================================================\n");



                        Cadastro_ADVOGADO novoadvogado = new Cadastro_ADVOGADO();

                        String nomeA;
                        do {

                            System.out.println("DIGITE SEU NOME:");
                            nomeA = leia.next();
                            if(!nomeA.matches("^[A-Za-z]+$")) {

                                System.out.println("\nNOME INVÁLIDO, DIGITE APENAS LETRAS!");
                                Thread.sleep(segundosDeLatencia * 1000);
                                limpa();

                            }


                        }while(!nomeA.matches("^[A-Za-z]+$"));
                        nomeA.toUpperCase();
                        novoadvogado.setNome(nomeA);
                        System.out.println("\n");

                        String senhaA;
                        System.out.println("DIGITE SUA SENHA:");
                        senhaA = leia.next();
                        novoadvogado.setSenha(senhaA);
                        System.out.println("\n");

                        String cpfA;
                        // do {





                        boolean cpfRepetido1;
                        //do {


                        do {
                            System.out.println("DIGITE SEU CPF:");
                            cpfA = leia.next();
                            cpfRepetido1 = false;

                            for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                if (advogado.getCpf().equalsIgnoreCase(cpfA)) {
                                    cpfRepetido1 = true;
                                    break;
                                }
                            }

                            if (cpfRepetido1) {

                                System.out.println("\nCPF JÁ EXISTENTE!");
                                System.out.println("DIGITE NOVAMENTE O CPF CORRETAMENTE: ");
                            }
                        } while (cpfRepetido1);
                        // if (!cpfA.matches("\\d{11}")) {
                        //  System.out.println("\nCPF INVÁLIDO!");
                        //System.out.println("\nDIGITE NOVAMENTE O CPF CORRETAMENTE, NECESSITA TER 11 NUMEROS:  ");
                        //  }
                        //	} while (!cpfA.matches("\\d{11}"));




                        novoadvogado.setCpf(cpfA);
                        System.out.println("\n");


                        String OAB;
                        System.out.println("DIGITE SEU OAB:");

                        boolean OABRepetido;
                        do {
                            do {
                                OAB = leia.next();
                                OABRepetido = false;

                                for (Cadastro_ADVOGADO advogado : listaadvogado) {
                                    if (advogado.getOAB().equalsIgnoreCase(OAB)) {
                                        OABRepetido = true;
                                        break;
                                    }
                                }

                                if (OABRepetido) {

                                    System.out.println("\nOAB JÁ EXISTENTE!");
                                    System.out.println("DIGITE NOVAMENTE O OAB CORRETAMENTE: ");
                                }
                            } while (OABRepetido);
                            if (!OAB.matches("\\d{1,6}")) {
                                System.out.println("\nOAB INVÁLIDO!");
                                System.out.println("DIGITE NOVAMENTE O OAB CORRETAMENTE: ");
                            }
                        } while (!OAB.matches("\\d{1,6}"));


                        novoadvogado.setOAB(OAB);


                        System.out.println("\n");

                        int idade;
                        System.out.println("DIGITE SUA IDADE:");
                        while (!leia.hasNextInt()) {
                            System.out.println("\nENTRADA INVÁLIDA! \nDIGITE APENAS NUMEROS:");
                            leia.next(); // Descarta o valor iInválido digitado pelo usuário
                        }
                        idade = leia.nextInt();
                        novoadvogado.setIdade(idade);

                        String escolhaA;
                        do {
                            System.out.println("\nESCOLHA UM SERVIÇO:\n"
                                    + "- CONSULTORIA JURÍDICA\n"
                                    + "- CONTENCIOSO\n"
                                    + "- DIREITO EMPRESARIAL\n"
                                    + "- DIREITO TRABALHISTA\n"
                                    + "- DIREITO CIVIL\n"
                                    + "- DIREITO PENAL\n"
                                    + "- DIREITO IMOBILIÁRIO\n"
                                    + "- DIREITO TRIBUTÁRIO\n"
                                    + "- DIREITO INTERNACIONAL\n"
                                    + "- DIREITO DO CONSUMIDOR\n"
                                    + "DIGITE UMA DAS ÁREAS ACIMA: ");
                            escolhaA = leia.nextLine();


                            if (!escolhaA.equalsIgnoreCase("CONSULTORIA JURIDICA") && !escolhaA.equalsIgnoreCase("CONTENCIOSO")
                                    && !escolhaA.equalsIgnoreCase("DIREITO EMPRESARIAL") && !escolhaA.equalsIgnoreCase("DIREITO TRABALHISTA")
                                    && !escolhaA.equalsIgnoreCase("DIREITO CIVIL") && !escolhaA.equalsIgnoreCase("DIREITO PENAL")
                                    && !escolhaA.equalsIgnoreCase("DIREITO IMOBILIARIO") && !escolhaA.equalsIgnoreCase("DIREITO TRIBUTARIO")
                                    && !escolhaA.equalsIgnoreCase("DIREITO INTERNACIONAL") && !escolhaA.equalsIgnoreCase("DIREITO DO CONSUMIDOR")) {
                                System.out.println("SERVIÇO DIGITADO INCORRETAMENTE!, DIGITE NOVAMENTE POR FAVOR\n");
                            }
                            // Limpa o buffer do scanner
                            leia.nextLine();


                        }

                        while (!escolhaA.equalsIgnoreCase("CONSULTORIA JURIDICA") && !escolhaA.equalsIgnoreCase("CONTENCIOSO")
                                && !escolhaA.equalsIgnoreCase("DIREITO EMPRESARIAL") && !escolhaA.equalsIgnoreCase("DIREITO TRABALHISTA")
                                && !escolhaA.equalsIgnoreCase("DIREITO CIVIL") && !escolhaA.equalsIgnoreCase("DIREITO PENAL")
                                && !escolhaA.equalsIgnoreCase("DIREITO IMOBILIARIO") && !escolhaA.equalsIgnoreCase("DIREITO TRIBUTARIO")
                                && !escolhaA.equalsIgnoreCase("DIREITO INTERNACIONAL") && !escolhaA.equalsIgnoreCase("DIREITO DO CONSUMIDOR"));

                        novoadvogado.setArea(escolhaA);
                        listaadvogado.add(novoadvogado);


                        for (Cadastro_ADVOGADO advogado : listaadvogado) {
                            System.out.println("NOME: " + advogado.getNome());
                            System.out.println("OAB: " + advogado.getOAB());
                            System.out.println("CPF: " + advogado.getCpf());
                            System.out.println("AREA: " + advogado.getArea());

                            // Imprimir outros atributos específicos do advogado
                            System.out.println();
                        }
                        limpa();
                        System.out.println("--------------------------------------------------------------------\n"
                                + "   	             CADASTRO REALIZADO COM SUCESSO!\n"
                                //	+ "		           SEJA BEM-VINDO " + advogado.getNome().toUpperCase() +" \n"
                                + "           OBRIGADO POR FAZER PARTE DA NOSSA EQUIPE DE ADVOGADOS!\n"
                                + "--------------------------------------------------------------------\n");
                        Thread.sleep(segundosDeLatencia * 1000);
                        break;
                    }



                    if(!escolha.equalsIgnoreCase("A") && !escolha.equalsIgnoreCase("B") && !escolha.equalsIgnoreCase("0") ) {
                        limpa();
                        System.out.println("ENTRADA INVÁLIDA, DIGITE NOVAMENTE!");
                        Thread.sleep(segundosDeLatencia * 1000);
                    }



                    //ADVOGADO
                }while(!escolha.equalsIgnoreCase("0"));

            } //cadastro


            if(!op20.equalsIgnoreCase("A") && !op20.equalsIgnoreCase("B")) {
                limpa();
                System.out.println("\nENTRADA INVÁLIDA, TENTE NOVAMENTE!");
                Thread.sleep(segundosDeLatencia * 1000);
            }

        }while(!op20.equalsIgnoreCase("0")); //TELA PRINCIAPL


    }

    public static void limpa() throws InterruptedException, IOException {
        new ProcessBuilder ("cmd", "/c",  "cls" ).inheritIO().start().waitFor();

    }
}
