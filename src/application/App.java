package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application 
{

	public static void main(String[] args)
	{
		launch(args);
		

	}

	@Override
	public void start(Stage arg0) throws Exception 
	{
		
		Group root = new Group();
		Scene scene= new Scene(root,600,400);
		arg0.setScene(scene);
		arg0.setTitle("Motherf*** Johns!");
		arg0.show();
	}

}
