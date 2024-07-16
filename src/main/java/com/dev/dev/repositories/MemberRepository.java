package com.dev.dev.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.dev.dev.domain.Member;
import java.util.List;


@Repository
public interface MemberRepository extends MongoRepository<Member,String>{
  public List<Member> findAll();
}