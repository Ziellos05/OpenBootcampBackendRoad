## PATRONES DE DISEÑO

No son código, no se copian de un proyecto y se pegan en otro

Son métodos probados y nacidos desde la hermenéutica que se sabe
que permiten resolver eficientemente problemas comunes

Patrones a aprender con OpenBootCampo:

* Plantilla
* Cadena de responsabilidad
* Estrategia
* Proxy
* Constructor
* Observador

## TIPOS DE PATRONES

## Creacionales

BUILDER

        El patrón Builder permite crear objetos complejos paso por paso, permitiendo construir 
        diferentes objetos con diferentes caracterìsticas usando el mismo código.

        1. Problema:

        Para el caso en el que estás en el deber de construir un objeto que de forma normal es 
        laborioso, pues tiene muchos campos, tiene campos nesteados con otro, o hasta escala demasiado
        hasta llegar al cliente.

        2. Solución:

        Si se implementa una clase constructora aparte de la misma clase original de la cual se van
        a crear los objetos, este va a poder gestionar la creación de los objetos, sin importar si
        no se agregan todos los campos de la clase original, o si hay diferentes métodos a implementar,
        estos serán implementados por el constructor y se creará el objeto deseado correctamente.

        También es posible implementar un DIRECTOR, este director puede decidir los pasos a seguir y en
        este caso los constructores serán la implementación de estos pasos.

        3. Aplicación:

        Permite quitarse de encima la implementación de de un "constructor" para cada posible objeto
        con diferentes atributos, conocido en inglés como "Telecoping Constructor".

        Se puede usar cuando requieras crear distintos objetos de una clase pero con una implementación
        intermedia que difiere en algo específico, por ejemplo, un carro de cuatro puertas y un carro 
        de 2 puertas, siendo que cada uno va a tener diferencias en su estructura interna.

        Permite crear un objeto compuesto con mucha más facilidad y menos exposición del código como de 
        un objeto mal construido, por ejemplo, un objeto que llama datos desde otros paquetes o hasta 
        otras aplicaciones, bases de datos, etc.

        4. Pros y Contras: 
        
            ✓ Se pueden construir objetos paso por paso.
            ✓ Puede utilizar el mismo código del constructor para hacer varios objetos.
            ✓ Single Responsability Principle.
            ✕ La complejidad del código aumenta a medida que el constructor necesitará nuevas clases.
        
FACTORY METHOD

        El patrón Factory Method permite crear objetos utilizando una clase principal como interface que 
        será implementado por subclases que crearán el objeto correcto.

        1. Problema:

        Para el caso en el que tienes implementada toda la lógica de la creación de objetos a través de una
        clase que en cualquier momento puede cambiar o pueden agregarse clases nuevas, ahora tendrás n clases
        que podrán implementar n constructores.

        2. Solución:

        En vez de tener constructores independientes, se implementa la creaciòn de nuevos objetos a través
        de un método FÁBRICA en una super clase que podrá ser implementada por subclases que podrán sobreescribir
        y adaptar su propia creación, permitiéndote así seguir creando todos tus objetos a través de un
        solo método (En la práctica).

        Es importante entender que para que esto sea posible es importante entender que las subclases deben
        depender de una clase base, la cual es la que podrá ser devuelta por el método invocado.

        3. Aplicación:

        Sirve para utilizarlo cuando no se conozca específicamente las dependencias y los tipos de objetos
        que se utilizarán, así en caso de que el requerimiento de subclases nueva vaya en aumento, ya tendrás
        una implementación que permitirá lidiar con este problema

        Se puede utilizar cuando se está creando una herramienta de desarrollo, un framework, y deseas que tus
        usuarios puedan extender la utilidad e implementar sus soluciones específicas.

        Para permitir la reutilización de objetos existentes en lugar de reconstruirlos nuevamente.

        4. Pros y Contras: 
        
            ✓ Se evita un acoplamiento entre el creador y los productos finales.
            ✓ Single Responsability Principle.
            ✓ Open/Close Principle.
            ✕ Puede ser que a la larga se deban implementar varias subclases para implementar el patrón.

