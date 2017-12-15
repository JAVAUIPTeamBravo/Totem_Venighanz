package totemSrc;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Reserva
{
    @FXML
    ImageView totemHomeBtn, totemReservaBtn, totemMenuBtn, totemContactoBtn;

    //Boton de Salida
    public void totemExit(ActionEvent actionEvent)
    {
        System.out.println("Cerrando programa...");
        Platform.exit();
    }

    public void totemHome(MouseEvent mouseEvent)
    {
        Stage stage = (Stage) totemHomeBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("opcion.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void totemReserva(MouseEvent mouseEvent) {
        Stage stage = (Stage) totemReservaBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reserva.fxml"));
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
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Reserva controller = fxmlLoader.<Reserva>getController();
        //controller.setCuenta();
        //controller.setSaldo();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void totemMenu(MouseEvent mouseEvent) {
        Stage stage = (Stage) totemMenuBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("opcion.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void totemContacto(MouseEvent mouseEvent) {
        Stage stage = (Stage) totemContactoBtn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("opcion.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
