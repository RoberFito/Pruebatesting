import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person
{
    protected String dni;
    protected String mail;

    public Person() {
        dni = "";
        mail = "";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = "";

        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        Pattern p = Pattern.compile("\\w+(\\.\\w+)*@\\w+(\\.\\w+)+$");
        Matcher m = p.matcher(mail);
        if(m.find()) {
            this.mail = mail;
        }
        else {
            this.mail = mail;
        }
    }
}