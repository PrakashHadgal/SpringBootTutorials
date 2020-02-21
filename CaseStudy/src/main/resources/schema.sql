DROP TABLE IF EXISTS CATEGORIES;
create table CATEGORIES (catId int, catname varchar(50));
insert into categories values(1001,'Pants');
insert into categories values(1002,'Shirts');
insert into categories values(1003,'Socks');
insert into categories values(1004,'Caps');

DROP TABLE IF EXISTS products;
create table products(producttId int, productname varchar(50), size int, brand varchar(50), price number(5,2), color varchar(20), sku int, availproductseller int , catId int);
insert into products values(2001, 'Pants1', 32, 'Raymond', 255.25, 'Green', 50, 45, 1001);
insert into products values(2001, 'Pants2', 32, 'Raymond', 255.25, 'Green', 50, 45, 1001);
insert into products values(2001, 'Pants3', 45, 'Syrams', 568.58, 'Red', 84, 76, 1001);
insert into products values(2001, 'Shirts1', 25, 'Raymond', 154.48, 'Blue', 48, 41, 1002);
insert into products values(2001, 'Shirts2', 50, 'Syrams', 259.54, 'Orange', 69, 67, 1002);




