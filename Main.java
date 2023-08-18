package jdbc;

public class Main {
    public static void main(String args[]){
        Dboperation dbObj = new Dboperation();
        dbObj.doConnectDB();
        dbObj.fetchData();
    }

}
