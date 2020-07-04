
/*==============================================================*/
/* Table: address                                               */
/*==============================================================*/
create table address 
(
   add_id               numeric                        not null,
   user_id              numeric                        null,
   add_pro              varchar(20)                    not null,
   add_city             varchar(30)                    not null,
   add_area             varchar(40)                    not null,
   add_detail           varchar(100)                   not null,
   add_name             varchar(20)                    not null,
   add_phone            varchar(20)                    not null,
   constraint PK_ADDRESS primary key (add_id)
);

/*==============================================================*/
/* Index: address_PK                                            */
/*==============================================================*/
create unique index address_PK on address (
add_id ASC
);

/*==============================================================*/
/* Index: Relationship_2_FK                                     */
/*==============================================================*/
create index Relationship_2_FK on address (
user_id ASC
);

/*==============================================================*/
/* Table: coupon                                                */
/*==============================================================*/
create table coupon 
(
   coupon_id            numeric                        not null,
   coupon_youhui        numeric                        not null,
   coupon_list_num      numeric                        not null,
   coupon_time_start    timestamp                      not null,
   coupon_time_finish   timestamp                      null,
   constraint PK_COUPON primary key (coupon_id)
);

/*==============================================================*/
/* Index: coupon_PK                                             */
/*==============================================================*/
create unique index coupon_PK on coupon (
coupon_id ASC
);

/*==============================================================*/
/* Table: coupon_holding                                        */
/*==============================================================*/
create table coupon_holding 
(
   shop_id              numeric                        not null,
   user_id              numeric                        not null,
   coupon_id            numeric                        not null,
   quantity             numeric                        null,
   closingDate          timestamp                      null,
   youhui               numeric                        null,
   constraint PK_COUPON_HOLDING primary key clustered (shop_id, user_id, coupon_id)
);



/*==============================================================*/
/* Index: coupon_holding_FK                                     */
/*==============================================================*/
create index coupon_holding_FK on coupon_holding (
shop_id ASC
);

/*==============================================================*/
/* Index: coupon_holding2_FK                                    */
/*==============================================================*/
create index coupon_holding2_FK on coupon_holding (
user_id ASC
);

/*==============================================================*/
/* Index: coupon_holding3_FK                                    */
/*==============================================================*/
create index coupon_holding3_FK on coupon_holding (
coupon_id ASC
);

/*==============================================================*/
/* Table: goods                                                 */
/*==============================================================*/
create table goods 
(
   goods_id             numeric                        not null,
   order_id             numeric                        null,
   goods_name           varchar(50)                    not null,
   goods_price          numeric                        not null,
   goods_youhui         numeric                        not null,
   constraint PK_GOODS primary key (goods_id)
);

/*==============================================================*/
/* Index: goods_PK                                              */
/*==============================================================*/
create unique index goods_PK on goods (
goods_id ASC
);

/*==============================================================*/
/* Index: Relationship_3_FK                                     */
/*==============================================================*/
create index Relationship_3_FK on goods (
order_id ASC
);

/*==============================================================*/
/* Table: goods_evaluation                                      */
/*==============================================================*/
create table goods_evaluation 
(
   shop_id              numeric                        not null,
   goods_id             numeric                        not null,
   user_id              numeric                        not null,
   evalution            varchar(20)                    null,
   evalution_time       timestamp                      null,
   phtot                varchar(500)                   null,
   constraint PK_GOODS_EVALUATION primary key clustered (shop_id, goods_id, user_id)
);



/*==============================================================*/
/* Index: goods_evaluation_FK                                   */
/*==============================================================*/
create index goods_evaluation_FK on goods_evaluation (
shop_id ASC
);

/*==============================================================*/
/* Index: goods_evaluation2_FK                                  */
/*==============================================================*/
create index goods_evaluation2_FK on goods_evaluation (
goods_id ASC
);

/*==============================================================*/
/* Index: goods_evaluation3_FK                                  */
/*==============================================================*/
create index goods_evaluation3_FK on goods_evaluation (
user_id ASC
);

/*==============================================================*/
/* Table: mj                                                    */
/*==============================================================*/
create table mj 
(
   mj_id                numeric                        not null,
   mj_money             numeric                        not null,
   mj_youhui            numeric                        not null,
   mj_FlagCoupon        smallint                       not null,
   constraint PK_MJ primary key (mj_id)
);

/*==============================================================*/
/* Index: mj_PK                                                 */
/*==============================================================*/
create unique index mj_PK on mj (
mj_id ASC
);

/*==============================================================*/
/* Table: myuser                                                */
/*==============================================================*/
create table myuser 
(
   user_id              numeric                        not null,
   user_name            varchar(20)                    not null,
   user_sex             varchar(10)                    not null,
   user_pwd             varchar(10)                    not null,
   user_phone           varchar(20)                    not null,
   user_email           varchar(30)                    not null,
   user_city            varchar(30)                    not null,
   user_rigister_time   timestamp                      not null,
   user_VIP             smallint                       not null,
   user_VIP_time        timestamp                      null,
   constraint PK_MYUSER primary key (user_id)
);

