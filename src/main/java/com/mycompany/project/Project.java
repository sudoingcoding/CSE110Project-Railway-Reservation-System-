/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project;

import java.io.*;
import java.text.*;
import java.util.*;

/**
 *
 * @author user
 */
interface RailwaySystem {

    public String getName();
}

class admin implements RailwaySystem, Serializable {

    private int id;
    private String email;
    private String name;

    public admin() {

    }

    public admin(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

abstract class User implements RailwaySystem, Serializable {

    private String name;
    private String Email;

    public User() {

    }

    public User(String userName, String Email) {
        this.name = userName;
        this.Email = Email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "User" + "\nname=" + name + "\nEmail=" + Email + "\nsc=";
    }

}

class ticket extends User implements Serializable {

    private String travellingclass;
    private Date Dateofjourny;

    public ticket() {

    }

    public ticket(String travellingclass, String whichDate, User user) throws ParseException {
        super(user.getName(), user.getEmail());
        this.travellingclass = travellingclass;
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(whichDate);
        this.Dateofjourny = date1;
    }

    public ticket(String travellingclass, String whichDate) throws ParseException {
        this.travellingclass = travellingclass;
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(whichDate);
        this.Dateofjourny = date1;
    }

    public ticket(String travellingclass,Date Dateofjourny, String userName, String Email) {
        super(userName, Email);
        this.travellingclass = travellingclass;
        this.Dateofjourny = Dateofjourny;
    }

    public String getTravellingclass() {
        return travellingclass;
    }

    public void setTravellingclass(String travellingclass) {
        this.travellingclass = travellingclass;
    }

    public Date getDateofjourny() {
        return Dateofjourny;
    }

    public void setDateofjourny(String whichDate) throws ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(whichDate);
        this.Dateofjourny = date1;
    }

    @Override
    public String toString() {
        return "ticket" + "\ntravellingclass=" + travellingclass + "\nDateofjourny=" + Dateofjourny;
    }

}

class Passenger extends User implements Serializable {

    private ticket ticket;
    private User user;
    private Train train;
    private Payment payment;
    private String from;
    private String to;
    private int SitNo;
    
    public Passenger() {
    }

    public Passenger(String userName, String Email) {
        super(userName, Email);
    }

    public Passenger(ticket ticket, User user, Train train, Payment payment, String from, String to,int SitNo) {
        this.ticket = ticket;
        this.user = user;
        this.train = train;
        this.payment = payment;
        this.from = from;
        this.to = to;
        this.SitNo=SitNo;
    }

    public Passenger(ticket ticket, User user, Train train, Payment payment, String from, String to, String userName, String Email,int SitNo) {
        super(userName, Email);
        this.ticket = ticket;
        this.user = user;
        this.train = train;
        this.payment = payment;
        this.from = from;
        this.to = to;
        this.SitNo=SitNo;
    }

    public ticket getTicket() {
        return ticket;
    }

    public void setTicket(ticket ticket) {
        this.ticket = ticket;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getSitNo() {
        return SitNo;
    }

    public void setSitNo(int SitNo) {
        this.SitNo = SitNo;
    }

    @Override
    public String toString() {
        return "Passenger" + "\nticket=" + ticket + "\ntrain=" + train + "\nuser=" + user + "\npayment=" + payment + "\nfrom=" + from + "\nto=" + to;
    }

    public void printTicketSlip() {
        String templateFile = "ticket_template.txt";
        String outputFile = user.getName() + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(templateFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("{{FROM}}", from)
                        .replace("{{TO}}", to)
                        .replace("{{NAME}}", user.getName())
                        .replace("{{Pay}", payment.getAmount() + "")
                        .replace("{{Sit_No}}", SitNo + "")
                        .replace("{{Date}}", ticket.getDateofjourny().toString())
                        .replace("{{TRAIN}}", train.getName());

                writer.write(line);
                writer.newLine();
            }

            System.out.println("Ticket slip created successfully.");
            System.out.println("Go to the project folder to see your ticket.");

        } catch (IOException e) {
            System.out.println("Error creating ticket slip: " + e.getMessage());
        }
    }

