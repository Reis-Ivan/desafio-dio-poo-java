import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso python");
        curso3.setDescricao("descricao curso python");
        curso3.setCargaHoraria(6);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso logica de programacao");
        curso4.setDescricao("descricao curso logica de programacao");
        curso4.setCargaHoraria(3);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Python");
        bootcamp2.setDescricao("Descricao Bootcamp Python");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso4);



//        Dev dev1 = new Dev();
//        dev1.setNome("Camila");
//        dev1.inscreverBootcamp(bootcamp1);
//        System.out.println("Conteudos inscritos CAMILA: " + dev1.getConteudosInscritos());
//        dev1.progredir();
//        dev1.progredir();
//        System.out.println("-");
//        System.out.println("Conteudos inscritos CAMILA: " + dev1.getConteudosInscritos());
//        System.out.println("Conteudos concluidos CAMILA: " + dev1.getConteudosConcluidos());
//        System.out.println("XP: " + dev1.calcularTotalXp());
//
//        System.out.println("---------");

        Dev dev2 = new Dev();
        dev2.setNome("Ivan");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos IVAN: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos IVAN: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos IVAN: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("Conteudos histório IVAN: ");
        dev2.exibeHistoricoCursos();

        dev2.inscreverBootcamp(bootcamp2);
        dev2.progredir();
        dev2.progredir();
        dev2.exibeHistoricoCursos();

    }
}