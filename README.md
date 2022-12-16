# meaty-flock-6305


Tables 

mysql> desc infoaccountant;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| ename | varchar(20) | YES  |     | NULL    |       |
| email | varchar(25) | YES  |     | NULL    |       |
| epass | varchar(20) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> desc infocustomer;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| cname | varchar(20) | YES  |     | NULL    |                |
| cmail | varchar(25) | YES  |     | NULL    |                |
| cpass | varchar(20) | YES  |     | NULL    |                |
| cmob  | varchar(10) | YES  |     | NULL    |                |
| cadd  | varchar(20) | YES  |     | NULL    |                |
| cid   | int         | NO   | PRI | NULL    | auto_increment |
+-------+-------------+------+-----+---------+----------------+
6 rows in set (0.01 sec)

mysql> create table Transaction(cACno bigint not null,deposit int not null,withdraw int not null,foreign key(cACno) references Account(cACno) on delete cascade);
Query OK, 0 rows affected (0.08 sec)

mysql> create table Transaction(cACno bigint not null,deposit int not null,withdraw int not null,foreign key(cACno) references Account(cACno) on delete cascade);

mysql> show tables;
+------------------------+
| Tables_in_projectsb101 |
+------------------------+
| account                |
| infoaccountant         |
| infocustomer           |
| transaction            |
+------------------------+
4 rows in set (0.04 sec)

mysql> insert into InfoAccountant values('Mustafeez','mus@gmail.com','1234');
Query OK, 1 row affected (0.12 sec)

mysql> select*from infoaccountant;
+-----------+---------------+-------+
| ename     | email         | epass |
+-----------+---------------+-------+
| Mustafeez | mus@gmail.com | 1234  |
+-----------+---------------+-------+
1 row in set (0.04 sec)
