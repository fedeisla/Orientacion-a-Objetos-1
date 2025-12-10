
# Ejercicio 3 - Casos de prueba

Dado la clase Salida, probaremos los metodos, **obtenerPrecioSalida**, **inscribirGrupo**  

- **obtenerPrecioSalida**
    - identificamos dos particiones que va a estar dada por el tipo de clase ingresada en el construcor:
        - Rafting: al precio base se aumentara el 5%
        - Trekking: si la cantidad de personas del grupo que se inscriben  son mayores a 4 o no,  se realiza descuento
- **inscribirGrupo (Rafting)**  
    - identificamos dos particiones: si hay guia a cargo o no 
    - identificamos valores de borde: 4,5,6  cantidad de personas en el grupo inscripto
    - identificamos valores de borde del metodo  de la clase equipo, **HayStock** cuando el stock disponible es de  40 equipos: 39, 40, 41 cantidad de equipos usados por dia
    
- **inscribirGrupo (Trekking)**  
    - identificamos dos particiones: si hay guia a cargo o no 
    - identificamos valores de borde: 9,10,11 cantidad de personas en el grupo inscripto
     - identificamos valores de borde del metodo  de la clase equipo, **HayStock** cuando el stock disponible es de  40 equipos: 39, 40, 41 cantidad de equipos usados por dia  