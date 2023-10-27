# Temarios de JAVA avanzado

## Programación funcional

Paradigma de programación en el cual no se trabaja con el estado de las variables sino con operaciones matemáticas
anidadas. En este paradigma el estado de las variables no varía en el tiempo de ejecución, y los procesos están anidados
a partir de funciones matemáticas, componiendo expresiones que se evalúan como funciones.

                                        *P1* -> *P2* -> *Expresión*

Java NO ES un lenguaje funcional,sin embargo desde la versión 8 agrega la posibilidad de utilizar programación
funcional, con esto puede implementar recorridos sobre colecciones de datos sin estar usando instrucciones cíclicas como
while, for, o do while, en cambio, se procesan usando recursividad y funciones de alto orden y expresiones lambda, las
cuales ya están integradas en JAVA.

En los lenguajes funcionales no existen los tipos de datos, en JAVA se deja al compilador la inferencia de estos tipos,
siendo que ahora la función maneja sola esa información.

### Expresiones Lambda

Caracterizadas por su sintaxis de la siguiente manera

                                            X, Y --> return X, y

Una expresión lambda representa el método abstracto de una interfaz funcional, una interfaz funcional a su vez solo
tiene
un método abstracto, más puede tener n cantidad de métodos default o estáticos. Este método es representado por una
expresión lambda.

### Interfaces funcionales

Aquella que solo tiene un método abstracto, se pueden utilizar métodos default, métodos estáticos y métodos heredados de
la clase object y declararlos como métodos abstractos.

Se puede usar la anotación @FunctionalInterface para verificar si la clase implementada tiene el método abstracto
esperado, esto permite que se use como una buena práctica para verificar que el condicional se cumpla.

### Métodos referenciados

En general se puede usar el método lambda para referirse a métodos anónimos, en el caso de las interfaces funcionales,
sin embargo, una expresión lambda en la práctica no hace algo diferente a llamar a otro método, en este caso puede
resultar más claro referirse al método llamado por su nombre.

Los métodos referenciados nos permiten referirnos a los métodos que ya existen mediante su nombre.

## Recursividad

La recursividad es la técnica que emplea un método cuando se llama a sí mismo, esta técnica permite resolver multiples
problemas de forma sencilla. Es un tema difícil de entender pero importante para implementar.

### Halting condition

Así como los loops pueden extenderse infinitamente por una condición mal implementada, lo mismo puede ocurrir con la
recursividad, por eso es importante agregar condiciones que detengan el proceso y entreguen el resultado final, la app
deja de llamarse a sí misma.

## RESTful APIs

REST no es ni un protocolo ni un estándar, sino un conjunto de límites de arquitectura, definidos para permitir definir
un idioma en el cual las computadores podrán contactarse a través de un "contrato", en el cual, si una solicitud cumple
todas las condiciones del formato en el cual se requiere la información, se procesa una petición de vuelta.

La información se entrega por medio de HTTP/S a través de uno de los siguientes formatos: JSON, XML, HTML, Python, PHP o
como texto plano. En las peticiones por HTTP son importantes los encabezados y los bodies, los cuales son enviados por
la API REST, puesto que en estos datos va a haber metadatos importantes como la autorización, el identificador uniforme
de recursos (URI), el almacenamiento en caché, las cookies y otros elementos de la solicitud.

### Condiciones para que una API se considere RESTful:

        1. Arquitectura cliente-servidor compuesta de clientes, servidores y recursos, con la gestión de solicitudes a 
           través de HTTP.

        2. Comunicación entre el cliente y el servidor sin estado, lo cual implica que no se almacena la información del 
           cliente entre las solicitudes de GET y que cada una de ellas es independiente y está desconectada del resto.
      
        3. Datos que pueden almacenarse en caché y optimizan las interacciones entre el cliente y el servidor.
        
        4. Una interfaz uniforme entre los elementos, para que la información se transfiera de forma estandarizada. 
           Para ello deben cumplirse las siguientes condiciones:
            - Los recursos solicitados deben ser identificables e independientes de las representaciones 
              enviadas al cliente.
            - El cliente debe poder manipular los recursos a través de la representación que recibe, ya que esta 
              contiene suficiente información para permitirlo.
            - Los mensajes autodescriptivos que se envíen al cliente deben contener la información necesaria para 
              describir cómo debe procesarla.
            - Debe contener hipertexto o hipermedios, lo cual significa que cuando el cliente acceda a algún recurso, 
              debe poder utilizar hipervínculos para buscar las demás acciones que se encuentren disponibles 
              en ese momento.
        
        5. Un sistema en capas que organiza en jerarquías invisibles para el cliente cada uno de los servidores 
           (los encargados de la seguridad, del equilibrio de carga, etc.) que participan en la recuperación de la 
           información solicitada.
        
        6. Código disponible según se solicite (opcional), es decir, la capacidad para enviar códigos ejecutables del 
           servidor al cliente cuando se requiera, lo cual amplía las funciones del cliente.

