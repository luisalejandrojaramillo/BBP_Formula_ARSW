Realizado por Carlos Andrés Castañeda y Luis Alejandro Jaramillo

# BBP Formula ARSW

## Part I - Introduction to Java Threads

#### As reviewed in the readings, complete the CountThread classes, so that they define the life cycle of a thread that     prints the numbers between A and B. 

  * Para el correcto funcionamiento del codigo completamos la clase **CountThread** con la implementación de **Thread**.

#### Complete the main method of the CountMainThreads class so that: 
* Create 3 threads of type CountThread, assigning the first one the interval [0..99], the second one [99..199], and the third one [200..299]. 
* Start all three threads with start(). 
* Run and check the output on screen. 
  ```
    public class CountThreadsMain {
    
      public static void main(String a[]){
          CountThread countThread = new CountThread(0,99);
          CountThread countThread2 = new CountThread(100,199);
          CountThread countThread3 = new CountThread(200,299);
          countThread.start();
          countThread2.start();
          countThread3.start();
      }
    }
   ```
 * Change the beginning with **start()** to **run()**. How does the output change? Why?
 
   * Cuando implementamos el metodo **start()**, La salida imprime en desorden, esto se debe a que el metodo crea un hilo por cada implementación, mientras que el metodo **run()** ejecuta los metodos por orden de ejecución.

## Part III - Performance Evaluation

* **According to Amdahls law, where S (n) is the theoretical performance improvement, P the parallel fraction of the algorithm, and n the number of threads, the greater n, the greater the improvement should be. Why is the best performance not achieved with the 500 threads? How does this performance compare when 200 are used?**

  *
  
* **How does the solution behave using as many processing threads as cores compared to the result of using twice as much?**
  
  *
  
* **According to the above, if for this problem instead of 500 threads on a single CPU, 1 wire could be used on each of 500 hypothetical machines, would Amdahls's law be better applied? If, instead, c threads were used in 500 / c distributed machines (where c is the number of cores of said machines), would it be improved? Explain your answer.**

 *

### Compile and run instructions

* Para cada una de las pruebas se implementó **JUnit** y **Maven**.
* Proyecto creado en **IntelliJ IDEA**.

**Compiling**
```
$ mvn clean compile
```
**Packing**
```
$ mvn package
```

    
