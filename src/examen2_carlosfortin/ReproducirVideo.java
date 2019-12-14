package examen2_carlosfortin;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Carlos Fortin
 */
public class ReproducirVideo extends Thread{
    private JProgressBar reproduccion;
    private Video video;
    private JTextArea subtitulos;
    private boolean vive;

    public ReproducirVideo() {
    }

    public ReproducirVideo(JProgressBar reproduccion, Video video, JTextArea subtitulos) {
        this.reproduccion = reproduccion;
        this.video = video;
        this.subtitulos = subtitulos;
        this.vive=true;
    }

    public JProgressBar getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(JProgressBar reproduccion) {
        this.reproduccion = reproduccion;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public JTextArea getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(JTextArea subtitulos) {
        this.subtitulos = subtitulos;
    }
    
    @Override
    public void run(){
        while(vive){
            reproduccion.setMaximum(video.getTiempo());
            if(reproduccion.getValue()<reproduccion.getMaximum()){
                if(reproduccion.getValue()%10==0 && reproduccion.getValue()/10<video.getSubtitulos().size()){
                    int pos=reproduccion.getValue()/10;
                    System.out.println(pos);
                    subtitulos.setText(video.getSubtitulos().get(pos));
                    System.out.println(video.getSubtitulos().get(pos));
                }
                reproduccion.setValue(reproduccion.getValue()+1);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }else{
                vive=false;
                reproduccion.setValue(0);
                subtitulos.setText("");
            }
        }
    }
    
}
