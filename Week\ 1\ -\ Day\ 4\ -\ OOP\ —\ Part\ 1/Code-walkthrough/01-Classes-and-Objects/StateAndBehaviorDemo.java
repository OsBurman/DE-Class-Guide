/**
 * State and Behavior Demo
 * 
 * Demonstrates:
 * - Objects as carriers of state and behavior
 * - How state changes affect behavior
 * - Relationship between fields and methods
 * - Real-world object modeling
 * - Encapsulation of related data and methods
 * 
 * Key Concepts:
 * - State = current values of fields
 * - Behavior = what methods do based on state
 * - State changes can alter behavior outcomes
 * - Objects combine related state and behavior
 */

public class StateAndBehaviorDemo {

    // Example 1: Simple state affecting output
    public static void demonstrateStateAffectsBehavior() {
        System.out.println("=== Example 1: State Affects Behavior ===");

        class TrafficLight {
            String color; // State

            void showStatus() {
                // Behavior depends on state
                if (color.equals("red")) {
                    System.out.println("STOP");
                } else if (color.equals("yellow")) {
                    System.out.println("CAUTION");
                } else if (color.equals("green")) {
                    System.out.println("GO");
                }
            }
        }

        TrafficLight light = new TrafficLight();

        light.color = "red";
        light.showStatus();

        light.color = "green";
        light.showStatus();

        light.color = "yellow";
        light.showStatus();
    }

    // Example 2: State affecting calculations
    public static void demonstrateStateInCalculations() {
        System.out.println("\n=== Example 2: State in Calculations ===");

        class Temperature {
            double celsius; // State

            double convertToFahrenheit() {
                // Calculation depends on state
                return (celsius * 9 / 5) + 32;
            }

            String describeWeather() {
                // Behavior depends on state
                if (celsius < 0)
                    return "Freezing";
                if (celsius < 15)
                    return "Cold";
                if (celsius < 25)
                    return "Pleasant";
                return "Hot";
            }
        }

        Temperature temp = new Temperature();

        temp.celsius = -5;
        System.out.println(temp.celsius + "°C = " + temp.convertToFahrenheit() + "°F (" + temp.describeWeather() + ")");

        temp.celsius = 20;
        System.out.println(temp.celsius + "°C = " + temp.convertToFahrenheit() + "°F (" + temp.describeWeather() + ")");

        temp.celsius = 35;
        System.out.println(temp.celsius + "°C = " + temp.convertToFahrenheit() + "°F (" + temp.describeWeather() + ")");
    }

    // Example 3: Multiple state variables working together
    public static void demonstrateMultipleStateVariables() {
        System.out.println("\n=== Example 3: Multiple State Variables ===");

        class Player {
            String name; // State
            int health; // State
            int mana; // State
            int level; // State

            void takeDamage(int damage) {
                health = health - damage;
                System.out.println(name + " takes " + damage + " damage. Health: " + health);
            }

            void castSpell(int manaCost) {
                if (mana >= manaCost) {
                    mana = mana - manaCost;
                    System.out.println(name + " casts spell. Mana: " + mana);
                } else {
                    System.out.println(name + " doesn't have enough mana!");
                }
            }

            void levelUp() {
                level = level + 1;
                health = health + 20;
                mana = mana + 10;
                System.out.println(name + " leveled up to " + level + "! Health: " + health + ", Mana: " + mana);
            }

            boolean isAlive() {
                return health > 0;
            }
        }

        Player player = new Player();
        player.name = "Hero";
        player.health = 100;
        player.mana = 50;
        player.level = 1;

        player.castSpell(20);
        player.takeDamage(30);
        player.takeDamage(50);
        System.out.println("Is alive? " + player.isAlive());
        player.levelUp();
        System.out.println("Is alive? " + player.isAlive());
    }

    // Example 4: State affecting eligibility
    public static void demonstrateStateAsEligibilityCriteria() {
        System.out.println("\n=== Example 4: State as Eligibility ===");

        class BankAccount {
            String accountType; // State
            double balance; // State
            int yearsActive; // State

            boolean isEligibleForLoan() {
                // Eligibility depends on multiple state variables
                if (accountType.equals("premium")) {
                    return yearsActive >= 1 && balance >= 5000;
                } else {
                    return yearsActive >= 2 && balance >= 10000;
                }
            }

            double getLoanLimit() {
                if (!isEligibleForLoan())
                    return 0;
                // Loan limit depends on state
                return balance * (accountType.equals("premium") ? 3 : 2);
            }

            void displayLoanInfo() {
                System.out.println("Account Type: " + accountType + " | Balance: $" + balance +
                        " | Years Active: " + yearsActive);
                System.out.println("Eligible for loan? " + isEligibleForLoan() +
                        " | Loan Limit: $" + getLoanLimit());
            }
        }

        BankAccount account1 = new BankAccount();
        account1.accountType = "regular";
        account1.balance = 8000;
        account1.yearsActive = 1;
        account1.displayLoanInfo();

        System.out.println();

        BankAccount account2 = new BankAccount();
        account2.accountType = "premium";
        account2.balance = 20000;
        account2.yearsActive = 3;
        account2.displayLoanInfo();
    }

