import java.io.*;
import java.util.*;
public class Lectura {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		String linea;
		Iterator<String> iterador;
		try{
			String nombre = "src/archivo.txt";
			File archivo = new File(nombre);
			FileReader lector = new FileReader(archivo);
			Scanner sc = new Scanner(lector);
			while(sc.hasNextLine()){
				//Archivo leído y agregado a un ArrayList de tipo String
				linea=sc.nextLine();
				lista.add(linea);
			}
			//Pasar los valores del ArrayList (son de tipo String) al arreglo de enteros
			int c;
			int arreglo[]=new int[lista.size()];			
			System.out.print("Numero de elementos en el archivo: "+lista.get(0)+"\nElementos del archivo:\n");
			for(int i=1; i<lista.size(); i++){
				c=Integer.parseInt(lista.get(i));
				arreglo[i]=c;
				System.out.print(arreglo[i]+"\n");
			}
			
			//Ordenar los números del arreglo de enteros de manera descendente
			System.out.print("\nSALIDA (En forma descendente):\n");
			int d=Integer.parseInt(lista.get(0));
			for(int i=1;i<d+1;i++){
				for(int j=1; j<d+1 && j!=i; j++){
					if(arreglo[i]>arreglo[j]){
						int aux=arreglo[i];
						arreglo[i]=arreglo[j];
						arreglo[j]=aux;
					}
				}
			}
			for(int j=1; j<d+1; j++){
				System.out.println(arreglo[j]);
			}
		}
		catch(FileNotFoundException e){
			System.out.print("Archivo no encontrado");
		}
	}
}
