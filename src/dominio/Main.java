package dominio;

import dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("dominio.Curso Java");
        curso1.setDescricao("Descricao");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("dominio.Curso JavaScript");
        curso2.setDescricao("Descricao");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Descracao");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscristos Amanda" + devAmanda.getConteudosInscritos());

        devAmanda.progredir();
        System.out.println();
        devAmanda.progredir();
        System.out.println();
        devAmanda.progredir();
        System.out.println();
        System.out.println("Conteúdos Inscristos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Amanda" + devAmanda.getConteudosConcluidos());
        System.out.println("XP: " + devAmanda.calcularTotalXp());

        System.out.println();
        System.out.println();
        System.out.println();

        Dev devItalo = new Dev();
        devItalo.setNome("Italo");
        devItalo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscristos Italo" + devItalo.getConteudosInscritos());

        devItalo.progredir();
        System.out.println();
        System.out.println("Conteúdos Inscristos Italo" + devItalo.getConteudosInscritos());
        System.out.println("Conteúdos Comcluidos Italo" + devItalo.getConteudosConcluidos());
        System.out.println("XP: " + devItalo.calcularTotalXp());

    }

}
