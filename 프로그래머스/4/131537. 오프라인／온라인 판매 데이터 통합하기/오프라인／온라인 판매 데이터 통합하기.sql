SELECT  TO_CHAR(SALES_DATE , 'YYYY-MM-DD') AS SALES_DATE,
        PRODUCT_ID,
        USER_ID, 
        SALES_AMOUNT
FROM
        (SELECT SALES_DATE, 
                PRODUCT_ID, 
                USER_ID,
                SALES_AMOUNT
         FROM ONLINE_SALE
         union
         SELECT SALES_DATE,
                PRODUCT_ID, 
                null USER_ID,
                SALES_AMOUNT 
         FROM OFFLINE_SALE) --NULL 생성하는 열 함수
WHERE TO_CHAR(SALES_DATE , 'YYYY-MM') ='2022-03'
ORDER BY SALES_DATE ASC , PRODUCT_ID ASC , USER_ID ASC