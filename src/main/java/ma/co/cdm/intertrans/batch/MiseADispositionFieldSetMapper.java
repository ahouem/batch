package ma.co.cdm.intertrans.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import ma.co.cdm.intertrans.batch.model.MiseADisposition;

public class MiseADispositionFieldSetMapper implements FieldSetMapper<MiseADisposition> {

		@Override
		public MiseADisposition mapFieldSet(FieldSet fieldSet) throws BindException {
			return MiseADisposition.builder()
					.sendingDate(fieldSet.readString("sendingDate"))
					.acountDebited(fieldSet.readString("acountDebited"))
					.beneficiaryName(fieldSet.readString("beneficiaryName"))
					.identityType(fieldSet.readString("identityType"))
					.identityNumber(fieldSet.readString("identityNumber"))
					.amount(fieldSet.readDouble("amount"))
					.currency(fieldSet.readString("currency"))
					.costsAtPaid(fieldSet.readString("costsAtPaid"))
					.countryCode(fieldSet.readString("countryCode"))
					.motif(fieldSet.readString("motif"))
					.adriaReference(fieldSet.readString("adriaReference"))
					.customerReference(fieldSet.readString("customerReference"))

					.build(); 
		}
	}


