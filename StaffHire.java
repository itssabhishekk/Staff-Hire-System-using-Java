
/**
 * A program to hire a staff.
 *
 * @author (Abhishek Rokaya)
 * @version (0.1)
 */
//creating class StaffHire
public class StaffHire
{
    //declaring variables
    private int vacancyNumber;
    private String designation;
    private String jobType;
    public StaffHire(int vacancyNumber, String designation, String jobType)
    {
        this.vacancyNumber=vacancyNumber;
        this.designation= designation;
        this.jobType= jobType;
    
    }
    //getter method of vacancyNumber
    public int getVacancyNumber()
    { return vacancyNumber;
    }
    //setter method of vacancyNumber
    public void setVacancyNumber(int vacancyNumber)
    { this.vacancyNumber=vacancyNumber;
    }
    //getter method of designation
    public String getDesignation()
    { return designation;
    }
    //setter method of designation
    public void setDesignation(String Designation)
    {this.designation=designation;
    }
    //getter method of jobType
    public String getJobType()
    { return jobType;
    }
    //setter method of jobType
    public void setJobType(String jobType)
    { this.jobType=jobType;
    }
    //method to display the information of the staff that has been hired.
    public void displayInfo()
    { System.out.println("Vacancy number= "+ getVacancyNumber());
      System.out.println("Designation= " + getDesignation());
      System.out.println("Job Type= " + getJobType()); 
    }
}
