import controllers.UserController;

public class Project {
    
    public static void main(String[] args){
        UserController uc = new UserController();
        System.out.println(uc.getAll().toString());
    }
}
