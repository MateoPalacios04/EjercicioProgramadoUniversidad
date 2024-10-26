public class Materia {

    String Nmateria;

    public String getNmateria() {
        return Nmateria;
    }

    public void setNmateria(String nmateria) {
        Nmateria = nmateria;
    }

    int Cmateria;

    public int getCmateria() {
        return Cmateria;
    }

    public void setCmateria(int cmateria) {
        Cmateria = cmateria;
    }

    public String RegistroTotal(){
        String reg= "El nombre de la materia es: "+ getNmateria();

        return reg;
    }

    public String RegistroTotal2(){
        String reg= "El curso de la materia es: "+ getCmateria();

        return reg;
    }


}
