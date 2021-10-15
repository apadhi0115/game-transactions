# game-transactions

This application exposes two API endpoints

POST -- /transaction
GET--- /transactions

/transaction accept the request like below 

{
    "userId": "345512",
    "transactionId": "dsdsa",
    "product": "sku3345",
    "amount": "£4310"
}

/transactions fetches all the transactions

{
    "userId": "43543",
    "transactionId": "dsd435345sa",
    "product": "sku45433345",
    "amount": "£4410"
},
{
    "userId": "345512",
    "transactionId": "dsdsa",
    "product": "sku3345",
    "amount": "£4310"
}


# Technology Used

Spring Boot
Spring data JPA
H2 Memory database

# How to run the application
git clone git@github.com:apadhi0115/game-transactions.git
cd game-transactions
./mvnw spring-boot:run

The API end points are below:

GET Operation --  http://localhost:8080/transactions
POST Operation ---http://localhost:8080/transaction
