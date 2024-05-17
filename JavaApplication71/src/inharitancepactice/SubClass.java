package inharitancepactice;

public class SubClass extends SuperClass {

    int postCode;

    public SubClass() {
    }

    public SubClass(int postCode) {
        this.postCode = postCode;
    }

    public SubClass(int postCode, String villegeName, String divisionName, int Word) {
        super(villegeName, divisionName, Word);
        this.postCode = postCode;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public void displyPrint() {
        System.out.println(super.villegeName + " " + super.divisionName + " "
                + super.Word + " " + this.postCode);

    }

}
