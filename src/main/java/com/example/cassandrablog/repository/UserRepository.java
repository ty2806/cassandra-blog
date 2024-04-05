package com.example.cassandrablog.repository;

import com.example.cassandrablog.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, Long> {
}
