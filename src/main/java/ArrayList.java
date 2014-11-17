import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Clase ArrayLit para gestionar la lista de clientes y datos
 */
class ArrayList {
    /**
     * Declaracion de variables a utilizar
     */
    public int size;
    public int maxSize;
    public String[] arreglo;
    public final int MAX_SIZE = 1000;
    
    /**
     * Constructor de la clase
     * Se declara el valor de las variables que hacen falta 
     */
    public ArrayList () {
            
	this.size = 0;
	this.maxSize = MAX_SIZE;
	this.arreglo = new String[this.maxSize];
    }
    /**
     * Agregar elementos al arreglo con la condición sea menor al maximo la lista, sino que tire error
     * @param Dato
     */
    public void Modificar(String Dato, int indice){
        this.arreglo[indice]=Dato;
    }
    
    public void add (String Dato) {

	if (this.size < this.maxSize) {
            this.arreglo [this.size] = Dato;
            this.size ++;
	}
	else {
            System.out.println ("Error");
	}
    }
    
    public int getSize (){
        return this.size;
    }
    /**
     * Obtener un elemento a travez de un indice mientras que el indice
     * se mantenga en la condicion que sea mayor o igual a 0 y indice sea 
     * menor o igual a size
     * 
     * 
     * @param indice seleccion de cliente
     * @return elemento que se encuentra en el indice
     * @throws Exception 
     */
    public String getElemento (int indice) throws Exception {
                        
	if ((indice >= 0 ) && (indice <= this.size)){
            return this.arreglo [indice];
        }
        if (indice == 0) {
            JOptionPane.showMessageDialog (null," Es la ultima canción","Error",ERROR_MESSAGE);
        }
        return null;
    }
    
    public void setElemento (int indice, String elemento){
        for (int a = 0; a < size; a++){
            if (a == indice){
                arreglo [indice] = elemento;
            }
        }
    }
    
    public void imprimir (){
        for (int a =0; a<size; a++){
            System.out.println(arreglo[a]);
        }
    }
    /*
    public static void main (String [] args){
        try {
            ArrayList hola = new ArrayList ();
            hola.add("hola");
            hola.add ("max gay");
            System.out.println(hola.getElemento(0));
            hola.imprimir();
        } catch (Exception ex) {
            Logger.getLogger(ArrayList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    */
}
