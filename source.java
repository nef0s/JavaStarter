
package triangle;
import javafx.util.Duration;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Pane p=new Pane();
        Polygon poly=new Polygon();
        poly.getPoints().add(100.0);
        poly.getPoints().add(200.0);
        
        poly.getPoints().add(300.0);
        poly.getPoints().add(200.0);
        
        poly.getPoints().add(200.0);
        poly.getPoints().add(50.0);
        
        poly.setFill(Color.GREEN);
        poly.setStrokeWidth(70);
        Circle krug = new Circle();
        krug.setRadius(13);
        krug.setFill(Color.GRAY);
        PathTransition t=new PathTransition(Duration.seconds(2),poly,krug);
        t.setCycleCount(Timeline.INDEFINITE);
        p.getChildren().addAll(poly, krug);
        t.play();
        primaryStage.setScene(new Scene(p,500,500));
        primaryStage.show();
        
        

    }

    /**
     * nef0s
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
