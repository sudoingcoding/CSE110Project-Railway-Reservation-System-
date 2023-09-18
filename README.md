# Project
This project is using features of Object Oriented Programming 
The input and output of trainlist are done through .dat file (binary file) 
# Acknowledgement
We would like to thank our course instructor Tanni Mitra who inspired us and provided us with sufficient amount of background knowledge, necessary information and resources such as lecture which helped us to complete this project successfully.
We feel privileged to extend our gratitude to our parents for their support and encouragement.
# Introduction
A Railway Reservation System is used to reserve a seat from anywhere through a single, dynamic website that will help the user know all about the places details on a single website. The main purpose of our project, "Railway Reservation System", is to provide a convenient way for a customer to book trains for purposes. We simplified the process of searching for and booking trains in this project
# Objective
Our project was created to provide customers with the best transportation options. This system also helps to promote responsible and interesting travel so that people can enjoy their holidays at their favorite places
# Features
Our code has options like booking tickets, methods of payment, editing user info according to the user's convenience, whereas admin gets all information regarding user bookings, etc. The system is implemented using object oriented principles and consists of the following classes:
# Feature:
**1. Admin:** A class that extends to railway system. Admin can see all users' booking information, such as destination, booking type, payment, payment status, and schedule.<br>
**2. User:** An abstract class that serves as the base class for railway system. Users can register by entering information such as their name, password, and email address.<br>
**3. Train:** Users can find information about train schedule by entering the place name in this part.<br>
**4. Ticket:** Users can reservation ticket and print it in this part.<br>
**5. Passenger:** This class entitled an user who has ticket reserved.<br>
# Operations
**1. Reserve a train:** Users can reserve train seat in this option.<br>
**2. View train schedule:** Users can check the departure and arrival time.<br>
**3. Cancel trip:** Users can cancel the ticket in this method.<br>
**4. Giving payment:** Users have to pay the bill for their tickets.<br>
**5. Print ticket slip:** This option can print the ticket slip as a .txt file to Users.<br>
# Components
**Classes:** The project includes several classes such as “Admin”, “User”, “Train”, “Passenger”, “Ticket”, “Payment”.<br>
**Interface:** The project has only one interface called “RailwaySystem” .<br>
**Abstract:** We have used “User ” class as abstract class.<br>
**Inheritence and Association:** There are many inheritance in our project by using method overriding of toString, getName etc.Besides, there are many has-a relationship and is-a relationship which defines association of the classes.<br>
**File(I/O):** There are a binary files have been used in this project. The names of the binary file is “trainList.dat”. “trainList.dat” is used to train schedule information .Besides, We have used “ticket_templet.txt ”file to give output of ticket of every individual passengers as .txt file.<br>
**Exception Handling:** We have IOException, ClassNotFoundException, ParseException and handled using try-catch block and throws.<br>
**Generics:** We have two generics class DataStored<T> and MainMenu<T> class<br>
which has also have generics method.<br>
# Conclusion
We successfully made a Railway Reservation System with the help of Java programming.
Please note that this report provides an overview of the system based on the provided code. Additional details or functionalities may be implemented beyond the code's scope.<br>
