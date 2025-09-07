Zadání je následovné:

Vytvořte backendovou mikroslužbu, která nad definovaným modelem (ta_database.sql) bude vracet seznam transakcí transparentního účtu pro front end.

Rozhraní služby je REST
Pohyby na účtu
GET /accounts/2002222222/transactions
odpověď viz. ta-2002222222-transactions-response.json

Hodnota 2002222222 v cestě je číslo účtu. V modelu je uvedené jako ownAccountNumber.

Zabezpečení, stránkování a výkonové optimalizace pro tuto úlohu neřešíme.