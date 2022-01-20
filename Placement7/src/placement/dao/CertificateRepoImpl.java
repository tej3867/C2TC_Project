package placement.dao;

import javax.persistence.EntityManager;

import placement.entities.Certificate;
import placement.entities.College;

public class CertificateRepoImpl implements CertificateRepo{
	EntityManager em;
	public CertificateRepoImpl()
{
	em=configuration.getEntityManager();
}
	@Override
	public Certificate addCertificate(Certificate certificate) {
		em.persist(certificate);
		return certificate;
	}
	@Override
	public Certificate updateCertificate(Certificate certificate) {
		em.merge(certificate);
		return certificate;
	}
	@Override
	public Certificate searchCertificate(long id) {
		Certificate cer =em.find(Certificate.class, id);
		return cer;
	}
	@Override
	public String deleteCertificate(long id) {
		Certificate cert = searchCertificate(id);
		em.remove(cert);
		return "deleted";
	}
	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

}
