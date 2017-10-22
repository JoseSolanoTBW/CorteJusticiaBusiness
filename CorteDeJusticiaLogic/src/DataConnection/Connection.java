/**
 * Autor: Jose Solano Montoya
 */

package DataConnection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Connection {

  private static String Host;
  private static String Username;
  private static String Password;
  private static String Database;

  private   void jsonParse() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException{
      JSONParser parser = new JSONParser();
      Object obj = parser.parse(new FileReader("src/data/connectionSettings.json")); //the location of the file
      JSONObject jsonObject = (JSONObject) obj;
      Host = (String) jsonObject.get("Hostname");
      Username = (String) jsonObject.get("Username");
      Password = (String) jsonObject.get("Password");
      Database =(String) jsonObject.get("Database");
  }

  protected java.sql.Connection getConnection()throws IOException {
    java.sql.Connection connection = null;

    try {
	connection = DriverManager.getConnection("jdbc:mysql://" + Host + "/" +Database , Username , Password);

    } catch (SQLException e) {
    
        System.out.println("Connection Failed! Check output console " + e.toString());
    }
        return connection;
  }
}
