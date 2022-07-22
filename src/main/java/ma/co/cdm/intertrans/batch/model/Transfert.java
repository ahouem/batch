package ma.co.cdm.intertrans.batch.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.batch.item.ResourceAware;
import org.springframework.core.io.Resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transfert implements ResourceAware{
	
	
	private String sendingDate;
	
	private String customerName;
	
	private String acountDebited;
	
	private String beneficiaryName;
	
	private String bic;
	
	private String iban;
	
	private Double amount;
	
	private String currencyCustomer;
	
	private String currencyBeneficiary;
	
	private String costsAtPaid;

	@NotNull(message = "le code pays ne doit pas être null")
	@NotBlank(message = "le code pays ne doit pas être balnk")
	@NotEmpty(message = "le code pays ne doit pas être vide")
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
