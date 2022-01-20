package placement.service;

import placement.entities.Certificate;

public interface CertificateService {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(long id);
	public String deleteCertificate(long id);
}
