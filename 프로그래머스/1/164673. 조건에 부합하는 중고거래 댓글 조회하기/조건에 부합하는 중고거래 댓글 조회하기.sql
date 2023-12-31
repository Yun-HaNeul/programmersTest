-- 코드를 입력하세요
SELECT  UGB.TITLE,
        UGB.BOARD_ID,
        UGR.REPLY_ID,
        UGR.WRITER_ID,
        UGR.CONTENTS,
        TO_CHAR(UGR.CREATED_DATE,'yyyy-MM-dd') AS CREATED_DATE
FROM    USED_GOODS_BOARD UGB
    JOIN    USED_GOODS_REPLY UGR ON UGB.BOARD_ID = UGR.BOARD_ID
WHERE   TO_CHAR(UGB.CREATED_DATE,'yyyy-MM') = '2022-10'
ORDER BY    UGR.CREATED_DATE, UGB.TITLE;