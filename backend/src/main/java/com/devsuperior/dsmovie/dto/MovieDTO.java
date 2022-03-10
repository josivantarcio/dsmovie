package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

	private String title;
	private Double score;
	private Long id;
	private Integer count;
	private String image;
	
	public MovieDTO() {
	}
	
	public MovieDTO(String title, Double score, Long id, Integer count, String image) {
		this.title = title;
		this.score = score;
		this.id = id;
		this.count = count;
		this.image = image;
	}

	public MovieDTO(Movie movie) {
		title = movie.getTitle();
		score = movie.getScore();
		id = movie.getId();
		count = movie.getCount();
		image = movie.getImage();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