Por último es importante comentar que si bie una API Rest debe cumplir todos estos parámetros, suele ser más fácil de
implementar que un protocolo SOAP (Simple Objects Access Protocol), el cual es más lento y pesado. Esto mismo, hace que
REST sea más rápido y ligero, y por ende, su implementación solo siga en aumento con el tiempo, resultando ideal para
el Internet de las Cosas (IOT) y el desarrollo de aplicaciones móviles.

## Documentación en JAVA

Nada del otro mundo repaso rápido de los tres métodos para documentar:

UNA SOLA LINEA

        // AQUÍ VA EL COMENTARIO, GENIAL.

VARIAS LINEAS

        /* 
            AQUÍ VA EL COMENTARIO, MUITO BEM.
        /*

JAVA DOC

        /**
         * AQUÍ VA EL COMENTARIO, MUITO BONITO.
        */

## Miscelanias del desarrollo

### Tratamiento de datos

Más que hablar sobre el tema como tal, se usarán ejemplos y comentarios de nuevos métodos ingeniosos para lanzar
excepciones o interpretar errores para debuggear de forma efectiva.

1. Es bueno utilizar StackTraceElement para tener un trazo de la pila de llamada que hizo la app antes de fallar.

2. Siempre utilizar Try y Catch en los procesos donde la posibilidad de que aparezca un error exista, aunque es
   preferible que los errores no existan o se gestionen de forma personalizado usando el método "Throws XException".

3. Se pueden interceptar excepciones y arrojar excepciones distintas, que pueden ser creadas para tener casos
   personalizadas y que deben ser identificados desde el principio, usando una interface o una clase abstracta se pueden
   gestionar diferentes excepciones en un solo llamado.

### Formateo del código

Como vamos a comunicar a otros usuarios o a nosotros mismo el código que estamos haciendo, cositas:

1. El grueso de grandes librerías como Hibernate o React está escrito en alrededor de 700 lineas, entra 200 o 300 sería
   un buen punto de inicio para un desarrollador menos experimentado haciendo un proyecto grande.

2. La metáfora del periódico, un código se debe visualizar como se ve en un periódico, QUE SE ENTIENDA, que hayan
   espacios entre las secciones del código, esta separación vertical mejora la legibilidad.

3. Mantener una buena densidad vertical, romper entre secciones separadas dentro de un mismo código dificulta la
   lectura, mantener declaraciones o métodos emparentados de forma cercana.

4. Mantener padres y llamados (Funciones dependientes) alineados. Mantener las funciones también cercanas por afinidad,
   por ejemplo cuando tengas sobrecarga de métodos, cuanto más parámetros, más abajo la función, mejora el entendimiento
   mientras se avanza en la lectura.

5. Poner las funciones llamadas por todas las demás o la mayoría en las partes más bajas.

6. Colocar las lógicas más complicadas y profundas en la parte más baja.

7. Usar sin miedo la separación horizontal, esto permite leer con mayor coherencia la parte de la derecha como la parte
   izquierda.

8. El alineamiento horizontal se utiliza en algunos lenguajes, resultando en una matriz de información interesante, pero
   por cuestiones cognitivas, asociamos esta forma de organizar a una tabla y alteramos mentalmente el sentido de las
   declaraciones.

9. Sin miedo a tabular tampoco, la indentación no es necesaria, pero genera profundidad en el código y separa
   eficientemente BLOQUES, mejorando la lectura y el entendimiento del código.