/*==============================================================*/
/* Index: myuser_PK                                             */
/*==============================================================*/
create unique index myuser_PK on myuser (
user_id ASC
);

/*==============================================================*/
/* Table: order1                                               */
/*==============================================================*/
create table order1
(
   order_id             numeric                        not null,
   order_sum            numeric                        not null,
   order_price          numeric                        not null,
   order_disconut       numeric                        not null,
   constraint PK_ORDER primary key (order_id)
);

/*==============================================================*/
/* Index: order_PK                                              */
/*==============================================================*/
create unique index order_PK on order1 (
order_id ASC
);

/*==============================================================*/
/* Table: orders_coupons                                        */
/*==============================================================*/
create table orders_coupons 
(
   shop_id              numeric                        not null,
   user_id              numeric                        not null,
   coupon_id            numeric                        not null,
   need_order           numeric                        not null,
   left_order           numeric                        not null,
   constraint PK_ORDERS_COUPONS primary key clustered (shop_id, user_id, coupon_id)
);


/*==============================================================*/
/* Index: orders_coupons_FK                                     */
/*==============================================================*/
create index orders_coupons_FK on orders_coupons (
shop_id ASC
);

/*==============================================================*/
/* Index: orders_coupons2_FK                                    */
/*==============================================================*/
create index orders_coupons2_FK on orders_coupons (
user_id ASC
);

/*==============================================================*/
/* Index: orders_coupons3_FK                                    */
/*==============================================================*/
create index orders_coupons3_FK on orders_coupons (
coupon_id ASC
);

/*==============================================================*/
/* Table: rider                                                 */
/*==============================================================*/
create table rider 
(
   rider_id             numeric                        not null,
   rider_name           varchar(20)                    not null,
   rider_status         varchar(50)                    not null,
   rider_time           timestamp                      not null,
   constraint PK_RIDER primary key (rider_id)
);

/*==============================================================*/
/* Index: rider_PK                                              */
/*==============================================================*/
create unique index rider_PK on rider (
rider_id ASC
);

/*==============================================================*/
/* Table: rider_entry                                           */
/*==============================================================*/
create table rider_entry 
(
   rider_id             numeric                        not null,
   add_id               numeric                        not null,
   time1                timestamp                      null,
   rider_evalution      varchar(200)                   null,
   constraint PK_RIDER_ENTRY primary key clustered (rider_id, add_id)
);


/*==============================================================*/
/* Index: rider_entry_FK                                      */
/*==============================================================*/
create index rider_entry_FK on rider_entry (
rider_id ASC
);

/*==============================================================*/
/* Index: rider_entry2_FK"                                     */
/*==============================================================*/
create index rider_entry2_FK on rider_entry (
add_id ASC
);

/*==============================================================*/
/* Table: shop                                                  */
/*==============================================================*/
create table shop 
(
   shop_id              numeric                        not null,
   shop_name            varchar(50)                    not null,
   shop_star            numeric                        not null,
   shop_perConsume      numeric                        not null,
   shop_total           numeric                        not null,
   constraint PK_SHOP primary key (shop_id)
);

/*==============================================================*/
/* Index: shop_PK                                               */
/*==============================================================*/
create unique index shop_PK on shop (
shop_id ASC
);

/*==============================================================*/
/* Table: shop_order                                            */
/*==============================================================*/
create table shop_order 
(
   coupon_id            numeric                        not null,
   shop_id              numeric                        not null,
   mj_id                numeric                        not null,
   user_id              numeric                        not null,
   add_id               numeric                        not null,
   order_id             numeric                        not null,
   rider_id             numeric                        not null,
   so_old_money         numeric                        not null,
   so_new_money         numeric                        null,
   so_order_time        timestamp                      null,
   so_intime            timestamp                      null,
   so_state             varchar(30)                    null,
   constraint PK_SHOP_ORDER primary key clustered (coupon_id, shop_id, mj_id, user_id, add_id, order_id, rider_id)
);


/*==============================================================*/
/* Index: shop_order_FK                                         */
/*==============================================================*/
create index shop_order_FK on shop_order (
coupon_id ASC
);

/*==============================================================*/
/* Index: shop_order2_FK                                        */
/*==============================================================*/
create index shop_order2_FK on shop_order (
shop_id ASC
);

/*==============================================================*/
/* Index: shop_order3_FK                                        */
/*==============================================================*/
create index shop_order3_FK on shop_order (
mj_id ASC
);

/*==============================================================*/
/* Index: shop_order4_FK                                        */
/*==============================================================*/
create index shop_order4_FK on shop_order (
user_id ASC
);

