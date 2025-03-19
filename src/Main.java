import java.lang.StringBuilder;
class Solution {

    static String toCamelCase(String s) {
        String[] palabras = s.split("[-_]");
        String resultado = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
        }

        return resultado;
    }
}

