///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Controller;

import Model.Model;
import View.MainView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller {
	private MainView view;
	private Model model;

	public Controller(MainView mv, Model m) {
		view = mv;
		model = m;

		view.listView(model.getList());
		view.ShipView(model.getShip());//new
		view.TruckView(model.getTruck());//new

		EventHandler<MouseEvent> click = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				int clickX = (int) event.getX();
				int clickY = (int) event.getY();

				model.markCont(clickX, clickY);
				view.listView(model.getList());
			}
		};

		view.addEventHandler(click);

		Button move = new Button("Move");
		move.setLayoutX(50.0);
		move.setLayoutY(50.0);

		view.addButton(move);
		move.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				model.moveCont();
				view.clearAll();
				view.addButton(move);
				view.ShipView(model.getShip());
				view.listView(model.getList());
				view.stackOnTruckView(model.getSot());
				view.tmpStackView(model.getTs());//new
				view.TruckView(model.getTruck());//new

			}
		});
	}

}
