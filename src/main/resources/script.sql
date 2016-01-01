CREATE TABLE bank (
  BANK_ID NUMBER(20) NOT NULL,
  NAME varchar2(100) NOT NULL,
  ADDRESS_LINE_1 varchar2(100) NOT NULL,
  ADDRESS_LINE_2 varchar2(100) NOT NULL,
  CITY varchar2(100) NOT NULL,
  STATE varchar2(2) NOT NULL,
  ZIP_CODE varchar(5) NOT NULL,
  IS_INTERNATIONAL NUMBER(1) NOT NULL,
  LAST_UPDATED_BY varchar2(45) NOT NULL,
  LAST_UPDATED_DATE DATE NOT NULL,
  CREATED_BY varchar2(45) NOT NULL,
  CREATED_DATE DATE NOT NULL,
  ADDRESS_TYPE varchar2(45) DEFAULT NULL,
  PRIMARY KEY (BANK_ID)
);

INSERT INTO bank VALUES (1,'Second National Trust','301 Snowy Lane','Suite 2','Adams','PA','10003',0,'system',sysdate,'system',sysdate,'PRIMARY');
INSERT INTO bank VALUES (2,'Third National Trust','Sunrise Drive','Suite 22','Jonestown','MI','12303',0,'system',sysdate,'system',sysdate,'PRIMARY');
INSERT INTO bank VALUES (3,'Third National Trust','Bellvue','Suite 2','Newport','RI','18943',0,'system',sysdate,'system',sysdate,'PRIMARY');
INSERT INTO bank VALUES (4,'Forth National Trust','403 Park Ave','Suite 221','Madison','WI','10003',0,'system',sysdate,'system',sysdate,'PRIMARY');


CREATE TABLE account (
  ACCOUNT_ID NUMBER(20) NOT NULL ,
  BANK_ID NUMBER(20) DEFAULT NULL,
  ACCOUNT_TYPE varchar2(45) DEFAULT NULL,
  NAME varchar2(100) DEFAULT NULL,
  INITIAL_BALANCE NUMBER(10,2) NOT NULL,
  CURRENT_BALANCE NUMBER(10,2) NOT NULL,
  OPEN_DATE date NOT NULL,
  CLOSE_DATE date NOT NULL,
  LAST_UPDATED_BY varchar2(45) NOT NULL,
  LAST_UPDATED_DATE DATE DEFAULT NULL,
  CREATED_BY varchar2(45) DEFAULT NULL,
  CREATED_DATE DATE DEFAULT NULL,
  PRIMARY KEY (ACCOUNT_ID),
  CONSTRAINT BANK_FK FOREIGN KEY (BANK_ID) REFERENCES bank (BANK_ID)
)

