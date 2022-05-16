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
         Pattern pepe = Pattern.compile("^\\d{8}[A-Z]$");
        Matcher m = pepe.matcher(dni);
        if(m.find()) {
            this.dni= dni;
        }
        else {
            this.dni = "";
        }

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