package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Service {

    public static void bootcamp() {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao ("descrisção curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao ("descrisção curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescriscao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao. setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("******************************************************************");
        Dev devCamila = new Dev();
        devCamila. setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
