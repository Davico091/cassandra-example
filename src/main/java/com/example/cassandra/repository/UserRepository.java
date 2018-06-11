package com.example.cassandra.repository;

import com.example.cassandra.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;


public interface UserRepository extends CassandraRepository<User,String> {
}
