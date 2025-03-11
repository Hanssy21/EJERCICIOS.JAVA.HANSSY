public class OperacionesLogicas {
    public static void main(String[] args) {
        // Definir las variables booleanas
        boolean a = true;
        boolean b = false;
        
        // Operación lógica 'and'
        System.out.println(a && b);
        
        // Definir variables numéricas
        int x = 2;
        int y = 3;
        int z = 4;
        int w = 10;
        
        // Operación lógica con comparación '==', '<' y '>'
        System.out.println(x == y && z < w);
        
        // Operación lógica con 'not' (invertir una condición)
        System.out.println(!(x == y) && z > w);
    }
}