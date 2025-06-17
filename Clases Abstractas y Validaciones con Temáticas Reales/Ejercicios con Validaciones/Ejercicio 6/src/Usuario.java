public class Usuario {
    private String password;

    public void setPassword(String password){
        if (password.length() >= 8){
            this.password = password;
            System.out.println("Contraseña aceptada");
        } else {
            System.out.println("Contraseña muy corta");
        }
    }

    public String getPassword(){
        return password;
    }
}
