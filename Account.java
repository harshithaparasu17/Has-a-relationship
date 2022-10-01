package p4;

public class Account {

	long accountNumber;

	 String userName;

	 String password;

	int balance;

	KYCVerification kycdetails;
	
	ContactDetails contactDetails;

	 int cashback;

	 
	 
	
	

	public Account(long accountNumber, String username, String password, int balance, KYCVerification kycdetails,
			ContactDetails contactDetails, int cashback, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this.kycdetails = kycdetails;
		this.contactDetails = contactDetails;
		this.cashback = cashback;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public KYCVerification getKycdetails() {
		return kycdetails;
	}

	public void setKycdetails(KYCVerification kycdetails) {
		this.kycdetails = kycdetails;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public int getCashback() {
		return cashback;
	}

	public void setCashback(int cashback) {
		this.cashback = cashback;
	}
	 @Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", username=" + userName + ", password=" + password
					+ ", balance=" + balance + ", kycdetails=" + kycdetails + ", contactDetails=" + contactDetails
					+ ", cashback=" + cashback + "]";
	 }
}
