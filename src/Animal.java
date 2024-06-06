
import java.util.Date;

public class Animal {
    private int ID;
    private String nomeAnimal;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private Date dataEntrada;
    private String status;

    public Animal(int ID, String nome,String especie, String raca,int idade, String sexo, Date dataEntrada, String status ){
        this.ID=ID;
        this.nomeAnimal=nome;
        this.especie=especie;
        this.raca=raca;
        this.idade=idade;
        this.sexo=sexo;
        this.dataEntrada=dataEntrada;
        this.status=status;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nomeAnimal;
    }

    public void setNome(String nome) {
        this.nomeAnimal = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
