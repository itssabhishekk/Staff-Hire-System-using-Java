/**
 * This is a class which creates the GUI of the staff hire
 * and implements action listener to do the given task.
 * Abhishek Rokaya L1C2
 * @version (0.1)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import org.jdesktop.swingx.JXDatePicker;
import java.text.SimpleDateFormat;
import javax.swing.border.BevelBorder;
import javax.swing.BorderFactory;
 
public class INGNepal implements ActionListener
{
   //Declaring variables required in this program.
   //variable of JFrame.
   private JFrame myFrm;
   
   //variables of JLabel of Full Time Staff.
   private JLabel lblFT, lblVacancyNo1FT, lblWorkingHourFT, lblDesignationFT, lblSalaryFT, lblJobTypeFT, lblNameFT,
   lblQualificationFT, lblJoiningDateFT, lblVacancyNo2FT,lblAppointedByFT;
   
   // variables of JLabel of Part Time Staff.
   private JLabel lblPT, lblVacancyNo1PT, lblWorkingHourPT, lblDesignationPT, lblWagesPerHourPT, lblJobTypePT, lblShiftsPT,
   lblNamePT, lblVacancyNo2PT, lblJoiningDatePT, lblQualificationPT, lblAppointedByPT,lblVacancyNo3PT;
   
   //variables of JtextField of Full Time Staff.
   private JTextField txtVacancyNo1FT, txtWorkingHourFT, txtDesignationFT, txtSalaryFT,  txtNameFT,
   txtVacancyNo2FT, txtQualificationFT, txtAppointedByFT;
   
   //variables of JTextField of Part Time Staff.
   private JTextField txtVacancyNo1PT, txtWorkingHourPT, txtDesignationPT, txtWagesPerHourPT,
   txtVacancyNo2PT, txtNamePT, txtAppointedByPT, txtQualificationPT, txtVacancyNo3PT;
   
   //variables of a combobox
   private JComboBox cbJobTypeFT, cbJobTypePT, cbShiftsPT;
   
   //for picking a date
   private JXDatePicker dpJoiningDateFT, dpJoiningDatePT;
   
   //variable of JButton
   private JButton btnAddFT, btnAppointFT, btnAddPT, btnAppointPT, btnTerminatePT, btnDisplay, btnClear;
   
   //for creating border
   private JPanel panel1, panel2, panel3, panel4, panel5;
   
   //variable of arraylist.
   ArrayList<StaffHire> list = new ArrayList<StaffHire>();
   
   public static void main(String []args){
        //creating object of INGNepal and calling method gui().
        new INGNepal().gui();
   }
   
   //method to create the Graphical User Interface(GUI).
   public void gui(){
       
       //creating the main frame
       myFrm = new JFrame("Staff Hire");
       myFrm.setSize(1272,467);
       myFrm.setLayout(null);
       myFrm.setResizable(false);
       
       //For Full Time Staff
       
       //creatingJLabel
       lblFT = new JLabel ("For Full Time Staff Hire");
       //setting font and color
       lblFT.setFont(new Font("Arial black",Font.BOLD,15));
       lblFT.setForeground(Color.BLACK);
       //setting location of lblFT
       lblFT.setBounds(210,15,300,25);
       //adding to frame.
       myFrm.add(lblFT);
       
       lblVacancyNo1FT = new JLabel ("Vacancy No. :");
       lblVacancyNo1FT.setBounds (25,60,110,23);
       lblVacancyNo1FT.setFont(new Font("Arial",Font.BOLD,13));
       lblVacancyNo1FT.setForeground(Color.BLACK);
       myFrm.add(lblVacancyNo1FT);
       
       txtVacancyNo1FT = new JTextField();
       txtVacancyNo1FT.setBounds(130,60,165,23);
       myFrm.add(txtVacancyNo1FT);
       
       lblDesignationFT = new JLabel("Designation : ");
       lblDesignationFT.setBounds(27,95,110,23);
       lblDesignationFT.setFont(new Font("Arial",Font.BOLD,13));
       lblDesignationFT.setForeground(Color.BLACK);
       myFrm.add(lblDesignationFT);
       
       txtDesignationFT = new JTextField();
       txtDesignationFT.setBounds(130,95,165,23);
       myFrm.add(txtDesignationFT);
       
       lblWorkingHourFT = new JLabel("Working Hours :");
       lblWorkingHourFT.setBounds(325,60,110,23);
       lblWorkingHourFT.setFont(new Font("Arial",Font.BOLD,13));
       lblWorkingHourFT.setForeground(Color.BLACK);
       myFrm.add(lblWorkingHourFT);
       
       txtWorkingHourFT = new JTextField();
       txtWorkingHourFT.setBounds(440,60,165,23);
       myFrm.add(txtWorkingHourFT);
       
       lblSalaryFT = new JLabel("Salary :");
       lblSalaryFT.setBounds(380,95,60,23);
       lblSalaryFT.setFont(new Font("Arial",Font.BOLD,13));
       lblSalaryFT.setForeground(Color.BLACK);
       myFrm.add(lblSalaryFT);
       
       txtSalaryFT = new JTextField();
       txtSalaryFT.setBounds(440,95,165,23);
       myFrm.add(txtSalaryFT);
       
       lblJobTypeFT = new JLabel ("Job Type :");
       lblJobTypeFT.setBounds(43,130,100,23);
       lblJobTypeFT.setFont(new Font("Arial",Font.BOLD,13));
       lblJobTypeFT.setForeground(Color.BLACK);
       myFrm.add(lblJobTypeFT);
       
       cbJobTypeFT = new JComboBox();
       cbJobTypeFT.addItem("Full Time");
       cbJobTypeFT.addItem("Part Time");
       cbJobTypeFT.setBounds(130,130,83,23);
       myFrm.add(cbJobTypeFT);
       
       btnAddFT = new JButton("ADD");
       btnAddFT.setBounds(450,160,130,25);
       myFrm.add(btnAddFT);
       
       lblNameFT = new JLabel(" Staff Name : ");
       lblNameFT.setBounds(35,220,100,23);
       lblNameFT.setFont(new Font("Arial",Font.BOLD,13));
       lblNameFT.setForeground(Color.BLACK);
       myFrm.add(lblNameFT);
       
       txtNameFT = new JTextField();
       txtNameFT.setBounds(130,220,165,23);
       myFrm.add(txtNameFT);
       
       lblJoiningDateFT = new JLabel ("Joining Date :");
       lblJoiningDateFT.setBounds(28,255,110,23);
       lblJoiningDateFT.setFont(new Font("Arial",Font.BOLD,13));
       lblJoiningDateFT.setForeground(Color.BLACK);
       myFrm.add(lblJoiningDateFT);
       
       dpJoiningDateFT = new JXDatePicker();
       dpJoiningDateFT.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
       dpJoiningDateFT.setBounds(130,255,100,23);
       myFrm.add(dpJoiningDateFT);
       
       lblVacancyNo2FT = new JLabel ("Vacancy No. :");
       lblVacancyNo2FT.setBounds(342,220,120,23);
       lblVacancyNo2FT.setFont(new Font("Arial",Font.BOLD,13));
       lblVacancyNo2FT.setForeground(Color.BLACK);
       myFrm.add(lblVacancyNo2FT);
       
       txtVacancyNo2FT = new JTextField();
       txtVacancyNo2FT.setBounds(440,220,165,23);
       myFrm.add(txtVacancyNo2FT);
       
       lblQualificationFT = new JLabel ("Qualification :");
       lblQualificationFT.setBounds(339,255,100,23);
       lblQualificationFT.setFont(new Font("Arial",Font.BOLD,13));
       lblQualificationFT.setForeground(Color.BLACK);
       myFrm.add(lblQualificationFT);
       
       txtQualificationFT = new JTextField();
       txtQualificationFT.setBounds(440,255,165,23);
       myFrm.add(txtQualificationFT);
       
       lblAppointedByFT = new JLabel("Appointed By :");
       lblAppointedByFT.setBounds(22,290,100,23);
       lblAppointedByFT.setFont(new Font("Arial",Font.BOLD,13));
       lblAppointedByFT.setForeground(Color.BLACK);
       myFrm.add(lblAppointedByFT);
       
       txtAppointedByFT = new JTextField();
       txtAppointedByFT.setBounds(130,290,165,23);
       myFrm.add(txtAppointedByFT);
       
       btnAppointFT = new JButton("Appoint");
       btnAppointFT.setBounds(450,295,130,25);
       myFrm.add(btnAppointFT);

       //For Part Time Staff
       
       //creatingJLabel
       lblPT = new JLabel ("For Part Time Staff Hire");
       //setting font and color
       lblPT.setFont(new Font("Arial black",Font.BOLD,15));
       lblPT.setForeground(Color.BLACK);
       //determining location of lblFT
       lblPT.setBounds(860,15,300,25);
       //adding to frame.
       myFrm.add(lblPT);
       
       lblVacancyNo1PT = new JLabel ("Vacancy No. :");
       lblVacancyNo1PT.setBounds(663,55,90,23);
       lblVacancyNo1PT.setFont(new Font("Arial",Font.BOLD,13));
       lblVacancyNo1PT.setForeground(Color.BLACK);
       myFrm.add(lblVacancyNo1PT);
       
       txtVacancyNo1PT = new JTextField();
       txtVacancyNo1PT.setBounds(760,55,165,23);
       myFrm.add(txtVacancyNo1PT);
       
       lblDesignationPT = new JLabel ("Designation :");
       lblDesignationPT.setBounds(665,90,110,23);
       lblDesignationPT.setFont(new Font("Arial",Font.BOLD,13));
       lblDesignationPT.setForeground(Color.BLACK);
       myFrm.add(lblDesignationPT);
       
       txtDesignationPT = new JTextField();
       txtDesignationPT.setBounds(760,90,165,23);
       myFrm.add(txtDesignationPT);
       
       lblJobTypePT = new JLabel ("Job Type :");
       lblJobTypePT.setBounds(683,125,110,23);
       lblJobTypePT.setFont(new Font("Arial",Font.BOLD,13));
       lblJobTypePT.setForeground(Color.BLACK);
       myFrm.add(lblJobTypePT);
       
       cbJobTypePT = new JComboBox();
       cbJobTypePT.addItem("Part Time");
       cbJobTypePT.addItem("Full Time");
       cbJobTypePT.setBounds(760,125,83,23);
       myFrm.add(cbJobTypePT);
       
       lblWorkingHourPT = new JLabel ("Working Hour :");
       lblWorkingHourPT.setBounds(965,55,110,23);
       lblWorkingHourPT.setFont(new Font("Arial",Font.BOLD,13));
       lblWorkingHourPT.setForeground(Color.BLACK);
       myFrm.add(lblWorkingHourPT);
       
       txtWorkingHourPT = new JTextField();
       txtWorkingHourPT.setBounds(1070,55,165,23);
       myFrm.add(txtWorkingHourPT);
       
       lblWagesPerHourPT = new JLabel ("Wages Per Hour :");
       lblWagesPerHourPT.setBounds(950,90,120,23);
       lblWagesPerHourPT.setFont(new Font("Arial",Font.BOLD,13));
       lblWagesPerHourPT.setForeground(Color.BLACK);
       myFrm.add(lblWagesPerHourPT);
       
       txtWagesPerHourPT = new JTextField();
       txtWagesPerHourPT.setBounds(1070,90,165,23);
       myFrm.add(txtWagesPerHourPT);
       
       lblShiftsPT = new JLabel ("Shifts :");
       lblShiftsPT.setBounds(1016,125,90,23);
       lblShiftsPT.setFont(new Font("Arial",Font.BOLD,13));
       lblShiftsPT.setForeground(Color.BLACK);
       myFrm.add(lblShiftsPT);
       
       cbShiftsPT = new JComboBox();
       cbShiftsPT.addItem("Morning");
       cbShiftsPT.addItem("Day");
       cbShiftsPT.addItem("Evening");
       cbShiftsPT.setBounds(1070,125,83,23);
       myFrm.add(cbShiftsPT);
       
       btnAddPT = new JButton("ADD");
       btnAddPT.setBounds(1080,160,130,25);
       myFrm.add(btnAddPT);
       
       lblNamePT = new JLabel("Staff Name : ");
       lblNamePT.setBounds(670, 220, 100, 23);
       lblNamePT.setFont(new Font("Arial",Font.BOLD,13));
       lblNamePT.setForeground(Color.BLACK);
       myFrm.add(lblNamePT);
       
       txtNamePT = new JTextField();
       txtNamePT.setBounds(760, 220, 165, 23);
       myFrm.add(txtNamePT);
       
       lblJoiningDatePT = new JLabel ("Joining Date :");
       lblJoiningDatePT.setBounds(661, 255, 90, 23); 
       lblJoiningDatePT.setFont(new Font("Arial",Font.BOLD,13));
       lblJoiningDatePT.setForeground(Color.BLACK);
       myFrm.add(lblJoiningDatePT);
       
       dpJoiningDatePT = new JXDatePicker();
       dpJoiningDatePT.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
       dpJoiningDatePT.setBounds(760, 255, 100, 23);
       myFrm.add(dpJoiningDatePT);
       
       lblVacancyNo2PT = new JLabel ("Vacancy No. :");
       lblVacancyNo2PT.setBounds(970, 220, 100, 23);
       lblVacancyNo2PT.setFont(new Font("Arial",Font.BOLD,13));
       lblVacancyNo2PT.setForeground(Color.BLACK);
       myFrm.add(lblVacancyNo2PT);
       
       txtVacancyNo2PT = new JTextField();
       txtVacancyNo2PT.setBounds(1070, 220, 165, 23);
       myFrm.add(txtVacancyNo2PT);
       
       lblQualificationPT = new JLabel ("Qualification :");
       lblQualificationPT.setBounds(968, 255, 100, 23);
       lblQualificationPT.setFont(new Font("Arial",Font.BOLD,13));
       lblQualificationPT.setForeground(Color.BLACK);
       myFrm.add(lblQualificationPT);
       
       txtQualificationPT = new JTextField();
       txtQualificationPT.setBounds(1070, 255, 165, 23);
       myFrm.add(txtQualificationPT);
       
       lblAppointedByPT = new JLabel("Appointed By :");
       lblAppointedByPT.setBounds(655, 290, 110, 23);
       lblAppointedByPT.setFont(new Font("Arial",Font.BOLD,13));
       lblAppointedByPT.setForeground(Color.BLACK);
       myFrm.add(lblAppointedByPT);
       
       txtAppointedByPT = new JTextField();
       txtAppointedByPT.setBounds(760, 290, 165, 23);
       myFrm.add(txtAppointedByPT);
       
       btnAppointPT = new JButton("Appoint");
       btnAppointPT.setBounds(1075, 295, 130, 25);
       myFrm.add(btnAppointPT);
       
       lblVacancyNo3PT = new JLabel ("Vacancy No. :");
       lblVacancyNo3PT.setBounds(760, 335, 100, 23);
       lblVacancyNo3PT.setFont(new Font("Arial",Font.BOLD,13));
       lblVacancyNo3PT.setForeground(Color.BLACK);
       myFrm.add(lblVacancyNo3PT);
       
       txtVacancyNo3PT = new JTextField();
       txtVacancyNo3PT.setBounds(860, 335, 165, 23);
       myFrm.add(txtVacancyNo3PT);
       
       btnTerminatePT = new JButton("Terminate");
       btnTerminatePT.setBounds(1045, 333, 130, 25);
       myFrm.add(btnTerminatePT);
       
       //button to display all the values entered
       btnDisplay = new JButton("Display All");
       btnDisplay.setBounds(445, 373, 200, 40);
       myFrm.add(btnDisplay);
       
       //button to clear the values written in text fields
       btnClear = new JButton("Clear");
       btnClear.setBounds(660, 373, 200, 40);
       myFrm.add(btnClear);
       
       panel3 = new JPanel();
       panel3.setBounds(10,10,630,32);
       panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
       myFrm.add(panel3);
       
       panel1 = new JPanel();
       panel1.setBounds(10,10,630,355);
       panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
       myFrm.add(panel1);
       
       panel4 = new JPanel();
       panel4.setBounds(635,10,612,32);
       panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
       myFrm.add(panel4);
       
       panel2 = new JPanel();
       panel2.setBounds(635,10,612,355);
       panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
       myFrm.add(panel2);
       
       panel5 = new JPanel();
       panel5.setBounds(10,363,1237,59);
       panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
       myFrm.add(panel5);
       
       //Adding action of button. 
       btnClear.addActionListener(this); 
       btnAddFT.addActionListener(this); 
       btnAddPT.addActionListener(this); 
       btnAppointFT.addActionListener(this); 
       btnTerminatePT.addActionListener(this); 
       btnAppointPT.addActionListener(this); 
       btnDisplay.addActionListener(this);
       
 
       myFrm.repaint();//so that everything is visible without mouse click
       myFrm.setVisible(true);//making the frame visible
       //closing the program when user clicks cross button.
       myFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void actionPerformed(ActionEvent e){ 
       if(e.getSource() == btnAddFT){ 
            //calling method of same class. 
            addFT(); 
       } 
       if(e.getSource() == btnAppointFT){ 
            appointFT(); 
       } 
       if(e.getSource() == btnAddPT){ 
            addPT(); 
       }
       if(e.getSource() == btnAppointPT){ 
            appointPT(); 
       }
       if(e.getSource() == btnTerminatePT){ 
            terminatePT(); 
       }
       if(e.getSource() == btnDisplay){ 
            display(); 
       }
       if(e.getSource() == btnClear){ 
            clear(); 
       }
   }
    
   public void addFT(){
        int vno=0;
        int salary=0, workingHour=0;
        String jobType="", desgination="";
        try{
          if(txtVacancyNo1FT.getText().isEmpty() || txtDesignationFT.getText().isEmpty() || 
            txtSalaryFT.getText().isEmpty() || txtWorkingHourFT.getText().isEmpty()
            ){ 
                //displays pop up dialogbox. 
                JOptionPane.showMessageDialog(myFrm, "Please fill up all the text boxes"); 
            }
            else
           {
            vno=Integer.parseInt(txtVacancyNo1FT.getText()); 
            desgination=txtDesignationFT.getText();
            salary=Integer.parseInt(txtSalaryFT.getText());
            workingHour=Integer.parseInt(txtWorkingHourFT.getText());
            jobType=(cbJobTypeFT.getSelectedItem()).toString();
            boolean isDuplicateVno=false;
            for(StaffHire var:list){
               if(var.getVacancyNumber()==vno){
                        isDuplicateVno=true;
                        break;
                    }
               }
            if (isDuplicateVno==false){
                if(vno<1 || salary<0 || workingHour<1){
                   JOptionPane.showMessageDialog(myFrm,"Enter positive Number Only");
                }
                else if(workingHour>15)
                {
                    JOptionPane.showMessageDialog(myFrm,"Working Hour cannot be more than 15");
                }
               else{
                FullTimeStaffHire obj=new FullTimeStaffHire(vno, desgination,jobType,salary,workingHour);
                list.add(obj);
                JOptionPane.showMessageDialog(myFrm,"vacancy added "+list.size());
               }
            }else{
                 JOptionPane.showMessageDialog(myFrm,"Input Vacancy no is already in the list. "+list.size()); 
            }
          }
        }catch(Exception exp){
             JOptionPane.showMessageDialog(myFrm,"Input is invalid. "); 
        }
   }
    
   public void appointFT(){
       if(txtVacancyNo2FT.getText().isEmpty() || txtNameFT.getText().isEmpty() || dpJoiningDateFT.getDate().toString().isEmpty() || 
            txtQualificationFT.getText().isEmpty() || txtAppointedByFT.getText().isEmpty()
            ){ 
                //displays pop up dialogbox. 
                JOptionPane.showMessageDialog(myFrm, "Please fill up all the text boxes");      
        }else{
           int vno=Integer.parseInt(txtVacancyNo2FT.getText());
           String staffName=txtNameFT.getText();
           String joinDate=dpJoiningDateFT.getDate().toString();
           String qualification=txtQualificationFT.getText();
           String appointedBy=txtAppointedByFT.getText();
           boolean vnoFound=false;
           int counter = 0;
           for(StaffHire obj:list){
                if(obj.getVacancyNumber()==vno){
                   vnoFound=true;
                   if(obj instanceof FullTimeStaffHire){
                       if(((FullTimeStaffHire)obj).getJoined()==true){
                            JOptionPane.showMessageDialog(myFrm,"Staff already hired!");
                        }else{
                           ((FullTimeStaffHire)obj).hireFullTimeStaff(staffName,joinDate,qualification,appointedBy);
                           list.set(counter,obj);
                           JOptionPane.showMessageDialog(myFrm,"Staff has been hired!");
                        }
                        break;
                    }else{
                        JOptionPane.showMessageDialog(myFrm,"not for fulltime staff Hire");
                        break;
                    }
                }
                counter+=1;
           }
          if (!vnoFound) {
                JOptionPane.showMessageDialog(myFrm,"invalid vacancy");
          }
       }
   }
    
   public void addPT(){
        int vno=0;
        int wagesPerHour=0, workingHour=0;
        String jobType="", desgination="", shifts="";
        try{
            if(txtVacancyNo1PT.getText().isEmpty() || txtDesignationPT.getText().isEmpty() || 
            txtWagesPerHourPT.getText().isEmpty() || txtWorkingHourPT.getText().isEmpty())
            { 
                //displays pop up dialogbox. 
                JOptionPane.showMessageDialog(myFrm, "Please fill up all the text boxes"); 
            }
            else{
            vno=Integer.parseInt(txtVacancyNo1PT.getText()); 
            desgination=txtDesignationPT.getText();
            wagesPerHour=Integer.parseInt(txtWagesPerHourPT.getText());
            workingHour=Integer.parseInt(txtWorkingHourPT.getText());
            jobType=(cbJobTypePT.getSelectedItem()).toString();
            shifts=(cbShiftsPT.getSelectedItem()).toString();
            boolean isDuplicateVno=false;
            for(StaffHire var:list){
               if(var.getVacancyNumber()==vno){
                        isDuplicateVno=true;
                        break;
                    }
               }
            if (isDuplicateVno==false){
                if(vno<1 || wagesPerHour<0 || workingHour<1){
                   JOptionPane.showMessageDialog(myFrm,"Enter positive Number Only");
                }
                else if(workingHour>6)
                {
                    JOptionPane.showMessageDialog(myFrm,"Working Hour cannot be more than 6");
                }
                else{
                PartTimeStaffHire obj=new PartTimeStaffHire(vno, desgination,jobType,workingHour,wagesPerHour,shifts);
                list.add(obj);
                JOptionPane.showMessageDialog(myFrm,"vacancy added "+list.size());
                }
            }else{
                 JOptionPane.showMessageDialog(myFrm,"Input Vacancy no is already in the list. "+list.size()); 
              } 
          }
        }catch(Exception exp){
             JOptionPane.showMessageDialog(myFrm,"Input is invalid. "); 
        }
   }
    
   public void appointPT(){
      if(txtVacancyNo2PT.getText().isEmpty() || txtNamePT.getText().isEmpty() || dpJoiningDatePT.getDate().toString().isEmpty() || 
            txtQualificationPT.getText().isEmpty() || txtAppointedByPT.getText().isEmpty())
        { 
                //displays pop up dialogbox. 
                JOptionPane.showMessageDialog(myFrm, "Please fill up all the text boxes");      
      }else
      {
        int vno=Integer.parseInt(txtVacancyNo2PT.getText());
        String staffName=txtNamePT.getText();
        String joinDate=dpJoiningDatePT.getDate().toString();
        String qualification=txtQualificationPT.getText();
        String appointedBy=txtAppointedByPT.getText();
        boolean vnoFound=false;
        int counter = 0;
        for(StaffHire obj:list){
            if(obj.getVacancyNumber()==vno){
               vnoFound=true;
               if(obj instanceof PartTimeStaffHire){
                  if(((PartTimeStaffHire)obj).getJoined()==true){
                         JOptionPane.showMessageDialog(myFrm,"Staff already hired!");
                   }else{
                        ((PartTimeStaffHire)obj).hirePartTimeStaff(staffName,joinDate,qualification,appointedBy);
                        list.set(counter,obj);
                        JOptionPane.showMessageDialog(myFrm,"Staff has been hired!");
                     }
                  break;
               }else{
                   JOptionPane.showMessageDialog(myFrm,"not for part time staff Hire");
                   break;
                }
             }
            counter+=1;
         }
         if (!vnoFound) {
           JOptionPane.showMessageDialog(myFrm,"invalid vacancy");
         }
       }
   }
    
   public void terminatePT(){
      if(txtVacancyNo3PT.getText().isEmpty())
        { 
                //displays pop up dialogbox. 
                JOptionPane.showMessageDialog(myFrm, "Please fill up the text box");      
      }else{
        int vacant=Integer.parseInt(txtVacancyNo3PT.getText());
        for(StaffHire obj:list){
            if(obj.getVacancyNumber()==vacant){
                if(obj instanceof PartTimeStaffHire) {
                    PartTimeStaffHire part_obj=(PartTimeStaffHire)obj;
                    if(part_obj.getTerminated()==false) {
                           part_obj.terminateStaff();
                           JOptionPane.showMessageDialog(myFrm,"Part Time Staff is successfully terminated.");
                           break;
                        
                    }
                    else if (part_obj.getTerminated() == true){
                           JOptionPane.showMessageDialog(myFrm,"Sorry! Staff has already been terminated.");
                           break;
                    }
                 
                  }
                  else{
                      JOptionPane.showMessageDialog(myFrm,"Sorry! Please enter valid vacancy no.");
                      break;
                  }
            }
        }
       }
   }
   
    public void display(){
        //iterating all items of list. 
        for (StaffHire obj: list){ 
            if (obj instanceof FullTimeStaffHire){ 
                System.out.println("\t\t Full Time Staff Details:"); 
                obj.displayInfo(); 
            } 
            else{ 
                System.out.println("\t\t Part Time Staff Details:"); 
                obj.displayInfo(); 
            } 
            System.out.println(""); 
        } 
    }
    
   public void clear(){
       //clearing the values of text fields of full time staff
       txtVacancyNo1FT.setText("");
       txtWorkingHourFT.setText("");
       txtDesignationFT.setText("");
       cbJobTypeFT.setSelectedItem("Full Time");//keeping the default value of combo box as full time
       txtSalaryFT.setText("");
       txtNameFT.setText("");
       txtVacancyNo2FT.setText("");
       dpJoiningDateFT.setDate(null); //clearing the value of date picker
       txtQualificationFT.setText("");
       txtAppointedByFT.setText("");
       
       //clearing the values of text fields of Part Time Staff
       txtVacancyNo1PT.setText("");
       txtWorkingHourPT.setText("");
       txtDesignationPT.setText("");
       cbJobTypePT.setSelectedItem("Part Time"); //keeping the default value of combo box as part time
       cbShiftsPT.setSelectedItem("Morning"); //keeping the default value of combo box as morning
       txtWagesPerHourPT.setText("");
       txtNamePT.setText("");
       txtVacancyNo2PT.setText("");
       dpJoiningDatePT.setDate(null); //clearing the value of date picker
       txtQualificationPT.setText("");
       txtAppointedByPT.setText("");
       txtVacancyNo3PT.setText("");
      
    }
}