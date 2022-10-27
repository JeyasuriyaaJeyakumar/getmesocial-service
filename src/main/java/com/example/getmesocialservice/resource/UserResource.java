package com.example.getmesocialservice.resource;


import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    //GET methods
//    @GetMapping("/user")
//    public User getuser(){
//      return  userService.getuser();
//    }


    @GetMapping("/album")
    public List<Album> getAllAlbum(){
        return userService.getAllAlbum();
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
        return userService.getAlbumById(albumId);
    }
    //POST  methods
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return userService.saveAlbum(album);
    }

    //PUT methods
    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album){
        return userService.updateAlbum(albumId, album);
    }

    //DELETE methods
    @DeleteMapping("/album")
    public Album deleteAlbum (@RequestParam(name = "albumId")int albumId){
        return userService.deleteAlbum(albumId);
    }


}

