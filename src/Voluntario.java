public class Voluntario {
    private int ID;
    private String nomeVoluntario;
    private String email;
    private int telefone;
    private String endereco;
    private String areasDeInteresse;

    public Voluntario(int ID, String nome, String email, int telefone, String endereco, String areasDeInteresse){
        this.ID=ID;
        this.nomeVoluntario=nome;
        this.telefone=telefone;
        this.endereco=endereco;
        this.areasDeInteresse=areasDeInteresse;
        this.email=email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomeVoluntario() {
        return nomeVoluntario;
    }

    public void setNomeVoluntario(String nomeVoluntario) {
        this.nomeVoluntario = nomeVoluntario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getAreasDeInteresse() {
        return areasDeInteresse;
    }

    public void setAreasDeInteresse(String areasDeInteresse) {
        this.areasDeInteresse = areasDeInteresse;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