    public void cancelTrip() {
        this.ticket = null;
        this.user = null;
        this.train = null;
        this.payment = null;
        this.from = null;
        this.to = null;
        this.SitNo = 0;
        System.out.println("Your trip is cancelled");
    }

}

class Payment {

    private String paymentId;
    private double amount;
    private String paymentMethod;
    private Date paymentTime;

    public Payment(String paymentId, double amount, String paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        if (paymentMethod.equals("Bkash") || paymentMethod.equals("Nagad") || paymentMethod.equals("Credit Card")) {
            this.paymentMethod = paymentMethod;
        } else {
            System.out.println("Your Payment method is Wrong");
        }
        this.paymentTime = new Date();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void processPayment() {
        System.out.println("Processing payment...");
        System.out.println("Payment processed successfully.");
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId
                + "\nAmount: " + amount
                + "\nPayment Method: " + paymentMethod;
    }
}

class Train implements RailwaySystem, Serializable {

    private int TrainNo;
    private String name;
    private int seat;
    private int filledSit;
    private int charge;
    private ArrayList<Passenger> passengers;
    private String boardingPoint;
    private String departurePoint;
    private Date boardingTime;
    private Date depatureTime;

    public Train() {
    }
    
    
    public Train(int TrainNo, String name, int seat, int charge, String boardingPoint, String departurePoint, String boardingTime, String depatureTime) throws ParseException {

        this.TrainNo = TrainNo;
        this.name = name;
        this.seat = seat;
        this.charge = charge;
        this.boardingPoint = boardingPoint;
        this.departurePoint = departurePoint;
        Date time1 = new SimpleDateFormat("HH:mm:ss").parse(boardingTime);
        this.boardingTime = time1;
        Date time2 = new SimpleDateFormat("HH:mm:ss").parse(depatureTime);
        this.depatureTime = time2;
    }

    public int getTrainNo() {
        return TrainNo;
    }

    public void setTrainNo(int TrainNo) {
        this.TrainNo = TrainNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) throws ParseException {
        Date time1 = new SimpleDateFormat("HH:mm:ss").parse(boardingTime);
        this.boardingTime = time1;
    }

    public Date getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) throws ParseException {
        Date time2 = new SimpleDateFormat("HH:mm:ss").parse(depatureTime);
        this.depatureTime = time2;
    }

    @Override
    public String toString() {
        return "Train{" + "\nname=" + name + "\nseat=" + seat + "\ncharge=" + charge + "\npassengers=" + passengers + "\nboardingPoint=" + boardingPoint + "\ndeparturePoint=" + departurePoint + "\nboardingTime=" + boardingTime + "\ndepatureTime=" + depatureTime;
    }

