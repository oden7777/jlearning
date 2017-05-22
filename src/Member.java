/**
 * Created by suyamayutaro on 2017/05/21.
 */
public class Member {

    private String FirstName;
    private String LastName;


    Member (String FirstName, String LastName)
    {
        this.FirstName = FirstName;
        this.LastName  = LastName;
    }

    public String getFullName()
    {
        return String.format("%s %s", this.FirstName.toUpperCase(), this.LastName.toUpperCase());
    }
}