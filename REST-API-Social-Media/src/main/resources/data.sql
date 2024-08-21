insert into user_details(id, name, birth_date) values(10001, 'SaiKiran', current_date());
insert into user_details(id, name, birth_date) values(10002, 'Ranga', current_date());
insert into user_details(id, name, birth_date) values(10003, 'Ravi', current_date());

insert into post(id, description, user_id) values(20001, 'I want to learn AWS', 10001);
insert into post(id, description, user_id) values(20002, 'I want to learn DevOps', 10002);
insert into post(id, description, user_id) values(20003, 'I want to get AWS certified', 10002);
insert into post(id, description, user_id) values(20004, 'I want to learn spring boot', 10003);