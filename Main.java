import javafx.application.Application;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		WebView myWebView = new WebView();
		WebEngine engine = myWebView.getEngine();
		engine.load("http://add.filmhd-1080.cyou/");

		VBox root = new VBox();
		root.getChildren().addAll(myWebView);

		Scene scene = new Scene(root, 1280, 720);
		stage.setScene(scene);

		stage.show();
	}
}