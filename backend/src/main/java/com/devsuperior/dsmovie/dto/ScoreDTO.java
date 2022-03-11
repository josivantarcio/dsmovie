package com.devsuperior.dsmovie.dto;

public class ScoreDTO {
	private Double score;
	private String email;
	private Long movieId;
	
	public ScoreDTO() {
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
}