10. Usando { } ; u otros elementos, permite entender donde termina un bloque sencillo y qué ya no es parte de su
    ambiente.

11. No imponemos nuestro estilo de programación al equipo, ni tampoco a un código que estamos manteniendo ya iniciado,
    se hace consenso en los equipos antes de empezar para no generar una carga cognitiva, sino que se trabajará con las
    convenciones de código definidas.

## Organización de las clases

Hace poco aprendí a usar la palabra miscelánea y ahora la usaré tantas veces como pueda.

Miscelánea sobre como organizar mejor las clases.

1. Si tenemos una clase de 5k líneas, algo estamos haciendo mal, siempre se pueden separar las clases en clases más
   chiquitas.

2. se pueden encapsular (Hacerlas privadas) las clases y llamarlas por Getters and Setters, esto respeta el OCP.

3. Se espera que las clases tengan COHESIÓN, que lo que se implementa en unas clases o unos métodos, se mantenga
   coherente en otras clases y métodos, eso hace el código más intuitivo.

4. Cuando se reemplacen clases/variables/métodos que se están limpiando. en vez de ir reemplazando directamente los
   elementos, se propone mejor crear los elementos nuevos y eliminar los otros cuando ya estén totalmente sacados del
   flujo de la aplicación.

5. Tener cohesión por código, por nombrado, por clases y por carpetas. Un paquete controller te deja claro que ahí
   tienes una lógica específica, una clase controllerPayment te dice que esa clase específicamente te controla los
   procesos relacionados con un pago realizado, un método generatePayment() te deja claro que ahí tienes el método que
   hace el pago final.

## Curiosidad -> String[] args

                                       public static void main(String []args) {}

¿Qué significa ese String []args? Pues son los argumentos de entrada que tiene la aplicación, los cuales sirven para
agregar información a la app que procesará y que dependerá del entorno generado. Un ejemplo de esta utilidad sería un
string de conexión a una base de datos, para desarrollo en tu entorno puedes tener como argumentos el String de conexión
a la base de datos de prueba, pero el entorno de despliegue tener el String de conexión a la base de datos REAL.

## Arquitectura Limpia (Relectura)

Arquitectura de software diseñada pensada en proyectos grandes, para poder, además de tener un buen diseño, tener un
código mantenible y fácil de entender para facilitar el desarrollo a medida que el progreso crece.

Se basa en la idea de estructurar el código en capas contiguas que se pueden comunicar con sus capas aledañas,
generalmente:

1. Capa de entidades:

         Define la lógica de negocio.

2. Capa de aplicación:

         Define los casos de uso, todo lo que ocurra en la aplicación se espera sea procesado como caso de uso.

3. Capa de puertos externos:

         Capa de interfaces adaptadoras

4. Capa de frameworks o drivers o controladores:

         Se conecta la base de datos, o presenta el HTML a una página WEB o envía los datos a otra API, o presenta una vista al cliente

Se puede ver por etapas

1. Por entrypoints: Por donde se entra a la aplicación.

2. Se pasa al core de la aplicación, donde son procesadas por los casos de uso e interpretados por las entidades base.

3. Capa de proveedores de datos, donde se entrega la información esperada.

Se puede implementar junto con SOLID, pues estos principios nos recuerdan como debe funcionar nuestra aplicación.

## SOLID PRINCIPLES

1. Mantenimiento del código más fácil y rápido.

2. Permite añadir nuevas funcionalidades de forma más sencilla.

3. Favorece una mayor reusabilidad, encapsulación y calidad del código.

### S: Single Responsability Principle

Establece que una clase, un componente, un microservicio, debe ser responsable de una sola cosa. Si tiene más de una
responsabilidad, esto significa que el cambio en dicha responsabilidad implicaría posibles alteraciones a la otra.

Ejemplo de mala implementación:

      class Coche {  

         String marca;

         Coche(String marca){ this.marca = marca; }

         String getMarcaCoche(){ return marca; }

         void guardarCocheDB(Coche coche){ ... }
      }

En este caso, esta implementación de la clase coche, además de ofrecer el método de obtención de la información del
objeto, también implementa la lógica que lo guarda, por lo que ya está violando el principio de responsabilidad única.

