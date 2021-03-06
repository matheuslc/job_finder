package model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String name;
    @Column
    private long cpf;
    @Column
    private String phone;
    @Column
    private String company;
    @Column(unique = true)
    private String login;
    @Column
    private String password;
    @JoinColumn(name = "curriculum_id")
    @OneToOne
    private Curriculum curriculum;
    @JoinColumn(name = "job_id")
    @OneToOne
    private JobOpportunity jobOpportunity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public JobOpportunity getJobOpportunity() {
        return jobOpportunity;
    }

    public void setJobOpportunity(JobOpportunity jobOpportunity) {
        this.jobOpportunity = jobOpportunity;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf=" + cpf +
                ", phone='" + phone + '\'' +
                ", company='" + company + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", curriculum=" + curriculum +
                '}';
    }
}
