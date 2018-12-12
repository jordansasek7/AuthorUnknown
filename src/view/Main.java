//-------------------------------------------------------------------------------------------------
//    FILE: Author.java
//    BY: Sasek, J
//    ORG: COP 3003
//    Date: 12/12/2018
//    DESC: Main will work with the Model, View and Controller packages to create a usable Gui
//    database to perform specific SQL statements for a user in a GUI Database designed program
//     The Stage will be set by the AuthorView.fxml file under the view package
//    CODE Retrieved from GitHub: Acknowledgement to Prof. Vanselow
//    Modified code from ONUR BASKIRT.
//    https://www.swtestacademy.com/database-operations-javafx/
//    ---------------------------------------------------------------------------------------------

package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("AuthorView.fxml"));
    primaryStage.setTitle("DAO Authors");
    primaryStage.setScene(new Scene(root, 422, 344));
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}