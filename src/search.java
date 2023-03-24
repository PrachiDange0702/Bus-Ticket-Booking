import javax.swing.table.DefaultTableModel;
public class search extends javax.swing.JFrame {
 String bt="";
    public search() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Enter the journey Date:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 130, 240, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 0, 204));
        jRadioButton1.setText("MUMBAI");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(510, 50, 150, 34);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton2.setForeground(java.awt.Color.orange);
        jRadioButton2.setText("PUNE");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(310, 50, 89, 34);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton3.setForeground(java.awt.Color.blue);
        jRadioButton3.setText("JAIPUR");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(50, 50, 120, 34);

        jTable1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 0, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 690, 120);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 130, 190, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setText("back to home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 460, 210, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 460, 300, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton4.setForeground(java.awt.Color.orange);
        jButton4.setText("proceed");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 210, 200, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reservation Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 4, 550, 40);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents
void check()
{   
        try
        {
           journey.query="select seatno from res where jdt='"+journey.jdt.trim()+
                   "' and city='"+journey.city.trim()+"'";
           journey.rs=journey.st.executeQuery(journey.query);
           while(journey.rs.next())
           {     
               bt+=journey.rs.getString(1);
           }
           String ss="";
           int l=bt.length();
           int i=0;
           while(i<bt.length())
           {
               if(bt.charAt(i)==' ')
               {
                  ss=ss.trim();  
                  ++i;
                  ss="";
               } 
               ss+=bt.charAt(i);
               ++i;
           }
        }
       catch(Exception e){}
    }    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       new BM2().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
         int r=dtm.getRowCount();
         for(int i=1;i<=r;++i)
             dtm.removeRow(0);
         String ct = null;
         if(jRadioButton1.isSelected())
             ct="mumbai";
         if(jRadioButton2.isSelected())
             ct="pune";
         if(jRadioButton3.isSelected())
             ct="jaipur";
         String jt=jTextField1.getText();
        try
        {
            journey.makecon();
            journey.query="select * from res where city='"+ct+"' and jdt='"+jt+"'";
                    
            journey.rs=journey.st.executeQuery(journey.query);
             while(journey.rs.next())
             {
               dtm.addRow(new Object[]{journey.rs.getString(1),
               journey.rs.getString(2),
               journey.rs.getString(3),
               journey.rs.getString(4),
               journey.rs.getInt(5),
               journey.rs.getString(6),
               journey.rs.getInt(7)});
             }
            journey.query="select sum(totseat) from res where city='"+ct+"' and jdt='"+jt+"'";
                    
            journey.rs=journey.st.executeQuery(journey.query);
            journey.rs.next();
            jLabel2.setText("Total travellers are:"+journey.rs.getInt(1));
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}