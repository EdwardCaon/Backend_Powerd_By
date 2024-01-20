
package Powered_by.springboot.controller;


import Powered_by.springboot.payload.request.TokenUserRequest;
import Powered_by.springboot.payload.request.NewFavPlayerRequest;
import Powered_by.springboot.payload.request.NewFavTeamRequest;
import Powered_by.springboot.service.FavService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fav")
@RequiredArgsConstructor
@CrossOrigin
public class FavController {

    private final FavService favService;

    @PostMapping("/new/team")
    public ResponseEntity<?> saveFavTeam(@RequestBody @Valid NewFavTeamRequest request) {
        return favService.saveOrDeleteFavTeam(request);
    }

    @PostMapping("/new/player")
    public ResponseEntity<?> saveFavPlayer(@RequestBody @Valid NewFavPlayerRequest request) {
        return favService.saveFavPlayer(request);
    }



    @PostMapping("/get/team")
    public ResponseEntity<?> getFavTeam(@RequestBody @Valid TokenUserRequest request) {
        return favService.getFavTeam(request);
    }

    @PostMapping("/get/player")
    public ResponseEntity<?> getFavPlayer(@RequestBody @Valid TokenUserRequest request) {
        return favService.getFavPlayer(request);
    }

/*
    @GetMapping("/season/stats/{idPlayer}")
    public ResponseEntity<?> getSasonPlayerStats(@PathVariable Long idPlayer) {
        return favService.getFavPlayerStats(idPlayer);
    }
*/


}