import java.util.Scanner;

public class Donor  extends person
{
    protected String bloodBankName;
    protected String donorType;
    protected String donationDate;
    public void setBloodBankName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Blood Bank Name");
        this.bloodBankName=sc.nextLine();
    }
    public void setDonorType()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Donor Type");
        this.donorType=sc.nextLine();
    }
    public void setDonationDate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Donotiondate");
        this.donationDate=sc.nextLine();
    }
    String getBloodBankName()
    {
        return bloodBankName;
    }
    String getDonorType()
    {
        return getDonorType();
    }
    String getDonationDate()
    {
        return getDonationDate();
    }
    public void displayDonationDetails()
    {
        System.out.println("Donation Details:\n"+"Name:"+name+"\nDate Of Birth:"+dateOfBirth+"\nGender:"+gender+"\nMobile Number:"+mobileNumber+"\nBlood Group:"+bloodGroup+"\nBlood Bank Name:"+bloodBankName+"\nDonor Type:"+donorType+"\nDonation Date:"+donationDate);
    }
}