/*==============================================================*/
/* Index: shop_order5_FK                                        */
/*==============================================================*/
create index shop_order5_FK on shop_order (
add_id ASC
);

/*==============================================================*/
/* Index: shop_order6_FK                                        */
/*==============================================================*/
create index shop_order6_FK on shop_order (
order_id ASC
);

/*==============================================================*/
/* Index: shop_order7_FK                                        */
/*==============================================================*/
create index shop_order7_FK on shop_order (
rider_id ASC
);

/*==============================================================*/
/* Table: sort                                                  */
/*==============================================================*/
create table sort 
(
   sort_id              numeric                        not null,
   goods_id             numeric                        null,
   sort_name            varchar(50)                    not null,
   sort_num             numeric                        not null,
   constraint PK_SORT primary key (sort_id)
);

/*==============================================================*/
/* Index: sort_PK                                               */
/*==============================================================*/
create unique index sort_PK on sort (
sort_id ASC
);

/*==============================================================*/
/* Index: Relationship_1_FK                                     */
/*==============================================================*/
create index Relationship_1_FK on sort (
goods_id ASC
);

/*==============================================================*/
/* Table: staff                                                 */
/*==============================================================*/
create table staff 
(
   staff_id             numeric                        not null,
   staff_name           varchar(30)                    not null,
   staff_pwd            varchar(30)                    not null,
   constraint PK_STAFF primary key (staff_id)
);

/*==============================================================*/
/* Index: staff_PK                                              */
/*==============================================================*/
create unique index staff_PK on staff (
staff_id ASC
);

alter table address
   add constraint FK_ADDRESS_RELATIONS_MYUSER foreign key (user_id)
      references myuser (user_id)
      on update restrict
      on delete restrict;

alter table coupon_holding
   add constraint FK_COUPON_H_COUPON_HO_SHOP foreign key (shop_id)
      references shop (shop_id)
      on update restrict
      on delete restrict;

alter table coupon_holding
   add constraint FK_COUPON_H_COUPON_HO_MYUSER foreign key (user_id)
      references myuser (user_id)
      on update restrict
      on delete restrict;

alter table coupon_holding
   add constraint FK_COUPON_H_COUPON_HO_COUPON foreign key (coupon_id)
      references coupon (coupon_id)
      on update restrict
      on delete restrict;

alter table goods
   add constraint FK_GOODS_RELATIONS_ORDER foreign key (order_id)
      references order1 (order_id)
      on update restrict
      on delete restrict;

alter table goods_evaluation
   add constraint FK_GOODS_EV_GOODS_EVA_SHOP foreign key (shop_id)
      references shop (shop_id)
      on update restrict
      on delete restrict;

alter table goods_evaluation
   add constraint FK_GOODS_EV_GOODS_EVA_GOODS foreign key (goods_id)
      references goods (goods_id)
      on update restrict
      on delete restrict;

alter table goods_evaluation
   add constraint FK_GOODS_EV_GOODS_EVA_MYUSER foreign key (user_id)
      references myuser (user_id)
      on update restrict
      on delete restrict;

alter table orders_coupons
   add constraint FK_ORDERS_C_ORDERS_CO_SHOP foreign key (shop_id)
      references shop (shop_id)
      on update restrict
      on delete restrict;

alter table orders_coupons
   add constraint FK_ORDERS_C_ORDERS_CO_MYUSER foreign key (user_id)
      references myuser (user_id)
      on update restrict
      on delete restrict;

alter table orders_coupons
   add constraint FK_ORDERS_C_ORDERS_CO_COUPON foreign key (coupon_id)
      references coupon (coupon_id)
      on update restrict
      on delete restrict;

alter table rider_entry
   add constraint FK_RIDER_EN_RIDER_ENT_RIDER foreign key (rider_id)
      references rider (rider_id)
      on update restrict
      on delete restrict;

alter table rider_entry
   add constraint FK_RIDER_EN_RIDER_ENT_ADDRESS foreign key (add_id)
      references address (add_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_COUPON foreign key (coupon_id)
      references coupon (coupon_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_SHOP foreign key (shop_id)
      references shop (shop_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_MJ foreign key (mj_id)
      references mj (mj_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_MYUSER foreign key (user_id)
      references myuser (user_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_ADDRESS foreign key (add_id)
      references address (add_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_ORDER foreign key (order_id)
      references order1 (order_id)
      on update restrict
      on delete restrict;

alter table shop_order
   add constraint FK_SHOP_ORD_SHOP_ORDE_RIDER foreign key (rider_id)
      references rider (rider_id)
      on update restrict
      on delete restrict;

alter table sort
   add constraint FK_SORT_RELATIONS_GOODS foreign key (goods_id)
      references goods (goods_id)
      on update restrict
      on delete restrict;

