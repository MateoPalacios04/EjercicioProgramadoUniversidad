public class Curso {

    int Cname;

    public int getCname() {
        return Cname;
    }

    public void setCname(int cname) {
        Cname = cname;
    }

    int Nalumnos;

    public int getNalumnos() {
        return Nalumnos;
    }

    public void setNalumnos(int nalumnos) {
        Nalumnos = nalumnos;
    }

    public String RegistroTotal(){
        String reg= "El numero de curso es: " + getCname();
        return reg;
    }

    public String RegistroTotal2(){
        String reg= "El numero de alumnos de curso es: " + getNalumnos();
        return reg;
    }
}
