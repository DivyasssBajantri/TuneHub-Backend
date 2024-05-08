package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.entity.Song;
import com.kodnest.service.SongService;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class SongController {

	@Autowired
	SongService songService;

	@PostMapping("/addsongs")

	public String addSong(@ModelAttribute Song song) {

		//to check a user with a mail is present or not
		String name=song.getName();
		boolean songExists=songService.songExists(name);
		if(songExists==false){
			songService.saveSong(song);
		}
		else{
			System.out.println("duplicate entry");
		}
		return "adminhome";
	}

	@GetMapping("/playsongs")
	public String playSong(Model model) {
		boolean premium=true;
		if(premium) {
			List<Song> songslist=songService.fetchAllSongs();
			model.addAttribute("songs", songslist);
			System.out.println(songslist);
			return "viewsongs";
		}else {
			return "pay";
		}
	}

	@GetMapping("/viewsongs")
	public String viewSong(Model model) {
		List<Song> songslist=songService.fetchAllSongs();
		model.addAttribute("songs", songslist);
		System.out.println(songslist);
		return "viewsongs";
	}


}