INSERT INTO account VALUES (1,1,'CHECKING','Checking Account',1000.00,1000.00,sysdate,sysdate,'Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);

CREATE TABLE account_type (
  ACCOUNT_TYPE_ID NUMBER(20) NOT NULL,
  NAME varchar2(45) DEFAULT NULL,
  LAST_UPDATED_DATE date DEFAULT NULL,
  LAST_UPDATED_BY varchar2(45) DEFAULT NULL,
  CREATED_DATE date DEFAULT NULL,
  CREATED_BY varchar2(45) DEFAULT NULL,
  PRIMARY KEY (ACCOUNT_TYPE_ID)
);

CREATE TABLE bank_contact (
  BANK_ID NUMBER(20) NOT NULL,
  NAME varchar2(100) NOT NULL,
  POSITION_TYPE varchar2(100) DEFAULT NULL,
  PRIMARY KEY (BANK_ID,NAME)
);

INSERT INTO "BANK_CONTACT" (BANK_ID, NAME, POSITION_TYPE) VALUES ('1', 'Test Name', 'MANAGER');
INSERT INTO "BANK_CONTACT" (BANK_ID, NAME, POSITION_TYPE) VALUES ('2', 'Test name 2', 'DEVELOPER');


CREATE TABLE portfolio (
  PORTFOLIO_ID NUMBER(20) NOT NULL,
  NAME varchar2(100) NOT NULL,
  PRIMARY KEY (PORTFOLIO_ID)
)

INSERT INTO portfolio VALUES (1,'First Investments');
INSERT INTO portfolio VALUES (2,'First Investments');
INSERT INTO portfolio VALUES (6,'First Investments');
INSERT INTO portfolio VALUES (7,'First Investments');
INSERT INTO portfolio VALUES (8,'First Investments');
INSERT INTO portfolio VALUES (9,'First Investments');
INSERT INTO portfolio VALUES (10,'First Investments');
INSERT INTO portfolio VALUES (12,'First Investments');

CREATE TABLE bond (
  BOND_ID NUMBER(20) NOT NULL,
  NAME varchar2(100) NOT NULL,
  ISSUER varchar2(100) NOT NULL,
  PURCHASE_DATE date NOT NULL,
  VALUE number(10,2) NOT NULL,
  INTEREST_RATE number(10,2) NOT NULL,
  MATURITY_DATE date NOT NULL,
  PORTFOLIO_ID number(20) DEFAULT NULL,
  PRIMARY KEY (BOND_ID),
  CONSTRAINT PORTFOLIO_FK2 FOREIGN KEY (PORTFOLIO_ID) REFERENCES portfolio (PORTFOLIO_ID)
);

INSERT INTO bond VALUES (1451,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,2);
INSERT INTO bond VALUES (1452,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,NULL);

CREATE TABLE budget (
  BUDGET_ID number(20) NOT NULL,
  NAME varchar2(100) NOT NULL,
  GOAL_AMOUNT number(10,2) NOT NULL,
  PERIOD varchar2(45) NOT NULL,
  PRIMARY KEY (BUDGET_ID)
);

CREATE TABLE transaction (
  TRANSACTION_ID number(20) NOT NULL,
  ACCOUNT_ID number(20) NOT NULL,
  TRANSACTION_TYPE varchar2(45) NOT NULL,
  TITLE varchar2(100) NOT NULL,
  AMOUNT number(10,2) NOT NULL,
  INITIAL_BALANCE number(10,2) NOT NULL,
  CLOSING_BALANCE number(10,2) NOT NULL,
  NOTES varchar2(2555),
  LAST_UPDATED_BY varchar2(45) NOT NULL,
  LAST_UPDATED_DATE date NOT NULL,
  CREATED_BY varchar2(45) NOT NULL,
  CREATED_DATE date NOT NULL,
  PRIMARY KEY (TRANSACTION_ID),
  CONSTRAINT ACCOUNT_FK2 FOREIGN KEY (ACCOUNT_ID) REFERENCES account (ACCOUNT_ID)
);
INSERT INTO transaction VALUES (1,1,'Withdrawl','Dress Belt',50.00,1000.00,950.00,'New Dress Belt','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (2,1,'Withdrawl','Work Shoes',100.00,950.00,850.00,'Nice Pair of Shoes','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (3,1,'Withdrawl','Shirt',100.00,850.00,750.00,'Nice Shirt','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (4,1,'Withdrawl','Socks',10.00,750.00,740.00,'Nice Socks','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (5,1,'Withdrawl','Tie',40.00,740.00,700.00,'Nice Tie','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (6,1,'Withdrawl','Pants',100.00,700.00,600.00,'Nice Pants','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (7,1,'Withdrawl','Lunch',20.00,600.00,580.00,'Nice Lunch','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (8,1,'Withdrawl','Dinner',30.00,580.00,550.00,'Great Dinner','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (9,1,'Withdrawl','Breakfast',10.00,550.00,540.00,'Breakfast at Tiffanys','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (10,1,'Withdrawl','Groceries',100.00,540.00,440.00,'Healthy Food','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (11,1,'Deposit','Pay Check',1000.00,440.00,1440.00,'Pay Day','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);
INSERT INTO transaction VALUES (12,1,'Deposit','Bonus',500.00,1440.00,1940.00,'Annual Bonus','Kevin Bowersox',sysdate,'Kevin Bowersox',sysdate);

CREATE TABLE budget_transaction (
  TRANSACTION_ID number(20) NOT NULL,
  BUDGET_ID number(20) NOT NULL,
  PRIMARY KEY (TRANSACTION_ID,BUDGET_ID),
  CONSTRAINT BUDGET_FK FOREIGN KEY (BUDGET_ID) REFERENCES budget (BUDGET_ID),
  CONSTRAINT TRANSACTION_FK2 FOREIGN KEY (TRANSACTION_ID) REFERENCES transaction (TRANSACTION_ID)
);

CREATE TABLE finances_user (
  USER_ID number(20) NOT NULL,
  FIRST_NAME varchar2(45) NOT NULL,
  LAST_NAME varchar2(45) NOT NULL,
  BIRTH_DATE date NOT NULL,
  EMAIL_ADDRESS varchar2(100) NOT NULL,
  LAST_UPDATED_BY varchar2(45) NOT NULL,
  LAST_UPDATED_DATE date NOT NULL,
  CREATED_BY varchar2(45) NOT NULL,
  CREATED_DATE date NOT NULL,
  USER_ADDRESS_LINE_1 varchar2(100) DEFAULT NULL,
  USER_ADDRESS_LINE_2 varchar2(100) DEFAULT NULL,
  CITY varchar2(100) DEFAULT NULL,
  STATE varchar2(2) DEFAULT NULL,
  ZIP_CODE varchar2(5) DEFAULT NULL,
  PRIMARY KEY (USER_ID)
);

CREATE TABLE credential (
  CREDENTIAL_ID number(20) NOT NULL,
  USER_ID number(20) NOT NULL,
  USERNAME varchar2(50) NOT NULL,
  PASSWORD varchar2(100) NOT NULL,
  PRIMARY KEY (CREDENTIAL_ID),
  CONSTRAINT FINANCES_USER_FK FOREIGN KEY (USER_ID) REFERENCES finances_user (USER_ID)
);

INSERT INTO "CREDENTIAL" (CREDENTIAL_ID, USER_ID, USERNAME, PASSWORD) VALUES ('1', '1', 'username', 'pass');

CREATE TABLE ifinances_keys (
  PK_NAME varchar2(45) NOT NULL,
  PK_VALUE number(20) DEFAULT NULL,
  PRIMARY KEY (PK_NAME)
);

CREATE TABLE investment (
  INVESTMENT_ID number(20) NOT NULL,
  PORTFOLIO_ID number(20) DEFAULT NULL,
  NAME varchar2(100) DEFAULT NULL,
  ISSUER varchar2(100) DEFAULT NULL,
  PURCHASE_DATE date DEFAULT NULL,
  VALUE number(10,2) DEFAULT NULL,
  INTEREST_RATE number(10,2) DEFAULT NULL,
  MATURITY_DATE date DEFAULT NULL,
  SHARE_PRICE number(10,2) DEFAULT NULL,
  QUANTITY number(20) DEFAULT NULL,
  INVESTMENT_TYPE varchar2(100) DEFAULT NULL,
  PRIMARY KEY (INVESTMENT_ID)
);

INSERT INTO investment VALUES (1,6,'Private American Stock Purchases','Allen Edmonds',sysdate,NULL,NULL,NULL,100.00,1922,'STOCK');
INSERT INTO investment VALUES (2,6,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,NULL,NULL,'BOND');
INSERT INTO investment VALUES (3,7,'Private American Stock Purchases','Allen Edmonds',sysdate,NULL,NULL,NULL,100.00,1922,'STOCK');
INSERT INTO investment VALUES (4,7,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,NULL,NULL,'BOND');
INSERT INTO investment VALUES (1500,8,'Private American Stock Purchases','Allen Edmonds',sysdate,NULL,NULL,NULL,100.00,1922,'Stock');
INSERT INTO investment VALUES (1501,8,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,NULL,NULL,'Bond');
INSERT INTO investment VALUES (1502,9,'Private American Stock Purchases','Allen Edmonds',sysdate,NULL,NULL,NULL,100.00,1922,'Stock');
INSERT INTO investment VALUES (1503,9,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,NULL,NULL,'Bond');
INSERT INTO investment VALUES (1504,10,'Private American Stock Purchases','Allen Edmonds',sysdate,NULL,NULL,NULL,100.00,1922,'ST');
INSERT INTO investment VALUES (1505,10,'Long Term Bond Purchases','JP Morgan Chase',sysdate,10.22,123.22,sysdate,NULL,NULL,'BND');
INSERT INTO investment VALUES (1506,12,'Private American Stock Purchases','Allen Edmonds',sysdate,NULL,NULL,NULL,100.00,1922,'ST');

CREATE TABLE currency (
  NAME varchar2(45) NOT NULL,
  COUNTRY_NAME varchar2(45) NOT NULL,
  SYMBOL varchar2(45) DEFAULT NULL,
  PRIMARY KEY (NAME,COUNTRY_NAME)
);

INSERT INTO "CURRENCY" (NAME, COUNTRY_NAME, SYMBOL) VALUES ('DOLLAR', 'US', '$');
INSERT INTO "CURRENCY" (NAME, COUNTRY_NAME, SYMBOL) VALUES ('EURO', 'EU', 'E');

CREATE TABLE market (
  MARKET_ID number(20) NOT NULL,
  CURRENCY_NAME varchar2(45) NOT NULL,
  COUNTRY_NAME varchar2(45) NOT NULL,
  MARKET_NAME varchar2(45) DEFAULT NULL,
  PRIMARY KEY (MARKET_ID),
  CONSTRAINT CURRENCY_FK FOREIGN KEY (CURRENCY_NAME, COUNTRY_NAME) REFERENCES currency (NAME, COUNTRY_NAME)
);

INSERT INTO "MARKET" (MARKET_ID, CURRENCY_NAME, COUNTRY_NAME, MARKET_NAME) VALUES ('1', 'EURO', 'EU', 'EUROPE');
INSERT INTO "MARKET" (MARKET_ID, CURRENCY_NAME, COUNTRY_NAME, MARKET_NAME) VALUES ('2', 'EURO', 'EU', 'GERMANY');

CREATE TABLE stock (
  STOCK_ID number(20) NOT NULL,
  NAME varchar2(100) NOT NULL,
  ISSUER varchar2(45) NOT NULL,
  PURCHASE_DATE date NOT NULL,
  SHARE_PRICE number(10,2) NOT NULL,
  QUANTITY number(20) NOT NULL,
  PORTFOLIO_ID number(20) DEFAULT NULL,
  PRIMARY KEY (STOCK_ID),
  CONSTRAINT PORTFOLIO_FK FOREIGN KEY (PORTFOLIO_ID) REFERENCES portfolio (PORTFOLIO_ID)
);

INSERT INTO stock VALUES (1450,'Private American Stock Purchases','Allen Edmonds',sysdate,100.00,1922,2);
INSERT INTO stock VALUES (1451,'Private American Stock Purchases','Allen Edmonds',sysdate,100.00,1922,NULL);

CREATE TABLE time_test (
  TIME_TEST_ID number(20) NOT NULL,
  DATETIME_COLUMN date DEFAULT NULL,
  TIMESTAMP_COLUMN date DEFAULT NULL,
  DATE_COLUMN date DEFAULT NULL,
  TIME_COLUMN date DEFAULT NULL,
  SQL_DATETIME_COLUMN date DEFAULT NULL,
  SQL_TIMESTAMP_COLUMN timestamp DEFAULT NULL,
  SQL_DATE_COLUMN date DEFAULT NULL,
  SQL_TIME_COLUMN date DEFAULT NULL,
  PRIMARY KEY (TIME_TEST_ID)
);

CREATE TABLE user_account (
  USER_ID number(20) NOT NULL,
  ACCOUNT_ID number(20) NOT NULL,
  PRIMARY KEY (USER_ID,ACCOUNT_ID),
  CONSTRAINT ACCOUNT_FK FOREIGN KEY (ACCOUNT_ID) REFERENCES account (ACCOUNT_ID),
  CONSTRAINT USER_FK FOREIGN KEY (USER_ID) REFERENCES finances_user (USER_ID)
);

INSERT INTO "USER_ACCOUNT" (USER_ID, ACCOUNT_ID) VALUES ('1', '1');
INSERT INTO "USER_ACCOUNT" (USER_ID, ACCOUNT_ID) VALUES ('1', '2');
INSERT INTO "USER_ACCOUNT" (USER_ID, ACCOUNT_ID) VALUES ('2', '1');
INSERT INTO "USER_ACCOUNT" (USER_ID, ACCOUNT_ID) VALUES ('2', '2');


INSERT INTO "ACCOUNT" (ACCOUNT_ID, BANK_ID, ACCOUNT_TYPE, NAME, INITIAL_BALANCE, CURRENT_BALANCE, OPEN_DATE, CLOSE_DATE, LAST_UPDATED_BY, LAST_UPDATED_DATE, CREATED_BY, CREATED_DATE) VALUES ('2', '1', 'CHECKING', 'Checking Account', '1000', '1000', TO_DATE('15/12/25', 'RR/MM/DD'), TO_DATE('15/12/25', 'RR/MM/DD'), 'Kevin Bowersox', TO_DATE('15/12/25', 'RR/MM/DD'), 'Kevin Bowersox', TO_DATE('15/12/25', 'RR/MM/DD'));


CREATE TABLE user_address (
  USER_ID number(20) NOT NULL,
  USER_ADDRESS_LINE_1 varchar2(100) NOT NULL,
  USER_ADDRESS_LINE_2 varchar2(100) NOT NULL,
  CITY varchar2(100) NOT NULL,
  STATE varchar2(2) NOT NULL,
  ZIP_CODE varchar2(5) NOT NULL,
  ADDRESS_TYPE varchar2(45) DEFAULT NULL,
  PRIMARY KEY (USER_ID,USER_ADDRESS_LINE_1,USER_ADDRESS_LINE_2,CITY,STATE,ZIP_CODE)
);

INSERT INTO "FINANCES_USER" (USER_ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, EMAIL_ADDRESS, LAST_UPDATED_BY, LAST_UPDATED_DATE, CREATED_BY, CREATED_DATE) VALUES ('1', 'Jarek', 'Rola', TO_DATE('90/08/31', 'RR/MM/DD'), 'jaroslaw.rola@jrola.pl', 'SYSTEM', TO_DATE('15/12/25', 'RR/MM/DD'), 'SYSTEM', TO_DATE('15/12/25', 'RR/MM/DD'))





