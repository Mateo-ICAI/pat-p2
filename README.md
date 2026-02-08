# API REST para la Gestión de Carritos

## Descripción del Proyecto
Este proyecto implementa un servicio web siguiendo el estilo REST para la gestión de carritos de una manera mut simplificada. La aplicación permite realizar operaciones CRUD (Create, Read, Update, Delete) sobre el recurso Carrito, utilizando el protocolo HTTP para la comunicación servidor-cliente y JSON para el formato de datos.

Para simplificar, y como se indica en la práctica el diseño se basa en un modelo donde cada carrito incluye únicamente un articulo

Se debe recordar que en esta practica, al no tener un servidor como tal, los datos creados y añadidos a nuestra _pseudo base de datos_ se perderán al reiniciar el programa. 

---

## Tabla de Endpoints

| Método (Operación CRUD) | ruta | Cuerpo | Descripción | Posibles Codigos de Respuesta |
| :--- | :--- | :--- | :--- | :--- |
| GET (lista)| `/api/carritos` | No hay | Devuelve todos los carritos | 200 |
| GET (individual)| `/api/carritos/{id}` | No requiere | Devuelve un carrito en especifico | 200 , 404  |
| POST | `/api/carritos` | Objeto Carrito (JSON) | Añade un nuevo carrito | 201 Created |
| PUT | `/api/carritos/{id}` | Objeto Carrito (JSON) | Actualiza la información de un carrito existente. Si el carrito no existe, devuelve error. | 200 , 404 |
| DELETE | `/api/carritos/{id}` | No requiere | Elimina el carrito con {id}  | 204, 404 |

las respuestas que empiezan por 2 son existo, y por 4 son errores

---

## Body
Representación en JSON de un carrito, como se utiliza para POST, PUT, y DELETE:

```json
{
    "idCarrito": "int",
    "idArticulo": "int",
    "descripcion": "String",
    "unidades": "int",
    "precioFinal": "double"
}
