package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Song;

public interface SongService {	

	public boolean songExists(String name);

	public void saveSong(Song song);

	public List<Song> fetchAllSongs();

	public void updateSong(Song song);

	
	


	
}