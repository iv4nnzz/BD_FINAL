1. Crear la Base de Datos

Abrir:

MySQL Command Line Client

Ingresar la contraseña de MySQL y ejecutar:

CREATE DATABASE gestion_servicios;

Luego salir:

EXIT;
2. Importar la Base de Datos

Abrir:

CMD (Símbolo del sistema)

Ir a la carpeta bin de MySQL:

cd "C:\Program Files\MySQL\MySQL Server 5.7\bin"
Importar el archivo .sql

Ejecutar:

mysql -u root -p gestion_servicios < "RUTA_DEL_ARCHIVO_SQL"

Ejemplo:

mysql -u root -p gestion_servicios < "C:\Users\Usuario\Downloads\gestion_servicios.sql"

Ingresar la contraseña de MySQL cuando sea solicitada.

3. Verificar la Importación

Entrar nuevamente a MySQL:

mysql -u root -p

Usar la base de datos:

USE gestion_servicios;

Mostrar tablas:

SHOW TABLES;

Si aparecen las tablas, la importación fue exitosa.