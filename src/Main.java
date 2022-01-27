import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso javaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev DaniDev = new Dev();
        DaniDev.setNome("Daniela");
        DaniDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Daniela: " + DaniDev.getConteudoInscritos());
        DaniDev.progredir();
        System.out.println("--------------");
        System.out.println("Conteudos Inscritos Daniela: " + DaniDev.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Daniela: " + DaniDev.getConteudoConcluidos());
        System.out.println("xp: " + DaniDev.calcularTotalXp());

        System.out.println("--------------");

        Dev OutroDev = new Dev();
        OutroDev.setNome("Alex");
        OutroDev.inscreverBootcamp(bootcamp);
        OutroDev.progredir();
        System.out.println("--------------");
        System.out.println("Conteudos Inscritos Outro dev: " + OutroDev.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Outro dev: " + OutroDev.getConteudoConcluidos());
        System.out.println("xp: " + OutroDev.calcularTotalXp());
    }
}
