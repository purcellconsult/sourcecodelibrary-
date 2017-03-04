import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Shapes extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Shapes");
		Group root = new Group();
		Canvas canvas = new Canvas(300, 300); // boundaries of the canvas
		GraphicsContext graphics = canvas.getGraphicsContext2D();
		draw(graphics);
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	private void draw(GraphicsContext graphics) {
		graphics.setFill(Color.GREY);
		graphics.setStroke(Color.BLACK);
		graphics.setLineWidth(2.55);
		graphics.strokeLine(20, 20, 50, 75); // creates a line
		graphics.fillOval(20, 80, 50, 50); // creates a gray filled oval
		graphics.strokeOval(80, 80, 50, 50); // creates an oval
		graphics.fillOval(140, 80, 50, 50); // creates a gray filled oval
		graphics.strokeOval(200, 80, 50, 50); // creates an oval
		graphics.fillRect(20, 150, 100, 25); // creates a gray filled rectangle
		graphics.strokeRect(150, 150, 100, 25); // creates a rectangle
		graphics.fillArc(10, 200, 100, 50, 45, 100, ArcType.ROUND);
		graphics.strokeArc(100, 200, 100, 50, 45, 100, ArcType.ROUND);
		graphics.fillArc(200, 200, 100, 50, 45, 100, ArcType.ROUND);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
