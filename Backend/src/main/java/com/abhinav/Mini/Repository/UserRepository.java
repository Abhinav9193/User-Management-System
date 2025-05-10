package com.abhinav.Mini.Repository;

import com.abhinav.Mini.Model.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{

}
