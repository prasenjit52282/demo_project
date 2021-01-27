package empdb.DB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Employees")
@Entity
public class Emp {
    private @Id long id;
    private @Column String name;
    private @Column int age;
    private @Column int exp;
    private @Column String skill;
    private @Column String contact_no;

    public Emp() {
    }

    public Emp(long id, String name, int age, int exp, String skill, String contact_no) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.skill = skill;
        this.contact_no = contact_no;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                ", skill='" + skill + '\'' +
                ", contact_no='" + contact_no + '\'' +
                '}';
    }
}
