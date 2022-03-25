import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alexandre: " + devAlexandre.getConteudosConcluidos());
        System.out.println("XP: " + devAlexandre.calcularTotalXp());

        System.out.println("---------------------");

        Dev devSuzana = new Dev();
        devSuzana.setNome("Suzana");
        devSuzana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Suzana: " + devSuzana.getConteudosInscritos());
        devSuzana.progredir();
        devSuzana.progredir();
        devSuzana.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Suzana: " + devSuzana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Suzana: " + devSuzana.getConteudosConcluidos());
        System.out.println("XP: " + devSuzana.calcularTotalXp());
    }
}
