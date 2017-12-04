
package Test;

import java.sql.*;
class test{
public static void main(String args[]){
try{
//step1 load the driver class
Class.forName("oracle.jdbc.driver.OracleDriver");
String uname="system",password="oracle";
//step2 create the connection object
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe",uname,password);

if(con!=null) {
System.out.println("Connection Successfully with Username:"+uname+"\tPassword:"+password);
}
else
{
System.out.println("Username or Password Incorrect");
}

}catch(Exception e){ System.out.println(e);}

}
} 