PROTOTYPE

        El patrón prototype permite copiar objetos existentes sin que el código dependa de la clase de estos.

        1. Problema:

        Existe la posibilidad de que quieras crear objetos nuevos, exactamente igual, pero existen campos y
        métodos internos de este objeto que son privados, lo cual haría imposible acceder a esta información
        para copiar efectivamente el objeto.

        También existe la posibilidad de que no sepas exactamente la clase del objeto que vas a copiar,
        entonces sería factible tener una forma de copiarlo sin depender de esa clase precisamente.

        2. Solución:

        Implementar la clonación de los objetos en los métodos de los objetos como tal, a través de una interfaz
        común a todos los objetos que se espera, tengan la capacidad de clonarse. Esto permite, entre otras cosas,
        acceder a los datos privados pues van a clonarse desde el mismo tipo de objeto.

        3. Aplicación:

        Utiliza el patrón Prototype cuando tu código no deba depender de las clases 
        concretas de objetos que necesites copiar.

        Utiliza el patrón cuando quieras reducir la cantidad de subclases que solo se diferencian en 
        la forma en que inicializan sus respectivos objetos. Puede ser que alguien haya creado estas 
        subclases para poder crear objetos con una configuración específica.

        4. Pros y Contras: 
        
            ✓ Se pueden clonar objetos sin preocuparse de sus clases concretas.
            ✓ En vez de usar varios codigos de inicialización, se pueden clonar prototipos.
            ✓ Alternativa a la herencia al tratar con preajustes de configuración para objetos complejos.
            ✓ Se pueden crear más fácilmente objetos complejos.
            ✕ Si los objetos tienen referencias circulares.

SINGLETON

        El patrón Singleton permite asegurarnos de que una clase tenga una única instancia, 
        a la vez que proporciona un punto de acceso global a dicha instancia.

        1. Problema:

        Por un lado garantiza que una instancia tenga una responsabilidad única, especialmente porque permite
        controlar el acceso a un recurso compartido, como puede ser la conexión a una base de datos.

        Por otro lado proporciona un punto de acceso global a dicha instancia, así como cuando se trabaja 
        con variables globales, pero esas variables estarán referenciadas desde una clase específica y podrá
        ser accedido desde cualquier parte de la aplicación sin la posibilidad de ser editado.

        2. Solución:

        Se hace private el constructor por defecto de la clase en cuestión para evitar instanciar el objeto
        con el método new().

        Se crea un método de construcción estático que actúa como constructor. Por detrás, este método llama
        al constructor y guarda el objeto en un campo estático, posteriormente este objeto creado será accedido
        desde su almacenamiento en caché.

        3. Aplicación:

        Cuando una clase de tu programa tan solo deba tener una instancia disponible para todos los clientes; 
        por ejemplo, un único objeto de base de datos compartido por distintas partes del programa.

        Cuando necesites un control más estricto de las variables globales.

        4. Pros y Contras: 
        
            ✓ Puede tener la certeza de que una clase tiene una ùnica instancia.
            ✓ Obtiene un punto de acceso global a dicha instancia.
            ✓ El objeto singleton solo se inicializa cuando se obtiene por primera vez.
            ✕ Vulnera el principio de responsabilidad única al resolver dos problemas a la vez.
            ✕ Se puede enmascaras un mal diseño, ejemplo, lo que saben los componentes del programa entre sí.
            ✕ En sistemas concurrentes/paralelos se puede crear un objeto singleton varias veces.
            ✕ Realizar mocks para pruebas unitarias es complicado por la falta de herencia.

## Estructurales

Adapter

        El patrón adapter permite la colaboración entre objetos con interfaces no compatibles.

        1. Problema:

        Muchas veces vas a trabajar con datos en formatos distintos, como es la posibilidad de recibir
        datos en formato XMl pero contar con una biblioteca que solo maneja datos en formato JSON, importante
        para el funcionamiento correcto de tu APP.

        2. Solución:

        Como se viene comentando, la solución es implementar una clase que sirva como traducción entre ambas
        interfaces, recibiendo un formato de la información y entregando el otro, siendo este la comunicación
        intermedia entre la parte del negocio que recibe los datos y la otra parte del negocio que los procesa.

        3. Aplicación:

        Utiliza la clase adaptadora cuando quieras usar una clase existente, pero cuya interfaz no sea 
        compatible con el resto del código.

        Utiliza el patrón cuando quieras reutilizar varias subclases existentes que carezcan de alguna
        funcionalidad común que no pueda añadirse a la superclase.

        4. Pros y Contras: 
        
            ✓ Principio de responsabilidad única, pues la interfaz, el código que traduce los datos y el
              código que desarrolla nuestra solución están separados.
            ✓ Principio de abierto/cerrado, pues permite introducir nuevos tipos de adaptadores que conecten
              la interfaz con los procesos sin modificar el código previo.
            ✕ La complejidad del código aumenta, pues introduces nuevas interfaces, clases e implementaciones.

