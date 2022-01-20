package placement.service;

import placement.dao.CertificateRepo;
import placement.dao.CertificateRepoImpl;
import placement.dao.CollegeRepo;
import placement.dao.CollegeRepoImpl;
import placement.entities.Certificate;

public class CertificateServiceImpl implements CertificateService{
CertificateRepo cr;
	
	public CertificateServiceImpl(){
		cr=new CertificateRepoImpl();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		cr.startTransaction();
		cr.addCertificate(certificate);
		cr.endTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		cr.startTransaction();
		cr.updateCertificate(certificate);
		cr.endTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) {
		return cr.searchCertificate(id);
	}

	@Override
	public String deleteCertificate(long id) {
		cr.startTransaction();
		cr.deleteCertificate(id);
		cr.endTransaction();
		return "deleted";
	}

}
