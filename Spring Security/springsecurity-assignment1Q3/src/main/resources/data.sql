INSERT into users(username,password,enabled)
values ('user','pass',true);

INSERT into users(username,password,enabled)
values ('admin','apass',true);

INSERT into authorities(username,authority)
values ('user','ROLE_USER');

INSERT into authorities(username,authority)
values ('admin','ROLE_ADMIN');