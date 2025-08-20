import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descriçao curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Node");
        curso2.setDescricao("Descriçao curso Node");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descriçao mentoria Java");
        mentoria.setData(LocalDate.now());

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        dev1.setNome("Marcos");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Marcos" + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-----------");
        System.out.println("Conteudos inscritos apos progredir" + dev1.getConteudosIncritos());
        System.out.println("Conteudos concluidos" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularXP());

        System.out.println(' ');

        dev2.setNome("Arlesson");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Arlesson" + dev2.getConteudosIncritos());
        dev2.progredir();
        System.out.println("-----------");
        System.out.println("Conteudos inscritos apos progredir" + dev2.getConteudosIncritos());
        System.out.println("Conteudos concluidos" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularXP());


    }
}