import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Lectura {
    double i,e,tv,te,tl,as,afds,f, nt;

    int cont=0;
    ArrayList<Estudiante> estudiantes;
    public ArrayList<Estudiante> datos(){
        estudiantes = new ArrayList<Estudiante>();
        try {

            FileInputStream file = new FileInputStream(
                    new File("Datos.xlsx"));

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);


            // Iterar a través de las filas de la hoja
            for (Row row : sheet) {
                // Iterar a través de las celdas de cada fila
                for (Cell cell : row) {
                    switch (cont){
                        case 0:
                            i = cell.getNumericCellValue();
                            break;
                        case 1:
                            e = cell.getNumericCellValue();
                            break;
                        case 2:
                            tv = cell.getNumericCellValue();
                            break;
                        case 3:
                            te = cell.getNumericCellValue();
                            break;
                        case 4:
                            tl = cell.getNumericCellValue();
                            break;
                        case 5:
                            as =cell.getNumericCellValue();
                            break;
                        case 6:
                            afds = cell.getNumericCellValue();
                            break;
                        case 7:
                            f = cell.getNumericCellValue();
                            break;
                        case 8:
                            nt = cell.getNumericCellValue();
                            cont = -1;
                            break;
                    }
                    cont++;
                }
                estudiantes.add(new Estudiante(i,e,tv,te,tl,as,afds,f,nt));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }
}
