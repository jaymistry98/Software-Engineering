### Assignment 5: Software Design 



1. The User class As a user of the system I want to be able to see each store's offering and the amount of product in stock by square feet. This was implemented by creating a User class and a Store class where the user class can use the user_settings() to change the user settings and can also add, delete, edit products from the methods in the user class

2. The Store class allows employees to check the Inventory and also update it. The Store Class also allows to add new products to the system. As well as delete and edit them. It has method like CheckOut() to allow the to user to checkout.
3. The Floor class contains the basic attributes of floor and two levels which are the floor category class and the floortype class 
4. The Floor class is also connected to a database (DB) of floors. 
5. The User and Store Class  also have method to search for products by picking from a hierarchical list, where the first level is the floor category, and the second level is the floor type. 
6. The User Class also has a search functionality method.
7. The Floor Category class is connected to many sub classes where each sub class has a specific attribute accroding to the floor category.