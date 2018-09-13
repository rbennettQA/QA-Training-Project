import java.sql.*;

public class Controller {
    private String dbURL = "jdbc:mysql://18.202.27.131:3306";
    private Connection con;

    public static void main(String[] args){
        Controller controller = new Controller();
        controller.begin();
    }

    private void begin(){
        System.out.println("Starting");
        establishConnection();
        //insertStuff();
        //testSearch("Location");
    }

    // establish connection
    private void establishConnection(){
        try{
            System.out.println("Establishing Connection");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL,"root","els");
        }
        catch(Exception e) {
            System.out.println("Error - " + e);
        }
    }

    private void testSearch(String search) {
        System.out.println("Testing Search");

        String query = "SELECT " + search + " FROM nsa.rooms;";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                System.out.print(rs.getString(1));
            }

        } catch (SQLException e) {
            System.out.println("Error - " + e);
        }
    }

    private void insertStuff(){
        String insertQuery = "UPDATE nsa.rooms SET noBeds = 1 WHERE id = 4;";
        try {
            PreparedStatement stmt = con.prepareStatement(insertQuery);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error - " + e);
        }
        System.out.println("worked?");
    }

    private void getDetailedInformation() {
    /*
        find the detailed information relevant
            - want to have this accessible via a click on a room
            - probably handled client side then?
     */
    }

    private void getAvailableRooms() {

    }

    private void roomSearchByPrice(int price){

    }

    private void roomSearchByCity(String city){

    }

    private void roomSearchByBedrooms(int bedrooms){

    }


}

/*
    private void testQuery() {
        HashMap<String, String> map = new HashMap<String, String>();
        String query = "SELECT number FROM Nsarooms;";
        try (PreparedStatement stmt = c.prepareStatement(query)) {
            ResultSet r = stmt.executeQuery();

            while (r.next()) {
                map.put(r.getString("username"), r.getString("name"));
            }
        } catch (SQLException e) {

        }
    }
*/

