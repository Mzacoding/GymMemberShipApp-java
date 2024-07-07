
package aop.tut.gymmembership;


public class MemberDetials {
    
    private String name;
    private String surname;
    private String idno;
    private String gender;
    private String Contract;
    private String PersonTrainer;

    public MemberDetials(String name, String surname, String idno, String gender, String Contract, String PersonTrainer) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.gender = gender;
        this.Contract = Contract;
        this.PersonTrainer = PersonTrainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContract() {
        return Contract;
    }

    public void setContract(String Contract) {
        this.Contract = Contract;
    }

    public String getPersonTrainer() {
        return PersonTrainer;
    }

    public void setPersonTrainer(String PersonTrainer) {
        this.PersonTrainer = PersonTrainer;
    }

    @Override
    public String toString() {
    
       
               return
               "\nName\t: " + name +
                "\nSurname\t: " + surname + "\nIdNumber\t: " + idno + 
                "\nGender\t: " + gender +
                "\nContract\t: " + Contract + "\nPersonTrainer\t: " + PersonTrainer;
                
         
    }

   
    
    
    
    
}
