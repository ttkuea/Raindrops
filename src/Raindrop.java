import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import raindrop.Drops;

public class Raindrop extends Application{
	private Drops drops;
	
	public void start(Stage stage){
		drops = new Drops();
		
		
		Pane root = new Pane();
		
		for (int i = 0; i < drops.getDrops().length; ++i) {
			root.getChildren().add(drops.getDrops()[i]);
		}
		
		Scene scene = new Scene(root, 500, 400);
		stage.setScene(scene);
		stage.setTitle("Rain rain, Raindrops on me...");
		stage.show();
		
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1. / 60), 
				e -> {
					drops.update();
				})
		);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
