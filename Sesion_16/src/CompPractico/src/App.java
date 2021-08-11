import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Vistas/loginFrm.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("D2ST");
        primaryStage.getIcons().add(new Image("/img/favicon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}