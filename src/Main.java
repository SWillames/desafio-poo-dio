import sw.com.desafio.dominio.Bootcamp;
import sw.com.desafio.dominio.Course;
import sw.com.desafio.dominio.Dev;
import sw.com.desafio.dominio.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course curso = new Course();
        Course curso1 = new Course();
        Mentoring mentoring = new Mentoring();
        Mentoring mentoring1 = new Mentoring();

        curso.setTitle("Curso A");
        curso.setDescription("Descrição Curso A");
        curso.setWorkload(8);

        curso1.setTitle("Curso B");
        curso1.setDescription("Descrição Curso B");
        curso1.setWorkload(4);

        mentoring.setTitle("Mentoria do Curso A");
        mentoring.setDescription("Descrição mentoria do curso A");
        mentoring.setDate(LocalDate.now());

        mentoring1.setDate(LocalDate.of(2020, 10, 10));
        mentoring1.setDescription("Descrição mentoria do curso B");
        mentoring1.setTitle("Mentoria do Curso B");


//        System.out.println(curso);
//        System.out.println(curso1);
//        System.out.println(mentoring);
//        System.out.println(mentoring1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Dev Java");
        bootcamp.setDescription("Descrição Bootcamp Dev Java");
        bootcamp.getContents().add(curso);
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(mentoring);

        Dev dev1 = new Dev();
        dev1.setName("John Doe");
        dev1.subscribeBootcamp(bootcamp);
        System.out.println("Conteudo inscritos" + dev1.getContentSubscribed());
        dev1.toProgress();
        System.out.println("-");
        System.out.println("Conteudo inscritos" + dev1.getContentSubscribed());
        System.out.println("Conteudo concluidos" + dev1.getContentCompleted());
        double x = dev1.calculateTotalXp();
        System.out.println("XP: "+dev1.calculateTotalXp());


        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setName("Jane Doe");
        dev2.subscribeBootcamp(bootcamp);
        System.out.println("Conteudo inscritos" + dev2.getContentSubscribed());
        dev2.toProgress();
        System.out.println("-");
        System.out.println("Conteudo inscritos" + dev2.getContentSubscribed());
        System.out.println("Conteudo concluidos" + dev2.getContentCompleted());
        System.out.println("XP: "+dev2.calculateTotalXp());
    }
}
