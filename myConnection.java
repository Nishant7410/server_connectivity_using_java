import java.sql.*;  
class myConnection
{  
    public static void main(String args[])
    {  
        System.out.println("hello");
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NISHANT","9728686066Ns");  
  
            Statement stmt=con.createStatement();  
  
            ResultSet rs=stmt.executeQuery("select * from emp where empno=123");
            ResultSetMetaData rm=rs.getMetaData();
            int flag=0;
            while(rs.next())
            {
                String s="";
                for(int i=1;i<=rm.getColumnCount();i++)
                {
                    s+=rs.getString(i)+" ";
                }
                System.out.println(s);
                flag++;
            }
  
            if(flag == 0)
            {
                System.out.println("No Data Found");
            }
            con.close();  
  
        }
        catch(Exception e){
             System.out.println(e);
        }  
  
    }  
}  