import javax.swing.JOptionPane;

public class TrCalculadora extends javax.swing.JFrame {
    double PrimerNumero; 
    double SegundoNumero; 
    double Resultado; 
    String Operador;

    public TrCalculadora() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        N1 = new javax.swing.JButton();
        N2 = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        N6 = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        N0 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminarDigito = new javax.swing.JButton();
        btnIVA = new javax.swing.JButton();
        btnSen = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(415, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        Pantalla.setBackground(new java.awt.Color(0, 0, 0));
        Pantalla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Pantalla.setForeground(new java.awt.Color(255, 255, 255));
        Pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaActionPerformed(evt);
            }
        });
        getContentPane().add(Pantalla);
        Pantalla.setBounds(30, 50, 350, 50);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 130, 350, 10);

        N1.setBackground(new java.awt.Color(102, 102, 102));
        N1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N1.setForeground(new java.awt.Color(255, 255, 255));
        N1.setText("1");
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });
        getContentPane().add(N1);
        N1.setBounds(30, 320, 60, 50);

        N2.setBackground(new java.awt.Color(102, 102, 102));
        N2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N2.setForeground(new java.awt.Color(255, 255, 255));
        N2.setText("2");
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });
        getContentPane().add(N2);
        N2.setBounds(100, 320, 60, 50);

        N3.setBackground(new java.awt.Color(102, 102, 102));
        N3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setText("3");
        N3.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                N3HierarchyChanged(evt);
            }
        });
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });
        getContentPane().add(N3);
        N3.setBounds(170, 320, 60, 50);

        N4.setBackground(new java.awt.Color(102, 102, 102));
        N4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N4.setForeground(new java.awt.Color(255, 255, 255));
        N4.setText("4");
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });
        getContentPane().add(N4);
        N4.setBounds(30, 260, 60, 50);

        N5.setBackground(new java.awt.Color(102, 102, 102));
        N5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N5.setForeground(new java.awt.Color(255, 255, 255));
        N5.setText("5");
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });
        getContentPane().add(N5);
        N5.setBounds(100, 260, 60, 50);

        N6.setBackground(new java.awt.Color(102, 102, 102));
        N6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N6.setForeground(new java.awt.Color(255, 255, 255));
        N6.setText("6");
        N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });
        getContentPane().add(N6);
        N6.setBounds(170, 260, 60, 50);

        N7.setBackground(new java.awt.Color(102, 102, 102));
        N7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N7.setForeground(new java.awt.Color(255, 255, 255));
        N7.setText("7");
        N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });
        getContentPane().add(N7);
        N7.setBounds(30, 200, 60, 50);

        N8.setBackground(new java.awt.Color(102, 102, 102));
        N8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N8.setForeground(new java.awt.Color(255, 255, 255));
        N8.setText("8");
        N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });
        getContentPane().add(N8);
        N8.setBounds(100, 200, 60, 50);

        N9.setBackground(new java.awt.Color(102, 102, 102));
        N9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N9.setForeground(new java.awt.Color(255, 255, 255));
        N9.setText("9");
        N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });
        getContentPane().add(N9);
        N9.setBounds(170, 200, 60, 50);

        N0.setBackground(new java.awt.Color(102, 102, 102));
        N0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        N0.setForeground(new java.awt.Color(255, 255, 255));
        N0.setText("0");
        N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N0ActionPerformed(evt);
            }
        });
        getContentPane().add(N0);
        N0.setBounds(30, 380, 60, 50);

        btnSuma.setBackground(new java.awt.Color(102, 102, 102));
        btnSuma.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(204, 204, 255));
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma);
        btnSuma.setBounds(240, 370, 60, 60);

        btnResta.setBackground(new java.awt.Color(102, 102, 102));
        btnResta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(204, 204, 255));
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnResta);
        btnResta.setBounds(240, 320, 60, 40);

        btnDivi.setBackground(new java.awt.Color(102, 102, 102));
        btnDivi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDivi.setForeground(new java.awt.Color(204, 204, 255));
        btnDivi.setText("/");
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivi);
        btnDivi.setBounds(240, 200, 60, 40);

        btnMulti.setBackground(new java.awt.Color(102, 102, 102));
        btnMulti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(204, 204, 255));
        btnMulti.setText("X");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        getContentPane().add(btnMulti);
        btnMulti.setBounds(240, 250, 60, 60);

        btnPunto.setBackground(new java.awt.Color(102, 102, 102));
        btnPunto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPunto);
        btnPunto.setBounds(100, 380, 60, 50);

        btnIgual.setBackground(new java.awt.Color(204, 204, 255));
        btnIgual.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual);
        btnIgual.setBounds(310, 340, 70, 90);

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setText("C");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(30, 150, 60, 40);

        btnEliminarDigito.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarDigito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarDigito.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarDigito.setText("X");
        btnEliminarDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDigitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarDigito);
        btnEliminarDigito.setBounds(100, 150, 60, 40);

        btnIVA.setBackground(new java.awt.Color(102, 102, 102));
        btnIVA.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnIVA.setForeground(new java.awt.Color(204, 204, 255));
        btnIVA.setText("IVA");
        btnIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIVAActionPerformed(evt);
            }
        });
        getContentPane().add(btnIVA);
        btnIVA.setBounds(170, 380, 60, 50);

        btnSen.setBackground(new java.awt.Color(102, 102, 102));
        btnSen.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSen.setForeground(new java.awt.Color(204, 204, 255));
        btnSen.setText("Sen");
        btnSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenActionPerformed(evt);
            }
        });
        getContentPane().add(btnSen);
        btnSen.setBounds(170, 150, 60, 40);

        btnCos.setBackground(new java.awt.Color(102, 102, 102));
        btnCos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCos.setForeground(new java.awt.Color(204, 204, 255));
        btnCos.setText("Cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCos);
        btnCos.setBounds(240, 150, 60, 40);

        btnTan.setBackground(new java.awt.Color(102, 102, 102));
        btnTan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTan.setForeground(new java.awt.Color(204, 204, 255));
        btnTan.setText("Tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTan);
        btnTan.setBounds(310, 150, 70, 40);

        btnPotencia.setBackground(new java.awt.Color(102, 102, 102));
        btnPotencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPotencia.setForeground(new java.awt.Color(204, 204, 255));
        btnPotencia.setText("^");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPotencia);
        btnPotencia.setBounds(310, 210, 70, 50);

        btnRaiz.setBackground(new java.awt.Color(102, 102, 102));
        btnRaiz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(204, 204, 255));
        btnRaiz.setText("√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        getContentPane().add(btnRaiz);
        btnRaiz.setBounds(310, 280, 70, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo Negro.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 190, 220, 280);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo Negro.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 200, 220, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo Negro.jpeg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, -10, 220, 280);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo Negro.jpeg"))); // NOI18N
        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -10, 220, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
    try{
   PrimerNumero = Double.parseDouble(Pantalla.getText());
   Pantalla.setText(" ");
   Operador = "*";   
   }catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }    
    }//GEN-LAST:event_btnMultiActionPerformed

    private void N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N0ActionPerformed
    String Numero = Pantalla.getText()+ N0.getText(); 
    Pantalla.setText(Numero);
    }//GEN-LAST:event_N0ActionPerformed

    private void PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
      String Numero = Pantalla.getText()+ N1.getText(); 
    Pantalla.setText(Numero);
    // TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
 String Numero = Pantalla.getText()+ N2.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
    String Numero = Pantalla.getText()+ N3.getText(); 
    Pantalla.setText(Numero);
    // TODO add your handling code here:
    }//GEN-LAST:event_N3ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
 String Numero = Pantalla.getText()+ N4.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
 String Numero = Pantalla.getText()+ N5.getText(); 
    Pantalla.setText(Numero);
    // TODO add your handling code here:
    }//GEN-LAST:event_N5ActionPerformed

    private void N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N6ActionPerformed
 String Numero = Pantalla.getText()+ N6.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_N6ActionPerformed

    private void N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N7ActionPerformed
 String Numero = Pantalla.getText()+ N7.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_N7ActionPerformed

    private void N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N8ActionPerformed
 String Numero = Pantalla.getText()+ N8.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_N8ActionPerformed

    private void N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N9ActionPerformed
 String Numero = Pantalla.getText()+ N9.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_N9ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
 String Numero = Pantalla.getText()+ btnPunto.getText(); 
    Pantalla.setText(Numero);        // TODO add your handling code here:
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
Pantalla.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
   try{
   PrimerNumero = Double.parseDouble(Pantalla.getText());
   Pantalla.setText(" ");
   Operador = "+";   
   }catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
    try{
   PrimerNumero = Double.parseDouble(Pantalla.getText());
   Pantalla.setText(" ");
   Operador = "-";   
   }catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
    try{
   PrimerNumero = Double.parseDouble(Pantalla.getText());
   Pantalla.setText(" ");
   Operador = "/";   
   }catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
   try {
            SegundoNumero = Double.parseDouble(Pantalla.getText());
            switch (Operador) {
                case "+":
                    Resultado = PrimerNumero + SegundoNumero;
                    break;
                case "-":
                    Resultado = PrimerNumero - SegundoNumero;
                    break;
                case "*":
                    Resultado = PrimerNumero * SegundoNumero;
                    break;
                case "/":
                    if (SegundoNumero != 0) {
                        Resultado = PrimerNumero / SegundoNumero;
                    } else {
                        Pantalla.setText("Error");
                        return;
                    }
                    break;
                case "√":
                    Resultado = Math.sqrt(PrimerNumero);
                    break;
                case "^":
                    Resultado = Math.pow(PrimerNumero, SegundoNumero);
                    break;
                case "Sen":
                    Resultado = Math.sin(Math.toRadians(PrimerNumero));
                    break;
                case "Cos":
                    Resultado = Math.cos(Math.toRadians(PrimerNumero));
                    break;
                case "Tan":
                    Resultado = Math.tan(Math.toRadians(PrimerNumero));
                    break;
                case "IVA":
                    Resultado = PrimerNumero + (PrimerNumero * (SegundoNumero / 100));
                    break;
                default:
                    Pantalla.setText("Error");
                    return;
            }
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }

    }//GEN-LAST:event_btnIgualActionPerformed

    private void N3HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_N3HierarchyChanged

    }//GEN-LAST:event_N3HierarchyChanged

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        try {
            PrimerNumero = Double.parseDouble(Pantalla.getText());
            if (PrimerNumero < 0) {
                Pantalla.setText("Error");
                return;
            }
            Resultado = Math.sqrt(PrimerNumero);
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnEliminarDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDigitoActionPerformed
        String textoActual = Pantalla.getText();
        if (textoActual.length() > 0) {
            Pantalla.setText(textoActual.substring(0, textoActual.length() - 1));
        }
    }//GEN-LAST:event_btnEliminarDigitoActionPerformed

    private void btnIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIVAActionPerformed
        try {
            PrimerNumero = Double.parseDouble(Pantalla.getText());
            String ivaStr = JOptionPane.showInputDialog("Ingrese el porcentaje de IVA:");
            double porcentajeIVA = Double.parseDouble(ivaStr);
            Resultado = PrimerNumero + (PrimerNumero * (porcentajeIVA / 100));
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnIVAActionPerformed

    private void btnSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenActionPerformed
        try {
            PrimerNumero = Double.parseDouble(Pantalla.getText());
            Resultado = Math.sin(Math.toRadians(PrimerNumero)); 
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnSenActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        try {
            PrimerNumero = Double.parseDouble(Pantalla.getText());
            Resultado = Math.cos(Math.toRadians(PrimerNumero)); 
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        try {
            PrimerNumero = Double.parseDouble(Pantalla.getText());
            Resultado = Math.tan(Math.toRadians(PrimerNumero)); 
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
         try {
            PrimerNumero = Double.parseDouble(Pantalla.getText());
            String exponenteStr = JOptionPane.showInputDialog("Ingrese el exponente:");
            double exponente = Double.parseDouble(exponenteStr);
            Resultado = Math.pow(PrimerNumero, exponente);
            Pantalla.setText(Double.toString(Resultado));
        } catch (NumberFormatException e) {
            Pantalla.setText("Error");
        }
    }//GEN-LAST:event_btnPotenciaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new TrCalculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton N0;
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnEliminarDigito;
    private javax.swing.JButton btnIVA;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSen;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
