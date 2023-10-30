import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
    private StackPane luzesStackPane;

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

        HBox luzesSala = new HBox();
        // Crie um nó gráfico para representar as luzes da sala
        Rectangle luz1 = new Rectangle(100, 100, Color.YELLOW); // Exemplo de um retângulo amarelo
        Rectangle luz2 = new Rectangle(50, 50, Color.BLACK); // Exemplo de outro retângulo amarelo

        // Adicione os nós gráficos ao StackPane
        luzesStackPane.getChildren().addAll(luz1, luz2);
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

    // Adicione métodos semelhantes para outros cômodos

    public void stop() {
        // Lógica de encerramento, se necessário
    }
}
