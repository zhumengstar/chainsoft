SELECT * FROM  student WHERE claid=(SELECT 
clsId FROM student WHERE stuname='路帅')； /*--路帅班级编号；*/
SELECT * FROM  student WHERE claid IN(SELECT 
clsId FROM student WHERE stuname='路帅')；

/* 增、删、改、查 */
INSERT INTO usertable(userid,useraccount,userpass) VALUES(1,'wm001','wm001123456');

/** 查询wm001 的所有的订单 订单编号，订单下单日期 
    以及订单中的所有商品名称，单价 信息进行显示 */
    
/* 用户表 ， ordertable  producttable   orderprotable  */
SELECT  res.* FROM  (SELECT  ortb.userid,ortb.orderid,ortb.orderddate , 
pro.proname,proPrice  FROM  ordertable 
 ortb INNER JOIN orderprotabale odpr USING (orderid)  
 INNER JOIN producttable pro USING(proid) ) res  WHERE res.userid=
 (SELECT userid FROM usertable WHERE useraccount='wm001');  
 
 /*select 列(当sql语句中出现group by  此处列只能出现 
 组函数和分组列) from tabls。。 where 条件  group by (列s)  having 组函数条件   order BY  */
 
/** DELETE FROM  TABLE WHERE CONDS;*/
/** UPDATE  table set 列1=列值。。。 where cods  */
 
 
