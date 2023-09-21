public class Estudiante {
    public double id;
    public double edad;
    public double tviaje;
    public double test;
    public double tlibre;
    public double alcoholS;
    public double alcoholFDS;
    public double faltas;
    public double nota;
    public String valoracion;
    public String asigado;

    public Estudiante() {

    }

    public Estudiante(double id, double edad, double tviaje, double test, double tlibre, double alcoholS, double alcoholFDS, double faltas, double nota) {
        this.id = id;
        this.edad = edad;
        this.tviaje = tviaje;
        this.test = test;
        this.tlibre = tlibre;
        this.alcoholS = alcoholS;
        this.alcoholFDS = alcoholFDS;
        this.faltas = faltas;
        this.nota = nota;
        if(nota < 3){
            valoracion = "Baja";
        } else if (nota <4) {
            valoracion = "Básica";
        }else if (nota < 4.5){
            valoracion = "Alta";
        }else{
            valoracion = "Superior";
        }


    }
}
