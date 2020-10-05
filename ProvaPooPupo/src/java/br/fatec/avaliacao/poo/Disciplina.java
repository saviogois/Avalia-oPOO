package br.fatec.avaliacao.poo;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String ementa;
    private String ciclo;
    private double nota;
    
    public Disciplina(String nome, String ementa, String ciclo, double nota){
        this.nome = nome;
        this.ementa = ementa;
        this.ciclo = ciclo;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public static ArrayList<Disciplina> getList(){
        ArrayList<Disciplina> disc = new ArrayList();
        disc.add(new Disciplina("Banco de Dados","Conceitos de Base de Dados. Modelos conceituais de informações. Modelos de Dados: Relacional,  Redes e Hierárquicos. Modelagem de dados - conceitual, lógica e física. Teoria relacional: dependências funcionais e multivaloradas, formas normais. Restrições de integridade e de segurança em Banco de Dados Relacional. Sistemas Gerenciadores de Banco de Dados – objetivo e funções. Linguagens de declaração e de manipulação de dados.","4ºCiclo",0));
        disc.add(new Disciplina("Programação Orientada a Objetos","Conceitos e evolução da tecnologia de orientação a objetos. Limitações e diferenças entre o paradigma da programação estruturada em relação à orientação a objetos. Conceito de objeto, classe, métodos, atributos, herança, polimorfismo, agregação, associação, dependência, encapsulamento, mensagem e suas respectivas notações na linguagem padrão de representação da orientação a objetos. Implementação de algoritmos orientado a objetos utilizando linguagens de programação. Aplicação e uso das estruturas fundamentais da orientação a objetos.","4° Ciclo",0));
        disc.add(new Disciplina("Engenharia de Software III","Conceitos, evolução e importância de arquitetura de software. Padrões de Arquitetura. Padrões de Distribuição. Camadas no desenvolvimento de software. Tipos de Arquitetura de Software. Visões na arquitetura de software. Modelo de Análise e Projetos. Formas de representação. O processo de desenvolvimento. Mapeamento para implementação. Integração do sistema. Testes: planejamento e tipos. Manutenção. Documentação.","4° Ciclo",0));
        disc.add(new Disciplina("Linguagem de Programação IV","Comandos de linguagens usadas na construção e estruturação de sites para a Web, com páginas dinâmi­cas e interativas. Definição de layouts e formatação em geral. Adição de algorítmos usando laços, matrizes, datas, funções e condições. Introdução a Orientação a Objetos utilizando objetos, métodos e propriedades. Integração com Banco de Dados. Exercícios práticos com projeto de criação de sites.","4° Ciclo",0));
        disc.add(new Disciplina("Metodologia da Pesquisa Científico-tecnológica","O Papel da ciência e da tecnologia. Tipos de conhecimento. Método e técnica. O processo de leitura e de análise textual. Citações e bibliografias. Trabalhos acadêmicos: tipos, características e composição estrutural. O projeto de pesquisa experimental e não-experimental. Pesquisa qualitativa e quantitativa. Apresentação gráfica. Normas da ABNT.","4° Ciclo",0));
        disc.add(new Disciplina("Sistemas operacionais II","Apresentação de um sistema operacional específico utilizado em ambiente corporativo. Requisitos de hardware para instalação do sistema. Processo de instalação, personalização, operação, administração e segurança sobre o sistema operacional focado.  Elaboração de projetos de seleção e implantação de um sistema operacional.","4° Ciclo",0));
        return disc;
    }
}
