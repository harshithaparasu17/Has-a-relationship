package p4;

public class KYCVerification {
 String panNumber;
 String documentType;
 long aadharNumber;
 String documentNumber;
 public KYCVerification() {
		super();
		// TODO Auto-generated constructor stub
	}
 
public KYCVerification(String panNumber, String documentType, long aadharNumber, String documentNumber) {
	super();
	this.panNumber = panNumber;
	this.documentType = documentType;
	this.aadharNumber = aadharNumber;
	this.documentNumber = documentNumber;
}

public String getPanNumber() {
	return panNumber;
}
public void setPanNumber(String panNumber) {
	this.panNumber = panNumber;
}
public String getDocumentType() {
	return documentType;
}
public void setDocumentType(String documentType) {
	this.documentType = documentType;
}
public long getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public String getDocumentNumber() {
	return documentNumber;
}
public void setDocumentNumber(String documentNumber) {
	this.documentNumber = documentNumber;
}
@Override
public String toString() {
	return "KYCVerification [panNumber=" + panNumber + ", documentType=" + documentType + ", aadharNumber="
			+ aadharNumber + ", documentNumber=" + documentNumber + "]";
}
 
 
}
