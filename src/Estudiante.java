public class Estudiante extends Persona{ ///Le heredamos de la clase Persona a la Clase estudiante
    //Atributo de la nota
    private int nota; //Encapsulamos nota

    //Constructor
    public Estudiante(String nombre, int edad, int anio_nacimiento, String ocupacion, int cedula, int nota) {
        super(nombre, edad, anio_nacimiento, ocupacion, cedula);
        this.nota=nota;
    }

    //Setters y getters
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override//a este se le aplica porlimorfismo en las otras clases
    public void Calificaciones_de_clase() {
        super.Calificaciones_de_clase();
        System.out.println("Tu nota es -> " +nota);
    }

    @Override//a este se le aplica porlimorfismo en las otras clases
    public void menu() {
        super.menu();
        System.out.println("1)Ver notas");
        System.out.println("2)Hacer cuestionarios");
    }
}
