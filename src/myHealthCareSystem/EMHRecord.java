package myHealthCareSystem;

/**
 * This is a superclass that has variables for a health care system report.  
 * 
 * @see Name, Address, BirthDate, EMRecord, MedicalCalculator
 * @author Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class EMHRecord {

	/** Reporting Facility Province */
	private String reportingFacilityProvince;
	/** Institution Number */
	private String institutionNumber;
	/** Functional Centre Account */
	private String functionalCentreAccount; 
	/** Encounter Sequence */
	private int encounterSequence;
	/** Health Care Number */
	private String healthCareNumber;
	/** Chart Number */
	private String chartNumber;
	/** Issuing Province */
	private String issuingProvince;
	/** Residence Code */
	private String residenceCode;
	/** Gender */
	private String gender;
	/** Submission Year */
	private int submissionYear;
	/** Admin Via Ambulance */
	private String adminViaAmbulance;
	/** Registration Date */
	private int registrationDate;
	/** Registration Time */
	private int registrationTime;
	/** Patient's Birth Date */
	private BirthDate birthDate;
	
	/* Accessors and modifiers for attributes not handled by the constructor */
	
	/**
	 * Gets the patient's Functional Centre Account value. 
	 * @return Functional Centre Account value. 
	 */
	public String getFunctionalCentreAccount() {
		return functionalCentreAccount;
	}

	/**
	 * Sets the patient's Functional Centre Account value. 
	 * @param functionalCentreAccount 	New Functional Centre Account value
	 */
	public void setFunctionalCentreAccount(String functionalCentreAccount) {
		this.functionalCentreAccount = functionalCentreAccount;
	}
	
	/**
	 * Gets the patient's Encounter Sequence value.
	 * @return Encounter Sequence value. 
	 */
	public int getEncounterSequence() {
		return encounterSequence;
	}

	/** 
	 * Sets the patient's Encounter Sequence value.
	 * @param encounterSequence	New Encounter Sequence value.
	 */
	public void setEncounterSequence(int encounterSequence) {
		this.encounterSequence = encounterSequence;
	}

	/**
	 * Gets the patient's Issuing Province value.
	 * @return Issuing Province value.
	 */
	public String getIssuingProvince() {
		return issuingProvince;
	}

	/**
	 * Sets the patient's Issuing Province value.
	 * @param issuingProvince	New Issuing Province value.
	 */
	public void setIssuingProvince(String issuingProvince) {
		this.issuingProvince = issuingProvince;
	}

	/**
	 * Gets the patient's Residence Code value.
	 * @return Residence Code value.
	 */
	public String getResidenceCode() {
		return residenceCode;
	}

	/**
	 * Sets the patient's Residence Code value.
	 * @param residenceCode	New Residence Code value.
	 */
	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}
	
	/**
	 * Gets the patient's Gender value. 
	 * @return Gender value.
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the patient's Gender value. Constraints (M, F, U, D).
	 * @param gender	New Gender value.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the patient's Submission Year value.
	 * @return Submission Year value.
	 */
	public int getSubmissionYear() {
		return submissionYear;
	}

	/**
	 * Sets the patient's Submission Year value.
	 * @param submissionYear	New Submission Year value.
	 */
	public void setSubmissionYear(int submissionYear) {
		this.submissionYear = submissionYear;
	}

	/**
	 * Gets the patient's Admin Via Ambulance value.
	 * @return Admin Via Ambulance value.
	 */
	public String getAdminViaAmbulance() {
		return adminViaAmbulance;
	}

	/**
	 * Sets the patient's Admin Via Ambulance value.
	 * @param adminViaAmbulance	New Admin Via Ambulance value.
	 */
	public void setAdminViaAmbulance(String adminViaAmbulance) {
		this.adminViaAmbulance = adminViaAmbulance;
	}

	/**
	 * Gets the patient's Registration Date value.
	 * @return Registration Date value.
	 */
	public int getRegistrationDate() {
		return registrationDate;
	}
	
	/**
	 * Sets the patient's Registration Date value. Constraints (YYYYMMDD).
	 * @param registrationDate	New Registration Date value.
	 */
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * Gets the patient's Registration Time value.
	 * @return Registration Time value.
	 */
	public int getRegistrationTime() {
		return registrationTime;
	}
	/**
	 * Sets the patient's Registration Time value. Constraints (HHMM).
	 * @param registrationTime	New Registration Time value.
	 */
	public void setRegistrationTime(int registrationTime) {
		this.registrationTime = registrationTime;
	}
	
	/**
	 * Gets the patient's Birth Date value. 
	 * @return Birth Date value.
	 */
	public BirthDate getBirthDate() {
		return birthDate;
	}
	
	/**
	 * Sets the patient's Birth Date.
	 * @param birthDate	Object of patient's Birth Date.
	 */
	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * Gets the patient's Reporting Facility Province value. 
	 * @return Reporting Facility Province value.
	 */
	public String getReportingFacilityProvince() {
		return reportingFacilityProvince;
	}
	
	/**
	 * Gets the patient's Institution Number value. 
	 * @return Institution Number value.
	 */
	public String getInstitutionNumber() {
		return institutionNumber;
	}
	
	/**
	 * Gets the patient's Chart Number value. 
	 * @return Chart Number value.
	 */
	public String getChartNumber() {
		return chartNumber;
	}
	
	/**
	 * Gets the patient's Health Care Number value. 
	 * @return Health Care Number value. 
	 */
	public String getHealthCareNumber() {
		return healthCareNumber;
	}
	
	/*	Constructors		************************************/
	
	/**
	 * Constructs an object of EMH Record with the following parameters.
	 * @param reportingFacilityProvince	Reporting Facility Province
	 * @param institutionNumber			Institution Number
	 * @param chartNumber				Chart Number
	 * @param healthCareNumber			Health Care Number
	 */
	public EMHRecord (String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.chartNumber = chartNumber;
		this.healthCareNumber = healthCareNumber;
	}
	
	/*	Normal Behavior	************************************/
	
	/**
	 * Converts this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString() {
		String className = getClass().getName();
		return String.format("Reporting Facility Province: %s\nInstitution Number: %s\nFunctional Centre Account: %s\nEncounter Sequence: %d\nHealth Care Number: "
				+ "%s\nChart Number: %s\nIssuing Province: %s\nResidence Code: %s\nGender: %s\nSubmission Year: %d\nAdmin Via Ambulance: "
				+ "%s\nRegistration Date: %d\nRegistration Time: %d\nBirthdate: %s\n", reportingFacilityProvince, institutionNumber, functionalCentreAccount, 
				encounterSequence, healthCareNumber, chartNumber, issuingProvince, residenceCode, gender, submissionYear, adminViaAmbulance, 
				registrationDate, registrationTime, birthDate.formattedBirthDate()); 
	}
}