    public void addPassenger(Passenger p) {
        if ((passengers.size() <= seat)) {
            passengers.add( p);
            filledSit++;
        } else {
            System.out.println("Sit is filled");
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void removePassenger(int SitNo) {
        passengers.remove(SitNo);
        filledSit--;
    }

}

class DataStored<T> {

    public DataStored() {
    }

    public static void enteringFlie(ArrayList<? extends RailwaySystem> list, String fileName) throws FileNotFoundException, IOException {
        try {
            try (FileOutputStream fos = new FileOutputStream(fileName); BufferedOutputStream bos = new BufferedOutputStream(fos); ObjectOutputStream oos = new ObjectOutputStream(bos)) {

                oos.writeObject(list);
                oos.flush();
                bos.flush();

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addNewObjectToFile(RailwaySystem newObject, String fileName) throws IOException, ClassNotFoundException {
        ArrayList<RailwaySystem> list;
        try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
            list = (ArrayList<RailwaySystem>) ois.readObject();
            list.add(newObject);
        }

        enteringFlie(list, fileName);
    }

    public ArrayList<? extends RailwaySystem> releasingFlie(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<? extends RailwaySystem> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            list = (ArrayList<? extends RailwaySystem>) ois.readObject();

            ois.close();
            bis.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}

class MainMenu<T> {

    Scanner sc = new Scanner(System.in);
    ArrayList<Train> trainList = new ArrayList<Train>();
    ArrayList<Passenger> PassengerList = new ArrayList<Passenger>();

    public void usingFile() throws IOException, ClassNotFoundException {
        DataStored TrainData = new DataStored();
        trainList = TrainData.releasingFlie("trainList.dat");
        DataStored passengerList = new DataStored();
        PassengerList = passengerList.releasingFlie("passengerList.dat");
    }

    public void firstMenu() throws IOException, ParseException, ClassNotFoundException {
        System.out.println(trainList.size());
        usingFile();
        System.out.println(trainList.size());
        System.out.println("\t\t|||||||||||||||||||| Welcome to Railway Reservation System ||||||||||||||||||||");
        System.out.println("Enter your choices:");
        System.out.println("1)Admin");
        System.out.println("2)User");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                adminMenu();
                break;
            case 2:
                userMenu();
                break;
            default:
                System.out.println("Sorry wrong choice(Enter 1 or 2)");
        }
    }

    public void adminMenu() throws IOException, ParseException {
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        if (password.equals("admin")) {
            System.out.println("Enter your choices:");
            System.out.println("1)Train");
            System.out.println("2)Passenger");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Want to see whole list of trains(y/n):");
                    sc.nextLine();
                    String s = sc.nextLine();
                    if (s.charAt(0) == 'y') {
                        show(trainList);
                    }

                    System.out.println("Enter train name to search:");
                    String tName = sc.nextLine();
                    System.out.println(search(trainList, tName).toString());

                    break;
                case 2:
                    show(PassengerList);
                    sc.nextLine();
                    System.out.println("Enter passenger name to search:");
                    String pName = sc.nextLine();
                    System.out.println(search(PassengerList, pName).toString());

                    break;
                default:
                    System.out.println("Sorry wrong choice(Enter 1 or 2)");
                    adminMenu();
            }
        } else {
            System.out.println("wrong password");
        }

    }

    public void userMenu() throws IOException, ParseException, ClassNotFoundException {

        DataStored passenger = new DataStored();
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your place:");
        String bp = sc.nextLine();
        System.out.println("Enter your destination:");
        String dp = sc.nextLine();
        System.out.println("Enter your journey date(yyyy-MM-dd)");
        String jDate = sc.nextLine();
        for (int i = 0; i < trainList.size(); i++) {
            if (trainList.get(i).getBoardingPoint().equals(bp) && trainList.get(i).getDeparturePoint().equals(dp)) {
                System.out.println("Here are some available schedule");
                System.out.println(trainList.get(i).toString());
                System.out.println("Want to catch it?(press y/n)");
                String ans = sc.nextLine();
                if (ans.charAt(0) == 'y') {
                    System.out.println("Enter your catagory");
                    System.out.println("1)AC");
                    System.out.println("2)1st class");
                    System.out.println("3)2nd class");
                    int cls = sc.nextInt();
                    switch (cls) {
                        case 1:
                            System.out.println("Enter your sit no:");
                            int sitNo = sc.nextInt();
                            System.out.println("Your payment is" + (trainList.get(i).getCharge() + 20));
                            sc.nextLine();
                            System.out.println("Enter y to make payment and reserve a sit:");
                            String a = sc.nextLine();
                            if (a.charAt(0) == 'y') {
                                System.out.println("Type any payment method:");
                                System.out.println("Bkash/Nagad/Credit Card");
                                String payMeth = sc.nextLine();
                                UUID uuid = UUID.randomUUID();
                                Payment pay = new Payment(uuid.toString(), (trainList.get(i).getCharge() + 20), payMeth);
                                pay.processPayment();
                                ticket t = new ticket("AC", jDate);
                                User u = new Passenger(name, email);
                                Passenger p = new Passenger(t, u, trainList.get(i), pay, bp, dp,sitNo);
                                PassengerList.add(p);
                                trainList.get(i).addPassenger(p);
                                passenger.addNewObjectToFile(p, "passengerList.dat");
                                System.out.println("Want to print ticket?press y :");
                                String sch = sc.nextLine();
                                if (sch.charAt(0) == 'y') {
                                    PassengerList.get(PassengerList.size() - 1).printTicketSlip();
                                    break;
                                }
                                System.out.println("Want to cancel trip?press y to cancel:");
                                String s = sc.nextLine();
                                if (s.charAt(0) == 'y') {
                                    PassengerList.remove(PassengerList.size() - 1);
                                    trainList.get(i).removePassenger(sitNo);
                                    break;
                                }

                            } else {
                                break;
                            }
                        case 2:
                            System.out.println("Enter your sit no:");
                            int sitNo1 = sc.nextInt();
                            System.out.println("Your payment is " + (trainList.get(i).getCharge() + 10));
                            sc.nextLine();
                            System.out.println("Enter y to make payment and reserve a sit:");
                            String ar = sc.nextLine();
                            if (ar.charAt(0) == 'y') {
                                System.out.println("Type any payment method:");
                                System.out.println("Bkash/Nagad/Credit Card");
                                String payMeth = sc.nextLine();
                                UUID uuid = UUID.randomUUID();
                                Payment pay = new Payment(uuid.toString(), (trainList.get(i).getCharge() + 10), payMeth);
                                pay.processPayment();
                                ticket t = new ticket("AC", jDate);
                                User u = new Passenger(name, email);
                                Passenger p = new Passenger(t, u, trainList.get(i), pay, bp, dp,sitNo1);
                                PassengerList.add(p);
                                trainList.get(i).addPassenger(p);
                                passenger.addNewObjectToFile(p, "passengerList.dat");
                                System.out.println("Want to print ticket?press y :");
                                String sch = sc.nextLine();
                                if (sch.charAt(0) == 'y') {
                                    PassengerList.get(PassengerList.size() - 1).printTicketSlip();
                                    break;
                                }
                                System.out.println("Want to cancel trip?press y to cancel:");
                                String s = sc.nextLine();
                                if (s.charAt(0) == 'y') {
                                    PassengerList.remove(PassengerList.size() - 1);
                                    trainList.get(i).removePassenger(sitNo1);
                                    break;
                                }

                            } else {
                                break;
                            }
                        case 3:
                            System.out.println("Enter your sit no:");
                            int sitNo2 = sc.nextInt();
                            System.out.println("Your payment is" + (trainList.get(i).getCharge()));
                            sc.nextLine();
                            System.out.println("Enter y to make payment and reserve a sit:");
                            String arc = sc.nextLine();
                            if (arc.charAt(0) == 'y') {
                                System.out.println("Type any payment method:");
                                System.out.println("Bkash/Nagad/Credit Card");
                                String payMeth = sc.nextLine();
                                UUID uuid = UUID.randomUUID();
                                Payment pay = new Payment(uuid.toString(), (trainList.get(i).getCharge()), payMeth);
                                pay.processPayment();
                                ticket t = new ticket("AC", jDate);
                                User u = new Passenger(name, email);
                                Passenger p = new Passenger(t, u, trainList.get(i), pay, bp, dp,sitNo2);
                                PassengerList.add(p);
                                trainList.get(i).addPassenger(p);
                                passenger.addNewObjectToFile(p, "passengerList.dat");
                                System.out.println("Want to print ticket?press y :");
                                String sch = sc.nextLine();
                                if (sch.charAt(0) == 'y') {
                                    PassengerList.get(PassengerList.size() - 1).printTicketSlip();
                                    break;
                                }
                                System.out.println("Want to cancel trip?press y to cancel:");
                                String s = sc.nextLine();
                                if (s.charAt(0) == 'y') {
                                    PassengerList.remove(PassengerList.size() - 1);
                                    trainList.get(i).removePassenger(sitNo2);
                                    break;
                                }

                            } else {
                                break;
                            }

                    }

                }

            }

        }
    }

    public RailwaySystem search(ArrayList<? extends RailwaySystem> arr, String name) {
        for (int i = 0; i < arr.size(); i++) {
            if (name.equals(arr.get(i).getName())) {
                return arr.get(i);
            }
        }
        return null;
    }

    public void show(ArrayList<? extends RailwaySystem> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
            System.out.println("");
        }
    }

}

public class Project {

    public static void main(String[] args) throws IOException, ParseException {
        try {
            ArrayList<Train> trainList = new ArrayList<Train>();
            trainList.add(new Train(701, "Subarna Express", 10, 500, "Chittagong", "Dhaka", "15:00:00", "20:10:00"));
            trainList.add(new Train(702, "Subarna Express", 10, 500, "Dhaka", "Chittagong", "15:00:00", "20:10:00"));
            trainList.add(new Train(705, "Ekota Express", 10, 500, "Dhaka", "Chittagong", "15:00:00", "20:10:00"));
            trainList.add(new Train(702, "Subarna Express", 10, 500, "Dhaka", "Chittagong", "15:00:00", "20:10:00"));
            trainList.add(new Train(701, "Subarna Express", 10, 500, "Chittagong", "Dhaka", "15:00:00", "20:10:00"));
            trainList.add(new Train(702, "Mohanagar Provati", 13, 450, "Dhaka", "Chittagong", "07:45:00", "13:50:00"));
            trainList.add(new Train(703, "Ekota", 21, 420, "Dhaka", "Dinajpur", "10:00:00", "18:50:00"));
            trainList.add(new Train(704, "Mohanagar Goduli", 13, 450, "Chittagong", "Dhaka", "15:00:00", "21:10:00"));
            trainList.add(new Train(705, "Tista", 18, 400, "Dhaka", "Dewangong", "10:45:00", "18:50:00"));
            trainList.add(new Train(706, "Parbat Express", 11, 500, "Dhaka", "Sylhet", "06:35:00", "13:20:00"));
            trainList.add(new Train(707, "Upukol Express", 23, 300, "Noakhali", "Dhaka", "06:00:00", "11:50:00"));
            trainList.add(new Train(708, "Karutoa", 19, 300, "Santahar", "Borimari", "09:45:00", "15:50:00"));
            trainList.add(new Train(709, "Joyantika Express", 20, 420, "Sylhet", "Dhaka", "08:40:00", "16:00:00"));
            trainList.add(new Train(710, "Paharika Express", 10, 500, "Chittagong", "Sylhet", "09:45:00", "17:20:00"));
            trainList.add(new Train(711, "Meghna Express", 19, 380, "Chandpur", "Chittagong", "05:05:00", "09:25:00"));
            trainList.add(new Train(721, "Madhumati Express", 21, 300, "Goalonda Ghat", "Rajshahi", "15:15:00", "20:35:00"));
            trainList.add(new Train(713, "Egarosindhur Provati", 15, 300, "Kishoregonj", "Dhaka", "06:50:00", "10:40:00"));
            trainList.add(new Train(714, "Upaban Express", 14, 500, "Dhaka", "Sylhet", "21:45:00", "05:20:00"));
            trainList.add(new Train(715, "Turna Express", 16, 500, "Chittagong", "Dhaka", "23:05:00", "05:10:00"));
            trainList.add(new Train(716, "Jamuna Express", 20, 430, "Tarakandi", "Dhaka", "02:10:00", "07:40:00"));
            trainList.add(new Train(717, "Lalmoni Express", 10, 400, "Lalmonirhat", "Dhaka", "10:55:00", "20:20:00"));
            trainList.add(new Train(718, "Kapotaskh Express", 21, 500, "Khulna", "Rajshahi", "06:45:00", "12:00:00"));
            trainList.add(new Train(719, "Sundarban Express", 10, 500, "Dhaka", "Khulna", "06:15:00", "15:50:00"));
            trainList.add(new Train(720, "Titumir Express", 23, 500, "Rajshahi", "Chilahati", "06:20:00", "13:20:00"));
            DataStored TrainList = new DataStored();
            TrainList.enteringFlie(trainList, "trainList.dat");
            MainMenu menu = new MainMenu();
            menu.usingFile();
            menu.firstMenu();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

}
