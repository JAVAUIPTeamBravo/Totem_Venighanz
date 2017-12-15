package totemSrc;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    //Se declarán para que la aplicación pueda moverse sin ventanas decorativas
    private double x = 0;
    private double y = 0;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        //Añade eventos para que la ventana pueda moverse con un evento de Mouse
        root.setOnMousePressed(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                x = event.getSceneX();
                y = event.getSceneY();
            }
        });
        //Hacer que se mueva la sección con evento de Mouse
        root.setOnMouseDragged(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                primaryStage.setX(event.getScreenX() - x);
                primaryStage.setY(event.getScreenY() - y);
            }
        });
        //Se declará el Stage Borderless o sin botones del sistema operativo, completo override del tema del sistema
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("Venighanz Grill & Tavern");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
