/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 14: Problem 4                                            *****
 *****___________________________________________________________________________________________________________*****
 *****                                    4.  Download 2 gif or jpg images.                                      *****
 *****                   Store them in the same directory as where you will place this program.                  *****
 *****                       Write a program that creates Image objects for each image and                       *****
 *****              then ImageView objects of each Image and then displays the ImageView in the Pane.            *****
 *****   Change the size of both images so that they have the same width and height using the proper Java code.  *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;




public class Chapter14_4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        // Create the Pane
        Pane pane = new Pane();

        // Create the images
        Image image1 = new Image("buck1.jpg");
        Image image2 = new Image("buck2.jpg");

        // Put "image1" into an ImageView
        ImageView iv1 = new ImageView();
        iv1.setImage(image1);

        // Put "image2" into an ImageView
        ImageView iv2 = new ImageView();
        iv2.setImage(image2);

        // Set height and width of image in iv1
        iv1.setFitHeight(200);
        iv1.setFitWidth(200);

        // Set height and width of image in iv2
        iv2.setFitHeight(200);
        iv2.setFitWidth(200);

        // Set the position of iv1
        iv1.setX(25);
        iv1.setY(150);

        // Set the position of iv2
        iv2.setX(275);
        iv2.setY(150);

        // Add the ImageViews to the Pane
        pane.getChildren().addAll(iv1, iv2);

        // Set the Scene, add the Pane to Scene, set the title of the Scene and show the Scene
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 14, Problem 4: Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
