package cs_utec.cs2901.business;

import cs_utec.cs2901.repositories.DailyCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DailyCasesBusiness {
    @Autowired
    private DailyCasesRepository repository;

}
