Insert into users(username, password, enabled) values('user','upass','true');
Insert into users(username, password, enabled) values('admin','apass','true');


Insert into authorities(username, authority) values('user','ROLE_USER');
Insert into authorities(username, authority) values('admin','ROLE_ADMIN');
