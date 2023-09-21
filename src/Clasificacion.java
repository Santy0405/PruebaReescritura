import java.util.ArrayList;
import java.util.Objects;

public class Clasificacion {
    //Clase para ponder 7239 if's
    Estudiante est;
    ArrayList<Estudiante> asignados = new ArrayList<Estudiante>();
    public ArrayList<Estudiante> asignacion(ArrayList<Estudiante> datos){
        for(int i = 0; i < datos.size(); i++){
            est = new Estudiante(datos.get(i).id,datos.get(i).edad, datos.get(i).tviaje, datos.get(i).test,
                    datos.get(i).tlibre, datos.get(i).alcoholS, datos.get(i).alcoholFDS, datos.get(i).faltas, datos.get(i).nota);
            if(est.edad > 15.5){
                if(est.tviaje > 13.5){
                    if(est.test > 21.5){
                        if(est.tlibre > 15.5){
                            if(est.alcoholS > 1.5){
                                if(est.alcoholFDS > 3.5){
                                    if(est.faltas > 2){
                                        est.asigado = "Baja";
                                    }else if (est.edad > 16.5) {
                                        est.asigado = "Baja";
                                    }else{
                                        est.asigado = "Básica";
                                    }
                                }else{
                                    est.asigado = "Baja";
                                }
                            }else if (est.alcoholFDS > 1.5) {
                                if(est.faltas > 6){
                                    est.asigado = "Básica";
                                }else if(est.tviaje > 36.5){
                                    est.asigado = "Básica";
                                }else{
                                    est.asigado = "Baja";
                                }
                            } else if (est.faltas > 5) {
                                if(est.tviaje > 23){
                                    est.asigado = "Básica";
                                }else{
                                    est.asigado = "Baja";
                                }
                            } else if (est.tviaje > 39.5) {
                                est.asigado = "Baja";
                            }else{
                                est.asigado = "Alta";
                            }
                        } else if (est.alcoholS > 1.5) {
                            if(est.alcoholFDS > 2.5){
                                est.asigado = "Básica";
                            }else{
                                est.asigado = "Baja";
                            }
                        } else if (est.alcoholFDS > 1.5) {
                            if(est.faltas > 9){
                                if(est.edad > 16.5){
                                    est.asigado = "Baja";
                                } else if (est.tviaje > 17) {
                                    est.asigado = "Baja";
                                }else{
                                    est.asigado = "Básica";
                                }
                            }else{
                                if(est.tviaje > 15){
                                    est.asigado = "Básica";
                                }else{
                                    est.asigado = "Baja";
                                }
                            }
                        }else if (est.faltas > 2){
                            est.asigado = "Básica";
                        } else if (est.edad > 16.5) {
                            est.asigado = "Baja";
                        }else{
                            est.asigado = "Básica";
                        }
                    }else if(est.tlibre > 16.5){
                        if(est.alcoholS > 1.5){
                            est.asigado = "Baja";
                        } else if (est.alcoholFDS > 3) {
                            est.asigado = "Baja";
                        } else if (est.faltas > 1) {
                            if(est.edad > 16.5){
                                est.asigado = "Baja";
                            } else if (est.tviaje > 28.5){
                                est.asigado = "Baja";
                            }else{
                                est.asigado = "Básica";
                            }
                        } else if (est.tviaje > 15){
                            if(est.test > 7.5){
                                est.asigado = "Básica";
                            }else{
                                est.asigado = "Baja";
                            }
                        }else{
                            est.asigado = "Baja";
                        }
                    } else if(est.alcoholS > 1.5){
                        if( est.alcoholFDS > 2.5){
                            if(est.faltas > 16){
                                est.asigado = "Superior";
                            }else{
                                est.asigado = "Baja";
                            }
                        }else{
                            est.asigado = "Baja";
                        }
                    } else if (est.alcoholFDS > 1.5) {
                        if(est.faltas > 8){
                            est.asigado = "Baja";
                        }else{
                            est.asigado = "Básica";
                        }
                    } else if (est.faltas > 1) {
                        est.asigado = "Básica";
                    } else if (est.edad > 16.5) {
                        est.asigado = "Básica";
                    } else if (est.tviaje > 21) {
                        est.asigado = "Baja";
                    }else{
                        est.asigado = "Básica";
                    }
                } else if (est.test > 21.5) {
                    if(est.tlibre > 15.5){
                        if(est.alcoholS > 1.5){
                            if(est.alcoholFDS > 3.5){
                                if(est.faltas > 3){
                                    est.asigado ="Básica";
                                }else{
                                    est.asigado="Baja";
                                }
                            }else{
                                est.asigado="Baja";
                            }
                        } else if (est.alcoholFDS > 1.5) {
                            if(est.faltas > 7){
                                est.asigado="Baja";
                            }else{
                                if(est.tviaje > 12){
                                    est.asigado="Básica";
                                }else{
                                    est.asigado="Baja";
                                }
                            }
                        } else if (est.faltas > 2) {
                            if(est. edad > 16.5){
                                est.asigado="Baja";
                            }else{
                                if(est.tviaje > 4.5){
                                    est.asigado="Baja";
                                }else{
                                    est.asigado="Alta";
                                }
                            }
                        } else if (est.tviaje > 9) {
                            if(est.test > 38.5){
                                est.asigado="Alta";
                            }else{
                                est.asigado="Básica";
                            }
                        }else{
                            est.asigado="Baja";
                        }
                    } else if (est.alcoholS > 1.5) {
                        est.asigado="Baja";
                    } else if (est.alcoholFDS > 1.5) {
                        if(est.faltas > 5){
                            if(est.edad > 16.5){
                                est.asigado="Baja";
                            } else if (est.tviaje > 4.5) {
                                est.asigado="Básica";
                            }else{
                                est.asigado="Baja";
                            }
                        }else if (est.edad > 16.5 ){
                            est.asigado="Baja";
                        } else if (est.tviaje > 7.5) {
                            est.asigado="Baja";
                        }else{
                            est.asigado="Básica";
                        }
                    } else if (est.faltas > 3) {
                        if( est.edad > 18){
                            est.asigado="Baja";
                        } else if (est.tviaje > 2.5) {
                            est.asigado="Básica";
                        }else{
                            est.asigado="Superior";
                        }
                    } else if (est.tviaje > 9.5) {
                        if(est.test > 56.5){
                            est.asigado="Baja";
                        }else{
                            if(est.tlibre > 12.5){
                                est.asigado="Superior";
                            }else{
                                est.asigado="Alta";
                            }
                        }
                    } else if (est.test > 23.5) {
                        est.asigado="Baja";
                    }else{
                        est.asigado="Alta";
                    }
                } else if (est.tlibre > 16.5) {
                    if(est.alcoholS >1.5){
                        if(est.alcoholFDS > 4.5){
                            if(est.faltas > 7){
                                if(est.tviaje > 5.5){
                                    est.asigado="Baja";
                                }else{
                                    est.asigado="Superior";
                                }
                            }else{
                                est.asigado="Básica";
                            }
                        } else if (est.faltas > 4) {
                            est.asigado="Baja";
                        } else if (est.tviaje > 3.5) {
                            if(est.test > 16.5){
                                est.asigado="Alta";
                            }else{
                                est.asigado="Básica";
                            }
                        }else{
                            est.asigado="Alta";
                        }
                    } else if (est.alcoholFDS > 2.5) {
                        if(est.faltas >9){
                            est.asigado="Básica";
                        }else{
                            est.asigado="Baja";
                        }
                    } else if (est.faltas > 2) {
                        if(est.tviaje > 3.5){
                            est.asigado="Básica";
                        }else{
                            est.asigado="Baja";
                        }
                    } else if (est.tviaje > 3) {
                        if(est.test > 13){
                            est.asigado="Baja";
                        }else{
                            est.asigado="Básica";
                        }
                    }else{
                        est.asigado="Baja";
                    }
                } else if (est.alcoholS > 1.5) {
                    if(est.alcoholFDS > 2.5){
                        if(est.faltas > 10){
                            est.asigado="Baja";
                        }else{
                            if(est.tviaje > 9.5){
                                est.asigado="Baja";
                            }else{
                                est.asigado="Básica";
                            }
                        }
                    }else{
                        est.asigado="Básica";
                    }
                } else if (est.alcoholFDS > 1.5) {
                    if(est.faltas >3){
                        if(est.tviaje > 3.5){
                            if(est.test > 2){
                                if(est.tlibre > 13.5){
                                    est.asigado="Baja";
                                }else{
                                    est.asigado="Alta";
                                }
                            }else {
                                est.asigado="Baja";
                            }
                        }else{
                            est.asigado="Baja";
                        }
                    } else if (est.tviaje > 5) {
                        est.asigado="Básica";
                    }else{
                        est.asigado="Baja";
                    }
                }else if (est.faltas > 2){
                    if(est.test > 6){
                        est.asigado="Baja";
                    }else{
                        est.asigado="Básica";
                    }
                }else{
                    est.asigado="Básica";
                }
            }else if (est.tviaje < 11.5) {
                if(est.test < 24){
                    if(est.tlibre < 17.5){
                        if(est.alcoholS < 1){
                            if(est.alcoholFDS < 1){
                                if(est.faltas < 4){
                                    if(est.tviaje < 16){
                                        if(est.test < 18){
                                            est.asigado="Baja";
                                        }else{
                                            if(est.tlibre < 14.5){
                                                est.asigado="Superior";
                                            }else{
                                                est.asigado="Básica";
                                            }
                                        }
                                    }else{
                                        est.asigado="Alta";
                                    }
                                }else{
                                    if(est.test < 8.5){
                                        est.asigado="Básica";
                                    }else{
                                        est.asigado="Baja";
                                    }
                                }
                            }else{
                                if(est.tviaje < 10){
                                    est.asigado="Básica";
                                }else{
                                    est.asigado="Baja";
                                }
                            }
                        } else if (est.alcoholFDS < 3.5) {
                            est.asigado="Baja";
                        }else{
                            est.asigado="Básica";
                        }
                    } else if (est.alcoholS < 1.5) {
                        if(est.alcoholFDS < 1.5){
                            if(est.faltas < 2){
                                if(est.tviaje < 9.5){
                                    if(est.test < 17){
                                        est.asigado="Baja";
                                    }else if(est.tlibre < 21){
                                        est.asigado="Básica";
                                    }else{
                                        est.asigado="Alta";
                                    }
                                }
                            } else if (est.tviaje < 5) {
                                est.asigado="Superior";
                            }else{
                                if(est.test < 14){
                                    est.asigado="Superior";
                                }else{
                                    est.asigado="Baja";
                                }
                            }
                        } else if (est.faltas < 5) {
                            est.asigado="Baja";
                        }else{
                            if(est.tviaje < 14){
                                est.asigado="Básica";
                            }else{
                                est.asigado="Superior";
                            }
                        }
                    }else{
                        est.asigado="Básica";
                    }
                } else if (est.tlibre < 16) {
                    if(est.alcoholS < 1.5){
                        if(est.alcoholFDS < 1.5){
                            if(est.faltas < 4){
                                est.asigado="Baja";
                            }else{
                                est.asigado="Básica";
                            }
                        }else{
                            est.asigado="Baja";
                        }
                    }if(est.alcoholFDS < 1.5){
                        est.asigado="Baja";
                    }else{
                        est.asigado="Básica";
                    }
                } else if (est.alcoholS < 1.5) {
                    if(est.alcoholFDS < 1.5){
                        if(est.faltas < 1){
                            if(est.tviaje < 11.5){
                                if(est.test < 52){
                                    est.asigado = "Básica";
                                }else{
                                    est.asigado = "Baja";
                                }
                            }else{
                                est.asigado = "Alta";
                            }
                        }else{
                            est.asigado = "Baja";
                        }
                    }else{
                        if(est.faltas < 5){
                            est.asigado = "Baja";
                        }else{
                            est.asigado = "Básica";
                        }
                    }
                }else{
                    est.asigado = "Baja";
                }
            }else if(est.test < 23){
                if(est.tlibre < 16.5){
                    if(est.alcoholS < 1.5){
                        if(est.alcoholFDS < 1.5){
                            if(est.faltas < 1){
                                if(est.tviaje < 25.5){
                                    est.asigado = "Alta";
                                } else if (est.test < 11.5) {
                                    est.asigado = "Básica";
                                }else{
                                    est.asigado = "Baja";
                                }
                            }else{
                                est.asigado = "Básica";
                            }
                        } else if (est.faltas < 3) {
                            if(est.tviaje < 17.5){
                                if(est.test < 18){
                                    est.asigado = "Baja";
                                }else{
                                    est.asigado = "Básica";
                                }
                            }else{
                                est.asigado = "Baja";
                            }
                        }else{
                            est.asigado = "Básica";
                        }
                    } else if (est.alcoholFDS < 3) {
                        est.asigado = "Baja";
                    }else{
                        est.asigado = "Básica";
                    }

                } else if (est.alcoholS < 1.5) {
                    if(est.alcoholFDS < 1.5){
                        if(est.faltas <1){
                            if(est.tviaje < 25.5){
                                est.asigado = "Alta";
                            }else{
                                if(est.test < 11.5){
                                    est.asigado = "Básica";
                                }else{
                                    est.asigado = "Baja";
                                }
                            }
                        }else{
                            est.asigado = "Básica";
                        }
                    } else if (est.faltas < 3) {
                        if(est.tviaje < 17.5){
                            if(est.test < 18){
                                est.asigado = "Baja";
                            }else{
                                est.asigado = "Básica";
                            }
                        }else{
                            est.asigado = "Baja";
                        }
                    }else{
                        est.asigado = "Básica";
                    }
                } else if (est.alcoholFDS < 3) {
                    est.asigado = "Baja";
                }else{
                    est.asigado = "Básica";
                }

            } else if (est.tlibre < 16.5) {
                if(est.alcoholS < 1.5) {
                    if (est.alcoholFDS < 1.5) {
                        if (est.faltas < 3) {
                            if (est.tviaje < 16) {
                                if (est.test < 28.5) {
                                    if (est.faltas < 1) {
                                        est.asigado = "Básica";
                                    } else {
                                        est.asigado = "Baja";
                                    }
                                } else if (est.tlibre < 15) {
                                    est.asigado = "Superior";
                                } else {
                                    est.asigado = "Baja";
                                }
                            } else {
                                est.asigado = "Baja";
                            }
                        } else if (est.tviaje < 31) {
                            est.asigado = "Baja";
                        }else{
                            est.asigado = "Básica";
                        }
                    } else if (est.faltas < 2) {
                        est.asigado = "Baja";
                    }else{
                        est.asigado = "Básica";
                    }
                }else{
                    est.asigado = "Baja";
                }
            } else if (est.alcoholS < 1.5) {
                if(est.faltas < 1){
                    if(est.tviaje < 13){
                        est.asigado = "Alta";
                    }else{
                        est.asigado = "Superior";
                    }
                }else if(est.tviaje < 20){
                    est.asigado = "Superior";
                }else{
                    est.asigado = "Baja";
                }
            } else if (est.alcoholFDS < 4) {
                if(est.faltas <9){
                    est.asigado = "Baja";
                }else{
                    est.asigado = "alta";
                }
            }else{
                est.asigado = "Básica";
            }

            asignados.add(est);
        }
        return asignados;
    }

    public void exito(ArrayList<Estudiante> datos){
        int ex =0;
        for (int i =0; i < datos.size(); i++){

                if(Objects.equals(datos.get(i).valoracion, asignados.get(i).asigado)){
                   ex++;
                }


        }
        System.out.println(ex);
    }

}
