USE jardineria;

CREATE TABLE ClienteLogin(
	User Varchar(255) PRIMARY KEY,
	Pass Varchar(255) NOT NULL,
	CodigoCliente int NOT NULL,
	CONSTRAINT fk_CodigoCliente FOREIGN KEY (CodigoCliente) REFERENCES Clientes (CodigoCliente)
);

DROP PROCEDURE IF EXISTS ClienteLoginActu;
DELIMITER //
CREATE PROCEDURE ClienteLoginActu()
BEGIN
	DECLARE cod int;
	DECLARE Terminado int DEFAULT 0;
	DECLARE curClientes CURSOR FOR
	SELECT CodigoCliente FROM Clientes;
	DECLARE CONTINUE HANDLER FOR SQLSTATE "02000" SET Terminado = 1;
	DECLARE EXIT HANDLER FOR NOT FOUND rollback;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION rollback;
	
	OPEN curClientes;
	START TRANSACTION;
	FETCH curClientes INTO cod;
	WHILE Terminado = 0 DO
			FETCH curClientes INTO cod;
			SELECT CONCAT(NombreContacto,"_",ApellidoContacto) INTO @User
			FROM Clientes 
			WHERE CodigoCliente = cod;

			SELECT CodigoCliente INTO @CodigoCliente
			FROM Clientes 
			WHERE CodigoCliente = cod;

			SELECT concat(CodigoCliente,Ciudad,Pais,CodigoPostal) INTO @Pass
			FROM Clientes
			WHERE CodigoCliente = cod;

			INSERT INTO ClienteLogin
			VALUES(@User,@Pass,@CodigoCliente);

			SELECT cod;
			FETCH curClientes INTO cod;
	END WHILE;
	COMMIT;
END//
DELIMITER ;