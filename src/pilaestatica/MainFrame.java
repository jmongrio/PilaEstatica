/**
* @author Jasón Mongrillo
* @version 1.0
*/
package pilaestatica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 @author Jason
 */
public class MainFrame extends javax.swing.JFrame
{
    int vectorSize; // Almacena el tamaño del vector.
    int count = 0; // Contador de iteraciónes de pila.
    
    Pelicula[] listMovie;
    
    /**
     Creates new form MainFrame
     */
    public MainFrame()
    {
        initComponents();
        
        //cambia el icono del formulario principal.
        setIconImage(new ImageIcon(getClass().getResource("/recursos/movie.png")).getImage());
    }

    /**
     This method is called from within the constructor to
     initialize the form.
     WARNING: Do NOT modify this code. The content of this method is
     always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnDesapilar = new javax.swing.JButton();
        btnMostrarTamano = new javax.swing.JButton();
        btnPilaVacia = new javax.swing.JButton();
        btnMostrarValor = new javax.swing.JButton();
        btnMostrarElementos = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlCrearPila = new javax.swing.JPanel();
        btnCrearPila = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spnVectorSize = new javax.swing.JSpinner();
        pnlApilar = new javax.swing.JPanel();
        btnApilar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pila estática");

        btnDesapilar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDesapilar.setText("Desapilar");

        btnMostrarTamano.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMostrarTamano.setText("Mostrar Tamaño");

        btnPilaVacia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnPilaVacia.setText("¿Pila Vacia?");

        btnMostrarValor.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMostrarValor.setText("Mostrar valor");

        btnMostrarElementos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMostrarElementos.setText("Mostrar Elementos");

        btnTerminar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnTerminar.setText("Terminar");
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnTerminarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pila Estática");

        pnlCrearPila.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCrearPila.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnCrearPila.setText("Crear Pila");
        btnCrearPila.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnCrearPilaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Tamaño:");

        spnVectorSize.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spnVectorSize.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnVectorSize.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                spnVectorSizeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlCrearPilaLayout = new javax.swing.GroupLayout(pnlCrearPila);
        pnlCrearPila.setLayout(pnlCrearPilaLayout);
        pnlCrearPilaLayout.setHorizontalGroup(
            pnlCrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrearPilaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrearPilaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spnVectorSize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCrearPila))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCrearPilaLayout.setVerticalGroup(
            pnlCrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrearPilaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnVectorSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCrearPila)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlApilar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnApilar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnApilar.setText("Apilar");
        btnApilar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnApilarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Director:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Duración:");

        txtID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtIDKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyTyped(evt);
            }
        });

        txtDirector.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDirector.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtDirectorKeyTyped(evt);
            }
        });

        txtDuracion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtDuracionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlApilarLayout = new javax.swing.GroupLayout(pnlApilar);
        pnlApilar.setLayout(pnlApilarLayout);
        pnlApilarLayout.setHorizontalGroup(
            pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlApilarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnApilar, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(pnlApilarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtDuracion))
                    .addGroup(pnlApilarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDirector))
                    .addGroup(pnlApilarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(pnlApilarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtID)))
                .addContainerGap())
        );
        pnlApilarLayout.setVerticalGroup(
            pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlApilarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnApilar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 410, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDesapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPilaVacia, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlCrearPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlApilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCrearPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPilaVacia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlApilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrarElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDesapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnTerminarMouseClicked
    {//GEN-HEADEREND:event_btnTerminarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnTerminarMouseClicked

    private void btnCrearPilaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnCrearPilaMouseClicked
    {//GEN-HEADEREND:event_btnCrearPilaMouseClicked
        vectorSize = (int) spnVectorSize.getValue();
        
        int dialogButton = JOptionPane.showConfirmDialog(null, "¿Desea crear un vector de " + vectorSize + " espacios?", "Confirmar", JOptionPane.YES_NO_OPTION);
                
        if(dialogButton == 0)
        {
            listMovie = new Pelicula[vectorSize]; // Se crea el vector Pelicula de tamaño vectorSize.
            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo vector.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(dialogButton == 1)
            {
                JOptionPane.showMessageDialog(null, "No se creo ningún un vector.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCrearPilaMouseClicked
       
    private void btnApilarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnApilarMouseClicked
    {//GEN-HEADEREND:event_btnApilarMouseClicked
        AddData();
    }//GEN-LAST:event_btnApilarMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtIDKeyTyped
    {//GEN-HEADEREND:event_txtIDKeyTyped
        validateNumbers(evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void spnVectorSizeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_spnVectorSizeKeyTyped
    {//GEN-HEADEREND:event_spnVectorSizeKeyTyped
        validateNumbers(evt);
    }//GEN-LAST:event_spnVectorSizeKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDuracionKeyTyped
    {//GEN-HEADEREND:event_txtDuracionKeyTyped
        validateNumbers(evt);
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        validateChar(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDirectorKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDirectorKeyTyped
    {//GEN-HEADEREND:event_txtDirectorKeyTyped
        validateChar(evt);
    }//GEN-LAST:event_txtDirectorKeyTyped

    public Pelicula GetData()
    {
        Pelicula newMovie = new Pelicula();
        
         try
        {
            newMovie.setId(Integer.parseInt(txtID.getText()));
            newMovie.setNombre(txtNombre.getText());
            newMovie.setDirector(txtDirector.getText());
            newMovie.setDuracion(Integer.parseInt(txtDuracion.getText()));
            
            JOptionPane.showMessageDialog(null, "Se ha agregado la información correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception err)
        {
            JOptionPane.showMessageDialog(null, "Se ha detectado un error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
        }
         
        return newMovie;
    }
    
    public void AddData()
    {
        if(count != listMovie.length)
        {
            listMovie[count] = GetData();   
            count++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el número máximo de elementos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
    * @param evt evento para validar la entrada 
    */
    public void validateNumbers(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }
    
    /**
    * @param evt evento para validar la entrada 
    */
    public void validateChar(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }
    
    
    /**
     @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApilar;
    private javax.swing.JButton btnCrearPila;
    private javax.swing.JButton btnDesapilar;
    private javax.swing.JButton btnMostrarElementos;
    private javax.swing.JButton btnMostrarTamano;
    private javax.swing.JButton btnMostrarValor;
    private javax.swing.JButton btnPilaVacia;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlApilar;
    private javax.swing.JPanel pnlCrearPila;
    private javax.swing.JSpinner spnVectorSize;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
