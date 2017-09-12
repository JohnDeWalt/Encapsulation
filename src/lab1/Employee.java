package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
/*
Didnt need everything i had in the constructor and need to change error messages
*/
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        //this.metWithHr = metWithHr;
        //this.metDeptStaff = metDeptStaff;
        //this.reviewedDeptPolicies = reviewedDeptPolicies;
        //this.movedIn = movedIn;
        //this.cubeId = cubeId;
        //this.orientationDate = orientationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("first name is required");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("last name is required");
        }
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        if(ssn == null || ssn.length() < 9){
            throw new IllegalArgumentException("Social securtiy number is required and must be 9 characters");
        }
        this.ssn = ssn;
    }
    
    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public void setOrientationDate(Date orientationDate) {
        if(orientationDate == null){
            throw new IllegalArgumentException("Orientation date is required");
        }
        this.orientationDate = orientationDate;
    }



}
