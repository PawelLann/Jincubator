package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by plangwerski on 05.07.17.
 */
public interface TalkRepository extends JpaRepository<Talk, String> {
}
