package com.practice.videogametracekrservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepos extends JpaRepository<VideoGame, Long> {
}
