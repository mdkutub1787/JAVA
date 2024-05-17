package inharitancepactice;

public class SuperClass {

    String villegeName;
    String divisionName;
    int Word;

    public SuperClass() {
    }

    public SuperClass(String villegeName, String divisionName, int Word) {
        this.villegeName = villegeName;
        this.divisionName = divisionName;
        this.Word = Word;
    }

    public String getVillegeName() {
        return villegeName;
    }

    public void setVillegeName(String villegeName) {
        this.villegeName = villegeName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getWord() {
        return Word;
    }

    public void setWord(int Word) {
        this.Word = Word;
    }

    @Override
    public String toString() {
        return "SuperClass{" + "villegeName=" + villegeName + ", divisionName=" + divisionName + ", Word=" + Word + '}';
    }

    public void displyPrint() {

    }

}
