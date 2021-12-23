import sw.com.desafio.dominio.Course;
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
        curso.setWorkload(150);

        curso1.setTitle("Curso B");
        curso1.setDescription("Descrição Curso B");
        curso1.setWorkload(180);

        mentoring.setTitle("Mentoria do Curso A");
        mentoring.setDescription("Descrição mentoria do curso A");
        mentoring.setDate(LocalDate.now());

        mentoring1.setDate(LocalDate.of(2020, 10, 10));
        mentoring1.setDescription("Descrição mentoria do curso B");
        mentoring1.setTitle("Mentoria do Curso B");


        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoring);
        System.out.println(mentoring1);


    }
}
