-- this is the dir for sql files of your project.

drop table if exists t_user;
create table t_user (
  user_id     varchar(32) not null comment '用户id',
  user_name   varchar(32) not null comment '用户名',
  password    varchar(64) not null comment '用户密码',
  email       varchar(32) comment '邮箱',
  id_card     varchar(18) comment '身份证号',
  phone_num   varchar(11) comment '手机号',
  birthday    varchar(10) comment '生日',
  create_time timestamp   not null default current_timestamp comment '记录插入时间',
  update_time datetime    on update current_timestamp comment '记录修改时间',
  primary key (user_id),
  unique key uk_t_user_name (user_name),
  unique key uk_t_user_email (email)
) engine = innodb comment '用户表';