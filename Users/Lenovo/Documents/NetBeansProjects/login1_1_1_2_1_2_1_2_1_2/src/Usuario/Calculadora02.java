/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author PERSONAL
 */
public class Calculadora02 extends javax.swing.JFrame {
private boolean punto=true;
String valor1,valor2,signo,contenido;
Double resultado;
    /**
     * Creates new form Calculadora02
     */
    public Calculadora02() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar = new javax.swing.JTextField();
        btnraiz = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnmasmenos = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn1x = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnx2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnxy = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btndivi = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA CIENTIFICA");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(500, 100));

        mostrar.setEditable(false);

        btnraiz.setBackground(new java.awt.Color(255, 51, 255));
        btnraiz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnraiz.setText("Raiz");
        btnraiz.setBorderPainted(false);
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(51, 255, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn7.setText("7");
        btn7.setBorderPainted(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(51, 255, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn4.setText("4");
        btn4.setBorderPainted(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnmasmenos.setBackground(new java.awt.Color(255, 255, 51));
        btnmasmenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmasmenos.setText("+-");
        btnmasmenos.setBorderPainted(false);
        btnmasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasmenosActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(51, 255, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn1.setText("1");
        btn1.setBorderPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn1x.setBackground(new java.awt.Color(255, 51, 255));
        btn1x.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn1x.setText("1/x");
        btn1x.setBorderPainted(false);
        btn1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1xActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(51, 255, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn8.setText("8");
        btn8.setBorderPainted(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(51, 255, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn5.setText("5");
        btn5.setBorderPainted(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(51, 255, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn2.setText("2");
        btn2.setBorderPainted(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnx2.setBackground(new java.awt.Color(255, 51, 255));
        btnx2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnx2.setText("x^2");
        btnx2.setBorderPainted(false);
        btnx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx2ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(51, 255, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn9.setText("9");
        btn9.setBorderPainted(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(51, 255, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn6.setText("6");
        btn6.setBorderPainted(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(51, 255, 0));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn0.setText("0");
        btn0.setBorderPainted(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 255, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn3.setText("3");
        btn3.setBorderPainted(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnxy.setBackground(new java.awt.Color(255, 51, 255));
        btnxy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnxy.setText("x^y");
        btnxy.setBorderPainted(false);
        btnxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxyActionPerformed(evt);
            }
        });

        btnsuma.setBackground(new java.awt.Color(255, 255, 51));
        btnsuma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsuma.setText("+");
        btnsuma.setBorderPainted(false);
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btnpunto.setBackground(new java.awt.Color(255, 255, 51));
        btnpunto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnpunto.setText(".");
        btnpunto.setBorderPainted(false);
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });

        btnresta.setBackground(new java.awt.Color(255, 255, 51));
        btnresta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnresta.setText("-");
        btnresta.setBorderPainted(false);
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btnex.setBackground(new java.awt.Color(255, 51, 255));
        btnex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnex.setText("e^x");
        btnex.setBorderPainted(false);
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(255, 51, 255));
        btnborrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnborrar.setText("<==");
        btnborrar.setBorderPainted(false);
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnmulti.setBackground(new java.awt.Color(255, 255, 51));
        btnmulti.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmulti.setText("x");
        btnmulti.setBorderPainted(false);
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btnigual.setBackground(new java.awt.Color(102, 51, 255));
        btnigual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnigual.setText("=");
        btnigual.setBorderPainted(false);
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btndivi.setBackground(new java.awt.Color(255, 255, 51));
        btndivi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndivi.setText("/");
        btndivi.setBorderPainted(false);
        btndivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiviActionPerformed(evt);
            }
        });

        btnc.setBackground(new java.awt.Color(255, 255, 255));
        btnc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnc.setText("c");
        btnc.setBorderPainted(false);
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("SALIR");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 51));
        jButton2.setText("REGRESAR");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmasmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnraiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn1x, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnx2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnpunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnmulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btndivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnex)
                            .addComponent(btnborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmasmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1x, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndivi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String operaciones(String valor1,String valor2,String signo){
    Double resultadocalc=0.0;
    String respuesta;
    if(signo.equals("+")){
        resultadocalc=Double.parseDouble(valor1)+Double.parseDouble(valor2);
        
    }else if (signo.equals("-")){
        resultadocalc=Double.parseDouble(valor1)-Double.parseDouble(valor2);
    }else if (signo.equals("*")){
        resultadocalc=Double.parseDouble(valor1)*Double.parseDouble(valor2);
    }else if (signo.equals("/")){
        resultadocalc=Double.parseDouble(valor1)/Double.parseDouble(valor2);
    }else if (signo.equals("x^y")){
        resultadocalc=Math.pow(Double.parseDouble(valor1),Double.parseDouble(valor2));
    }
    respuesta=resultadocalc.toString();
    return respuesta;
} 
    private void btnmasmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasmenosActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()>0){
            resultado=(-1)*Double.parseDouble(contenido);
            mostrar.setText(resultado.toString());
        }
        
    }//GEN-LAST:event_btnmasmenosActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()<=0){
            mostrar.setText("0.");
        }
        else
            if(mostrar.getText().contains(".")){
                
            }else{
                mostrar.setText(mostrar.getText()+".");
                punto=false;
            }
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        // TODO add your handling code here:
        String resultadototal;
        valor2=mostrar.getText();
        if(!valor2.equals("")){
            resultadototal=operaciones(valor1,valor2,signo);
            mostrar.setText(resultadototal);
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        mostrar.setText(mostrar.getText()+"9");
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        mostrar.setText("");
    }//GEN-LAST:event_btncActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
        if(!mostrar.getText().equals("")){
            valor1=mostrar.getText();
            signo="+";
            mostrar.setText("");
        }
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
        if(!mostrar.getText().equals("")){
            valor1=mostrar.getText();
            signo="-";
            mostrar.setText("");
        }
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        // TODO add your handling code here:
        if(!mostrar.getText().equals("")){
            valor1=mostrar.getText();
            signo="*";
            mostrar.setText("");
        }
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btndiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiviActionPerformed
        // TODO add your handling code here:
        if(!mostrar.getText().equals("")){
            valor1=mostrar.getText();
            signo="/";
            mostrar.setText("");
        }
    }//GEN-LAST:event_btndiviActionPerformed

    private void btnxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxyActionPerformed
        // TODO add your handling code here:
        if(!mostrar.getText().equals("")){
            valor1=mostrar.getText();
            signo="x^y";
            mostrar.setText("");
        }
    }//GEN-LAST:event_btnxyActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()>0){
            contenido=contenido.substring(0,contenido.length()-1);;
            mostrar.setText(contenido);
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()>0){
            resultado=Math.sqrt(Double.parseDouble(contenido));
            mostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnraizActionPerformed

    private void btn1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1xActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()>0){
            resultado=1/(Double.parseDouble(contenido));
            mostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btn1xActionPerformed

    private void btnx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx2ActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()>0){
            resultado=Math.pow(Double.parseDouble(contenido),2);
            mostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnx2ActionPerformed

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        // TODO add your handling code here:
        contenido=mostrar.getText();
        if(contenido.length()>0){
            resultado=Math.exp(Double.parseDouble(contenido));
            mostrar.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnexActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MENU abrir= new MENU();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1x;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btndivi;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmasmenos;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnraiz;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton btnx2;
    private javax.swing.JButton btnxy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField mostrar;
    // End of variables declaration//GEN-END:variables
}
