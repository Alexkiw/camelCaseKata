// La clase Solution
class Solution {

    // El metodo que convierte el texto a camelCase
    static String toCamelCase(String s) {
        // Separa el texto en partes, usando guiones o guiones bajos
        String[] palabras = s.split("[-_]");

        // La primera palabra no cambia, se usa tal cual
        String resultado = palabras[0];

        // Para cada palabra después de la primera
        for (int i = 1; i < palabras.length; i++) {
            // Toma la primera letra de cada palabra y la pone en mayúscula, luego le agrega el resto de la palabra
            resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
        }

        // Regresa el texto ya en camelCase
        return resultado;
    }
}

//Esto es un comentario

