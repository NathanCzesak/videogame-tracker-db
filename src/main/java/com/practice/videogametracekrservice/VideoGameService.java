package com.practice.videogametracekrservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameService {

    private final VideoGameRepos vgRepos;

    public VideoGameService(VideoGameRepos vgRepos) {
        this.vgRepos = vgRepos;
    }

    public List<VideoGame> getVideoGames() {
        return vgRepos.findAll();
    }

    public void addVideoGame(VideoGame videoGame) {
        vgRepos.save(videoGame);
    }

    public void deleteVideoGame(Long id) {
        vgRepos.deleteById(id);
    }

}
