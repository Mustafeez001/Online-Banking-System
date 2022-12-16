# meaty-flock-6305


Tables 

mysql> desc accountant;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| email | varchar(20) | YES  | UNI | NULL    |       |
| pass  | int         | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.04 sec)

mysql> desc customer;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| name  | varchar(20) | YES  |     | NULL    |       |
| email | varchar(20) | YES  | UNI | NULL    |       |
| pass  | int         | YES  |     | NULL    |       |
| bal   | int         | YES  |     | NULL    |       |
| actNo | int         | NO   | PRI | NULL    |       |
+-------+-------------+------+-----+---------+-------+
5 rows in set (0.01 sec)

mysql> desc data;
+---------+------+------+-----+---------+-------+
| Field   | Type | Null | Key | Default | Extra |
+---------+------+------+-----+---------+-------+
| custAct | int  | YES  | MUL | NULL    |       |
| bal     | int  | YES  |     | NULL    |       |
+---------+------+------+-----+---------+-------+
2 rows in set (0.01 sec)

mysql>
