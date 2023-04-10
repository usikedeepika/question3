import java.util.Scanner;

public class person {
    Scanner sc;
    protected String name;
    protected String dateOfBirth;
    protected String gender;
    protected String mobileNumber;
    protected String bloodGroup;
    public void setName()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the name");
        this.name=sc.nextLine();
    }
    public void setDateOfBirth()
    {   sc=new Scanner(System.in);
        System.out.println("Enter the DateOfBirth");
        this.dateOfBirth=sc.nextLine();
    }
    public void setGender()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the gender");
        this.gender=sc.nextLine();
    }
    public void setMobileNumber()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the Mobile Number");
        this.mobileNumber=sc.nextLine();
    }
    public void setBloodGroup()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the Blood Grop");
        this.bloodGroup=sc.nextLine();
    }
    String getName()
    {
        return name;
    }
    String getDateOfBirth()
    {
        return dateOfBirth;
    }
    String getGender()
    {
        return gender;
    }
    String getMobileNumber()
    {
        return mobileNumber;
    }
    String getBloodGroup()
    {
        return bloodGroup;
    }

}
