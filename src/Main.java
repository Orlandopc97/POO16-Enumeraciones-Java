public class Main {
    public static void main(String[] args) {

        // Tipo de dato especial que contieneun conjunto fijo de valores constantes
        //Conjunto de valores
            //Se recomienda nombrarla con la primer letra mmayuscula ya que se considera como un tipo de dato (ENUM)
        enum Color{
            ROJO, AZUL, VERDE, AMARILLO, NEGRO, MORADO, ANARANJADO, BLANCO
        };

        //Para mostrarlos se puede hacer por medio de una variable
              //variable
                      //Existe la clase base ENUM, abstracta de todos los tipos de enumeración. Proporciona una serie de métodos para obtener información sobre un tipo de enumeración y sus valores.
        Color color = Color.ROJO;
        //No se hace asi ya que al ser un conjunto de valores definidos para el programa, es mas facil y evita errores al consultarlos o para evitar registrar valores duplicados
        String colors = "Rojo";

        //Imprimir los valores del enum
        System.out.println("El color es: " + color);
        System.out.println("------------------------------------------");

        //Se puede recorrer como un Arreglo {}
        for (Color colores: Color.values()){

            System.out.println("El color es: " + colores);

        }




 
    }
}

/*
ENUMERACIONES (ENUM)
    -ENUM: es una palabra clave utilizada para DEFINIR UN TIPO DE DATO ESPECIAL que representa
     un CONJUNTO FIJO DE CONSTANTES.
    -Estas constantes son valores predefinidos que representan elementos distintos de un conjunto.



     EJEMPLO:

        enum DiaSemana{
            LUNES, MARTES, MIERCOLES, JUEVES, SABADO, DOMINGO
        }


        enum TipoVehiculo{
            AUTOMOVIL, MOTOCICLETA, CAMIONETA, BICICLETA
        }
*/