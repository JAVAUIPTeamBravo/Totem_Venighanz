package totemSrc;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Inicio
{
    @FXML
    ImageView totemOff, totemHomeBtn, totemReservaBtn, totemMenuBtn, totemContactoBtn;

    public void totemHome(MouseEvent mouseEvent)
    {
        Stage stage = (Stage) totemHomeBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Reserva.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("No se encuentra el documento.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition load = new FadeTransition(Duration.millis(1500), root);
        load.setFromValue(0.0);
        load.setToValue(1.0);
        load.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void totemReserva(MouseEvent mouseEvent) {
        Stage stage = (Stage) totemHomeBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Reserva.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("No se encuentra el documento.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition load = new FadeTransition(Duration.millis(1500), root);
        load.setFromValue(0.0);
        load.setToValue(1.0);
        load.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void totemMenu(MouseEvent mouseEvent) {
        Stage stage = (Stage) totemHomeBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Reserva.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("No se encuentra el documento.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition load = new FadeTransition(Duration.millis(1500), root);
        load.setFromValue(0.0);
        load.setToValue(1.0);
        load.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void totemContacto(MouseEvent mouseEvent) {
        Stage stage = (Stage) totemHomeBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Reserva.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("No se encuentra el documento.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition load = new FadeTransition(Duration.millis(1500), root);
        load.setFromValue(0.0);
        load.setToValue(1.0);
        load.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Boton de Salida
    public void totemExit(MouseEvent mouseEvent)
    {
        System.out.println("Cerrando programa...");
        Platform.exit();
    }
}
