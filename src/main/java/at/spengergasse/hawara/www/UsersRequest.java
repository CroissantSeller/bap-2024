package at.spengergasse.hawara.www;

public record UsersRequest(String username, String password, String email) {

    public static UsersRequest base(){
        return new UsersRequest("", "", "");
    }
}