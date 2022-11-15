package launchcodeproject.launchcodeproject.repositories;

import launchcodeproject.launchcodeproject.models.RegisterForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterFormRepository extends CrudRepository<RegisterForm,Integer> {
}