DECORATOR

        Este patrón permite añadir funcionalidades a objetos encapsulando estos dentro de otros objetos
        especiales que contendrán estas funcionalidades.

        1. Problema:

        Tienes un desarrollo que implementa un método, con el tiempo, este método sigue siendo funcional
        pero empiezan a surtir nuevos casos en los que tendrás que implementar nuevos métodos en tu clase,
        posteriormente se quiere que varias de esas soluciones se usen en conjunto, aquí podrás mezclar la 
        implementación de todos estos métodos creados, sin embargo, existe otra solución...

        2. Solución:

        Por un lado, la herencia, al ser estática, no permite alterar la funcionalidad de una clase en tiempo
        de ejecución, a no ser que se sustituya el objeto por completo en otro funcional.

        Las subclases solo pueden tener una clase padre, en la mayoría de los lenguajes no se permite que una
        clase tenga herencia de varias clases particulares.

        Un "wrapper" precisamente se puede crear para implementarse sobre una clase a la cual se le quiera
        modificar una funcionalidad, ya sea antes o después de pasar por la clase inicial. Ambos implementan
        la misma interfaz, así podrás implementar el objeto a través de la interfaz pues para el cliente estos
        se comportan como objetos de la misma clase. También es posible agregar varios decoradores.

        3. Aplicación:

        Utiliza el patrón Decorator cuando necesites asignar funcionalidades adicionales a objetos durante el 
        tiempo de ejecución sin descomponer el código que utiliza esos objetos.

        Utiliza el patrón cuando resulte extraño o no sea posible extender el comportamiento de un objeto 
        utilizando la herencia.

        4. Pros y Contras: 
        
            ✓ Puede extender el comportamiento de un objeto sin crear una nueva subclase.
            ✓ Puedes añadir o eliminar responsabilidades de un objeto durante tiempo de ejecución.
            ✓ Puedes combinar varios comportamientos envolviendo un objeto con varios decoradores.
            ✓ Single Responsability Principle. Se puede dividir una clase monolítica que implementa varios
              comportamientos en varias clases pequeñas.
            ✕ Es difícil eliminar un wrapper implementado en medio de la pila de wrappers.
            ✕ Es difícil implementar un decorador de tal forma que su comportamiento no dependa de otros en pila.
            ✕ El código de configuración inicial de las capas puede resultar enrevesado.

FACADE

        El patrón fachada permite implementar una interfaz sencilla (O al menos más sencilla) para acceder
        a métodos de una biblioteca, framework, etc, más fácil, reduciendo la complejidad en el proceso.

        1. Problema:

        Especialmente para el caso en el que tu aplicación esté limitada a trabajar con una biblioteca
        externa, eel nivel de complicación de la implementación de terceros se verá reflejado en lo acoplado
        que este código externo estará con la lógica propia del negocio.

        2. Solución:

        La fachada proporciona una interfaz sencilla a un subsistema complejo que contiene muchas partes móviles, 
        la misma fachada puede proporcionar un uso limitado de estas herramientas externas, debido a una previa
        personalización de las utilidades, pero a su vez simplifica el código a utilizar para implementar esas
        herramientas esperadas, por lo que se tiene que contar con buena información de lo que se requiere para que
        la fachada funcione correctamente.

        Especialmente para casos cuando esta sofisticada biblioteca no necesita ser usada en su mayoría de métodos
        tener una fachada que permita acceder a lo justo y necesario es importante.

        3. Aplicación:

        Utiliza el patrón Facade cuando necesites una interfaz limitada pero directa a un subsistema complejo.

        Utiliza el patrón Facade cuando quieras estructurar un subsistema en capas.

        4. Pros y Contras: 
        
            ✓ Se puede aislar un código de la complejidad de un subsistema.
            ✕ Una fachada puede convertirse en un objeto todo poderoso acoplado a todas las clases de una app.

