package com.kodnest.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.PlayList;
import com.kodnest.entity.Song;
import com.kodnest.repository.PlayListRepository;
import com.kodnest.service.PlayListService;

@Service
public class PlayListServiceImpl implements PlayListService {
	@Autowired
	PlayListRepository playlistRepository;


	@Override
	public void addPlaylist(PlayList playlist) {
		PlayList existplaylist=playlistRepository.findByName(playlist.getName());
		if(existplaylist==null) {
			playlistRepository.save(playlist);
		}
		else {
			System.out.println("playlist already exist");
		}

	}


	@Override
	public List<PlayList> fetchAllplaylist() {
		List<PlayList> playlist = playlistRepository.findAll();
		return playlist;

	}
}

























