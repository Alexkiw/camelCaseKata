# Proyecto Camel Case

Este proyecto contiene una función en Java que convierte cadenas de texto con guiones o guiones bajos a formato **camelCase**.

## Descripción

La función `toCamelCase` toma una cadena de texto que puede contener guiones (`-`) o guiones bajos (`_`) entre las palabras y 
las convierte en formato **camelCase**. La primera palabra se mantiene tal cual, y las primeras letras de las palabras subsecuentes se convierten en mayúsculas. 

Por ejemplo:
- `"the_Stealth_Warrior"` se convierte en `"theStealthWarrior"`.
- `"the-Stealth-Warrior"` se convierte en `"theStealthWarrior"`.

## Uso

Puedes usar la función `toCamelCase` de la siguiente manera:

```java
String result = Solution.toCamelCase("the_Stealth_Warrior");
System.out.println(result); // Salida: "theStealthWarrior"


Este `README.md` proporciona una descripción clara del proyecto, su uso, instalación, y detalles sobre las pruebas. Puedes agregarlo a tu proyecto y luego realizar un commit y un push a GitHub como te expliqué antes.