## Comportamentales

CHAIN OF RESPONSABILITY

        El patrón chain busca que cuando se realiza una solicitud, esta pase por una serie de manejadores,
        los cuales decidirán cada uno según sea el caso si procesan la solicitud o la envían al suguiente
        manejador en la cadena.

        1. Problema:

        Tienes un sistema en el cual vas a gestionar una petición la cual se procesa de manera diferente de
        acuerdo al caso, te das cuenta que puedes procesar desde caso a caso, pues no es necesario leerlos todos
        y cada caso tiene un nivel mayor de importancia a la hora de analizar, por ejemplo, al autenticar un
        usuario y su nivel de responsabilidad, primero autenticas que en efecto el usuario exista, que el
        usuario sí se haya autenticado correctamente y por último el nivel/cargo del mismo.

        Resulta que con el tiempo se puede aumentar la complejidad del sistema, como el agregar validaciones antes
        de enviar datos, el agregar seguridad para evitar ataques u obtención bruta de contraseñas o agregar
        caché para acelerar acceso a los datos, la aplicación mejora a costa del código mismo.

        2. Solución:

        Transformar comportamientos particulares en objetos autónomos denominados manejadores (HANDLERS),
        a este handler se le pasa toda la información y su objetivo es hacer una comprobación única (SRP).

        Los manejadores de pueden acoplar, de aquí la cadena, donde cada manejador al pasar el elemento podrá
        entregarlo con algún campo de referencia que el siguiente utilizará para su procesamiento, o en caso 
        de considerarlo, detener el proceso en algún manejador específico y lanzar una respuesta coherente con
        el resultado del proceso.

        También es factible tener un manejador inicial que analice la información recibida para determianr si sí
        es procesable, así se decide si se envía al resto de la cadena o se detiene al momento de empezar, lo cual
        además de mantener legibilidad y organización en el código, disminuye el procesamiento necesario para
        procesos que no van a resultar exitosos.

        3. Aplicación:

        Utiliza el patrón Chain of Responsibility cuando tu programa deba procesar distintos tipos de 
        solicitudes de varias maneras, pero los tipos exactos de solicitudes y sus secuencias no se conozcan 
        de antemano.

        Utiliza el patrón cuando sea fundamental ejecutar varios manejadores en un orden específico.

        Utiliza el patrón Chain of Responsibility cuando el grupo de manejadores y su orden deban 
        cambiar durante el tiempo de ejecución.

        4. Pros y Contras: 
        
            ✓ Puedes controlar el órden de las solicitudes
            ✓ SRP. Se desacoplan las clases que invocan operaciones de las que realizan operaciones.
            ✓ OCP. Se pueden agregar nuevos manejadores a la aplicación sin descomponer el código existente.
            ✕ Algunas solicitudes pueden acabar sin ser gestionadas.

