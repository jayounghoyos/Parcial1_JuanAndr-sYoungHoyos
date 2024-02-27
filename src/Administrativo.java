public class Administrativo extends Persona{///Le heredamos de la clase Persona a la Clase estudiante

    //creamos constructor
    public Administrativo(String nombre, int edad, int anio_nacimiento, String ocupacion, int cedula) {
        super(nombre, edad, anio_nacimiento, ocupacion, cedula);
    }

    @Override// imrprime algo distinto a las otras clases
    public void Calificaciones_de_clase() {
        super.Calificaciones_de_clase();
        System.out.println("Esta es la clase de Marcos");
        System.out.println("La calificacion del profe es de 5.0");
        System.out.println("La calificacion total del curso es 5.0");
    }

    @Override //imrprime algo distinto a las otras clases
    public void menu() {
        super.menu();
        System.out.println("1)Ver notas");
        System.out.println("2)Asignar profesor");
        System.out.println("3)Asignar horario");
    }
}
