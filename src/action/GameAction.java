package action;

import java.util.List;
import java.util.Map;

import dao.playing;
import model.game;
import model.record;

public class GameAction {

	public void add(game game) throws Exception{
		playing user = new playing();
		user.addplayer(game);
	}
	
	public void edit(game game) throws Exception{
		playing user = new playing();
		user.updatemessage(game);
	}
	
	public void del(Integer id) throws Exception{
		playing user = new playing();
		user.delmessage(id);
		
	}

	public List<record> query(String game_begintime,String game_exittime) throws Exception{
		playing record = new playing();
		return record.query(game_begintime, game_exittime);
		
	}
	
}
