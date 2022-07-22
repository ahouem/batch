package ma.co.cdm.intertrans.batch.model;

import org.springframework.batch.item.ResourceAware;
import org.springframework.core.io.Resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MiseADisposition implements ResourceAware{
	
	private String sendingDate;
		
	private String acountDebited;
	
	private String beneficiaryName;
	
	private String identityType;
	
	private String identityNumber;
	
	private Double amount;
		
	private String currency;
	
	private String costsAtPaid;
	
	private String countryCode;
	
	private String motif;
	
	private String adriaReference;
	
	private String customerReference;
	
	private String fileName;

	@Override
	public void setResource(Resource resource) {
		this.fileName = resource.getFilename();
		
	}

}
