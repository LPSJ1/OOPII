abstract public class Account{
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData){
        myData = _myData;
        myData.execute();
    }
}

 class Admin extends Account{
    //Private string specified owith Admin
    private String authPassword;
    public Admin(int _id, String _name, String _password){
        id = _id;
        name = _name;
        authPassword= _password; 
    }
}

interface DataSource{
    public void execute();
}

 class Delete implements DataSource{

    @Override
    public void execute() {
        System.out.println("Data has been deleted");
            }
}

class  MainApplication{
    public static void main(String[] args){

        Admin currentAdmin = new Admin(1, "Sean Combs","SC1");
        User currentUser = new User(2, "John Doe");
        currentAdmin.performOperation(new Update());
        currentUser.performOperation(new View());
        
    }
}

 class Update implements DataSource{

    @Override

    public void execute(){
        System.out.println("Data has been updated");
    }
}

 class User extends Account{
    public User(int _id,String _name){

    id = _id;
    name = _name;
}

}


 class View implements DataSource{

@Override

public void execute(){

    System.out.println("Some data to be displayed");
}

}