    // Example 5: State transitions through methods
    public static void demonstrateStateTransitions() {
        System.out.println("\n=== Example 5: State Transitions ===");

        class Order {
            String status; // State
            double amount; // State
            boolean paid; // State

            void processPayment() {
                if (status.equals("pending")) {
                    paid = true;
                    status = "processing";
                    System.out.println("Payment processed. Order now: " + status);
                } else {
                    System.out.println("Cannot process payment. Order is: " + status);
                }
            }

            void ship() {
                if (status.equals("processing") && paid) {
                    status = "shipped";
                    System.out.println("Order shipped!");
                } else {
                    System.out.println("Cannot ship. Status: " + status + ", Paid: " + paid);
                }
            }

            void deliver() {
                if (status.equals("shipped")) {
                    status = "delivered";
                    System.out.println("Order delivered!");
                } else {
                    System.out.println("Cannot deliver. Status: " + status);
                }
            }

            void displayStatus() {
                System.out.println("Status: " + status + " | Amount: $" + amount + " | Paid: " + paid);
            }
        }

        Order order = new Order();
        order.status = "pending";
        order.amount = 99.99;
        order.paid = false;

        order.displayStatus();
        order.processPayment();
        order.displayStatus();
        order.ship();
        order.displayStatus();
        order.deliver();
        order.displayStatus();
    }

    // Example 6: Behavior reflecting current state
    public static void demonstrateBehaviorReflectingState() {
        System.out.println("\n=== Example 6: Behavior Reflecting Current State ===");

        class VendingMachine {
            int itemsAvailable; // State
            boolean isPoweredOn; // State
            boolean hasMoney; // State

            void insertMoney() {
                if (isPoweredOn) {
                    hasMoney = true;
                    System.out.println("Money inserted");
                } else {
                    System.out.println("Machine is powered off");
                }
            }

            void selectItem() {
                if (!isPoweredOn) {
                    System.out.println("Machine is powered off");
                } else if (!hasMoney) {
                    System.out.println("Please insert money first");
                } else if (itemsAvailable <= 0) {
                    System.out.println("Item out of stock");
                } else {
                    itemsAvailable = itemsAvailable - 1;
                    hasMoney = false;
                    System.out.println("Item dispensed! Items left: " + itemsAvailable);
                }
            }

            void refill() {
                itemsAvailable = 10;
                System.out.println("Machine refilled");
            }

            void powerOn() {
                isPoweredOn = true;
                System.out.println("Machine powered on");
            }

            void powerOff() {
                isPoweredOn = false;
                System.out.println("Machine powered off");
            }
        }

        VendingMachine machine = new VendingMachine();
        machine.itemsAvailable = 5;

        machine.selectItem(); // Machine off
        machine.powerOn();
        machine.selectItem(); // No money
        machine.insertMoney();
        machine.selectItem(); // Success
        machine.insertMoney();
        machine.selectItem(); // Success
        machine.powerOff();
        machine.insertMoney(); // Machine off
    }

    // Example 7: Complex state-driven behavior
    public static void demonstrateComplexStateBehavior() {
        System.out.println("\n=== Example 7: Complex State-Driven Behavior ===");

        class Database {
            boolean isConnected; // State
            boolean isLocked; // State
            int queryCount; // State

            void connect() {
                isConnected = true;
                isLocked = false;
                queryCount = 0;
                System.out.println("Database connected");
            }

            void executeQuery(String sql) {
                if (!isConnected) {
                    System.out.println("Error: Not connected");
                } else if (isLocked) {
                    System.out.println("Error: Database is locked");
                } else {
                    queryCount = queryCount + 1;
                    System.out.println("Query executed: " + sql + " (Total: " + queryCount + ")");
                }
            }

            void lockDatabase() {
                if (isConnected) {
                    isLocked = true;
                    System.out.println("Database locked for maintenance");
                }
            }

            void unlockDatabase() {
                isLocked = false;
                System.out.println("Database unlocked");
            }

            void disconnect() {
                isConnected = false;
                System.out.println("Database disconnected. Total queries: " + queryCount);
            }
        }

        Database db = new Database();
        db.executeQuery("SELECT * FROM users"); // Not connected

        db.connect();
        db.executeQuery("SELECT * FROM users");
        db.executeQuery("INSERT INTO logs VALUES (...)");

        db.lockDatabase();
        db.executeQuery("SELECT * FROM users"); // Locked

        db.unlockDatabase();
        db.executeQuery("UPDATE users SET...");

        db.disconnect();
    }

    public static void main(String[] args) {
        demonstrateStateAffectsBehavior();
        demonstrateStateInCalculations();
        demonstrateMultipleStateVariables();
        demonstrateStateAsEligibilityCriteria();
        demonstrateStateTransitions();
        demonstrateBehaviorReflectingState();
        demonstrateComplexStateBehavior();
    }
}
