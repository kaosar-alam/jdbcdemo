package jdbc;
import java.sql.*;
public class Dboperation {
    Connection conn;
    public void doConnectDB() {
        String connectionStr = "jdbc:mysql://localhost:3306/" + Utils.DB_NAME;
        String userName = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(connectionStr, userName, password);
            System.out.println("DB Connection is seccussful!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        public void fetchData() {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM "+Utils.TABLE_NAME);

                while (rs.next()) {
                    String group = rs.getString(Utils.COLOUMN_GROUP);
                    int student_id = rs.getInt(Utils.COLOUMN_STUDENT_ID);
                    String section = rs.getString(Utils.COLOUMN_SECTION);
                    System.out.println("Group: " + group + ", Student_id: " + student_id + ", Blood group: "+section);
                }
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
    }

