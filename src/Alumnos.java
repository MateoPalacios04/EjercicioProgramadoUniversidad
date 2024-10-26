

public class Alumnos {



 String nombre;

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String RegistroTotal(){
  String reg= "El nombre del alumno es: " + getNombre();
  return reg;
 }

}
