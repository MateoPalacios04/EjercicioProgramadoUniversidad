public class Universidad {

String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }


    public String RegistroTotal(){
        String reg= "El nombre de la universidad es: " + getUname();
        return reg;
    }
}
