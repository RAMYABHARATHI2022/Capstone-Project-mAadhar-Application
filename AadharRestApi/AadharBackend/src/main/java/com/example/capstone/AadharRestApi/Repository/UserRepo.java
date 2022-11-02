package com.example.capstone.AadharRestApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.capstone.AadharRestApi.Entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
