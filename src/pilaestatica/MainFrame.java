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
        jPanel1 = new javax.swing.JPanel();
        btnDesapilar = new javax.swing.JButton();
        btnMostrarTamano = new javax.swing.JButton();
        btnPilaVacia = new javax.swing.JButton();
        btnMostrarElementos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMostrarValor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrarElementos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pila estática");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDesapilar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDesapilar.setText("Desapilar");
        btnDesapilar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnDesapilarMouseClicked(evt);
            }
        });

        btnMostrarTamano.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMostrarTamano.setText("Mostrar Tamaño");
        btnMostrarTamano.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnMostrarTamanoMouseClicked(evt);
            }
        });

        btnPilaVacia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnPilaVacia.setText("¿Pila Vacia?");
        btnPilaVacia.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnPilaVaciaMouseClicked(evt);
            }
        });

        btnMostrarElementos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMostrarElementos.setText("Mostrar Elementos");
        btnMostrarElementos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnMostrarElementosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesapilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarTamano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPilaVacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarElementos, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDesapilar)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarTamano)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarElementos)
                .addGap(18, 18, 18)
                .addComponent(btnPilaVacia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnMostrarValor.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMostrarValor.setText("Mostrar valor");
        btnMostrarValor.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnMostrarValorMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Índice:");

        txtIndice.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtIndice.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtIndiceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarValor, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtIndice)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostrarValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMostrarElementos.setColumns(20);
        txtMostrarElementos.setRows(5);
        jScrollPane1.setViewportView(txtMostrarElementos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCrearPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlApilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlCrearPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlApilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
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
        
        // Almacena la decisión del usuario.
        int dialogButton = JOptionPane.showConfirmDialog(null, "¿Desea crear un vector de " + vectorSize + " espacios?", "Confirmar", JOptionPane.YES_NO_OPTION);
                
        // Si el usuario selecciona SI, se crea el vector, de lo contrario, no se crea.
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

    private void txtDirectorKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDirectorKeyTyped
    {//GEN-HEADEREND:event_txtDirectorKeyTyped
        validateChar(evt);
    }//GEN-LAST:event_txtDirectorKeyTyped

    private void btnDesapilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesapilarMouseClicked
        int dialogButton = JOptionPane.showConfirmDialog(null, "Se eliminara el siguiente registro."
                + "\n ID: " + listMovie[count - 1].getId() +
                "\n Nombre: " + listMovie[count - 1].getNombre() +
                "\n Director: " + listMovie[count - 1].getDirector() + 
                "\n Duración=" + listMovie[count - 1].getDuracion(), 
                "¿Desea eliminar?", JOptionPane.YES_NO_OPTION);
        
        listMovie[count - 1] = null;
        count--;

    }//GEN-LAST:event_btnDesapilarMouseClicked

    private void btnMostrarTamanoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMostrarTamanoMouseClicked
    {//GEN-HEADEREND:event_btnMostrarTamanoMouseClicked
        int items = 0;
        
        // Verifica si la pila contiene algún elemento.
        for(int i = 0; i < vectorSize; i++)
        {
            if(listMovie[i] != null)
            {
                items++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El tamaño del arreglo es de " + items + " espacios.", "Tamaño", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMostrarTamanoMouseClicked

    private void btnPilaVaciaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnPilaVaciaMouseClicked
    {//GEN-HEADEREND:event_btnPilaVaciaMouseClicked
        int items = 0;
        
        // Verifica si la pila contiene algún elemento.
        for(int i = 0; i < vectorSize; i++)
        {
            if(listMovie[i] != null)
            {
                items++;
            }
        }
        
        // Muestra los datos evaluados en el for anterior.
        if(items == 0)
        {
            JOptionPane.showMessageDialog(null, "La pila SI esta vacio.", "¿Vacio?", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La pila NO esta vacio.", "¿Vacio?", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPilaVaciaMouseClicked

    private void btnMostrarValorMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMostrarValorMouseClicked
    {//GEN-HEADEREND:event_btnMostrarValorMouseClicked
        int indexValue = Integer.parseInt(txtIndice.getText());
        
        try
        {
            if(listMovie[indexValue] == null)
            {
                JOptionPane.showMessageDialog(null, "El índice que selecciono esta vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El elemento en el indice " + indexValue + " es:"
                + "\n ID: " + listMovie[indexValue].getId() +
                "\n Nombre: " + listMovie[indexValue].getNombre() +
                "\n Director: " + listMovie[indexValue].getDirector() + 
                "\n Duración: " + listMovie[indexValue].getDuracion(), 
                "Elemento seleccionado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(ArrayIndexOutOfBoundsException err)
        {
            JOptionPane.showMessageDialog(null, "El índice que selecciono exede el tamaño de la pila.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception err1)
        {
            JOptionPane.showMessageDialog(null, "Error: " + err1, "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnMostrarValorMouseClicked

    private void txtIndiceKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtIndiceKeyTyped
    {//GEN-HEADEREND:event_txtIndiceKeyTyped
        validateNumbers(evt);
    }//GEN-LAST:event_txtIndiceKeyTyped

    private void btnMostrarElementosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnMostrarElementosMouseClicked
    {//GEN-HEADEREND:event_btnMostrarElementosMouseClicked
        try
        {
            txtMostrarElementos.setText("");
            String texto = "";
            
            String textoAnterior = txtMostrarElementos.getText();
            
            for (int i = 0; i < count; i++)
            {
                texto += "ID: " + listMovie[i].getId() +
                         "\n Nombre: " + listMovie[i].getNombre() +
                         "\n Director: " + listMovie[i].getDirector() + 
                         "\n Duración: " + listMovie[i].getDuracion() +
                         "\n---------- Última linea ----------\n";
            }
            
            txtMostrarElementos.setText(texto);
        } catch (Exception err)
        {
            JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnMostrarElementosMouseClicked

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlApilar;
    private javax.swing.JPanel pnlCrearPila;
    private javax.swing.JSpinner spnVectorSize;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextArea txtMostrarElementos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
