public class Docente extends Persona{///Le heredamos de la clase Persona a la Clase estudiante

    //Constructor
    public Docente(String nombre, int edad, int anio_nacimiento, String ocupacion, int cedula) {
        super(nombre, edad, anio_nacimiento, ocupacion, cedula);
    }

    @Override //imrprime algo distinto a las otras clases
    public void Calificaciones_de_clase() {
        super.Calificaciones_de_clase();
        System.out.println("Las notas de tu clase en primedio son de 5.0");
    }

    @Override//imrprime algo distinto a las otras clases
    public void menu() {
        super.menu();
        System.out.println("1) Ver notas de toda la clase");
        System.out.println("2) Crear cuestionarios");
    }
}
