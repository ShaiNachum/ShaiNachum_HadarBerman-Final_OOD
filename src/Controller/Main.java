///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Controller;

import Model.Model;
import View.MainView;
import javafx.application.*;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		MainView view = new MainView(stage);
		Model model = new Model();
		Controller controller = new Controller(view, model);
	}
}
