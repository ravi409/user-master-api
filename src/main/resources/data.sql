--Usermaster Data
insert into user_master (user_master_id,user_id,user_name,keyclock_id,email_id) values (101,'vijay123','vijay','abcxyz123456789','vijay@gmail.com');
insert into user_master (user_master_id,user_id,user_name,keyclock_id,email_id) values (102,'kumar123','kumar','stuvwyx123456789','kumar@gmail.com');


--CMSRoles
insert into cms_role(role_id,role_name) values(5001,'STORAGE_ADMIN');
insert into cms_role(role_id,role_name) values(5002,'STORAGE_VIEW');
insert into cms_role(role_id,role_name) values(5003,'STORAGE_EDIT');
insert into cms_role(role_id,role_name) values(5004,'ACTIVITY_ADMIN');
insert into cms_role(role_id,role_name) values(5005,'ACTIVITY_VIEW');
insert into cms_role(role_id,role_name) values(5006,'ACTIVITY_EDIT');

--Role Permissions
insert into permission(permission_id,permission_name) values( 231201,'STORAGE_ADMIN_PERM');
insert into permission(permission_id,permission_name) values( 231202,'STORAGE_EDIT_PERM');
insert into permission(permission_id,permission_name) values( 231203,'STORAGE_VIEW_PERM');
insert into permission(permission_id,permission_name) values( 231204,'ACTIVITY_ADMIN_PERM');
insert into permission(permission_id,permission_name) values( 231205,'ACTIVITY_EDIT_PERM');
insert into permission(permission_id,permission_name) values( 231206,'ACTIVITY_VIEW_PERM');

--Usermaster Role Association
insert into user_master_role(user_master_id,role_id) values (101,5003);
insert into user_master_role(user_master_id,role_id) values (101,5004);
insert into user_master_role(user_master_id,role_id) values (102,5003);

--Role Permission Association
insert into cms_role_permission(role_id,permission_id) values(5001,231201);
insert into cms_role_permission(role_id,permission_id) values(5001,231202);
insert into cms_role_permission(role_id,permission_id) values(5001,231203);
insert into cms_role_permission(role_id,permission_id) values(5002,231202);
insert into cms_role_permission(role_id,permission_id) values(5002,231203);
insert into cms_role_permission(role_id,permission_id) values(5003,231203);

insert into cms_role_permission(role_id,permission_id) values(5004,231204);
insert into cms_role_permission(role_id,permission_id) values(5004,231205);
insert into cms_role_permission(role_id,permission_id) values(5004,231206);
insert into cms_role_permission(role_id,permission_id) values(5005,231205);
insert into cms_role_permission(role_id,permission_id) values(5005,231206);
insert into cms_role_permission(role_id,permission_id) values(5006,231206);
