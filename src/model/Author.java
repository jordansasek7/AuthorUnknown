//-------------------------------------------------------------------------------------------------
//    FILE: Author.java
//    BY: Sasek, J
//    ORG: COP 3003
//    Date: 12/12/2018
//    DESC: Author will work with the View and Controller packages to create a usable Gui
//    database to store the author's names and give them an ID tags.
//    CODE Retrieved from GitHub: Acknowledgement to Prof. Vanselow
//    Modified code from ONUR BASKIRT.
//    https://www.swtestacademy.com/database-operations-javafx/
//    ---------------------------------------------------------------------------------------------

package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Author {

  //Declare Employees Table Columns
  private IntegerProperty author_id;
  private StringProperty first_name;
  private StringProperty last_name;

  //Constructor
  public Author() {
    this.author_id = new SimpleIntegerProperty();
    this.first_name = new SimpleStringProperty();
    this.last_name = new SimpleStringProperty();
  }

  public int getAuthorID() {
    return author_id.get();
  }

  public IntegerProperty author_idProperty() {
    return author_id;
  }

  public void setAuthorId(int author_id) {
    this.author_id.set(author_id);
  }

  public String getFirstName() {
    return first_name.get();
  }

  public StringProperty first_nameProperty() {
    return first_name;
  }

  public void setFirstName(String first_name) {
    this.first_name.set(first_name);
  }

  public String getLast_name() {
    return last_name.get();
  }

  public StringProperty last_nameProperty() {
    return last_name;
  }

  public void setLastName(String last_name) {
    this.last_name.set(last_name);
  }
}