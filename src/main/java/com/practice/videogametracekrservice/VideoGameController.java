package com.practice.videogametracekrservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video-games")
public class VideoGameController {

    private final VideoGameRepos vgRepos;
    public VideoGameController(VideoGameRepos vgRepos) {
        this.vgRepos = vgRepos;
    }

    @GetMapping
    public List<VideoGame> getVideoGames() {
        return vgRepos.findAll();
    }

    @PostMapping
    public void addVideoGame(@RequestBody VideoGame videoGame) {
        vgRepos.save(videoGame);
    }

    @DeleteMapping("/{id}")
    public void deleteVideoGame(@PathVariable Long id) {
        vgRepos.deleteById(id);
    }

}
