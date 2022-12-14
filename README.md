# meaty-flock-6305


Tables 

ysql> desc customer;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| ccid     | int         | NO   | PRI | NULL    |       |
| cname    | varchar(12) | YES  |     | NULL    |       |
| caddress | varchar(12) | YES  |     | NULL    |       |
| cemail   | varchar(15) | YES  | UNI | NULL    |       |
| cpass    | varchar(12) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
5 rows in set (0.02 sec)

mysql> desc customeraccount;
+--------+------+------+-----+---------+-------+
| Field  | Type | Null | Key | Default | Extra |
+--------+------+------+-----+---------+-------+
| ccid   | int  | YES  | MUL | NULL    |       |
| tactno | int  | YES  | MUL | NULL    |       |
+--------+------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> desc account;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| tactno  | int         | NO   | PRI | NULL    |       |
| tbal    | int         | YES  |     | NULL    |       |
| tbranch | varchar(12) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)
