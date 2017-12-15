package totemSrc;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Menu
{
    @FXML
    Button totem_Home,totem_Reserva, totem_Menu, totem_Contact;

    @FXML
    ImageView totemOff;

    public void totemHome(ActionEvent actionEvent)
    {
        Stage stage = (Stage) totem_Home.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
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

    public void totemReserva(ActionEvent actionEvent) {
        Stage stage = (Stage) totem_Reserva.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Reserva.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setContentText("Se cerro esta aplicación por un error de excepción.");
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

    public void totemMenu(ActionEvent actionEvent) {
        Stage stage = (Stage) totem_Menu.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setContentText("Se cerro esta aplicación por un error de excepción.");
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

    public void totemContacto(ActionEvent actionEvent) {
        Stage stage = (Stage) totem_Contact.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Contacto.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e)
        {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setContentText("Se cerro esta aplicación por un error de excepción.");
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
