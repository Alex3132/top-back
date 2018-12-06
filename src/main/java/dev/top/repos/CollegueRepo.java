package dev.top.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.top.controller.CollegueForm;
import dev.top.entities.ActionAvis;
import dev.top.entities.Collegue;

public interface CollegueRepo extends JpaRepository<Collegue, Integer> {
	Collegue findByPseudo(String pseudo);

	void save(ActionAvis act);

	Collegue save(CollegueForm collegueForm);

}
