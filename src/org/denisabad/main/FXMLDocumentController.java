package org.denisabad.main;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLDocumentController implements Initializable {
    double valor1, valor2, result; 
    int op;
    
    @FXML private TextField txtPantalla;
    @FXML private Button btnCero; 
    @FXML private Button btnUno; 
    @FXML private Button btnDos; 
    @FXML private Button btnTres; 
    @FXML private Button btnCuatro; 
    @FXML private Button btnCinco; 
    @FXML private Button btnSeis;
    @FXML private Button btnSiete; 
    @FXML private Button btnOcho; 
    @FXML private Button btnNueve; 
    @FXML private Button btnMas; 
    @FXML private Button btnMenos; 
    @FXML private Button btnMulti; 
    @FXML private Button btnDivi; 
    @FXML private Button btnPunto; 
    @FXML private Button btnUnoX;
    @FXML private Button btnCuadrado; 
    @FXML private Button btnRaiz; 
    @FXML private Button btnPorciento; 
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnMasMenos;
    @FXML private Button btnIgual; 
    @FXML private ImageView imgCerrar;    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7"); 
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        else if (event.getSource() == btnCE)
            txtPantalla.setText("");
        
        else if(event.getSource() == btnUnoX){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result = 1/valor1;
            txtPantalla.setText(String.valueOf(result));
        }else if (event.getSource()==btnPorciento){
            valor2 = Double.parseDouble(txtPantalla.getText());
            double opp =(valor1 * valor2)/100;
            txtPantalla.setText(String.valueOf(opp));
        }else if (event.getSource()==btnMasMenos){
            valor1 = Double.parseDouble(txtPantalla.getText());
            valor1 = -valor1;
            txtPantalla.setText(String.valueOf(valor1));
        }else if (event.getSource() == btnCuadrado){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result = valor1 * valor1;
            txtPantalla.setText(String.valueOf(result));
        }else if (event.getSource() == btnRaiz){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result = Math.sqrt(valor1);
            txtPantalla.setText(String.valueOf(result));
        }else if (event.getSource() == btnC){
            txtPantalla.setText("");
            valor1 = 0;
            valor2 = 0;
        }else if (event.getSource() == btnMas){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 1;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnMenos){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 2;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnMulti){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 3;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnDivi){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 4;
            btnPunto.setDisable(false);
        }else if(event.getSource() == btnPunto){    
            if(txtPantalla.getText().equals("")){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
            }else{
                String aux = txtPantalla.getText();
                txtPantalla.setText(aux + ".");
                btnPunto.setDisable(true);
        }
        
        }else if (event.getSource() == btnIgual){
            valor2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            switch(op){
                case 1:
                    result = valor1 + valor2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 2: 
                    result = valor1 - valor2;
                    txtPantalla.setText(String.valueOf(result));
                    break; 
                case 3: 
                    result = valor1 * valor2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 4:
                    result = valor1 / valor2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
