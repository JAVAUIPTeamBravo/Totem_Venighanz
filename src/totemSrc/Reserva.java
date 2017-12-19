package totemSrc;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Reserva
{
    //Variables y campos
    @FXML
    TextField totemInputRes;

    @FXML
    DatePicker totemInputDate;

    @FXML
    Button totem_Home,totem_Reserva, totem_Menu, totem_Contact, totem_ConfirmRes, totem_ConfirmLib;

    @FXML
    ImageView totemOff,mesa1,mesa2,mesa3,mesa4,mesa5,mesa6;

    @FXML
    Image img;

    String Kk,Jj,estadoImg="libre";

    //======================================= Eventos y Metodos/Funciones ==================================================
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

    // Se ejecuta cuando carga la pantalla
    public void totemSetReservas() {
        String totem_linea = null;
        try
        {
            FileReader totem_fileReader = new FileReader("database_reserva.txt");
            BufferedReader totem_bufferedReader = new BufferedReader(totem_fileReader);
            while((totem_linea = totem_bufferedReader.readLine()) != null) {
                List<String> totem_data = Arrays.asList(totem_linea.split(","));
                Kk = totem_data.get(0);
                Jj = totem_data.get(1);
                switch(Kk)
                {
                    case "1":
                        if(Jj.equals("OCUPADA"))
                        {
                            estadoImg = "reservado";
                        }
                        mesa1.setImage(new Image("file:images/"+estadoImg+".png"));
                        break;
                    case "2":
                        if(Jj.equals("OCUPADA"))
                        {
                            estadoImg = "reservado";
                        }
                        mesa2.setImage(new Image("file:images/"+estadoImg+".png"));
                        break;
                    case "3":
                        if(Jj.equals("OCUPADA"))
                        {
                            estadoImg = "reservado";
                        }
                        mesa3.setImage(new Image("file:images/"+estadoImg+".png"));
                        break;
                    case "4":
                        if(Jj.equals("OCUPADA"))
                        {
                            estadoImg = "reservado";
                        }
                        mesa4.setImage(new Image("file:images/"+estadoImg+".png"));
                        break;
                    case "5":
                        if(Jj.equals("OCUPADA"))
                        {
                            estadoImg = "reservado";
                        }
                        mesa5.setImage(new Image("file:images/"+estadoImg+".png"));
                        break;
                    case "6":
                        if(Jj.equals("OCUPADA"))
                        {
                            estadoImg = "reservado";
                        }
                        mesa6.setImage(new Image("file:images/"+estadoImg+".png"));
                        break;
                    default:
                            break;
                }
            }
            totem_bufferedReader.close();
        } catch (FileNotFoundException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setContentText("Archivo no encontrado.");
            alerta.showAndWait();
            Platform.exit();
        } catch (IOException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setContentText("El archivo tuvo un error de entrada y salida.");
            alerta.showAndWait();
            Platform.exit();
        }
    }

    //Boton escribir
    public void totemDatosCargar(ActionEvent actionEvent) {
        LocalDate totemFechaRes = totemInputDate.getValue();
        try {
            if (totemFechaRes.isBefore(LocalDate.now())) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
                alerta.setHeaderText("La fecha es incorrecta por que es menor que el dia de hoy");
                alerta.setContentText("Intenta nuevamente.");
                alerta.showAndWait();
                return;
            }
        } catch (NullPointerException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setHeaderText("Fecha incorrecta: No hay valores en la fecha. ¯\\_(ツ)_/¯ ");
            alerta.setContentText("Intenta nuevamente.");
            alerta.showAndWait();
            return;
        }

        String linea = null;
        ObservableList<String> totemVisteObservable = FXCollections.observableArrayList();
        try {
            FileReader totemfileReader = new FileReader("database_reserva.txt");
            BufferedReader totembufferedReader = new BufferedReader(totemfileReader);
            while ((linea = totembufferedReader.readLine()) != null) {
                List<String> totemdatos = Arrays.asList(linea.split(","));
                String Rk = totemInputRes.getText();
                Kk = totemdatos.get(0);
                int Jk = Integer.parseInt(Rk);
                int Uk = Integer.parseInt(Kk);
                if(Jk == Uk)
                {
                    if(Jk >= 1 && Jk <= 6)
                    {
                        totemVisteObservable.set(Jk,Rk + ",OCUPADA," + totemInputDate);
                    }
                    else
                    {
                        break;
                    }
                }
            }
            totembufferedReader.close();
        } catch (FileNotFoundException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setHeaderText("Error encontrado el archivo ");
            alerta.setContentText("Intenta nuevamente.");
            alerta.showAndWait();
            return;
        } catch (IndexOutOfBoundsException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setHeaderText("Error con llenar el archivo por que esta fuera del limite ");
            alerta.setContentText("Intenta nuevamente.");
            alerta.showAndWait();
            return;
        } catch (IOException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setHeaderText("Error de entrada y salida del documento ¯\\_(ツ)_/¯ ");
            alerta.setContentText("Intenta nuevamente.");
            alerta.showAndWait();
            return;
        }

        Stage stage = (Stage) totem_ConfirmRes.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Resultado.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("AY LMAOOOOOOOO, se cerro :(");
            alerta.setHeaderText("Error abriendo el archivo");
            alerta.setContentText("Intenta nuevamente.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
