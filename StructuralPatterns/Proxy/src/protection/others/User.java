package protection.others;

public class User {
    private String name;
    private Permission permission;

    public User(String name, Permission permission){
        this.name = name;
        this.permission = permission;
    }

    public String getName(){
        return this.name;
    }

    public Permission getPermission(){
        return this.permission;
    }
}
