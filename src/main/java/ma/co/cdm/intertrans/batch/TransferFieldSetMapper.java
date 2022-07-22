package ma.co.cdm.intertrans.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import ma.co.cdm.intertrans.batch.model.Transfert;

public class TransferFieldSetMapper implements FieldSetMapper<Transfert> {

	
		@Override
		public Transfert mapFieldSet(FieldSet fieldSet) throws BindException {
			return Transfert.builder()
					.sendingDate(fieldSet.readString("sendingDate"))
					.customerName(fieldSet.readString("customerName"))
					.acountDebited(fieldSet.readString("acountDebited"))
					.beneficiaryName(fieldSet.readString("beneficiaryName"))
					.bic(fieldSet.readString("bic"))
					.iban(fieldSet.readString("iban"))
					.amount(fieldSet.readDouble("amount"))
					.currencyCustomer(fieldSet.readString("currencyCustomer"))
					.currencyBeneficiary(fieldSet.readString("currencyBeneficiary"))
					.costsAtPaid(fieldSet.readString("costsAtPaid"))
					.countryCode(fieldSet.readString("countryCode"))
					.motif(fieldSet.readString("motif"))
					.adriaReference(fieldSet.readString("adriaReference"))
					.customerReference(fieldSet.readString("customerReference"))
					.build(); 
		}
	}


