package fries.com.pl.komponenty.repository;

import fries.com.pl.komponenty.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface WypocinyRepository extends JpaRepository<Component, Integer>
    {

    }
