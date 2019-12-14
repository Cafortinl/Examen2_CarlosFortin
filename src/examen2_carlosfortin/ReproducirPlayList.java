package examen2_carlosfortin;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Fortin
 */
public class ReproducirPlayList extends Thread{
    private PlayList playlist;
    private JProgressBar reproduccion;
    private JTextArea subtitulos;
    private JTable reproducciones;
    private boolean vive;
    private int i=0;
    private int cont=0;
    private ArrayList<Video> reproducidos=new ArrayList();

    public ReproducirPlayList() {
    }

    public ReproducirPlayList(PlayList playlist, JProgressBar reproduccion, JTextArea subtitulos, JTable reproducciones) {
        this.playlist = playlist;
        this.reproduccion = reproduccion;
        this.subtitulos = subtitulos;
        this.reproducciones = reproducciones;
        this.vive=true;
        this.reproducidos=new ArrayList();
    }

    

    public PlayList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlayList playlist) {
        this.playlist = playlist;
    }

    public JProgressBar getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(JProgressBar reproduccion) {
        this.reproduccion = reproduccion;
    }

    public JTextArea getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(JTextArea subtitulos) {
        this.subtitulos = subtitulos;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    @Override
    public void run(){
        Video video=playlist.getVideos().get(i);
        while(vive){
            if(cont<playlist.getDuracion()){
                reproduccion.setMaximum(video.getTiempo());
                if(reproduccion.getValue()<reproduccion.getMaximum()){
                    if(reproduccion.getValue()%10==0 && reproduccion.getValue()/10<video.getSubtitulos().size()){
                        int pos=reproduccion.getValue()/10;
                        System.out.println(pos);
                        subtitulos.setText(video.getSubtitulos().get(pos));
                        System.out.println(video.getSubtitulos().get(pos));
                    }
                    reproduccion.setValue(reproduccion.getValue()+1);
                    cont++;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }else{
                    reproduccion.setValue(0);
                    subtitulos.setText("");
                    reproducidos.add(video);
                    actualizarTablaReproducciones();
                    i++;
                    video=playlist.getVideos().get(i);
                }
            }else{
               vive=false;
               reproduccion.setValue(0);
               subtitulos.setText("");
               reproducidos.add(video);
               actualizarTablaReproducciones();
            }   
        }
    }
    
    public void actualizarTablaReproducciones(){
        reproducciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Canal", "Duracion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        DefaultTableModel m=(DefaultTableModel)reproducciones.getModel();
        for (Video r : reproducidos) {
            Object[] info={r.getNombre(),r.getCanal().getNombre(),r.getTiempo()};
            m.addRow(info);
        }
        reproducciones.setModel(m);
    }
}
