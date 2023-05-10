package com.example.RanjanBootUrl307.models;

public class Url {

    String longUrl;

    String shortUrl;

    Long createdAt;

    Long updatedAt;

    Long lastAccessed;

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Long lastAccessed) {
        this.lastAccessed = lastAccessed;
    }
}
