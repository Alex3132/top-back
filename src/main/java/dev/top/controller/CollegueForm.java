package dev.top.controller;

public class CollegueForm {

	private String matricule;
	private String pseudo;
	private String imageUrl;

	
	public CollegueForm(String matricule, String pseudo, String imageUrl) {
		super();
		this.matricule = matricule;
		this.pseudo = pseudo;
		this.imageUrl = imageUrl;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
