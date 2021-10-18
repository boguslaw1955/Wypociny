package fries.com.pl.komponenty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
    public interface WypocinyRepository extends JpaRepository<Component, Integer>
    {

    }
