
package aop.tut.gymmembership;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;


public class GymMemberShip  extends JFrame{
   
    private JMenuBar  MenuBar;
   
    private JMenu Filemenu;
    
    private JMenuItem ExitmenuItem;
    private JMenuItem RegistertmenuItem;
    private JMenuItem ClearmenuItem;
    private JMenuItem DisplayAlltmenuItem;
    private JMenuItem SearchtmenuItem;
    private JMenuItem UpdatemenuItem;
    private JMenuItem DeletemenuItem;

    
    
    private JLabel NameLabel;
    private JLabel SurnameLabel;
    private JLabel IdLabel;
    private JLabel GenderLabel;
    private JLabel HeadingLabel;

    private JRadioButton Month_to_monthbtn;
    private JRadioButton SixmonthBtn;
    private JRadioButton AnualBtn;

    private JButton RegiaterBtn;
    private JButton ClearBtn;
    private JButton DispalyBtn;
    private JButton ExitBtn;

    private JButton DeleteBtn;
    private JButton UpdateBtn;
    private JButton SearchBtn;

    private JScrollPane scrollpane;
    private JTextArea textArea;

    private JTextField NameField;
    private JTextField SurnameField;
    private JTextField IdField;

    private JComboBox genderCombox;
    
    private  ButtonGroup group;
    
    private JCheckBox CheckMe;

    private JPanel ClientDetailsPabel;
    private JPanel ContractPanel;
    private JPanel TextAreaPanel;
    private JPanel ButtonPanel;
    private JPanel headingPanel;
    private JPanel TopPanel;
    private JPanel bottomPanel;
    private JPanel mainPanel;
    
    private JFileChooser filechooser;

