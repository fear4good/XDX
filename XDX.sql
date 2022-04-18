DROP TABLE IF exists customers;
DROP TABLE IF exists Business;
drop table if exists Premiumpelates;
drop table if exists orders;
drop table if exists products;
drop table if exists offers;
drop table if exists favouriteProduct;
drop table if exists ordersHistoryList;
drop table if exists orderdetail;
drop table if exists Rating;

create table customers(
customerId int(5) not null auto_increment PRIMARY KEY,
username varchar(18) NOT NULL ,
password varchar(18) NOT NULL ,
email varchar(255) NOT NULL,
phonenumber varchar(10)  NOT NULL,
Address varchar(50) NOT NULL,
Member ENUM('Free','Premium','Business')
);

create table  Business(
Id int(5) not null auto_increment PRIMARY KEY,
email  varchar(50) NOT NULL,
username varchar(18) NOT NULL,
password varchar(18) NOT NULL,
phonenumber varchar(10)  NOT NULL,
Address varchar(50) NOT NULL,
Member ENUM('Business')
);

create table products(
market_id int,
productid int not null auto_increment not null primary key ,
ProductName varchar(255) NOT NULL,
cost double,
quantity int
references Business(Id)
on update cascade on delete cascade
);

create table Premiumpelates(
customerId int,
customeremail varchar(255) NOT NULL,
points INT
);

CREATE TABLE favouriteProduct(
fmarketName varchar(30) not null,
fCustomerId int ,
fproductName VARCHAR(100) not null,
fproductid int 
);



create table orders(
businessid int not null,
orderid int not null auto_increment PRIMARY KEY,
customeremail varchar(50) NOT NULL ,
customerName varchar(20) not null,
cost double,
orderDate date
);

create table orderdetail(
orderid int ,
Name varchar(255) not null,
quantity float,
cost double
references orders(orderid)
on update cascade on delete cascade
);

create table ordersHistoryList(
customerEmail varchar(100) not null,
buyListDate date,
orderId int primary key
);



create table offers(
market_id int,
ProductName varchar(255) NOT NULL ,
discount int,
quantity int,
cost double,
newcost double,
FOREIGN KEY (ProductName) 
references products (ProductName)
on update cascade on delete cascade
);

create table rating(
market_id int,
customer_email varchar(50),
rating double,
avg_rate double,
Description text
);

INSERT INTO customers VALUES
(null,'Vasiliki','vasiliki99','Vasiliki99@gmail.com',6940322311,'zaimi 12','Premium'),
(null,'Xristos','Xristos98','Xristos98@gmail.com',6940322315,'norma 10','Free'),
(null,'Efrem','Efrem98','Efrem98@gmail.com',6940322313,'karolou 2','Premium');


insert into Business values
(null,'Sklavenitis@gmail.com','Sklavenitis','Sklavenitis98',6933432990,'mourouzi 20','Business'),
(null,'Mymarket@gmail.com.com','MyMarket','MyMarket22',6925432990,'aratou 20','Business');

insert into products values
(1,null,'milk',1.80,30),
(1,null,'flour',2,5),
(1,null,'Honey',4.2,15),
(2,null,'Water *6',1.5,5),
(2,null,'Spaghetti',0.8,55),
(1,null,'Biscuits',1.8,32);


insert into offers values
(1,'flour',50,5,2,1);


insert into orders values
(1,null,'Vasiliki99@gmail.com','Vasiliki',12,null),
(2,null,'Xristos98@gmail.com','Xristos',4.6,null);




insert into orderdetail values
(1,'milk',2,3.6),
(1,'Honey',2,8.4),
(2,'Water *6',2,3),
(2,'Spaghetti',2,1.6);

insert into Premiumpelates values
(1,'Vasiliki99@gmail.com',1000);

insert into favouriteProduct values
('Sklavenitis',1,'milk',1);

insert into rating values
(1,'Vasiliki99@gmail.com',5,4.5,''),
(1,'Efrem98@gmail.com',4,4.5,''),
(2,'Vasiliki99@gmail.com',5,5,'');

select * from customers;

select * from products;
