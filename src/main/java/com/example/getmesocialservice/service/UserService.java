package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getuser(){
        return userRepository.getuser();
    }


    public Album getalbum() {
        return userRepository.getalbum();
    }

    public Album saveAlbum(Album album) {
        return userRepository.saveAlbum(album);
    }

    public List<Album> getAllAlbum() {
        return userRepository.getAllAlbum();
    }

    public Album getAlbumById(int albumId) {
        return userRepository.getAlbumById(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
        return userRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId) {
        return userRepository.deleteAlbum(albumId);
    }
}
