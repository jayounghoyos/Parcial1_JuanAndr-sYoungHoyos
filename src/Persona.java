public class Persona {

    //Encapsulamiento: en los atributos teniendolos como privados
    private String nombre;
    private int edad;
    private int anio_nacimiento;
    private String ocupacion;
    private int cedula;

    //Constructor de la clase Persona
    public Persona(String nombre, int edad, int anio_nacimiento, String ocupacion, int cedula){
        this.nombre = nombre;
        this.edad = edad;
        this.anio_nacimiento = anio_nacimiento;
        this.ocupacion = ocupacion;
        this.cedula = cedula;
    }

    //Creación de setters y Getters con Alt + supr
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int isanio_nacimiento() {
        return anio_nacimiento;
    }

    public void setanio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    //Creción de los métodos de esta clase, de los cuales dos tendrán polimorfismo.
    public void Calificaciones_de_clase(){
        System.out.println("Hola -> " + ocupacion);
    }
    public void nombre(){
        System.out.println("**************");
        System.out.println("El nombre de esta persona es -> " + nombre);
    }

    public void menu(){
        System.out.println();
    }

}
