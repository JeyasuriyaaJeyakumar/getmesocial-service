package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

//    public User getuser(){
//
//        User user = new User("John doe","Canada", 20, "https://profilepicurl.com");
//        return user;
//    }
    List<Album> albumList = new ArrayList();
    public Album getalbum() {
        Album album = new Album(1, "Album 1", "This is the first album", "http://coverpicurl1.com");
        return album;
    }
    public List<Album> getAllAlbum() {
        return albumList;
    }
    public Album getAlbumById(int albumId) {
        for (Album album:albumList){
            if (album.getAlbumId() == albumId){
                return album;
            }
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() +1);
        albumList.add(album);
        return album;
    }
    public Album updateAlbum(int albumId, Album album) {
        for (Album a:albumList){
            if (a.getAlbumId() == albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for (Album a:albumList){
            if(a.getAlbumId() == albumId){
                deletedAlbum = a;
                albumList.remove(a);
//                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
