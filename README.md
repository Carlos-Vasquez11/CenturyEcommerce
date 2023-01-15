# CenturyEcommerce
Web Application. Ecommerce.


## Structure of the project
· centuryFrontEnd: is the front developed in Angular  
· ecommerce: is the API developed in Spring with JAVA

## Deployment in localhost

1. Clone this repository
2. You need to schema of the DB in MySQL (The tables are not necessary)
3. open "ecommerce" > src > main > resources > application.properties and update the property "spring.data.source.url" with your DB's route
4. Just compile the project and the API is going to work properly in the port 8080
5. open "centuryFrontEnd" with Visual Studio Code
6. put "ng server" in the console and the app is going to be running in the port 4200

----

### Quick product
Here you have a product to add to your DB with MySQL. You also can add products using the API.

INSERT INTO producto_base VALUES (1, 'Argentina national team shirt before becoming champions in the 2022 World Cup', 'Argentina soccer team shirt', 7000, 1000);  
INSERT INTO area_personalizacion(aper_id, aper_lugar, prodb_id) VALUES (1, 'frente' , 1);  
INSERT INTO producto VALUES (1, 'https://drive.google.com/uc?export=view&id=1r7K5f7RoBw2RAe7_tREwS8Hz8i4NbtSe', 1);  
INSERT INTO personalizacion(pers_id, aper_id, pers_texto, pers_nombre, pers_precio, prod_id) 
	VALUES (1, 1, 'albiceleste colors', 'colors', 3000, 1);  
INSERT INTO tienda VALUES(1, 'ShirtsShop', 'https://drive.google.com/uc?export=view&id=1Gq_Osv4KtRfl_jC6NKvo-kHA8k8by7zA');  
INSERT INTO publicacion VALUES (1, true, 11, 1, 1);  
INSERT INTO vendedor VALUES(1, 'Max', 1);  
INSERT INTO medio_pago VALUES(1, '0000111252850042', 'MercadoPago', 1);  
INSERT INTO usuario VALUES(1,'123456','correo1@dominio.com');  
INSERT INTO compra VALUES(1,1);  
INSERT INTO item VALUES(1, 5, 1, 1);  
