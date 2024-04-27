package com.example.fourfun;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SmileRepo extends JpaRepository<Smile,Integer>{

    
}