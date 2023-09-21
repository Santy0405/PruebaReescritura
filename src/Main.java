import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lectura ls = new Lectura();
        Clasificacion cl = new Clasificacion();
        ArrayList<Estudiante> conf = new ArrayList<Estudiante>();
        ls.datos();

        conf = cl.asignacion(ls.datos());
        cl.exito(ls.datos());
        /*for(int i =0; i < conf.size(); i++){
            System.out.println(conf.get(i).id + " " + conf.get(i).asigado);
        }*/
    }
}
