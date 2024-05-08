package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.entity.PlayList;
import com.kodnest.entity.Song;
import com.kodnest.service.PlayListService;
import com.kodnest.service.SongService;
@Controller
public class PlayListController<playlist> {
	@Autowired
	PlayListService playListService;

	@Autowired
	SongService songService;

	@GetMapping("/createplaylists")
	public String createPlayList(Model model) {
		List<Song> songList=songService.fetchAllSongs();
		model.addAttribute("songs", songList);
		return "createplaylist";
	}
	@PostMapping("/addplaylist")
	public String addplaylist(@ModelAttribute PlayList playlist) {
		playListService.addPlaylist(playlist);
		return "adminhome";
		
		//updating the song_playlists table
//		List<Song> songs = playlist.getSongs();
//		
//		for (Song song : songs) {
//			song.getPlaylists().add(playlist);
//			songService.updateSong(song);
//		}
//		
//		return "createplaylists";
	}
	@GetMapping("/viewplaylist")
	public String viewplaylist(Model model) {
	List<PlayList>  allplaylist=  playListService.fetchAllplaylist();
		model.addAttribute("playlists", allplaylist);
		return "viewplaylist";
	}


}



