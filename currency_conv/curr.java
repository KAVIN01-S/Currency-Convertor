import java.util.*;
import java.sql.*;

class curr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eval = 'Y';
        while (eval == 'Y') {
            System.out.println(
                    "*** WelCome to My Currency Converter Project ***\nEnter the currency code \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Kuwaiti dinar");
            int code = sc.nextInt();
            try {
                String s = "";
                if (code == 1) {
                    s = "select * from Currency where curr='Rupees'";
                } else if (code == 2) {
                    s = "select * from Currency where curr='Dollar'";
                } else if (code == 3) {
                    s = "select * from Currency where curr='Pound'";
                } else if (code == 4) {
                    s = "select * from Currency where curr='Euro'";
                } else if (code == 5) {
                    s = "select * from Currency where curr='Kuwaiti Dinar'";
                } else {
                    System.out.println("Invalid Input");
                    continue;

                }
                System.out.println("Enter the amount");
                double amt= sc.nextDouble();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/csea?user=root&password=root&useUnicode=true&characterEncoding=UTF-8");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(s);

                if (code == 1) {
                    while (rs.next()) {
                        System.out.println("Dollar         :" + amt * rs.getDouble(2));
                        System.out.println("Pound          :" + amt * rs.getDouble(3));
                        System.out.println("Euro           :" + amt * rs.getDouble(4));
                        System.out.println("Kuwaiti Dinar  :" + amt * rs.getDouble(5));
                    }

                }
                if (code == 2) {
                    while (rs.next()) {
                        System.out.println("Rupees         :" + amt * rs.getDouble(2));
                        System.out.println("Pound          :" + amt * rs.getDouble(3));
                        System.out.println("Euro           :" + amt * rs.getDouble(4));
                        System.out.println("Kuwaiti Dinar  :" + amt * rs.getDouble(5));
                    }
                }
                if (code == 3) {
                    while (rs.next()) {
                        System.out.println("Rupees         :" + amt * rs.getDouble(2));
                        System.out.println("Dollar         :" + amt * rs.getDouble(3));
                        System.out.println("Euro           :" + amt * rs.getDouble(4));
                        System.out.println("Kuwaiti Dinar  :" + amt * rs.getDouble(5));
                    }
                }
                if (code == 4) {
                    while (rs.next()) {
                        System.out.println("Rupees         :" + amt * rs.getDouble(2));
                        System.out.println("Dollar         :" + amt * rs.getDouble(3));
                        System.out.println("Pound          :" + amt * rs.getDouble(4));
                        System.out.println("Kuwaiti Dinar  :" + amt * rs.getDouble(5));
                    }
                }
                if (code == 5) {
                    while (rs.next()) {
                        System.out.println("Rupees         :" + amt * rs.getDouble(2));
                        System.out.println("Dollar         :" + amt * rs.getDouble(3));
                        System.out.println("Pound          :" + amt * rs.getDouble(4));
                        System.out.println("Euro           :" + amt * rs.getDouble(5));
                    }
                }
                con.close();
            }

            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Continue?? Y/N");
            eval = sc.next().charAt(0);
        }
        System.out.println("Thank You!!");
    }
}