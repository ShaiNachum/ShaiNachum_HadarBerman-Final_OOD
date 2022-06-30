///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import java.util.ArrayList;

import Model.Ship;
import Model.StackOfConts;
import Model.StackOnTruck;
import Model.TmpStack;
import Model.Truck;
import javafx.scene.shape.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class MainView {
	private Stage stage;
	private Group root;
	private Scene scene;

	public MainView(Stage s) {
		root = new Group();
		scene = new Scene(root, 800, 600);
		scene.setFill(Color.PALETURQUOISE);

		// for the deck
		Rectangle r = new Rectangle(0, 540, 800, 60);
		r.setFill(Color.GRAY);
		root.getChildren().add(r);
		

		stage = s;
		stage.setScene(scene);
		stage.show();
	}

	public void addEventHandler(EventHandler<MouseEvent> mark) {
		scene.addEventHandler(MouseEvent.MOUSE_CLICKED, mark);
	}

	public void addButton(Button b) {
		root.getChildren().add(b);
	}

	public void listView(ArrayList<StackOfConts> list) {
		ListOfStacksView los = new ListOfStacksView(list);
		los.show(root);
	}

	public void stackOnTruckView(StackOnTruck sot) {
		StackOnTruckView sotv = new StackOnTruckView(sot);
		sotv.show(root);
	}

	public void tmpStackView(TmpStack ts) {
		TmpStackView tsv = new TmpStackView(ts);
		tsv.show(root);
	}
	
	public void TruckView(Truck truck) {
		TruckView tV = new TruckView(truck);
		tV.show(root);
	}
	
	public void ShipView(Ship ship) {
		ShipView sV = new ShipView(ship);
		sV.show(root);
	}

	public void clearAll() {
		root.getChildren().clear();
		Rectangle r = new Rectangle(0, 540, 800, 60);
		r.setFill(Color.GRAY);
		root.getChildren().add(r);

	}
}