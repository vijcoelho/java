import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
    private StackPane luzesStackPane;
    private boolean lampaLigada = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Controle de Luzes da Casa");

        luzesStackPane = new StackPane();
        AnchorPane.setRightAnchor(luzesStackPane, 20.0);
        AnchorPane.setTopAnchor(luzesStackPane, 20.0);
        root.getChildren().add(luzesStackPane);

        Button salaButton = new Button("Sala");
        salaButton.setOnAction(e -> exibirLuzesSala());
        AnchorPane.setLeftAnchor(salaButton, 20.0);
        AnchorPane.setTopAnchor(salaButton, 20.0);
        root.getChildren().add(salaButton);

        Button quartoButton = new Button("Quarto");
        quartoButton.setOnAction(e -> exibirLuzesQuarto());
        AnchorPane.setLeftAnchor(quartoButton, 20.0);
        AnchorPane.setTopAnchor(quartoButton, 60.0);
        root.getChildren().add(quartoButton);

        Button cozinhaButton = new Button("Cozinha");
        cozinhaButton.setOnAction(e -> exibirLuzesCozinha());
        AnchorPane.setLeftAnchor(cozinhaButton, 20.0);
        AnchorPane.setTopAnchor(cozinhaButton, 100.0);
        root.getChildren().add(cozinhaButton);

        // Adicione mais botões para outros cômodos aqui

        primaryStage.show();
    }

    private void exibirLuzesSala() {
        luzesStackPane.getChildren().clear(); // Limpa quaisquer luzes exibidas anteriormente

        HBox luzesSala = new HBox(); // Crie um HBox para organizar as luzes horizontalmente
        luzesSala.setSpacing(10); // Define o espaço entre as luzes

        // Crie os nós gráficos para representar as luzes da sala
        ImageView luz1 = new ImageView(new Image("light-bulb.png")); // Exemplo de uma imagem
        luz1.setFitWidth(100);
        luz1.setFitHeight(100);
        ImageView luz2 = new ImageView(new Image("light-bulb.png")); // Exemplo de outra imagem
        luz2.setFitWidth(100);
        luz2.setFitHeight(100);
        ImageView luz3 = new ImageView(new Image("light-bulb.png")); // Mais uma imagem
        luz3.setFitWidth(100);
        luz3.setFitHeight(100);
        // Adicione quantas luzes você quiser

        // Adicione os nós gráficos ao HBox
        luzesSala.getChildren().addAll(luz1, luz2, luz3); // Adicione todas as luzes desejadas

        // Adicione eventos de clique para alternar as imagens
        luz1.setOnMouseClicked(event -> alternarImagem(luz1));
        luz2.setOnMouseClicked(event -> alternarImagem(luz2));
        luz3.setOnMouseClicked(event -> alternarImagem(luz3));

        // Adicione o HBox com as luzes ao StackPane
        luzesStackPane.getChildren().add(luzesSala);
    }

    private void exibirLuzesQuarto() {
        luzesStackPane.getChildren().clear(); // Limpa quaisquer luzes exibidas anteriormente

        // Crie um nó gráfico para representar as luzes do quarto
        Rectangle luz1 = new Rectangle(100, 100, Color.YELLOW); // Exemplo de um retângulo amarelo
        Rectangle luz2 = new Rectangle(100, 100, Color.YELLOW); // Exemplo de outro retângulo amarelo

        // Adicione os nós gráficos ao StackPane
        luzesStackPane.getChildren().addAll(luz1, luz2);
    }

    private void exibirLuzesCozinha() {
        luzesStackPane.getChildren().clear(); // Limpa quaisquer luzes exibidas anteriormente

        // Crie um nó gráfico para representar as luzes da cozinha
        Rectangle luz1 = new Rectangle(100, 100, Color.YELLOW); // Exemplo de um retângulo amarelo
        Rectangle luz2 = new Rectangle(100, 100, Color.YELLOW); // Exemplo de outro retângulo amarelo

        // Adicione os nós gráficos ao StackPane
        luzesStackPane.getChildren().addAll(luz1, luz2);
    }

     // Variável de estado inicializada como desligada

    private void alternarImagem(ImageView imageView) {
        // Inverta o estado da lâmpada (ligada para desligada e vice-versa)
        lampaLigada = !lampaLigada;
    
        // Defina a imagem com base no novo estado
        if (lampaLigada) {
            // Se a lâmpada estiver ligada, defina a imagem "ligada"
            imageView.setImage(new Image("light-bulb-on.png"));
        } else {
            // Caso contrário, defina a imagem "desligada"
            imageView.setImage(new Image("light-bulb.png"));
        }
    }
    
    

}
