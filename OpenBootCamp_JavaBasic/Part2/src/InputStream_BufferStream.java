import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream_BufferStream {

    // Te lee todo el archivo
    public void lecturaFile (){
        try {
            FileInputStream fichero = new FileInputStream("rutadecarpeta/rutadelarchivo");

            try {
                byte[] datos = fichero.readAllBytes();

                // Util para ficheros pequeños
                for (byte dato : datos) {
                    System.out.println((char)dato);
                }

                // En vez de byte puedo leer un integer, pero hace más lecturas de operaciones

                int datoInt = fichero.read();
                while (datoInt != -1) {
                    System.out.println((char)datoInt);
                    datoInt=fichero.read();
                }

                // Lectura por secciones
                byte datosCinco[] = new byte[5];
                int dato = fichero.read();
                while (datoInt != -1) {
                    System.out.println((char)datoInt);
                    datoInt=fichero.read();
                }


            } catch (IOException e) {
                System.out.println("No puedo leer el fichero :" + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("El archivo no ha sido encontrado: " + e.getMessage());
        }
    }

    // Te lee el archivo en secciones "Buffer"
    public void lecturaBuffered (){
        try {
            FileInputStream fichero = new FileInputStream("rutadecarpeta/rutadelarchivo");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {

                // El mejor método en cuanto a capacidad! :)
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.println((char)dato);
                    dato=ficheroBuffer.read();
                }


            } catch (IOException e) {
                System.out.println("No puedo leer el fichero :" + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("El archivo no ha sido encontrado: " + e.getMessage());
        }
    }
}
