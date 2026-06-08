package com.practice.videogametracekrservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video-games")
public class VideoGameController {

    private final VideoGameRepos vgRepos;
    private final VideoGameService videoGameService;

    public VideoGameController(VideoGameRepos vgRepos, VideoGameService videoGameService) {
        this.vgRepos = vgRepos;
        this.videoGameService = videoGameService;
    }

    @GetMapping
    public List<VideoGame> getVideoGames() {
        return videoGameService.getVideoGames();
    }

    @PostMapping
    public void addVideoGame(@RequestBody VideoGame videoGame) {
        videoGameService.addVideoGame(videoGame);
    }

    @DeleteMapping("/{id}")
    public void deleteVideoGame(@PathVariable Long id) {
        videoGameService.deleteVideoGame(id);
    }

}
