package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.PlayList;
import com.kodnest.entity.Song;

public interface PlayListService {

	public void addPlaylist(PlayList playlist);

	

	public List<PlayList> fetchAllplaylist();


	
	
	

}
