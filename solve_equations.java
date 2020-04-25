
import java.math.*;
/**
 *
 * @author Mohammed
 */
public class solve_equations extends javax.swing.JFrame {

    
    public solve_equations() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equation = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        getA = new javax.swing.JFormattedTextField();
        getB = new javax.swing.JFormattedTextField();
        getC = new javax.swing.JFormattedTextField();
        show = new javax.swing.JTextField();
        a_text = new javax.swing.JLabel();
        b_text = new javax.swing.JLabel();
        c_text = new javax.swing.JLabel();
        solutions_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solve Equations");
        setAlwaysOnTop(true);
        setResizable(false);

        equation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        equation.setText("ax² + bx + c = 0");

        button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button.setText("Solve it!");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        getA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        getB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        getB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        getC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        getC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        show.setEditable(false);
        show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        a_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_text.setText("a:");

        b_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_text.setText("b:");

        c_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c_text.setText("c:");

        solutions_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        solutions_text.setText("Solutions:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a_text)
                            .addComponent(b_text)
                            .addComponent(c_text)
                            .addComponent(solutions_text))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equation, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(getA)
                                .addComponent(getB)
                                .addComponent(getC)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(equation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_text))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_text))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_text))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solutions_text))
                .addGap(26, 26, 26)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public double a,b,c,x1,x2,d;
    
    
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        
            
            if(getA.getText().isEmpty())//check a
            {
                a=0;
            }
            else
            {
                a=Double.parseDouble(getA.getText());
            }
            
            //
            
             if(getB.getText().isEmpty())//check b
            {
                b=0;
            }
            else
            {
                b=Double.parseDouble(getB.getText());
            }
             
             //
             
              if(getC.getText().isEmpty())//check c
            {
                c=0;
            }
            else
            {
                c=Double.parseDouble(getC.getText());
            }
            //
            
            if(a==0)
            {
                if(b==0)
                {
                    if(c==0)
                            {// 0=0 means infinty solutions
                                show.setText("Infinty solutions");
                            }else
                    {
                        //c != 0
                        show.setText("No solutions");
                    }
                    
                }
                else
                {
                    //bx + c =0
                    x1= -c / b ;
                    show.setText(String.valueOf(x1));
                }
                
            }
            else
            {
                //ax² +bx +c=0
                
                d=b*b - 4*a*c;
                
                //check delta
                
                if(d<0)
                {
                 double d1=Math.sqrt(Math.abs(d));
                 show.setText(String.valueOf(-b/(2*a)) + " + " + String.valueOf(-d1/(2*a)) + "i" + " ; " + String.valueOf(-b/(2*a)) + " + " + String.valueOf(d1/(2*a)) + "i" );
                }
                
                
                if(d==0)
                {
                    x1=-b / (2*a);
                    show.setText(String.valueOf(x1));
                }
                
                
                  if(d>0)
                  {
                      
                      x1=(double) ((-b - Math.sqrt(d))/(2*a));
                      x2=(double) ((-b + Math.sqrt(d))/(2*a));
                      show.setText(String.valueOf(x1) + " ; " + String.valueOf(x2));
                     
                  }
            }
            
       
            
            
            
        
    }//GEN-LAST:event_buttonActionPerformed

    
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
            java.util.logging.Logger.getLogger(solve_equations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(solve_equations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(solve_equations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(solve_equations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new solve_equations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a_text;
    private javax.swing.JLabel b_text;
    private javax.swing.JButton button;
    private javax.swing.JLabel c_text;
    private javax.swing.JLabel equation;
    private javax.swing.JFormattedTextField getA;
    private javax.swing.JFormattedTextField getB;
    private javax.swing.JFormattedTextField getC;
    private javax.swing.JTextField show;
    private javax.swing.JLabel solutions_text;
    // End of variables declaration//GEN-END:variables
}