ITERATOR

        Iterator es un patrón de diseño de comportamiento que te permite recorrer elementos de una colección 
        sin exponer su representación subyacente (lista, pila, árbol, etc.).

        1. Problema:

        Sin importar el tipo de colección que se utilice para una recopilación de datos, deben existir métodos
        óptimos que permitan acceder a la información de estos sin tener que acceder directamente a la 
        representación de estos datos. Para listas el acceso a los datos no es muy complejo, pero cuando se 
        trata de elementos más entramados como con árboles o grafos, es importante tener una forma intuitiva
        de acceder a estos datos de diferentes maneras.

        Si se añaden gradualmente más algoritmos de recorrido, se viola el SRP al tener métodos sobre una clase que
        como responsabilidad debe gestionar los datos. En este caso nos queda acoplar el código a las clases que se
        están recibiendo.

        2. Solución:

        Extraer el comportamiento del acceso a los datos y colocarlo en un objeto aparte llamado "Iterator".

        El objeto iterador implementa el algoritmo personalizado pero además encapsula los detalles del
        recorrido, debido a esto, se pueden usar varios iteradores a la vez recorriendo la misma colección,
        todos independientes, útil para procesos concurrentes.

        Todos los iteradores implementan la misma interfaz, lo cual permitirá que el código acceda a los datos
        sin importar la colección desde la que se traiga la información. Para nuevas formas de acceder a la 
        información, solo se crea la clase iteradora nueva sin afectar ni la colección ni el cliente.

        3. Aplicación:

        Utiliza el patrón Iterator cuando tu colección tenga una estructura de datos compleja a nivel interno, 
        pero quieras ocultar su complejidad a los clientes (ya sea por conveniencia o por razones de seguridad).

        Utiliza el patrón para reducir la duplicación en el código de recorrido a lo largo de tu aplicación.

        Utiliza el patrón Iterator cuando quieras que tu código pueda recorrer distintas estructuras de datos, 
        o cuando los tipos de estas estructuras no se conozcan de antemano.

        4. Pros y Contras: 
        
            ✓ Se puede recorrer la misma colección en paralelo porque cada iterador tiene su propio estado.
            ✓ Se puede pausar una iteración y continuar cuando se precise.
            ✓ Open Close Principle.
            ✓ Single Responsability Principle.
            ✕ No es necesario se la aplicación solo utiliza colecciones sencillas o estándar.
            ✕ Utilizar un iterador puede ser menos eficiente que recorrer directamente los elementos
              en algunas colecciones especializadas, o en algunos algoritmos específicos.

Mediator

        Conocido también como INTERMEDIARY o CONTROLLER, este patrón restringe la dependencia directa entre clases
        obligando a las mismas a comunicarse a través del mediador.

        1. Problema:

        Tienes varias clases y campos que dependen los unos de los otros cuando se implementan y para su
        posterior procesamiento.

        2. Solución:

        Detener por completo toda comunicación directa entre los elementos y hacer que todos se comunican a través
        de una clase Mediator, la cual hará a todas las clases comunicarse de forma indirecta y redirigiendo todos
        los llamados de acuerdo al caso.

        También es posible implementar un DIRECTOR, este director puede decidir los pasos a seguir y en
        este caso los constructores serán la implementación de estos pasos.

        De esta manera se encapsula una compleja red de dependencias dentro de una sola clase mediadora, esto
        a su vez permite que cuando sea preciso, se modifique, extienda o reutilice una clase sin que ellos 
        conlleve manejar multiples dependencias.

        3. Aplicación:

        Utiliza el patrón Mediator cuando resulte difícil cambiar algunas de las clases porque están 
        fuertemente acopladas a un puñado de otras clases.

        Utiliza el patrón cuando no puedas reutilizar un componente en un programa diferente porque 
        sea demasiado dependiente de otros componentes.

        Utiliza el patrón Mediator cuando te encuentres creando cientos de subclases de componente 
        sólo para reutilizar un comportamiento básico en varios contextos.

        4. Pros y Contras: 
        
            ✓ Se reduce el acoplamiento entre varios componentes de un programa.
            ✓ Se pueden reutilizar componentes individuales con mayor responsabilidad.
            ✓ SRP.
            ✓ OCP.
            ✕ Un mediador puede evolucionar a un objeto TODOPODEROSO.

