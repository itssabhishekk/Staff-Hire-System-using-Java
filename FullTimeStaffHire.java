
/**
 * This is sub class of the class StaffHire.
 *
 * @author (Abhishek Rokaya)
 * @version (0.1)
 */
//Creating Sub-Class FullTimeStaffHire
public class FullTimeStaffHire extends StaffHire
{
    //declaring variables
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public FullTimeStaffHire( int vacancyNumber,String designation, String jobType, int salary, int workingHour)
    { super(vacancyNumber,designation,jobType);
      this.salary=salary;
      this.workingHour=workingHour;
      staffName=" ";
      joiningDate=" ";
      qualification= " ";
      appointedBy=" ";
      joined=false;
    }
    //getter method of salary
    public int getSalary()
    { return salary;
    }
    //getter method of workingHour
    public int getWorkingHour()
    { return workingHour;
    }
    //getter method of staffName
    public String getStaffName()
    { return staffName;
    }
    //getter method of joiningDate
    public String getJoiningDate()
    { return joiningDate;
    }
    //getter method of qualification
    public String getQualification()
    { return qualification;
    }
    //getter method of appointedBy
     public String getAppointedBy()
    { return appointedBy;
    }
    //getter method of joined
     public boolean getJoined()
    { return joined;
    }
    //setter method of salary
    public void setSalary(int salary)
        { if(joined == false)//only set the salary if the staff hasn't joined already
            { this.salary=salary;
            }
          else
          { System.out.println("Staff is already appointed, so the salary cannot be changed.");
           }
        }
    //setter method of working hour
    public void setWorkingHour( int workingHour)
        {this.workingHour=workingHour;
        }
    //method to hire Full Time Staff
     public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
     {
           if(getJoined())//only set the values if the staff hasn't joined
           {
            System.out.println( getStaffName() + " was already hired on " + getJoiningDate() );
           }else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy =appointedBy;
            joined = true;
            System.out.println("The staff is hired." );
        }
    }
     //method to display the information of the staff that has been hired
    public void displayInfo(){
        super.displayInfo();
        if(getJoined()){
            System.out.println("Staff Name : " + getStaffName());
            System.out.println("Salary : " + getSalary());
            System.out.println("Working hour : " + getWorkingHour());
            System.out.println("Joining date : " + getJoiningDate());
            System.out.println("Qualification : " + getQualification());
            System.out.println("Appoined by : " + getAppointedBy());
        }
    }
}
