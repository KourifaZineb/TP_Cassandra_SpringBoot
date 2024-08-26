package ma.enset.tp_cassandra_bdcc1.repositories;

import ma.enset.tp_cassandra_bdcc1.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {

}
