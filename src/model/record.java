package model;

import java.util.Date;

public class record {

	private Integer game_id;
	private Date game_begintime;
	private Date game_exittime;
	private String game_user1name;
	private String game_user2name;
	private String game_winnername;
	private Integer game_user1cards;
	private Integer game_user2cards;

	public Integer getGame_id() {
		return game_id;
	}

	public void setGame_id(Integer game_id) {
		this.game_id = game_id;
	}

	public Date getGame_begintime() {
		return game_begintime;
	}

	public void setGame_begintime(Date game_begintime) {
		this.game_begintime = game_begintime;
	}

	public Date getGame_exittime() {
		return game_exittime;
	}

	public void setGame_exittime(Date game_exittime) {
		this.game_exittime = game_exittime;
	}

	public String getGame_user1name() {
		return game_user1name;
	}

	public void setGame_user1name(String game_user1name) {
		this.game_user1name = game_user1name;
	}

	public String getGame_user2name() {
		return game_user2name;
	}

	public void setGame_user2name(String game_user2name) {
		this.game_user2name = game_user2name;
	}

	public String getGame_winnername() {
		return game_winnername;
	}

	public void setGame_winnername(String game_winnername) {
		this.game_winnername = game_winnername;
	}

	public Integer getGame_user1cards() {
		return game_user1cards;
	}

	public void setGame_user1cards(Integer game_user1cards) {
		this.game_user1cards = game_user1cards;
	}

	public Integer getGame_user2cards() {
		return game_user2cards;
	}

	public void setGame_user2cards(Integer game_user2cards) {
		this.game_user2cards = game_user2cards;
	}

}
