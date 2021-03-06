# Ejemplos del curso de Java

Para compilarlos desde la linea de comando, nos dirigimos al subdirectorio
adecuado y ejecutamos:
	$ javac *.java

Para ejecutarlos en el directorio del codigo fuente ejecutamos:
	$ java -cp \. <Clase>

Donde <Clase> es el nombre de la clase que contiene el metodo: 
	public static void main()

# Ejemplos con Base de datos
Para ejecutar los ejemplos con el driver de MySQL hay que modificar el classpath de Java para incluir el jar de MySQL:
	java -cp ./:./mysql-connector-java-5.1.15-bin.jar  EjemploDB

# Licencia
The MIT License

Copyright (c) 2011 Mario Alberto Chavez

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.