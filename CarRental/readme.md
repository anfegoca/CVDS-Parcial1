## Escuela Colombiana de Ingeniería
## Ciclos de vida del desarrollo de Software - CVDS
## Parcial Práctico - 1er Tercio


# Parte II. - Pruebas 'Car Rental'

Para la segunda parte del parcial, se creará el componente encargado de realizar el cálculo del valor a cobrar a un
cliente que desea alquilar un carro en la compañía 'Car Rental'.

1. Arbol del proyecto del parcial

```bash
	.
	+-- .gitignore
	+-- parcial-1.pdf
	+-- pom.xml
	+-- readme.md
	+-- src
		+-- main
		|   +-- java
		|       +-- edu
		|           +-- eci
		|               +-- cvds
		|                   +-- carRental
		|                       +-- model
		|                       |   +-- CarCategory.java
		|                       |   +-- FrequentClientCategory.java
		|                       |
		|                       +-- service
		|                           +-- RentalService.java
		|
		+-- test
			+-- java
				+-- edu
					+-- eci
						+-- cvds
							+-- carRental
								+-- service
									+-- RentalServiceTest.java
```

2. El proyecto cuenta con una estructura inicial, la cual se describirá a continuación:
	* Paquete `edu.eci.cvds.carRental.model`: Tiene las clases básicas del modelo.
		* Enumeración `CarCategory`: Enumeración con 3 categorías de vehículos (Pickup, Deportivo, Eléctrico).
		* Enumeración `FrequentClientCategory`: Enumeración con 3 categorías para clientes frecuentes (Plata, Oro, Diamante).
	* Paquete `edu.eci.cvds.carRental.service`: Se encuentra la lógica de negocio.
		* Clase `RentalService`: Clase principal de la lógica de negocio, donde se realiza el cálculo para el alquiler.
	* Paquete `edu.eci.cvds.carRental.service` (en src/test/java): Se encuentran las pruebas de la lógica de negocio.
		* Clase `RentalServiceTest`: en esta clase deben estar las pruebas para `RentalService`.

2. Para el cálculo del alquiler, se tienen las siguientes tarifas:
	* Categoría Vehículo: El precio base del alquiler (por días) está relacionado a la categoría del vehículo de la siguiente manera:
		* *Camioneta*: Es el carro más grande donde caben más personas y se cobra un valor de $100.000 pesos diarios
		* *Deportivo*: El vehìculo para los más aficionados de la velocidad y se cobra un valor de $80.000 pesos diarios
		* *Eléctrico*: Impulsado por un motor eléctrico, es la apuesta de la compañía hacia energías renovables, por lo cual tiene el costo más bajo, por solo $50.000 pesos diarios
	* Fidelización de Clientes: La empresa desea tener un programa de fidelización de clientes, donde ofrece un descuento para los clientes frecuentes dependiendo de la categoría.
		* *Plata*: Categoría inicial, se ofrece un 5% de descuento sobre el valor total.
		* *Oro*: Segunda categoría, se ofrece 10% de descuento en el alquiler de los vehículos.
		* *Diamante*: La máxima categoría de fidelización, donde se ofrece un 15% de descuento sobre el valor total.

3. Defina las clases de equivalencia necesarias para realizar las pruebas y asegurar la calidad del programa. Estas pueden se realizadas en cualquier archivo que sea claramente visible.

4. Realice la implementación de las pruebas unitarias en la clase `RentalServiceTest` según las clases de equivalencia anteriormente definidas (no olvidar tener en cuenta los límites / fronteras).

5. Implemente la lógica específica en la clase `RentalService` para realizar el cálculo del alquiler, con base en la información anterior. Revisar el "tip" dado en la clase para realziar los cálculos necesarios.

6. Verifique la correcta compilación, ejecución y pruebas del proyecto, por medio de la construcción con Maven.

7. Realice los ajustes requeridos a las pruebas o al cálculo del alquiler, según lo encontrado luego de las ejecucions de maven.

## Entrega

* Cada que se realice uno de los puntos 3 al 7, realice un commit indicando el avance,
* Cargar en Moodle antes de finalizar el parcial.
* Elimine completamente la tarpeta target para reducir el tamaño del archivo.
* Comprima todo el contenido del proyecto en un archivo .zip (excluyendo la carpeta target) y agreguela al esapcio correspondiente en Moodle.
