import java.io.Serializable;

public class SalaryPresent implements Serializable {

    String message;
    String content;
    int daysalary;
    int workdays;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String present) {
        this.content = present;
    }

    public int getDaysalary(){
        return daysalary;
    }

    public void setDaysalary(int daysalary){
        this.daysalary = daysalary;
    }

    public int getWorkdays(){
        return workdays;
    }

    public void setWorkdays(int workdays){
        this.workdays = workdays;
    }


}