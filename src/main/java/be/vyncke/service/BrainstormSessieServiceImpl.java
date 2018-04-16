package be.vyncke.service;

import java.util.List;

import be.vyncke.dao.PersoonRepository;
import be.vyncke.domain.Persoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

@Service("brainstormSessieService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
public class BrainstormSessieServiceImpl implements BrainstormSessieService {

    @Autowired
    private PersoonRepository persoonRepository = null;

    public BrainstormSessieServiceImpl(){}

    public List<Persoon> geefAllePersonen() {
        return persoonRepository.findAll();
    }

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Persoon zoekPersoonMetId(int id){
		return persoonRepository.findOne(id);
    }
    
	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	@Override
	public Persoon zoekPersoonMetEmail(String email) {
		return persoonRepository.findByEmailadres(email);
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Persoon voegPersoonToe(String voornaam, String familienaam, String emailadres, String paswoord) {

    	return persoonRepository.save( createPersoon("aktief",voornaam,familienaam,emailadres,paswoord) );
    }

    private Persoon createPersoon(String status, String voornaam, String familienaam, String emailadres,
			String paswoord) {

    	return new Persoon(status, voornaam, familienaam, emailadres,paswoord);
	}

}