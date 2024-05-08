package com.kodnest.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Song {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name; 
	private String artist;
	private String generic;
	private String link;
	@ManyToMany
	private List<PlayList> playlists;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGeneric() {
		return generic;
	}
	public void setGeneric(String genre) {
		this.generic = generic;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<PlayList> getPlaylists() {
		return playlists;
	}
	public void setPlaylists(List<PlayList> playlists) {
		this.playlists = playlists;
	}
	public Song() {
		super();
	}
	public Song(int id, String name, String artist, String genre, String link, List<PlayList> playlists) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.generic = generic;
		this.link = link;
		this.playlists = playlists;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", generic=" + generic + ", link=" + link
				+ ", playlists=" + playlists + "]";
	}

}
