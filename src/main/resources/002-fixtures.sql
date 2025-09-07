-- Fixtures for transaction data

-- Accounts
INSERT INTO account (name, number, code) SELECT 'PPF BANKA A.S.', '0000009504010019', '6000' WHERE NOT EXISTS (SELECT 1 FROM account WHERE number = '0000009504010019');
INSERT INTO account (name, number, code) SELECT 'PPF BANKA A.S.', '0000009505020008', '6000' WHERE NOT EXISTS (SELECT 1 FROM account WHERE number = '0000009505020008');
INSERT INTO account (name, number, code) SELECT 'PPF BANKA A.S.', '0000009503010009', '6000' WHERE NOT EXISTS (SELECT 1 FROM account WHERE number = '0000009503010009');
;

-- Transaction Types
INSERT INTO transactionType (type, code) SELECT 'DPO', 1012209 WHERE NOT EXISTS (SELECT 1 FROM transactionType WHERE type = 'DPO' AND code = 1012209);
INSERT INTO transactionType (type, code) SELECT 'DPO', 0 WHERE NOT EXISTS (SELECT 1 FROM transactionType WHERE type = 'DPO' AND code = 0);
;

-- Statements
INSERT INTO statement (number, period, description) SELECT '196', '2022', NULL WHERE NOT EXISTS (SELECT 1 FROM statement WHERE number = '196' AND period = '2022');
INSERT INTO statement (number, period, description) SELECT '195', '2022', NULL WHERE NOT EXISTS (SELECT 1 FROM statement WHERE number = '195' AND period = '2022');
;

-- Transactions
INSERT INTO [transaction] (amount, currency, id, bankref, transactionId, bookingDate, postingDate, creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, productBankRef, transactionType, statement, specificSymbol, variableSymbol)
SELECT 1500.00, 'CZK', '20221019:0000000219', 'PS221019SO314822', '4831716', '2022-10-19', '2022-10-19', 'CRDT', '2002222222', (SELECT accountId FROM account WHERE number = '0000009504010019'), 'Posílám peníze', 'PS221019SO314822', (SELECT trxTypeId FROM transactionType WHERE code = 1012209 AND type = 'DPO'), (SELECT statementId FROM statement WHERE number = '196' AND period = '2022'), '12', '12'
WHERE NOT EXISTS (SELECT 1 FROM [transaction] WHERE id = '20221019:0000000219');
;

INSERT INTO [transaction] (amount, currency, id, bankref, transactionId, bookingDate, postingDate, creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, productBankRef, transactionType, statement, specificSymbol, variableSymbol)
SELECT 1999.00, 'CZK', '20221019:0000000220', 'PS221019SO314822', '4831701', '2022-10-19', '2022-10-19', 'CRDT', '2002222222', (SELECT accountId FROM account WHERE number = '0000009505020008'), 'Trvalý příkaz 8', 'PS221019SO314822', (SELECT trxTypeId FROM transactionType WHERE code = 0 AND type = 'DPO'), (SELECT statementId FROM statement WHERE number = '196' AND period = '2022'), '12', '12'
WHERE NOT EXISTS (SELECT 1 FROM [transaction] WHERE id = '20221019:0000000220');
;

INSERT INTO [transaction] (amount, currency, id, bankref, transactionId, bookingDate, postingDate, creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, productBankRef, transactionType, statement, specificSymbol, variableSymbol)
SELECT 2000.00, 'CZK', '20221019:0000000221', 'PS221019SO314823', '4831700', '2022-10-19', '2022-10-19', 'CRDT', '2002222222', (SELECT accountId FROM account WHERE number = '0000009503010009'), 'Na dárky', 'PS221019SO314823', (SELECT trxTypeId FROM transactionType WHERE code = 1012209 AND type = 'DPO'), (SELECT statementId FROM statement WHERE number = '196' AND period = '2022'), '61', '61'
WHERE NOT EXISTS (SELECT 1 FROM [transaction] WHERE id = '20221019:0000000221');
;

INSERT INTO [transaction] (amount, currency, id, bankref, transactionId, bookingDate, postingDate, creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, productBankRef, transactionType, statement, specificSymbol, variableSymbol)
SELECT 100.00, 'CZK', '20221018:0000003607', 'PS221018SO314645', '4831425', '2022-10-18', '2022-10-18', 'CRDT', '2002222222', (SELECT accountId FROM account WHERE number = '0000009504010019'), 'Příspěvek', 'PS221018SO314645', (SELECT trxTypeId FROM transactionType WHERE code = 1012209 AND type = 'DPO'), (SELECT statementId FROM statement WHERE number = '195' AND period = '2022'), '12', '12'
WHERE NOT EXISTS (SELECT 1 FROM [transaction] WHERE id = '20221018:0000003607');
;

INSERT INTO [transaction] (amount, currency, id, bankref, transactionId, bookingDate, postingDate, creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, productBankRef, transactionType, statement, specificSymbol, variableSymbol)
SELECT 1594.00, 'CZK', '20221018:0000003608', 'PS221018SO314645', '4831381', '2022-10-18', '2022-10-18', 'DBIT', '2002222222', (SELECT accountId FROM account WHERE number = '0000009505020008'), 'Platba elektřiny', 'PS221018SO314645', (SELECT trxTypeId FROM transactionType WHERE code = 0 AND type = 'DPO'), (SELECT statementId FROM statement WHERE number = '195' AND period = '2022'), '12', '12'
WHERE NOT EXISTS (SELECT 1 FROM [transaction] WHERE id = '20221018:0000003608');
;
