
package main;
/*
Explicación
- AudioPlayer puede reproducir archivos mp3 por sí mismo pero utiliza MediaAdapter para manejar otros formatos.
- MediaAdapter verifica el tipo de archivo y delega la responsabilidad al objeto adecuado de AdvancedMediaPlayer.
- Esta estructura permite añadir soporte para más formatos de archivo fácilmente, sin alterar el código del cliente.
Este ejemplo muestra cómo el patrón Adapter facilita la colaboración entre clases que de otra manera no podrían trabajar juntas debido a interfaces incompatibles.
*/

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Something in the way.mp3");
        audioPlayer.play("mp4", "Interestellar.mp4");
        audioPlayer.play("vlc", "Inception.vlc");
        audioPlayer.play("avi", "WestWorld S1 E1.avi");
    }
}