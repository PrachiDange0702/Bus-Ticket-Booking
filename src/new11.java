import java.awt.Color;
import javax.swing.JOptionPane;
public class new11 extends javax.swing.JFrame {
    String sno="";
    int tno[];
    int c=0;
    String d1,d2,d3;
    int fs,fd;
    int sc=0;
    int dc=0;
    String bt="";
    void check()
    {   
        try
        {
           journey.query="select seatno from res where jdt='"+journey.jdt.trim()+
                   "' and city='"+journey.city.trim()+"'";
           journey.rs=journey.st.executeQuery(journey.query);
           while(journey.rs.next())
           {     
               bt+=journey.rs.getString(1)+' ';
           }
           String ss="";
           int l=bt.length();
           int i=0;
           
           while(i<bt.length())
           {
               if(bt.charAt(i)==' ')
               {
                  ss=ss.trim();
                  if(ss.equals(jLabel10.getText()))
                      jLabel10.setBackground(Color.red);
                  else if(ss.equals(jLabel12.getText()))
                      jLabel12.setBackground(Color.red);
                  else if(ss.equals(jLabel13.getText()))
                      jLabel13.setBackground(Color.red);
                  else if(ss.equals(jLabel14.getText()))
                      jLabel14.setBackground(Color.red);
                  else if(ss.equals(jLabel15.getText()))
                      jLabel15.setBackground(Color.red);
                  else if(ss.equals(jLabel16.getText()))
                      jLabel16.setBackground(Color.red);
                  else if(ss.equals(jLabel17.getText()))
                      jLabel17.setBackground(Color.red);
                  else if(ss.equals(jLabel18.getText()))
                      jLabel18.setBackground(Color.red);
                  else if(ss.equals(jLabel19.getText()))
                      jLabel19.setBackground(Color.red);
                  else if(ss.equals(jLabel20.getText()))
                      jLabel20.setBackground(Color.red);
                  else if(ss.equals(jLabel21.getText()))
                      jLabel21.setBackground(Color.red);
                  else if(ss.equals(jLabel22.getText()))
                      jLabel22.setBackground(Color.red);
                  else if(ss.equals(jLabel23.getText()))
                      jLabel23.setBackground(Color.red);
                  else if(ss.equals(jLabel24.getText()))
                      jLabel24.setBackground(Color.red);
                  else if(ss.equals(jLabel25.getText()))
                      jLabel25.setBackground(Color.red);
                  else if(ss.equals(jLabel26.getText()))
                      jLabel26.setBackground(Color.red);
                  else if(ss.equals(jLabel27.getText()))
                      jLabel27.setBackground(Color.red);
                  else if(ss.equals(jLabel28.getText()))
                      jLabel28.setBackground(Color.red);
                  else if(ss.equals(jLabel29.getText()))
                      jLabel29.setBackground(Color.red);
                  else if(ss.equals(jLabel30.getText()))
                      jLabel30.setBackground(Color.red);
                  ++i;
                  ss="";
               } 
               ss+=bt.charAt(i);
               ++i;
           }
        }
        catch(Exception e){System.out.print(e.getMessage());}
    }
    public new11() {
        initComponents();
        tno=new int[20];
        try
        {
            journey.makecon();
            journey.query="select curdate(),adddate(curdate(),1),adddate(curdate(),2)";
            journey.rs=journey.st.executeQuery(journey.query);
            journey.rs.next();
            jTextField2.setText(journey.rs.getDate(1)+"");
            
            d1=journey.rs.getDate(1)+"";
            d2=journey.rs.getDate(2)+"";
            d3=journey.rs.getDate(3)+"";
        }
        catch(Exception e){System.out.print(e.getMessage());}
        jTextField4.setText(journey.city);
        if(journey.city=="Mumbai")
        {
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
            fs=1500;
            fd=3000;
        }
        else if(journey.city=="Pune")
        {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            fs=2000;
            fd=4000;
        }
        else if(journey.city=="Jaipur")
         {
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            fs=800;
            fd=1600;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 36, 161));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ticket Confirmation Reciept");
        jLabel1.setBounds(70, 20, 620, 50);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setText("NAME-:");
        jLabel2.setBounds(20, 94, 140, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("JOURNEY DATE-:");
        jLabel3.setBounds(10, 150, 200, 20);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel4.setText("FROM-:");
        jLabel4.setBounds(10, 210, 110, 20);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel5.setText("TO-:");
        jLabel5.setBounds(300, 210, 50, 20);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel6.setText("NUMBER OF SEATS BOOKED-:");
        jLabel6.setBounds(10, 310, 370, 30);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel7.setText("SEAT NUMBER-:");
        jLabel7.setBounds(10, 360, 200, 30);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel8.setText("TOTAL AMOUNT-:");
        jLabel8.setBounds(10, 410, 240, 20);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel9.setText("SEAT TYPE-:");
        jLabel9.setBounds(10, 270, 150, 28);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setText("Confirm for jaipur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking(evt);
            }
        });
        jButton1.setBounds(20, 470, 230, 30);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setToolTipText("enter your name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setBounds(270, 100, 270, 30);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.setBounds(270, 150, 270, 30);
        jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField3.setText("Banswara");
        jTextField3.setBounds(110, 210, 150, 20);
        jLayeredPane1.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField4.setBounds(400, 210, 160, 30);
        jLayeredPane1.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField5.setBounds(170, 280, 190, 20);
        jLayeredPane1.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField6.setBounds(390, 320, 220, 20);
        jLayeredPane1.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField7.setBounds(200, 370, 230, 20);
        jLayeredPane1.add(jTextField7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField8.setBounds(240, 410, 240, 20);
        jLayeredPane1.add(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setBackground(java.awt.Color.red);
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setText("Confirm for mumbai");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking(evt);
            }
        });
        jButton2.setBounds(270, 470, 260, 30);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton3.setText("Confirm for pune");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking(evt);
            }
        });
        jButton3.setBounds(550, 470, 240, 30);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setBackground(java.awt.Color.magenta);
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("20");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.setBounds(780, 290, 30, 30);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        jLabel11.setText("select seat");
        jLabel11.setBounds(700, 84, 100, 20);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setBackground(new java.awt.Color(0, 102, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jLabel12.setBounds(660, 130, 30, 30);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setBackground(new java.awt.Color(0, 102, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("2");
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jLabel13.setBounds(700, 130, 30, 30);
        jLayeredPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setBackground(java.awt.Color.magenta);
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jLabel14.setBounds(740, 130, 30, 30);
        jLayeredPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setBackground(new java.awt.Color(0, 102, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("5");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jLabel15.setBounds(660, 170, 30, 30);
        jLayeredPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setBackground(new java.awt.Color(0, 102, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("6");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jLabel16.setBounds(700, 170, 30, 30);
        jLayeredPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setBackground(java.awt.Color.magenta);
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("7");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jLabel17.setBounds(740, 170, 30, 30);
        jLayeredPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setBackground(new java.awt.Color(0, 102, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("9");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jLabel18.setBounds(660, 210, 30, 30);
        jLayeredPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setBackground(new java.awt.Color(0, 102, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("10");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jLabel19.setBounds(700, 210, 30, 30);
        jLayeredPane1.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setBackground(java.awt.Color.magenta);
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("11");
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jLabel20.setBounds(740, 210, 30, 30);
        jLayeredPane1.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setBackground(new java.awt.Color(0, 102, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("13");
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jLabel21.setBounds(660, 250, 30, 30);
        jLayeredPane1.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setBackground(new java.awt.Color(0, 102, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" 14");
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jLabel22.setBounds(700, 250, 30, 30);
        jLayeredPane1.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setBackground(java.awt.Color.magenta);
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("15 ");
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jLabel23.setBounds(740, 250, 30, 30);
        jLayeredPane1.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setBackground(new java.awt.Color(0, 102, 0));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("17");
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jLabel24.setBounds(660, 290, 30, 30);
        jLayeredPane1.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel25.setBackground(new java.awt.Color(0, 102, 0));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("18");
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jLabel25.setBounds(700, 290, 30, 30);
        jLayeredPane1.add(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel26.setBackground(java.awt.Color.magenta);
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("19");
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jLabel26.setBounds(740, 290, 30, 30);
        jLayeredPane1.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel27.setBackground(java.awt.Color.magenta);
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("4");
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jLabel27.setBounds(780, 130, 30, 30);
        jLayeredPane1.add(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel28.setBackground(java.awt.Color.magenta);
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("8");
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jLabel28.setBounds(780, 170, 30, 30);
        jLayeredPane1.add(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel29.setBackground(java.awt.Color.magenta);
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("12");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jLabel29.setBounds(780, 210, 30, 30);
        jLayeredPane1.add(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel30.setBackground(java.awt.Color.magenta);
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("16");
        jLabel30.setOpaque(true);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jLabel30.setBounds(780, 250, 30, 30);
        jLayeredPane1.add(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel31.setText("yyyy-mm-dd");
        jLabel31.setBounds(270, 190, 70, 14);
        jLayeredPane1.add(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Back to Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(680, 20, 140, 40);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel32.setForeground(new java.awt.Color(255, 0, 255));
        jLabel32.setText("single sleeper");
        jLabel32.setBounds(660, 110, 80, 14);
        jLayeredPane1.add(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setForeground(new java.awt.Color(51, 153, 0));
        jLabel33.setText("double sleeper");
        jLabel33.setBounds(740, 110, 80, 14);
        jLayeredPane1.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new BM2().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        if(jLabel30.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel30.getText();
            jLabel30.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel30.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        if(jLabel29.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel29.getText();
            jLabel29.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel29.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        if(jLabel28.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel28.getText();
            jLabel28.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel28.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        if(jLabel27.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel27.getText();
            jLabel27.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel27.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        if(jLabel26.getBackground()==Color.red)
           JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel26.getText();
            jLabel26.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel26.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        if(jLabel25.getBackground()==Color.red)
           JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel25.getText();
            jLabel25.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel25.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        if(jLabel24.getBackground()==Color.red)
           JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel24.getText();
            jLabel24.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel24.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        if(jLabel23.getBackground()==Color.red)
           JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel23.getText();
            jLabel23.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel23.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        if(jLabel22.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel22.getText();
            jLabel22.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel22.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if(jLabel21.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel21.getText();
            jLabel21.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel21.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if(jLabel20.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel20.getText();
            jLabel20.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel20.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if(jLabel19.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel19.getText();
            jLabel19.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel19.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(jLabel18.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel18.getText();
            jLabel18.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel18.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(jLabel17.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel17.getText();
            jLabel17.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel17.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(jLabel16.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel16.getText();
            jLabel16.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel16.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if(jLabel15.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            sno+=" "+jLabel15.getText();
            jLabel15.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel15.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            ++sc;
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(jLabel14.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel14.getText();
            jLabel14.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel14.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(jLabel13.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel13.getText();
            jLabel13.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel13.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(jLabel12.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++sc;
            sno+=" "+jLabel12.getText();
            jLabel12.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel12.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(jLabel10.getBackground()==Color.red)
        JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
            ++dc;
            sno+=" "+jLabel10.getText();
            jLabel10.setBackground(Color.red);
            tno[c++]=Integer.parseInt(jLabel10.getText());
            jTextField6.setText(c+"");
            jTextField7.setText(sno);
            jTextField8.setText(""+(fs*sc+fd*dc));
            jTextField5.setText(sc+" Single "+dc+" double ");
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void booking(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking
        int totamt=fs*sc+fd*dc;
        String st=sc+" Single "+dc+" double ";
        try
        {
            journey.query="insert into res values('"+journey.city+"','"+
            jTextField2.getText()+"','"+sno.trim()+"','"+jTextField1.getText()+
            "',"+totamt+",'"+st+"',"+c+")";
            journey.st.executeUpdate(journey.query);
            JOptionPane.showMessageDialog(null,"Your seats are reserved !!!");
        }
        catch(Exception e){}
    }//GEN-LAST:event_booking

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
    if(!(jTextField2.getText().equals(d1)||jTextField2.getText().equals(d2)||
            jTextField2.getText().equals(d3)))
    {
        JOptionPane.showMessageDialog(null,"Reservation date must be:"+d1+" "+
            d2+" "+d3);
        jTextField2.setText("");
        jTextField2.grabFocus();
        }
        else
        {
            journey.jdt=jTextField2.getText();
            check();
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       jTextField1.grabFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new11().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}