Ejemplo de buena implementación:

      class Coche {  

         String marca;

         Coche(String marca){ 
            this.marca = marca; }

         String getMarcaCoche(){ return marca; }
      }
      
      class CocheDB {

      void guardarCocheDB(Coche coche){ ... }

      void eliminarCocheDB(Coche coche){ ... }
      }

Ahora el programa es más cohesivo y estará más encapsulado aplicando este principio. ✔

### O: Open Close Principle

Establece que las entidades de software (clases, métodos, funciones) deben estar abiertos para su extensión pero
cerrados para su modificación.

Ejemplo de mala implementación:

      class Coche {  

         String marca;

         Coche(String marca){ this.marca = marca; }

         String getMarcaCoche(){ return marca; }
      }

      public static void main(String[] args) {  
         Coche[] arrayCoches = {
            new Coche("Renault"),
            new Coche("Audi")
         };
         imprimirPrecioMedioCoche(arrayCoches);
      }
      
      public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){  
         for (Coche coche : arrayCoches) {
            if(coche.marca.equals("Renault")) System.out.println(18000);
            if(coche.marca.equals("Audi")) System.out.println(25000);
         }
      }

Esto no cumple con el principio, puesto que si quisiera agregar otro coche de una marca diferente debería:

      Coche[] arrayCoches = {  
         new Coche("Renault"),
         new Coche("Audi"),
         new Coche("Mercedes")
      };

Y posteriormente agregar esta modificación al método anterior:

      public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){  
         for (Coche coche : arrayCoches) {
            if(coche.marca.equals("Renault")) System.out.println(18000);
            if(coche.marca.equals("Audi")) System.out.println(25000);
            if(coche.marca.equals("Mercedes")) System.out.println(27000);
         }
      }

Como se puede ver, cada vez que se agrega un coche nuevo, el método debe implementar una linea de código nueva que envía
el precio medio del coche, reemplazando esto por el uso de OCP correctamente tendríamos:

      abstract class Coche {  
      // ...
      abstract int precioMedioCoche();
      }
      
      class Renault extends Coche {  
      @Override
      int precioMedioCoche() { return 18000; }
      }
      
      class Audi extends Coche {  
      @Override
      int precioMedioCoche() { return 25000; }
      }
      
      class Mercedes extends Coche {  
      @Override
      int precioMedioCoche() { return 27000; }
      }
      
      public static void main(String[] args) {
      
          Coche[] arrayCoches = {
                  new Renault(),
                  new Audi(),
                  new Mercedes()
          };
      
          imprimirPrecioMedioCoche(arrayCoches);
      }
      
      public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){  
         for (Coche coche : arrayCoches) {
            System.out.println(coche.precioMedioCoche());
         }
      }

Cada vehículo extiende la clase abstracta e implementa su propia funcionalidad, sin tener que alterar esa implementación
base ni la función imprimirPrecioMedioCoche() que es ahora llamado por precioMedioCoche().

## L: Liskov Substitution Principle

Declara que una subclase debe ser substituible por una superclase, si al hacer eso el programa falla, se estará violando
este principio. Cumplir con este principio permite saber que nuestro código tiene una jerarquía fácil de entender y el
código es reutilizable.

Ejemplo de una mala implementación:

      // ...
      public static void imprimirNumAsientos(Coche[] arrayCoches){  
         for (Coche coche : arrayCoches) {
            if(coche instanceof Renault)
               System.out.println(numAsientosRenault(coche));
            if(coche instanceof Audi)
               System.out.println(numAsientosAudi(coche));
            if(coche instanceof Mercedes)
               System.out.println(numAsientosMercedes(coche));
         }
      }
      imprimirNumAsientos(arrayCoches);  

Ahora si queremos meter un nuevo coche, el procedimiento es el siguiente:

      // ...
      Coche[] arrayCoches = {  
         new Renault(),
         new Audi(),
         new Mercedes(),
         new Ford()
      };
      
      public static void imprimirNumAsientos(Coche[] arrayCoches){  
         for (Coche coche : arrayCoches) {
            if(coche instanceof Renault)
               System.out.println(numAsientosRenault(coche));
            if(coche instanceof Audi)
               System.out.println(numAsientosAudi(coche));
            if(coche instanceof Mercedes)
               System.out.println(numAsientosMercedes(coche));
            if(coche instanceof Ford)
               System.out.println(numAsientosFord(coche));
         }
      }
      imprimirNumAsientos(arrayCoches);

