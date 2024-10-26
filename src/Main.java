import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Ingresar nombre");
        Scanner sc= new Scanner(System.in);
        Alumnos a= new Alumnos();
        String r;
        r = sc.nextLine();
        a.setNombre(r);



        System.out.println("Ingresar Universidad");
        Scanner sc2= new Scanner(System.in);
        Universidad u= new Universidad();
        String r1;
        r1 = sc.nextLine();
        u.setUname(r1);

        System.out.println("Ingresar Nombre de materia");
        Scanner sc5= new Scanner(System.in);
        Materia m= new Materia();
        String r4;
        r4 = sc.nextLine();
        m.setNmateria(r4);

        System.out.println("Ingresar Num. de Curso");
        Scanner sc3= new Scanner(System.in);
        Curso c= new Curso();
        int r2;
        r2 = sc.nextInt();
        c.setCname(r2);

        System.out.println("Ingresar N. de alumnos de curso");
        Scanner sc4= new Scanner(System.in);
        Curso c1= new Curso();
        int r3;
        r3 = sc.nextInt();
        c1.setNalumnos(r3);




        System.out.println("Ingresar C. de materia");
        Scanner sc6= new Scanner(System.in);
        Materia m2= new Materia();
        int r5;
        r5 = sc.nextInt();
        m2.setCmateria(r5);

        System.out.println(a.RegistroTotal());
        System.out.println(u.RegistroTotal());
        System.out.println(c.RegistroTotal());
        System.out.println(c1.RegistroTotal2());
        System.out.println(m.RegistroTotal());
        System.out.println(m2.RegistroTotal2());












    }
}