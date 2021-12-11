package com.endpointREST.repository;

import com.endpointREST.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Castro
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
    
}
