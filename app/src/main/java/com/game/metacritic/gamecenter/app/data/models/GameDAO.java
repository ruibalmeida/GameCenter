package com.game.metacritic.gamecenter.app.data.models;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

/**
 * Created by Rui Almeida on 21-05-2014.
 */
@RealmClass
public class GameDAO extends RealmObject {

    private String id;
    private String name;
    private String score;
    private String url;
    private String rlsdate;
    private String rating;
    private String publisher;
    private String platform;
    private String genre;
    private String thumbnail;
    private String userscore;
    private String developer;
    private boolean box;
    private boolean cartridge;
    private boolean manual;

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

    public boolean isCartridge() {
        return cartridge;
    }

    public void setCartridge(boolean cartridge) {
        this.cartridge = cartridge;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean wManual) {
        this.manual = wManual;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRlsdate() {
        return rlsdate;
    }

    public void setRlsdate(String rlsdate) {
        this.rlsdate = rlsdate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUserscore() {
        return userscore;
    }

    public void setUserscore(String userscore) {
        this.userscore = userscore;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}