package placement.dao;

import placement.entities.Certificate;

public interface CertificateRepo {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(long id);
	public String deleteCertificate(long id);
	public void startTransaction();
	public void endTransaction();

}
