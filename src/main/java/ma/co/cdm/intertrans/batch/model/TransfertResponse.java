package ma.co.cdm.intertrans.batch.model;

public class TransfertResponse {

	private String refId;
	private String status;
	private String description;
	private String dateEnvoie;
	private String fileNameHasTechnicalError;
	private boolean hasTechnicalError;
	private String motifTechnicalError;

	public TransfertResponse() {
		super();
	}

	public TransfertResponse(String refId, String status, String description) {
		super();
		this.refId = refId;
		this.status = status;
		this.description = description;
	}

	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	public String getDateEnvoie() {
		return dateEnvoie;
	}

	public void setDateEnvoie(String dateEnvoie) {
		this.dateEnvoie = dateEnvoie;
	}
	

	public String getFileNameHasTechnicalError() {
		return fileNameHasTechnicalError;
	}

	public void setFileNameHasTechnicalError(String fileNameHasTechnicalError) {
		this.fileNameHasTechnicalError = fileNameHasTechnicalError;
	}

	public String toStringCsvOutPut() {
		return "01|"+this.refId + "|" + this.status + "|" +this.description ;
	}
	
	
	

	public boolean isHasTechnicalError() {
		return hasTechnicalError;
	}

	public void setHasTechnicalError(boolean hasTechnicalError) {
		this.hasTechnicalError = hasTechnicalError;
	}

	
	
	public String getMotifTechnicalError() {
		return motifTechnicalError;
	}

	public void setMotifTechnicalError(String motifTechnicalError) {
		this.motifTechnicalError = motifTechnicalError;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.description == null) ? 0 : this.description.hashCode());
		result = (prime * result) + ((this.refId == null) ? 0 : this.refId.hashCode());
		result = (prime * result) + ((this.status == null) ? 0 : this.status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		TransfertResponse other = (TransfertResponse) obj;
		if (this.description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!this.description.equals(other.description)) {
			return false;
		}
		if (this.refId == null) {
			if (other.refId != null) {
				return false;
			}
		} else if (!this.refId.equals(other.refId)) {
			return false;
		}
		if (this.status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!this.status.equals(other.status)) {
			return false;
		}
		return true;
	}

}