    public GymMemberShip() {
        
         //Labels 
        NameLabel = new JLabel("Name:");
        SurnameLabel = new JLabel("Suraname:");
        IdLabel = new JLabel("Id no:");
        GenderLabel = new JLabel("Gender:");
        HeadingLabel = new JLabel("MemberShip Form");
        HeadingLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        HeadingLabel.setForeground(Color.blue);
        HeadingLabel.setFont(new Font("Consols",Font.BOLD,20));
                
                
        NameLabel.setBounds(5,10,150,30);
        SurnameLabel.setBounds(5,50,150,30);
        IdLabel.setBounds(5,90,150,30);
        GenderLabel.setBounds(5,130,150,30);
        
        //Check Box
        CheckMe = new JCheckBox();
        CheckMe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        CheckMe.setFocusable(false);
        //RadioButton
        Month_to_monthbtn = new JRadioButton("Month_to_Month");
         Month_to_monthbtn .setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         
        SixmonthBtn = new JRadioButton("Six Months");
        SixmonthBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        AnualBtn = new JRadioButton("Annual");
        AnualBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        
        
        Month_to_monthbtn.setFocusable(false);
        SixmonthBtn.setFocusable(false);
        AnualBtn.setFocusable(false);

        group = new ButtonGroup();
        group.add(Month_to_monthbtn);
        group.add(SixmonthBtn);
        group.add(AnualBtn);
        //buttons 
        RegiaterBtn = new JButton("REGISTER");
        ClearBtn = new JButton("CLEAR");
        DispalyBtn = new JButton("DISPLAY ALL");
        DeleteBtn = new JButton("DELETE");
        UpdateBtn = new JButton("UPDATE");
        SearchBtn = new JButton("SEARCH");
        ExitBtn = new JButton("EXIT");
        
        RegiaterBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ClearBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        DispalyBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ExitBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        DeleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UpdateBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        SearchBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        RegiaterBtn.addActionListener(new ActionListenerRegisterButton());
        ClearBtn.addActionListener(new ActionListenerClearButton());
        DispalyBtn.addActionListener(new ActionListenerDisplayButton());
        ExitBtn.addActionListener(new ActionListenerExitButton());
        SearchBtn.addActionListener(new ActionListenerSearchItem());
        UpdateBtn.addActionListener(new ActionListenerUdateItem());
        DeleteBtn.addActionListener(new ActionListenerDeleteItem());
        
        DeleteBtn.setFocusable(false);
        UpdateBtn.setFocusable(false);
        SearchBtn.setFocusable(false);
        RegiaterBtn.setFocusable(false);
        ClearBtn.setFocusable(false);
        DispalyBtn.setFocusable(false);
        ExitBtn.setFocusable(false);

        //TextFields
        NameField = new JTextField();
        NameField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        SurnameField = new JTextField();
        SurnameField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        IdField = new JTextField();
        IdField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        NameField.setBounds(100,10,250,30);
        SurnameField.setBounds(100,50,250,30);
        IdField.setBounds(100,90,250,30);
         //Combox 
        genderCombox = new JComboBox(new String[]{"Other","Male", "Female"});
        genderCombox.setBounds(100,130,250,30);
        genderCombox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //TextArea 
        textArea = new JTextArea(12,65);
        scrollpane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setMargin(new Insets(25,25,25,25));
       //textArea.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
       textArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Member(s) details", TitledBorder.LEFT, TitledBorder.TOP));
       scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
       


        //Client Panel
        ClientDetailsPabel = new JPanel();
        ClientDetailsPabel.setPreferredSize(new Dimension(200,170));
        ClientDetailsPabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Client Details", TitledBorder.LEFT, TitledBorder.TOP));
        ClientDetailsPabel.setLayout(null);
        ClientDetailsPabel.add(NameLabel);
        ClientDetailsPabel.add(SurnameLabel);
        ClientDetailsPabel.add(IdLabel);
        ClientDetailsPabel.add(GenderLabel);
        ClientDetailsPabel.add(NameField);
        ClientDetailsPabel.add(SurnameField);
        ClientDetailsPabel.add(IdField);
        ClientDetailsPabel.add(genderCombox );
       
       
       
        //Contract Panel
        ContractPanel= new JPanel();
        ContractPanel.setPreferredSize(new Dimension(130,100));
        ContractPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Contract Options",TitledBorder.LEFT,TitledBorder.TOP));
        ContractPanel.setLayout(new FlowLayout(FlowLayout.LEADING,30,6));
        ContractPanel.add(new JLabel("Type of Contract"));
        ContractPanel.add(Month_to_monthbtn );
        ContractPanel.add(SixmonthBtn);
        ContractPanel.add(AnualBtn);
        ContractPanel.add(new JLabel("Select the checkbox if you a personal trainer"));
        ContractPanel.add(CheckMe);
        
        
        //TextPanel
        TextAreaPanel = new JPanel();
        TextAreaPanel.add(scrollpane);
        //Button Panel
        ButtonPanel = new JPanel();
        ButtonPanel .setLayout(new FlowLayout(FlowLayout.LEADING));
        ButtonPanel.add(RegiaterBtn ); 
        ButtonPanel.add(DispalyBtn);
        ButtonPanel.add(SearchBtn);
        ButtonPanel.add(UpdateBtn); 
        ButtonPanel.add(DeleteBtn);
        ButtonPanel.add(ClearBtn); 
        ButtonPanel.add(ExitBtn); 
       
        
        //MenuBar 
        MenuBar=new JMenuBar();
        //menu 
        Filemenu=new JMenu ("Menu Options");
        Filemenu.setFont(new Font("Consoes",Font.BOLD,15));
        //menuItem
        MenuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ExitmenuItem=new JMenuItem ("EXIT");
        RegistertmenuItem=new JMenuItem ("Register Member");
        ClearmenuItem=new JMenuItem("Clear");
        DisplayAlltmenuItem=new JMenuItem ("View Members");
        SearchtmenuItem=new JMenuItem ("Search Member");
        UpdatemenuItem=new JMenuItem ("Update Member");
        DeletemenuItem=new JMenuItem ("Delete Member");
        
        
        
        ExitmenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        RegistertmenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ClearmenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        DisplayAlltmenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        SearchtmenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UpdatemenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        DeletemenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
    
        
        ExitmenuItem.addActionListener(new ActionListenerExitButton());
        RegistertmenuItem.addActionListener(new ActionListenerRegisterButton());
        ClearmenuItem.addActionListener(new ActionListenerClearButton());
        DisplayAlltmenuItem.addActionListener(new ActionListenerDisplayButton());
        SearchtmenuItem.addActionListener(new ActionListenerSearchItem());
        UpdatemenuItem.addActionListener(new ActionListenerUdateItem());
        DeletemenuItem.addActionListener(new ActionListenerDeleteItem());
        
        Filemenu.add(RegistertmenuItem);
        Filemenu.add(DisplayAlltmenuItem);
        Filemenu.add(SearchtmenuItem);
        Filemenu.add(UpdatemenuItem);
        Filemenu.add(DeletemenuItem);
        Filemenu.add(ExitmenuItem);
        
        MenuBar.add(Filemenu);
      
        //Heading Panel
        headingPanel= new JPanel();
        headingPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        headingPanel.add(HeadingLabel);
        //Top Panel
        TopPanel = new JPanel();
        TopPanel.setLayout(new BorderLayout());
        TopPanel.add(headingPanel, BorderLayout.NORTH);
        TopPanel.add(ClientDetailsPabel, BorderLayout.CENTER);
        TopPanel.add(ContractPanel, BorderLayout.SOUTH);

        //Bottom Panel
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(TextAreaPanel, BorderLayout.CENTER);
        bottomPanel.add(ButtonPanel, BorderLayout.SOUTH);
        //main Panel 
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));
        mainPanel.add(TopPanel);
        mainPanel.add(bottomPanel);

        this.setTitle("GymMemberShip");
        this.setLocation(500, 100);
        this.setResizable(false);
        this.setSize(760, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.add(mainPanel);
        this.setJMenuBar(MenuBar);
        this.pack();
        this.setVisible(true);
    }
    
    private void clear() {
        
        NameField.setText(" ");
        SurnameField.setText(" ");
        IdField.setText(" ");
        
        group.clearSelection();
        CheckMe.setSelected(false);
        textArea.setText(" ");
        
        SurnameField.setFocusable(true);
       // SurnameField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
   private class ActionListenerRegisterButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            
            String name,surname,idno,gender, Contract,PersonTrainer;
 
            if(Month_to_monthbtn.isSelected()){
                Contract= Month_to_monthbtn.getText();
            }else if(SixmonthBtn.isSelected()){
                Contract=SixmonthBtn.getText();
            }else if(AnualBtn.isSelected()){
                Contract=AnualBtn.getText();
            }else{
            Contract="No Contract";
            }
           
            name=NameField.getText().trim();
            surname=SurnameField.getText().trim();
            idno=IdField.getText().trim();
            PersonTrainer="No";
            gender=(String)genderCombox.getSelectedItem();
            
             if(CheckMe.isSelected()){
                PersonTrainer="Yes";
              }

            MemberDetials members= new MemberDetials(name,surname,idno,gender,Contract,PersonTrainer) ;
            
            filechooser=new JFileChooser ();
            
            int choser;
            
            choser=filechooser.showSaveDialog(GymMemberShip.this);
            
            if(choser==JFileChooser.APPROVE_OPTION){
                
                File thefile=new File(filechooser.getSelectedFile().getAbsolutePath());
                
                FileWriter filewriter;
                BufferedWriter bufferedwriter;
                try {
                    filewriter = new FileWriter(thefile,true);
                    bufferedwriter=new BufferedWriter(filewriter);
                   
                    bufferedwriter.write("====================\n"+members.toString());
                    bufferedwriter.newLine();
                    bufferedwriter.close();
                    clear();
                    
                    JOptionPane.showMessageDialog(null,"Member Added","SucessBox",JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null,ex.getMessage(),"ErroBox",JOptionPane.ERROR);
                }
               
                
            }
            
            
        }
      
   }   
         private class ActionListenerClearButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clear();
            
        }
        
    }   
         private class ActionListenerExitButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.exit(0);
        }
        
    }    
        private class ActionListenerDisplayButton implements ActionListener{

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    filechooser=new JFileChooser ();
                    
                    
                   int chooser=filechooser.showOpenDialog(IdLabel);
                   
                   if(chooser==JFileChooser.APPROVE_OPTION){
                       
                       File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                       BufferedReader bufferedReader;
                       FileReader fileReader;
                       String data,text="";
                       try{
                         fileReader=new FileReader(file);
                         bufferedReader=new BufferedReader(fileReader);
                         
                         
                        
                         while((data=bufferedReader.readLine())!=null){
                             text+=data+"\n";
                            
                             
                         }
                          bufferedReader.close();
                          
                          textArea.setText(text);
                           JOptionPane.showMessageDialog(null,"YourData Below","SucessBox",JOptionPane.INFORMATION_MESSAGE);
                           
                       }catch(IOException ex){
                            JOptionPane.showMessageDialog(null,ex.getMessage(),"ErroBox",JOptionPane.ERROR);
                       }
                   }
                }

        }   
    
        
        
         private class ActionListenerSearchItem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            filechooser=new JFileChooser();
            int chooser=filechooser.showOpenDialog(GymMemberShip.this);
            
            if(chooser==JFileChooser.APPROVE_OPTION){
                
                
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                
                BufferedReader bufferedReader;
                FileReader fileReader;
                
                
                String data,Id="",recoder="",MemberDetial="";
                try{
                     fileReader=new FileReader(file);
                     bufferedReader=new BufferedReader( fileReader);
                    
                    while((data=bufferedReader.readLine())!=null){
                        
                        recoder+=data+"\n";

                    }
                    
                    bufferedReader.close();

                }catch(IOException exv){
                    JOptionPane.showMessageDialog(null,exv.getMessage());
                }
                
                
                   String[]  MemberInfo=recoder.split("====================");
                   String  theId="";
                   int memberindex=-1;
                         for(int x=0;x<MemberInfo.length;x++){
                          
                             
                          for(int z=0;z<MemberInfo[x].length();z++){
                              
                              
                              if(Character.isDigit(MemberInfo[x].charAt(z))){
                                  theId+=MemberInfo[x].charAt(z);
                              }
                          }   
                          
                          
                          if(theId.equals(IdField.getText().trim())){
                              
                              memberindex=x;
                              break;
                          }else{
                              theId=""; 
                          }
                         
                      
                       }
                         
                         
                         if(memberindex!=-1){
                            JOptionPane.showMessageDialog(null,"Member Registered","MemberSerch", JOptionPane.INFORMATION_MESSAGE);
                             textArea.setText("====================\n"+MemberInfo[memberindex]+"\n====================");
                             
                         }
                         else{
                         JOptionPane.showMessageDialog(null,"Member Not Found","MemberSerch", JOptionPane.ERROR_MESSAGE);   
                         }
            }
        }
             
         }
          private class ActionListenerDeleteItem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
             
            filechooser=new JFileChooser();
            int chooser=filechooser.showOpenDialog(GymMemberShip.this);
            
            if(chooser==JFileChooser.APPROVE_OPTION){
                
                
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                
                BufferedReader bufferedReader;
                FileReader fileReader;
                
                
                String data,Id="",recoder="",MemberDetial="";
                try{
                     fileReader=new FileReader(file);
                     bufferedReader=new BufferedReader( fileReader);
                    
                    while((data=bufferedReader.readLine())!=null){
                        
                        recoder+=data+"\n";

                    }
                    
                    bufferedReader.close();

                }catch(IOException exv){
                    JOptionPane.showMessageDialog(null,exv.getMessage());
                }
            
                
                 String[]  MemberInfo=recoder.split("====================");
                   String  theId="";
                   int index=-1;
                   
                    ArrayList <String> MemberList=new ArrayList<>();
                    
                   
                         for(int x=0;x<MemberInfo.length;x++){
                          
                          MemberList.add(MemberInfo[x]);
                          
                       }
                         
                         
                         for(int i=0;i< MemberList.size();i++){
                            
                             
                             for(int z=0;z< MemberList.get(i).length();z++){
                                 
                                if(Character.isDigit(MemberList.get(i).charAt(z))){
                                   theId+=MemberList.get(i).charAt(z);
                                    
                                } 
                             }
                           
                             
                             if(theId.equals(IdField.getText().trim())){
                                 
                                index=i; 
                                break;
                             }else {
                                 theId="";
                             }
                             
                             
                         }
                         
                         
                 if (index != -1) {

                    MemberList.remove(index);
                    
                    

                    FileWriter filewriter;
                    BufferedWriter bufferedwriter;
                    String Writing;

                    try {
                        
                        filewriter = new FileWriter(file);
                        bufferedwriter = new BufferedWriter(filewriter);

                        for (int i = 0; i < MemberList.size(); i++) {

                            Writing=MemberList.get(i);
                             
                            if(Writing.isEmpty()==false){
                                  bufferedwriter.write("====================\n"+Writing);
                            }
                            
                            
                           
                        }
                        bufferedwriter.close();
                        JOptionPane.showMessageDialog(null, "Member Deleted", "SucessBox", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                    } catch (IOException ex) {
                        Logger.getLogger(GymMemberShip.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                        }else{
                         JOptionPane.showMessageDialog(null, "Member was Not Found In the List", "ErroBox", JOptionPane.ERROR_MESSAGE);
                   }
              
                         
                         
                             
                         }
                         
                         
                 
        }
             
            
            
            
         }
           private class ActionListenerUdateItem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            filechooser=new JFileChooser();
            int chooser=filechooser.showOpenDialog(GymMemberShip.this);
            
            if(chooser==JFileChooser.APPROVE_OPTION){
                
                
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                
                BufferedReader bufferedReader;
                FileReader fileReader;
                
                
                String data,Id="",recoder="",MemberDetial="";
                try{
                     fileReader=new FileReader(file);
                     bufferedReader=new BufferedReader( fileReader);
                    
                    while((data=bufferedReader.readLine())!=null){
                        
                        recoder+=data+"\n";

                    }
                    
                    bufferedReader.close();

                }catch(IOException exv){
                    JOptionPane.showMessageDialog(null,exv.getMessage());
                }
            
                
                 String[]  MemberInfo=recoder.split("====================");
                   String  theId="";
                   int index=-1;
                   
                    ArrayList <String> MemberList=new ArrayList<>();
                    
                   
                         for(int x=0;x<MemberInfo.length;x++){
                          
                          MemberList.add(MemberInfo[x]);
                          
                       }
                         
                         
                         for(int i=0;i< MemberList.size();i++){
                            
                             
                             for(int z=0;z< MemberList.get(i).length();z++){
                                 
                                if(Character.isDigit(MemberList.get(i).charAt(z))){
                                   theId+=MemberList.get(i).charAt(z);
                                    
                                } 
                             }
                           
                             
                             if(theId.equals(IdField.getText().trim())){
                                 
                                index=i; 
                                break;
                             }else {
                                 theId="";
                             }
                             
                             
                         }
                         
                         
                             
                         if(index!=-1){
                             
            String name,surname,idno,gender, Contract,PersonTrainer;    
            
            if(Month_to_monthbtn.isSelected()){
                Contract= Month_to_monthbtn.getText();
            }else if(SixmonthBtn.isSelected()){
                Contract=SixmonthBtn.getText();
            }else if(AnualBtn.isSelected()){
                Contract=AnualBtn.getText();
            }else{
            Contract="No Contract";
            }
           
            name=NameField.getText().trim();
            surname=SurnameField.getText().trim();
            idno=IdField.getText().trim();
            PersonTrainer="No";
            gender=(String)genderCombox.getSelectedItem();
            
             if(CheckMe.isSelected()){
                PersonTrainer="Yes";
              }

            MemberDetials members= new MemberDetials(name,surname,idno,gender,Contract,PersonTrainer);
            
            MemberList.get(index);
            MemberList.set(index,members.toString());
      
                    FileWriter filewriter;
                      BufferedWriter bufferedwriter;  
                        String Write; 
                     try {
                        
                        filewriter = new FileWriter(file);
                        bufferedwriter = new BufferedWriter(filewriter);

                        for (int i = 0; i < MemberList.size(); i++) {

                            Write=MemberList.get(i);
                             
                            if(Write.isEmpty()==false){
                                  bufferedwriter.write("====================\n"+Write+"\n====================");
                            }
  
                        }
                        bufferedwriter.close();
                        JOptionPane.showMessageDialog(null, "Member Details Updated", "SucessBox", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                    } catch (IOException ex) {
                        Logger.getLogger(GymMemberShip.class.getName()).log(Level.SEVERE, null, ex);
                    }
                         }else{
                         JOptionPane.showMessageDialog(null, "Member was Not Found In the List", "ErroBox", JOptionPane.ERROR_MESSAGE);
                   }
                         
          
                         
                             
                         }
            
            
            
            
            
        }
        
        
        
        
             
         }
}