Se puede ver que violamos el OCP al tener que modificar el método imprimirNumAsientos() para aceptar un nuevo tipo de
coche, así como violamos LSP al ver que el programa no reconoce cada tipo de coche.

Las modificaciones al hacer son las siguientes:

      - Si la superclase (Coche) tiene un método que acepta un parámetro del tipo de la misma superclase (Coche), entonces su subclase (Audi) debería aceptar como argumentos un argumento de la clase Coche o de la clase Audi.

      - Si la superclase devuelve un tipo de ella misma (Coche), entonces su subclase (Audi) puede devolver o un tipo de la superclase o de la subclase.

Reorganizando, tenemos:

      public static void imprimirNumAsientos(Coche[] arrayCoches){  
         for (Coche coche : arrayCoches) {
            System.out.println(coche.numAsientos());
         }
      }
      
      imprimirNumAsientos(arrayCoches);  

Se puede ver que no importa que subclase sea, se llama únicamente a la clase principal COCHE, ahora se implementa la
func numAsientos() en la superclase:

      abstract class Coche {
          // ...
          abstract int numAsientos();
      }

Y cada subclase se implementa de la siguiente manera:

      class Renault extends Coche {
      
          // ...
          @Override
          int numAsientos() {
              return 5;
          }
      }
      // ...

Ahora sí podemos reemplazar el llamado a cada subclase por la clase principal, así como podemos ver que cada subclase
podrá ser tratada como la clase padre sin ningún inconveniente, hemos implementado correctamente LSP. ✔

## I: Interface Segregation Principle

Los clientes no deben verse forzados a usar interfaces que no usan. Ya que si un cliente depende de una interfaz que
tiene métodos que este no usa pero otro cliente sí, este cliente estará siendo afectado por los cambios que fuercen
otros clientes sobre dicha interfaz.

Ejemplo de una mala implementación:

      interface IAve {  
         void volar();
         void comer();
      }
      
      class Loro implements IAve{
      
          @Override
          public void volar() {
              //...
          }
      
          @Override
          public void comer() {
              //..
          }
      }
      
      class Tucan implements IAve{  
      @Override
      public void volar() {
      //...
      }
      
          @Override
          public void comer() {
              //..
          }
      }

En este caso tenemos la interfaz ave que es implementada por loro y por tucan, si posteriormente queremos agregar otra
ave como un pingüino, que no vuela pero nada, y se usa la misma interfaz, tendríamos lo siguiente:

      interface IAve {  
         void volar();
         void comer();
         void nadar();
      }
      
      class Loro implements IAve{
      
          @Override
          public void volar() {
              //...
          }
      
          @Override
          public void comer() {
              //...
          }
      
          @Override
          public void nadar() {
              //...
          }
      }
      
      class Pinguino implements IAve{
      
          @Override
          public void volar() {
              //...
          }
      
          @Override
          public void comer() {
              //...
          }
      
          @Override
          public void nadar() {
              //...
          }
      }

Que en este caso, tendríamos implementados métodos en una interfaz que no compartejn las clases que lo implementan,
violando el principio de segregación de interfaces. Lo correcto en este caso, sería implementar las interfaces
suficientes para satisfacer todas las necesidades de las clases que las implementan.

Ejemplo de una buena implementación:

      interface IAve {  
         void comer();
      }
      interface IAveVoladora {  
         void volar();
      }
      
      interface IAveNadadora {  
         void nadar();
      }
      
      class Loro implements IAve, IAveVoladora{
      
          @Override
          public void volar() {
              //...
          }
      
          @Override
          public void comer() {
              //...
          }
      }
      
      class Pinguino implements IAve, IAveNadadora{
      
          @Override
          public void nadar() {
              //...
          }
      
          @Override
          public void comer() {
              //...
          }
      }

Ahora la interface IAve implementa un método común, y las nuevas interfaces son implementadas para cada clase de acuerdo
a su caso.

## D: Dependency Inversion Principle

Las dependencias deben estar en las abstacciones, no en las concreciones, es decir:

1. Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

2. Las abstracciones no deberían depender de detalles. Los detalles deben depender de abstracciones.

