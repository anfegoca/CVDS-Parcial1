---
Parte 3
---

# Contenedores Livianos + DI

# Calculadora de Órdenes

Se desarrollará una aplicación para el cálculo de las cuentas de restaurantes de acuerdo con la normatividad Colombiana, el cual pueda ser integrado a aplicaciones POS (Point of Sale). Esta aplicación se espera que pueda ser aplicada en diferentes tipos de restaurantes, ya que estos -muchas veces- interpretan y aplican las normas de manera diferente. En particular, se tienen -por ahora- los siguientes casos:

* En algunos restaurantes los precios de los platos ya incluirán el IVA (BasicBillCalculator) y no cobran propina. Es decir, la cuenta es simplemente la sumatoria de los precios.

* En otros restaurantes los precios ya incluyen el IVA, pero sí cobran el servicio del 10% sobre el total de la factura, siempre que el valor total de la misma supere los $15.000 pesos (TipBillCalculator).

* En muchos otros sí se cobra el IVA. Sin embargo, la manera de hacerlo varía de dos formas:
	* 19% estándar sobre todos los platos (TaxBillCalculator + StandardTaxValidator).
	* Aplicando un IVA diferencial a cada tipo de plato, previendo el régimen especial de impuestos a las comidas del año 2016 (TaxBillCalculator + SpecialRegimeTaxValidator)., donde:
		* Las bebidas azucaradas (con mpas de 1000 calorías) tendrán un gravamen adicional del 10% (es decir, un gravamen del 29%).
		* Los demás platos tendrán el gravamen estándar del 19%.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el principio de inversión de dependencias:

![](http://www.plantuml.com/plantuml/png/ZPBDRk8m4CVlUGgBlIIx2m-0KCIox04jfGYYtaVs45mvJcGx5LNRT-_OuIDEEVGKptz-yvyFc5i7nhMLIhW2QzcZ4MZi0sWeqR2tv5Uif1afZGAEGKvhDks0Z1uljHIKFaWjkgmcKMgNNI1ASb2yLU2w-g9seFeOVPAFf3_BRORG6uHOIdjC1S7-qUjRelCAsjIBQsdTpCVvpT27vFU3kTS6pmO5FKbfZEJO3K2HXie7UsUaBiawj8p4t_sAhEk-8I3DhaWdRZsMzdP3tLRNpZGDOylTQlEVljlrd-AVHuX4Sm2oNqYb_fvFLXiscwqkgJodsjuzGv_uzo2RsAs0qnCeAUvxXMdHSDGEIemkV50r1A_uxp4Uvrqthv_ZqSzHAFl26baU7G63bQOqYDJFo1sAF4-IuSRlambRW9KyJjpb2jbyXuBJW4g6KbWbFjTmpYWPVFSEj00Z-fbxM8DSWjfXAIkCs3bgqLRg4m00)


## Agregar Fabrica

- Configure la aplicación para que desde Pos.java NO CONSTRUYA el manejador de órdenes directamente; y así mismo, que el manejador de órdenes NO CONSTRUYA la calculadora básica; y la calculadora con impuestos NO CONSTRUYA el calculador de impuestos directamente. Estas clases deben ser creadas a través de una Fabrica y por medio de los parámetros de entrada del MAIN se pueda cambiar el comportamiento entre los diferentes tipos de calculadora. El primer parámetro corresponderá a el tipo de Calculadora y el segundo a el tipo de Calculador de impuestos.


## Entrega Final

* Incluya la fabrica y haga creación de las diferentes calculadoras y los validadores de impuestos, con base en los parámetros de entrada del `main`.
* Dentro del directorio coloque un archivo de texto en [Markdown] coloque los diferentes resultados del programa `main` al usar las diferentes calculadoras y los validadores de impuestos.
* Haga un Commit de todos los cambios realizados.