OBSERVER

        El mismo patrón Publicación-Subscripción, Listener, Event-Subscriber.

        Patrón de comportamiento que permite definir un mecanismo de subscripción para notificar a varios
        objetos cuando ocurra un cambio con el objeto que se está observando.

        1. Problema:

        Tienes dos tipos de objetos, uno de estos quiere estar pendiente cuando ocurra un cambio con el otro
        para poder actuar lo más rápidamente posible. Una forma sería estar enviando peticiones al objeto para
        saber cuando ha cambiado, pero eso sería un consumo de capacidad en vano en la mayoría de los casos.
        Por otro lado también es posible que el objeto bajo vigilancia esté notificando constantemente a los
        objetos en espera, pero entonces esto podría significar mucha información enviada innecesariamente.

        2. Solución:

        Se propone la solución de agregar un mecanismo en el que el objeto observado sea un notificador y el
        objeto observador sea un subsciptor. Significando esto que los objetos pueden subscribir o desvincularse
        de un stream de eventos observables. El método se resume en 1. Un campo matriz para almacenar una lista
        de referencias a objetos subscriptores. 2. Varios métodos públicos que permitan añadir y sacar subscriptores
        del steam de notificaciones.

        Para poder implementar eficientemente esta comunicación, se espera que los subscriptores implementes la
        misma interfaz, para que de esta manera a través de un método con un número de parámetros definidos, se
        pueda realizar la comunicación. También es posible tener varios notificadores y que TODOS IMPLEMENTEN la
        misma interfaz. Así los subscriptores podrán observar a los eventos de los notificadores sin acoplarse a
        sus clases concretas.

        3. Aplicación:

        Utiliza el patrón Observer cuando los cambios en el estado de un objeto puedan necesitar cambiar otros 
        objetos y el grupo de objetos sea desconocido de antemano o cambie dinámicamente.

        Utiliza el patrón cuando algunos objetos de tu aplicación deban observar a otros, pero sólo durante un 
        tiempo limitado o en casos específicos.

        4. Pros y Contras: 
        
            ✓ OCP.
            ✓ Se pueden establecer relaciones entre objetos en tiempo de ejecución.
            ✕ Los subscriptores son notificados de forma aleatoria.

STATE

        El patrón State permite a un objeto alterar su comportamiento cuando sus atributos internos cambian
        lo cual lo hace comportarse como si fuese otra clase.

        1. Problema:

        La máquina de estados finitos. Un programa puede encontrarse en un número finito de estados. 
        Dentro de cada estado único, el programa se comporta de forma diferente y puede cambiar de un 
        estado a otro instantáneamente. Sin embargo, dependiendo de un estado actual, el programa puede 
        cambiar o no a otros estados. Estas normas de cambio llamadas transiciones también son finitas 
        y predeterminadas.

        Por ejemplo, un objeto en tres estados de publicación diferente que de acuerdo a ese estado, cuando se
        usa el evento publicar, realizan acciones diferentes, que lo pueden mover de un estado al otro, o nada.

        Generalmente se puede implementar distintos estados a través de condicionales IF o SWITCH, sin embargo,
        a medida que se agregan más posibles estados, el código empieza a peder calidad, por lo que la
        implementación se vuelve tediosa y difícil de mantener en el tiempo.

        2. Solución:

        Se propone crear nuevas clases para cada estado nuevo esperado del objeto, con los comportamientos
        específicos para cada estado creado.

        El objeto original (Contexto) en vez de implementar el comportamiento, genera un campo que tiene la
        información del estado específico y delega esa implementación a la clase creada.

        Para ello, todos los objetos que administran los estados son implementados a través de la misma interface
        la cual permite que todos los estados sean comunicados y delegados a través del mismo formate de 
        datos.

        3. Aplicación:

        Utiliza el patrón State cuando tengas un objeto que se comporta de forma diferente dependiendo de su estado 
        actual, el número de estados sea enorme y el código específico del estado cambie con frecuencia.

        Utiliza el patrón cuando tengas una clase contaminada con enormes condicionales que alteran el modo en que se 
        comporta la clase de acuerdo con los valores actuales de los campos de la clase.

        Utiliza el patrón State cuando tengas mucho código duplicado por estados similares y transiciones de una máquina 
        de estados basada en condiciones.

        4. Pros y Contras: 
        
            ✓ Simplifica el código eliminando condicionales de máquinas de estado.
            ✓ SRP.
            ✓ OCP.
            ✕ Puede ser excesivo si una máquina tiene pocos estados o cambian poco.

