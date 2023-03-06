public class Tabla {


    public static Object[] crearTabla(int tamanio) {
        Object[] tabla = new Object[tamanio];
        return tabla;
    }

    public static void agregar(Object[] tabla, Object elemento){
        int posicion = funcionHash(elemento.atributoIdentificador);
        while(tabla[posicion] != null){
            posicion++;
        }
        tabla[posicion] = elemento;
    }
}
