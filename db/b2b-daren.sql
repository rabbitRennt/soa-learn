drop table if exists TALENT_BANK;

drop table if exists TALENT_GAINS;

drop table if exists TALENT_LEVEL;

drop table if exists TALENT_PRIZES;

drop table if exists TALENT_SCALE;

drop table if exists TALENT_USER;

/*==============================================================*/
/* Table: TALENT_BANK                                           */
/*==============================================================*/
create table TALENT_BANK
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   BANK_NAME            varchar(100) not null comment '����',
   BANK_MOBILE          varchar(32) not null comment '�ֻ���',
   ID_CARD              varchar(32) not null comment '���֤����',
   BANK_TYPE            int(1) not null comment '��������',
   BANK_NO              varchar(100) not null comment '���п���',
   DELETE_FLAG          int(1) default 0 comment 'ɾ�����@0����Ч���� 1����Ч����',
   CREATE_TIME          datetime not null comment '����ʱ��',
   UPDATE_TIME          timestamp comment '�޸�ʱ��',
   primary key (ID)
);

alter table TALENT_BANK comment '��ó����������Ϣ';

/*==============================================================*/
/* Table: TALENT_GAINS                                          */
/*==============================================================*/
create table TALENT_GAINS
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   ORDER_NO             bigint(18) comment '��������',
   GOODS_NAME           bigint(18) comment '��Ʒ����',
   REFERRAL_CODE        varchar(32) not null comment '�Ƽ���',
   TALENT_USER_ID       bigint(18) comment '�û�ID',
   BUYER_NAME           varchar(100) comment '������',
   SELLER_NAME          varchar(100) comment '��������',
   ORDER_TIME           datetime comment '����ʱ��',
   ORDER_UNIT           int(8) comment '���۵�λ',
   SCALE_TOTAL          int(8) comment '����',
   SCALE_BALANCE        bigint(18) comment '���۶�',
   GAINS_BALANCE        bigint(18) comment '������',
   CREATE_TIME          datetime comment '����ʱ��',
   UPDATE_TIME          timestamp comment '�޸�ʱ��',
   primary key (ID)
);

alter table TALENT_GAINS comment '��ó��������';

/*==============================================================*/
/* Table: TALENT_LEVEL                                          */
/*==============================================================*/
create table TALENT_LEVEL
(
   ID                   bigint(18) not null auto_increment,
   SCALE_ID             bigint(18) not null comment '����ID',
   LEVEL                int(2) not null comment '����',
   VALUE                varchar(32) not null comment 'ֵ',
   RANGE_START          varchar(32) comment '��ʼ��Χ',
   RANGE_END            varchar(32) comment '������Χ',
   CREATE_TIME          datetime comment '����ʱ��',
   UPDATE_TIME          timestamp comment '�޸�ʱ��',
   DELETE_FLAG          int(1) default 0 comment '0:��Ч 1����Ч',
   primary key (ID)
);

alter table TALENT_LEVEL comment '�����������';

/*==============================================================*/
/* Table: TALENT_PRIZES                                         */
/*==============================================================*/
create table TALENT_PRIZES
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   TALENT_USER_ID       bigint(18) comment '��ó����ID',
   MONTH_NUM            int(2) comment '����',
   STATUS               int(1) comment '0����� 1��ȡ��   2��Υ��',
   REMARK               varchar(2000) comment '��ע',
   CREATE_TIME          datetime not null comment '����ʱ��-ע��ʱ��',
   UPDATE_TIME          timestamp comment '�޸�ʱ��',
   MONEY                decimal(10,4) comment '���',
   primary key (ID)
);

/*==============================================================*/
/* Table: TALENT_SCALE                                          */
/*==============================================================*/
create table TALENT_SCALE
(
   ID                   bigint(18) not null auto_increment,
   INDUSTRY_ID          int(8) not null comment 'Ʒ�� -��ҵID',
   CATE_ID              int(8) not null comment '����',
   SOURCE_TYPE          int(1) not null comment '0�����۶� 1��������',
   SCALE_TYPE           int(1) not null comment '0�� ���� 1�����',
   CREATE_TIME          datetime not null comment '����ʱ��',
   UPDATE_TIME          timestamp comment '�޸�ʱ��',
   DELETE_FLAG          int(1) default 0 comment 'ɾ�����@0����Ч���� 1����Ч����',
   primary key (ID)
);

alter table TALENT_SCALE comment '��������';

/*==============================================================*/
/* Table: TALENT_USER                                           */
/*==============================================================*/
create table TALENT_USER
(
   ID                   bigint(18) not null auto_increment comment 'ID',
   NAME                 varchar(100) not null comment '��ó��������',
   MOBILE               varchar(32) not null comment '��ó�����ֻ���',
   ID_CARD              varchar(32) not null comment '���֤��',
   PRODUCT              int(8) comment '�ó�Ʒ��',
   REFERRAL_CODE        varchar(32) not null comment '�Ƽ���',
   PARENT_ID            bigint(18) not null comment '�ϼ�ID',
   USER_ID              bigint(18) not null comment '�����û�ID',
   INDUSTRY_ID          bigint(18) comment '��ҵID',
   STATUS               int(1) comment '״̬@0:���� 1:ͣ��',
   NO_TIME              datetime comment 'ͣ��ʱ��',
   OPEN_TIME            datetime comment '����ʱ��',
   CREATE_TIME          datetime not null comment '����ʱ��-ע��ʱ��',
   UPDATE_TIME          timestamp comment '�޸�ʱ��',
   REMART               varchar(255) comment '����',
   USER_TYPE            int(1) comment '�û�����',
   USERNAME             varchar(32) default '0' comment '�û���',
   PASSWORD             varchar(32) comment '����',
   primary key (ID)
);

alter table TALENT_USER comment '��ó�����û���';
