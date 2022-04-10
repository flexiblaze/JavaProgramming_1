package day31_Constructors;

public class Offer {

   public String location, companyName,jobTitle;
   public double salary;
   public boolean hasBenefit,hasPTO,isWTH,isFullTime;


    // it helps you to generate attributes
    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWTH, boolean isFullTime) {

        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWTH = isWTH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWTH=" + isWTH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}

