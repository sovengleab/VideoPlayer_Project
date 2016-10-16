
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.DefaultFullScreenStrategy;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer 4738
 */
public class VideoPlayer extends javax.swing.JFrame {

    /**
     * Creates new form VideoPlayer
     */
    public VideoPlayer() {
        initComponents();
//        setUndecorated(true);
//        this.setOpacity((float)0.5);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SlicePlaying = new javax.swing.JSlider();
        SlideVolumn = new javax.swing.JSlider();
        btnPlay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListSong = new javax.swing.JList<>();
        btnStereo = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnAddSong = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SlideVolumn.setOrientation(javax.swing.JSlider.VERTICAL);

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        ListSong.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ListSongMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ListSongMouseMoved(evt);
            }
        });
        ListSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListSongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListSong);

        btnStereo.setText("Stereo");

        btnRight.setText("Right");

        btnLeft.setText("Left");

        btnAddSong.setText("Add");
        btnAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSongActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayout(new java.awt.BorderLayout());

        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                canvas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                canvas1MouseExited(evt);
            }
        });
        jDesktopPane2.add(canvas1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlay)
                        .addGap(18, 18, 18)
                        .addComponent(SlicePlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStereo)
                        .addGap(18, 18, 18)
                        .addComponent(btnRight)
                        .addGap(18, 18, 18)
                        .addComponent(btnLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddSong)
                        .addGap(48, 48, 48)))
                .addComponent(SlideVolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jDesktopPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(SlideVolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnStereo)
                                    .addComponent(btnRight)
                                    .addComponent(btnLeft))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddSong)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPlay)
                            .addComponent(SlicePlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(571, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //DefaultListModel<Object>
    ArrayList<File> arraySong=new ArrayList<>();
    private void btnAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSongActionPerformed
        JFileChooser fc=new JFileChooser();
        int a=fc.showOpenDialog(null);
        if(a==JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();
            mod.addElement(f.getName());
            arraySong.add(f);
            
        }
        
    }//GEN-LAST:event_btnAddSongActionPerformed
    DefaultListModel<String> mod;
    private EmbeddedMediaPlayerComponent mediaPlayerComponent;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       mod=new DefaultListModel<>();
       ListSong.setModel(mod);
       ListSong.setDragEnabled(true);
       ListSong.setTransferHandler(new MyTransferHandler());
       ListSong.setDropMode(DropMode.INSERT);
        NewClass.c=canvas1;
        NewClass.ThisData=this;
       NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
       Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
       mpf=new MediaPlayerFactory();
       //fs=new DefaultFullScreenStrategy(this);
       player=mpf.newEmbeddedMediaPlayer();       
       //player=mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(this));     
       player.setVideoSurface(mpf.newVideoSurface(canvas1));
       player.setEnableKeyInputHandling(false);
       player.setEnableMouseInputHandling(false);
       
    }//GEN-LAST:event_formWindowOpened
    MediaPlayerFactory mpf;
    DefaultFullScreenStrategy fs;
    EmbeddedMediaPlayer player;
    //CanvasVideoSurface cvs;
    File f;
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        try {
            f=arraySong.get(0);
            player.playMedia(f.getAbsolutePath());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPlayActionPerformed
    
    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked
        if(evt.getClickCount()==2){
            //this.setMaximumSize(this.);
           // this.set
           //this.remove(ListSong);
           //ListSong.set
            
           //jDesktopPane2.add(canvas1,java.awt.BorderLayout.CENTER);
          this.dispose();
          setUndecorated(true);
           //this.pack();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            //ListSong.setVisible(false);
            
//           jDesktopPane2.add(canvas1, java.awt.BorderLayout.CENTER);
//           this.add(jDesktopPane2);
           //jDesktopPane2.add(canvas1);
           //f.add(jDesktopPane2);
            //f.add(); 
           
           //player.play();
           this.setVisible(true);
           //this.setVisible(false);
          
            
        }
            
    }//GEN-LAST:event_canvas1MouseClicked
//    boolean isDragging=false;
//    int dragIndex;
    private void ListSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListSongMouseClicked
        
    }//GEN-LAST:event_ListSongMouseClicked
    //boolean mouseDragging;
    private void ListSongMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListSongMouseDragged
//        isDragging=true;
//        dragIndex=ListSong.getSelectedIndex();
    }//GEN-LAST:event_ListSongMouseDragged

    private void ListSongMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListSongMouseMoved
//        if(isDragging==true){
//            int dropIndex=ListSong.locationToIndex(evt.getPoint());
//            if(dragIndex!=dropIndex){
//                mod.add(dropIndex, mod.remove(dragIndex));
//            }
//            isDragging=false;
//        }
    }//GEN-LAST:event_ListSongMouseMoved

    private void canvas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseEntered
       
    }//GEN-LAST:event_canvas1MouseEntered

    private void canvas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseExited
      
    }//GEN-LAST:event_canvas1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoPlayer().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListSong;
    private javax.swing.JSlider SlicePlaying;
    private javax.swing.JSlider SlideVolumn;
    private javax.swing.JButton btnAddSong;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnStereo;
    private java.awt.Canvas canvas1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