En aplicaciones donde sea necesario contar con varios módulos, se puede utilizar la inyección de dependencias, de esta
manera se pueden controlar todas las funcionalidades desde un mismo sitio en vez de tenerlas esparcidas por todo el
programa. Permitiendo mejor lectura, debbuging, actualizaciones y testing.

Ejemplo de una mala implementación:

      class DatabaseService{  
      //...
         void getDatos(){ //... }
         }
      
      class AccesoADatos {
      
          private DatabaseService databaseService;
      
          public AccesoADatos(DatabaseService databaseService){
              this.databaseService = databaseService;
          }
      
          Dato getDatos(){
              databaseService.getDatos();
              //...
          }
      }

Si el día de mañana en vez de una base de datos queremos acceder a una API, estamos en la obligación de cambiar todas
las implementaciones en clase AccesoADatos, pues este módulo de alto nivel está dependiendo de otro módulo directamente.

Se puede corregir haciendo que AccesoADatos dependa de una implementación más genérica:

      interface Conexion {  
         Dato getDatos();
         void setDatos();
      }
      
      class AccesoADatos {
      
          private Conexion conexion;
      
          public AccesoADatos(Conexion conexion){
              this.conexion = conexion;
          }
      
          Dato getDatos(){
              conexion.getDatos();
          }
      }

Ahora se instancia directamente la interface conexión y por detrás se puede implementar el tipo de conexión específica
que se desee utilizar, de esta manera:

class DatabaseService implements Conexion {

    @Override
    public Dato getDatos() { //... }

    @Override
    public void setDatos() { //... }

}

class APIService implements Conexion{

    @Override
    public Dato getDatos() { //... }

    @Override
    public void setDatos() { //... }

}

Ahora también hemos hecho que el módulo de alto nivel y el módulo de bajo nivel dependan de interfaces y no
directamente, cumpliendo ahora sí con el DIP.

*Conclusión: Aplicar SOLID y Clean Architecture al principio puede ser tedioso, pero con práctica e inspeccionar el
código de vez en cuando se volverán una pieza clave en nuestra creación cotidiana de código de calidad, teniendo un
programa más sencillo de mantener para vos y para futuros developers, teniendo una estructura bien definida y un código
de fácil lectura*

### Temarios relacionados con el mantenimiento de un proyecto a largo plazo

## Limpieza de proyecto

Algunos tips o pasos a realizar para tener un código más limpio, organizado y legible:

      1. Eliminar código duplicado, extraer código duplicado para convertirlo en un método, reduce el código y cuando corrija el código lo hará en un solo paso.
      
      2. Eliminar código deprecado, dejando commiteado correctamente donde se hizo esta eliminación en el caso de que se necesite ese código deprecado en el futuro para cuestiones de reversión o de revisión.

      Reorganización de código siguiente las prácticas recomendadas para formateo del código y organización de las clases.

## Refactoring

Tema largo como el carajo, en esta ocasión se hace un primer repaso para reconocer el tema y sus principios.

Refactorizar es el acto de mejorar el código mediante su reestructuración sin agregar nuevas funcionalidades, el
objetivo es pasar de un mess de código a un código limpio y organizado.

## Clean Code

El objetivo principal de refactorizar es reducir la deuda técnica, pero ¿Por qué? Bueno, algunas razones son:

      1. El código limpio es "obvio" para los programadores.

      2. El código limpio no contiene duplicación.

      3. El código limpio contiene un número mínimo de clases y otras partes móviles.

      4. El código limpio pasa todos los tests! Si pasas el 95% de tus pruebas, tu código es sucio, si tu coverage del código es 0%, tu código es un desastre.

      5. El código limpio es más fácil y barato de mantener.

## Deuda técnica

Todos los programadores intentamos programar de la mejor manera posible. Pero ¿En qué momento el código limpio ya no es
limpio?

La deuda técnica es ese proceso en el cual no mantienes buenas prácticas en el código ni haces las pruebas necesarias
para nuevas implementaciones hasta que llega el día en el que avanzar ya se hace un infierno, the HELL DEV.

### Causas de deuda técnica

#### Presión por parte de negocio

Algunas veces las necesidades por parte de negocio obligan a que los features sean entregados antes de haber sido
desarrollados por completo. En este caso bugs y parches pueden ser el resultado a la larga de los resultados del
proyecto.

#### Falta de conocimiento de las consecuencias de la deuda técnica

Es probable que el empleador no tenga conocimiento de la necesidad de hacer refactorizaciones al código, y por ende, no
considere en los tiempos de desarrollo espacios o sprints dedicados a limpiar y mejorar el código en general, llevando a
sus respectivas consecuencias.

#### Fallas en combatir la estricta coherencia de los componentes

Esto ocurre con los programas monolíticos, donde el código ya está tan enrevesado que al agregar nuevas utilidades no
hay forma de agregar sin que esto implique fomentar el uso de malas prácticas y ensuciar aún más el código.

#### Falta de tests!

La falta de feedback inmediato fomenta soluciones rápidas pero riesgosas. En muchos casos esto puede ser desarrollado y
lanzado en producción sin suficientes pruebas de comprobación. Las consecuencias pueden ser catastróficas.

#### Falta de documentación

Esto disminuye el proceso de producción para nuevas personas que se integren en el equipo de desarrollo.

#### Falta de interacción entre los miembros del equipo

Si el conocimiento base no es distribuido a través de la compañía, la gente terminará trabajando con información
desfazada sobre los procesos y el projecto. Esto puede pasar cuando por ejemplo un desarollador junior es
incorrectamente entrenado por los mentores.

#### Simultaneos desarrollos de largo plazo en distintas ramas

Si la deuda técnica es incremental, incrementará más aún cuando dos ramas con mucha diferencia se mergeen, mis respetos
al DevOps que mergeará esa basura.

#### Refactorización retardada

En muchas etapas del proyecto se hace obvio que es momento de reorganizar la casa, pues existirá código obsoleto,
desperdicio, y será útil reorganizar antes de seguir agregando nuevos elementos, clases, funcionalidades, etc.

Por otro lado, el proyecto no para y se sigue redactando código sobre lo que ya está mal hecho, por lo que la
refactorización (Ya retardada) se sigue retardando.

#### Falta de seguimiento de cumplimiento

Esto pasa cuando todo el mundo sigue escribiendo código donde lo ven posible, sin un monitoreo general.

#### Incompetencia

Esto es cuando el desarrollador simplemente no sabe como escribir código con buenas prácticas.

## Code Smells

1. Bloaters

Métodos que han aumentado a tamaños innecesariamente grandes, haciendo difícil trabajar con estos. Estos códigos se van
acumulando con el tiempo hasta que por fin el problema es depurado. Algunos casos son:

      - Métodos largos
      - Clases largas
      - Obsesión con los primitivos
      - Lista de parámetros larga
      - Data clumps (Grandes grupos de datos)

2. Object-Oriented Abusers

Implementaciones incorrectas o incompletas de los principios de la programación orientada a objetos, algunos casos son:

      - Clases alternativas con diferentes interfaces
      - Switch Statements
      - Legado rechazado (Cuando una subclase implementa de forma incompleta una súper clase)
      - Campos temporales

3. Change Preventers

Esto ocurre cuando ves que al tener que cambiar un campo en una parte específica de tu aplicación, estás en la necesidad
de modificar muchas otras partes para que el código funcione.

      - Cambios divergentes (Para hacer un pequeño cambio a una clase, debes cambiar muchas partes de ese elemento)
      - Jerarquía de herencia paralela (Cada vez que generes una subclase de una súper clase, tienes que generar otra sub clase desde otra súper clase)
      - Shotgun Surgery (Si haces un cambio, tienes que hacer muchos cambios pequeños en distintas partes del código)

4. Dispensables

Es algo sin sentido y que no es necesario lo cual al eliminar, hará al código más limpio.

      - Comentarios.
      - Código duplicado.
      - Data Class (Clases que solo contienen datos, con cero métodos funcionales)
      - Dead Code
      - Lazzy Class (Clases que hacen poco, pero implican atención para entenderlas y mantenerlas)
      - Generación especulativa (Código que se espera usar algún día...

5. Couplers

Casos que contribuyen a un excesivo emparejamiento entre clases o muestran que pasa si el emparejamiento es reemplazado
por delegaciones excesivas.

      - Feature Envy (Un método accede a más datos de otra clase que datos de su propia clase)
      - Innapropiate Intimacy (Un método usa campos y métodos internos de otra clase, una clase no debería saber tanto sobre otra)
      - Incomplete Library Class (Las librerías en algún momento dejarán de satisfacer las necesidades del usuario, es de esperar que se pueda cambiar la librería sin mucho problema)
      - Message Chains (Calls resembling $a()->b()->c()->d())
      - Middle Man (Si una clase solo sirve para delegar tareas a otra clase ¿Para qué existe?)

## Como refactorizar

Checklist de acciones a realizar para refactorizar efectivamente el código

      ✔ El código debe volverse más limpio

      ✔ No se pueden crear nuevas funcionalidades durante la refactorización

      ✔ Todos los tests previamente existentes deben seguir funcionando posteriormente a la refactorización

### Refactoring Techniques

1. Composing Methods

Mucha refactorización se dirige a rehacer correctamente métodos, ya sea por extensión, o por falta de cohesión, ambas
situaciones hacen de los métodos difíciles de leer y mantener en el tiempo.

Las técnicas de refactorización en este grupo agilizan los métodos, remueven código duplicado y pavimentan el camino
para futuras mejoras:

      - Extract Method
      - Inline Method
      - Extract Variable
      - Inline Temp
      - Replace Temp with Query
      - Split Temporary Variable
      - Remove Assigments to Parameters
      - Replace Method with Method Object
      - Substitute Algorithm

2. Moving Features Between Objects

Técnicas de factorización para mover funcionalidades de forma segura entre clases, crear nuevas clases, y ocultar
implementaciones previamente públicas.

      - Move Method
      - Move Filed
      - Extract Class
      - Inline Class
      - Hide Delegate
      - Remove Middle Man
      - Introduce Foreign Method
      - Introduce Local Extension

3. Organizing Data

Técnicas de refactorización que ayudan con el manejo de los datos, reemplazando primitivos con clases funcionales.
Desenredando la asociación entre clases, haciendo de las clases algo más portable y reutilizable.

      - Change value to reference
      - Change reference to value
      - Duplicate Observed Data
      - Self Encapsulate Field
      - Replace Data Value with Object
      - Replace Array with Object
      - Change Unidirectional Association to Bidirectional Association
      - Encapsulate Field
      - Encapsulate Collection
      - Replace Magic Number with Symbolic Constant
      - Replace Type Code with Class
      - Replace Type Code with Subclasses
      - Replace Type code with State/Strategy
      - Replace Subclass with Fields

4. Simplifying Conditional Expressions

Los condicionales tienden a crecer y a crecer a medida que el negocio va recibiendo nuevas necesidades, las siguientes
técnicas de refactorización combaten este problema:

      - Consolidate Conditional Expression
      - Consolidate Duplicate Conditional Fragments
      - Descompose Conditional
      - Replace Conditional with Polymorphism
      - Remove Control Flag
      - Repalce Nested Conditional with Guard Clauses
      - Introduce Null Object
      - Introduce Assertion

5. Simplifying Method Calls

Estas técnicas hacen los llamados a los métodos más simples y fáciles de usar, de hecho, simplifica las interfaces para
la interacción entre clases:

      - Add Parameter
      - Remove Parameter
      - Rename Method
      - Separate Query from Modifier
      - Parametrize Method
      - Introduce Parameter Object
      - Preserve Whole Object
      - Remove Setting Methods
      - Repalce Paramaters with Explicit Methods
      - Replace Paramether with Method Call
      - Hide Method
      - Replace Constructor with Factory Method
      - Replace Error Code with Exception
      - Replace Exception with Test

6. Dealing with Generalization

La abstración tiene su propio grupo de técnicas de refactorización, primeramente asociadas a mover funcionalidades a
través de la jerarquía de la herencia, creando nuevas clases e interfaces, y reemplazando herencia con delegación y
viceversa.

      - Pull Up Field
      - Pull Up Method
      - Pull Up Constructor Body
      - Push Down Field
      - Push Down Method
      - Extract Subclass
      - Extract Superclass
      - Extract Interface
      - Collapse Hierarchy
      - Form Template Method
      - Replace Inheritance with Delegation
      - Replace Delegation With Inheritance