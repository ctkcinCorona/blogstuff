package com.rmpader.basicsecurity.data.repository;

import com.rmpader.basicsecurity.data.model.UserAuthority;
import org.springframework.data.repository.CrudRepository;

/**
 * @author RMPader
 */
public interface UserAuthorityRepository extends CrudRepository<UserAuthority, UserAuthority.UserAuthoritiesId> {

}
