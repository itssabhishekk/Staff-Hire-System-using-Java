
/**
 * This is a sub class of the class StaffHire. 
 * It is used to hire Part Time staff in an organization.
 * @author (Abhishek Rokaya)
 * @version (0.1)
 */
//creating sub-class PartTimeStaffHire
public class PartTimeStaffHire extends StaffHire
{
  //declaring variables
  private int workingHour;
  private int wagesPerHour;
  private String staffName;
  private String joiningDate;
  private String qualification;
  private String appointedBy;
  private String shifts;
  private boolean joined;
  private boolean terminated;
  public PartTimeStaffHire (int vacancyNumber, String designation, 
                            String jobType, int workingHour,int wagesPerHour, String shifts)
  {
      super(vacancyNumber,designation,jobType);
      this.workingHour=workingHour;
      this.wagesPerHour=wagesPerHour;
      this.shifts=shifts;
      staffName="";
      joiningDate="";
      qualification="";
      appointedBy="";
      joined=false;
      terminated=false;
  }
  //getter method of workingHour
  public int getWorkingHour()
    {
        return workingHour;
    }
  //getter method of wagesPerHour
  public int getWagesPerHour()
    {
        return wagesPerHour;
    }
  //getter method of staffName
  public String getStaffName()
    {
        return staffName;
    }
  //getter method of joiningDate
  public String getJoiningDate()
    {
        return joiningDate;
    }
  //getter method of qualification
  public String getQualification()
    {
        return qualification;
    }
  //getter method of appointedy
  public String getAppointedBy()
    {
        return appointedBy;
    }
  //getter method of shifts
  public String getShifts()
  {
      return shifts;
    }
  //getter method of joined
  public boolean getJoined()
    {
        return joined;
    }
  //getter method of terminated
  public boolean getTerminated()
  {
      return terminated;
  }
  //setter method of shifts
 public void setShifts(String shifts)
  {
      if (!getJoined())//if joined is false then set the shifts else displayed as cant be changed
      {
          this.shifts=shifts;
          System.out.println("Shift has been changed to " + getShifts());
      }else{
          System.out.println("Shift cannot be changed.");
        }
  }
  // method to hire PartTimeStaff
  public void hirePartTimeStaff(String staffName, String joiningDate, 
                        String qualification, String appointedBy)
  {
      if(getJoined())//if getJoined is true, display the staff was appointed on the following date else set new values
      {
          System.out.println(getStaffName()+" was appointed on "+getJoiningDate());
      }else{
          this.staffName=staffName;
          this.joiningDate=joiningDate;
          this.qualification=qualification;
          this.appointedBy=appointedBy;
          joined=true;
          terminated=false;
          System.out.println("The staff has been appointed");
       }
  }
  //method to terminate the staff
  public void terminateStaff()
  {
      if(getTerminated())//if getTerminated is true, message displayed as staff is already terminated else reset the values.
      {
          System.out.println("Staff is already terminated");
      }else{
          staffName="";
          joiningDate="";
          qualification="";
          appointedBy="";
          joined=false;
          terminated=true;
          System.out.println("Staff has been terminated.");
      }
  }
  //method to display the information of the staff that has been hired
  public void displayInfo()
  {
      super.displayInfo();
      if (getJoined())      
      {
         System.out.println("Staff name : "+getStaffName());
         System.out.println("Wages per hour : "+getWagesPerHour());
         System.out.println("Working hour : "+getWorkingHour());
         System.out.println("Joining Date : "+getJoiningDate());
         System.out.println("Qualification : "+getQualification());
         System.out.println("Appointed By : "+getAppointedBy());
         System.out.println("Income per day : "+(getWagesPerHour()*getWorkingHour()));
      }
    }
}
