package model;

import java.util.Date;

public class game {

	private Integer id;
	private String player_username;
	private Integer player_password;
	private Date play_createtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayer_username() {
		return player_username;
	}

	public void setPlayer_username(String player_username) {
		this.player_username = player_username;
	}

	public Integer getPlayer_password() {
		return player_password;
	}

	public void setPlayer_password(Integer player_password) {
		this.player_password = player_password;
	}

	public Date getPlay_createtime() {
		return play_createtime;
	}

	public void setPlay_createtime(Date play_createtime) {
		this.play_createtime = play_createtime;
	}



}
