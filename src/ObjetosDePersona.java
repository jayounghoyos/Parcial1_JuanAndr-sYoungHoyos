public class ObjetosDePersona {
    public static void main(String[] args) {
        //Creamos el objeto pepito de la clase Estudiante la cual hereda de persona
        //Los métodos menú y calificaciones tienen polimorfismo, imprimiendo distinto dependiendo de que sean

        Estudiante pepito = new Estudiante("Juan",18,2005,"Estudiante",101, 5);
        pepito.nombre();
        pepito.menu();
        pepito.Calificaciones_de_clase();


        Administrativo Rosa = new Administrativo("Rosa", 25, 1600, "Administrativo", 131321312);
        Rosa.nombre();
        Rosa.menu();
        Rosa.Calificaciones_de_clase();

        Docente Marcos = new Docente("Marcos",32,3123,"Docente",312312);
        Marcos.nombre();
        Marcos.menu();
        Marcos.Calificaciones_de_clase();




    }
}