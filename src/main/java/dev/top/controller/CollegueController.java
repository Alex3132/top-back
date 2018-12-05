package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.ActionAvis;
import dev.top.entities.ActionAvis.Action;
import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@CrossOrigin
@RestController
@RequestMapping(value="/collegues")
public class CollegueController {

	@Autowired
	CollegueRepo collegueRepo;
	
	@GetMapping
	public List<Collegue> findAll(){
		return this.collegueRepo.findAll();
	}
//	@RequestMapping(value="/collegues", method = RequestMethod.GET)
//	public ResponseEntity<List<Collegue>> findCollegue(){
//		return ResponseEntity.status(200).body(collegueRepo.findAll());
//	}
	
	@PatchMapping("/{pseudo}")
	public Collegue updateCollegue(@RequestBody ActionAvis act, @PathVariable String pseudo) {
		Collegue collegue = collegueRepo.findByPseudo(pseudo);
		System.out.println(act.getAction());
		if(act.getAction() == Action.AIMER) {
			collegue.setScore(collegue.getScore()+10);
		}else {
			collegue.setScore(collegue.getScore()-5);
		}
		
		this.collegueRepo.save(collegue);
		return collegue;
	}
	
	@GetMapping("/{pseudo}")
	public Collegue recupererCollegue(@PathVariable String pseudo) {
		Collegue collegue = collegueRepo.findByPseudo(pseudo);
		return collegue;
		
	}
}