STRATEGY

        Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos, 
        colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.

        1. Problema:

        Tienes una implementación que utiliza X algoritmo para resolver un problema, posteriormente, se observa
        que hay otros casos que se pueden gestionar implementando nuevos algoritmos, al final puedes tener
        tantos algoritmos como casos, en detrimento del código, su legibilidad y su mantenimiento.

        2. Solución:

        Tomas todos esos algoritmos que utiliza tu clase y los implementas en clases separadas que llamarás
        "ESTRATEGIAS". La clase original, el "CONTEXTO", tiene un campo de referencia a las estrategias y
        delega a éstas realizar el algoritmo en cuestión.

        La clase contexto no es la encargada de decidir el algoritmo a utilizar, ni conoce específicamente
        sobre los algoritmos, solo permite métodos para enviar la información a ser procesada y recibirla, las
        cuales son gestionadas a trvés de una interfaz genérica. Quien decide el algoritmo es el cliente.

        3. Aplicación:

        Utiliza el patrón Strategy cuando quieras utiliza distintas variantes de un algoritmo dentro de un objeto y 
        poder cambiar de un algoritmo a otro durante el tiempo de ejecución.

        Utiliza el patrón Strategy cuando tengas muchas clases similares que sólo se diferencien en la forma en que 
        ejecutan cierto comportamiento.

        Utiliza el patrón para aislar la lógica de negocio de una clase, de los detalles de implementación de algoritmos
        que pueden no ser tan importantes en el contexto de esa lógica.

        Utiliza el patrón cuando tu clase tenga un enorme operador condicional que cambie entre distintas variantes del 
        mismo algoritmo.

        4. Pros y Contras: 
        
            ✓ Se pueden intercambiar los algoritmos utilizados por un objeto en tiempo de ejecución.
            ✓ Se puede aislar la implementación de la lógica del negocio.
            ✓ Se puede sustituir la herencia por composición.
            ✓ OCP.
            ✕ Si solo se tienen pocos algoritmos que rara vez cambian, es un patrón innecesario.
            ✕ Los clientes deben conocer las diferentes estrategias para seleccionar la adecuada.
            ✕ Muchos lenguajes modernos tienen soporto funcional para implementar distintas versiones de un algoritmo
              dentro de un grupo de funciones anónimas. Por lo que implementando esto se evita usar clases e interfaces.

TEMPLATE METHOD

        patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase pero permite que las
        subclases sobrescriban pasos del algoritmo sin cambiar su estructura.

        1. Problema:

        Tienes que procesar tres fuentes diferentes de información y observas que el procedimiento es prácticamente el  
        mismo pero con una implementación específica diferente, por lo que sería útil implementar un código base que
        utilicen las implementaciones específicas para evitar duplicación de código y separar los métodos.

        Por otro lado, al tener distintos procesos, al tenerlo en un sólo código vas a tener que gestionarlo con
        condicionales, de esta manera si las tres clases de procesamiento utilizan la misma interfaz o clase base,
        puede eliminar las condicionales del código base y utilizar polimorfismo para invocar métodos en un objeto de
        procesamiento.

        2. Solución:

        Se sugiere que dividas un algoritmo en una serie de pasos, conviertas estos pasos en métodos y coloques una 
        serie de llamadas a esos métodos dentro de un único método plantilla. Los pasos pueden ser abstractos, o contar 
        con una implementación por defecto. Para utilizar el algoritmo, el cliente debe aportar su propia subclase, 
        implementar todos los pasos abstractos y sobrescribir algunos de los opcionales si es necesario (pero no el 
        propio método plantilla).

        3. Aplicación:

        Utiliza el patrón Template Method cuando quieras permitir a tus clientes que extiendan únicamente pasos 
        particulares de un algoritmo, pero no todo el algoritmo o su estructura.

        Utiliza el patrón cuando tengas muchas clases que contengan algoritmos casi idénticos, pero con algunas 
        diferencias mínimas. Como resultado, puede que tengas que modificar todas las clases cuando el algoritmo cambie.

        Permite crear un objeto compuesto con mucha más facilidad y menos exposición del código como de 
        un objeto mal construido, por ejemplo, un objeto que llama datos desde otros paquetes o hasta 
        otras aplicaciones, bases de datos, etc.

        4. Pros y Contras: 
        
            ✓ Se permite que los clientes sobreescriban solo ciertos pasos de un algoritmo definido por nosotros.
            ✓ Se puede colocar el código duplicado dentro de una superclase.
            ✕ El esqueleto propuesto puede limitar las opciones de un cliente.
            ✕ Se puede violar el principio de sustitución de Liskov suprimiendo una implementación por defecto de un
              paso a través de una subclase.
            ✕ Los métodos plantilla tienden a ser más difíciles de mantener y definir en cuanto más pasos tengan.
