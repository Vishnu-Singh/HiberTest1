package hiberPackage;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "test", schema = "test", catalog = "")
public class TestEntity {
    private String testname;

    @Basic
    @Column(name = "Testname", nullable = true, length = 20)
    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEntity that = (TestEntity) o;

        if (testname != null ? !testname.equals(that.testname) : that.testname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return testname != null ? testname.hashCode() : 0;
    }
}
