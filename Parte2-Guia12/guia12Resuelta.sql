/*insertar empleados y departamentos*/

INSERT INTO departamentos (nombre,presupuesto) VALUES ("Programacion",800000);
INSERT INTO departamentos (nombre,presupuesto) VALUES ("Logistica",500000);
INSERT INTO departamentos (nombre,presupuesto) VALUES ("Compras",1000000);
INSERT INTO departamentos (nombre,presupuesto) VALUES ("Programacion",5);

SELECT *FROM departamentos;

INSERT INTO empleados (nombre,apellido,dni,nacionalidad,departamentoId) VALUES ("Exequiel","Godoy",38437712,"Uruguay",1);
INSERT INTO empleados (nombre,apellido,dni,nacionalidad,departamentoId) VALUES ("Laura","Escudero",40457848,"Argentina",3);
INSERT INTO empleados (nombre,apellido,dni,nacionalidad,departamentoId) VALUES ("Susana","Godoy",25415478,"Argentina",3);
INSERT INTO empleados (nombre,apellido,dni,nacionalidad,departamentoId) VALUES ("Selena","Sanchez",42145458,"Argentina",2);
INSERT INTO empleados (nombre,apellido,dni,nacionalidad,departamentoId) VALUES ("Veronica","Vargas",35687845,"Argentina",2);

SELECT * FROM empleados;

/*5. Modificar la nacionalidad de algún empleado.*/
UPDATE empleados SET nacionalidad = "Argentina" WHERE id=2; 

/*6. Eliminar un departamento.*/
DELETE FROM departamentos WHERE id=4;
DELETE FROM departamentos WHERE id=5;

/*7. Conocer los empleados que trabajan en el departamento de “logística” (puede ser
cualquiera de los que agreguen).*/
SELECT * FROM empleados INNER JOIN departamentos ON departamentos.id = empleados.departamentoId;

SELECT * FROM empleados where departamentoId=2;

SELECT empleados.nombre, empleados.apellido, departamentos.nombre AS departamento FROM empleados
JOIN departamentos ON empleados.departamentoId = departamentos.id
WHERE departamentos.nombre = 'logística';

/*Mostrar todos los departamentos ordenados alfabéticamente*/
SELECT nombre,presupuesto FROM departamentos ORDER BY nombre ASC;


