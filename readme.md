# Hilos supermercado

Ejercicio de programación con hilos realizado para la asignatura de programación de procesos
y servicios del grado superior de desarrollo de aplicaciones multiplataforma.

## Enunciado
    En esta actividad vamos a hacer un programa que simule el trabajo de una cajera
    en un supermercado simulando el cobro a los clientes. Tendremos tres clientes y
    tres cajeras, la cajera debe cobrar la compra cliente a cliente, es decir que primero
    le cobra al cliente1, después al cliente2 y finalmente al cliente3. Para esto
    necesitaremos una clase “Cajera” y otra clase “Cliente” el cual va a tener un array
    de enteros que representarán los productos que va a comprar y el tiempo que la
    cajera tarda en pasar esos productos por la caja. Por lo tanto, si tenemos un array
    con [1,5,2] significa que el cliente va a comprar 3 productos y que la cajera tarda en
    procesar el producto “1” un segundo, el producto “2” cinco segundos y el producto
    “3” dos segundos, con lo cual, tardará en cobrar todos los productos 8 segundos.

## Planteamiento

Mi planteamiento para este ejercicio ha sido tener una clase Mercaduna que funciona como clase intermedia,
una clase cajera que hereda de la clase Thread de Java y una clase cliente que solo contiene el identificador
del cliente junto a una colección de enteros a modo de productos.

Al inicio del programa se pasa por parámetro una colección de objetos Cliente y el número de cajeras que vamos a
tener en la ejecución, el método de la clase Mercaduna se encargara de crear las instancias de la clase Cajera y
gestionar la cola de clientes, cada cajera se encargará de procesar la compra de un cliente y se le otorgará un
cliente nuevo en cuanto termine con el actual. Si al terminar no quedan más clientes el programa terminará su
ejecución con éxito.

## Dependencias y enlaces a la documentación 🛠️

#### [Executors](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Executors.html)
#### [Executor](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Executor.html)
#### [ExecutorService](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ExecutorService.html)

Como extra para poder nombrar los hilos he utilizado la clase _ThreadFactoryBuilder_ de la librería _Guava_ desarrollada
por Google.

#### [ThreadFactoryBuilder](https://guava.dev/releases/19.0/api/docs/com/google/common/util/concurrent/ThreadFactoryBuilder.html)





