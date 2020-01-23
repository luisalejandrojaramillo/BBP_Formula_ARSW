# BBP_Formula_ARSW
Integrantes:
- Carlos Andres Castaneda
- Luis Alejandro Jaramillo

Part I - Introduction to Java Threads
Compile and run instructions: Proyecto creado en IntelliJ, para ejecutar CountThreadsMain 
1. As reviewed in the readings, complete the CountThread classes, so that they define the life cycle of a thread that prints the numbers between A and B. 

2. Complete the main method of the CountMainThreads class so that: 
  - Create 3 threads of type CountThread, assigning the first one the interval [0..99], the second one [99..199], and the third one [200..299]. 
  - Start all three threads with start(). 
  - Run and check the output on screen. 
  - Change the beginning with start() to run(). How does the output change? Why?
    La salida cambia de forma en que ya no ejecuta los 3 hilos simultamneamnete (lo que sucede con el start()), si no que cuando utilizamos 
    la instancia de run(), ejecuta los metodos por orden de ejecucion.
    
