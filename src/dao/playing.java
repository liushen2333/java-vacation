
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.game;
import java.util.*;
import JavaVacationProjecte3.db.DBUtil;
import model.record;
import model.game;
public class playing {

	public void addplayer(game g) throws Exception {
		
		Connection conn=DBUtil.getConnection();
		String sql="" +
		" insert into 2333_user"+
		" (player_username,player_password,player_createtime)"	+
		" values(" +
		" ?,?,current_date())";
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ptmt.setString(1,g.getPlayer_username());
		ptmt.setInt(2,g.getPlayer_password());

		
		ptmt.execute();
		
	}
	
	public void updatemessage(game g) throws SQLException  {
		
		Connection conn=DBUtil.getConnection();
		String sql="" +
		" update 2333_user"+
		" (player_username=?,player_password=?,player_createtime=curren_date())"	+
		" where id=?";
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ptmt.setString(1,g.getPlayer_username());
		ptmt.setInt(2,g.getPlayer_password());
		ptmt.setInt(3,g.getId());
		
		
		ptmt.execute();
	}
	
	public void delmessage(Integer id) throws SQLException  {
		
		Connection conn=DBUtil.getConnection();
		String sql="" +
		" delete from 2333_user"+
		" where id=?";
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ptmt.setInt(1,id);

		
		ptmt.execute();
		
	}
	
	public List<record> query(String game_begintime,String game_exittime ) throws Exception{
		Connection conn=DBUtil.getConnection();
		
		StringBuilder sb=new StringBuilder();
		sb.append("select * from 2333_record");
		sb.append("where game_begintime=? and game_exittime=?");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setString(1, game_begintime);
		ptmt.setString(2, game_exittime);
		System.out.println(sb.toString());
		ResultSet rs=ptmt.executeQuery();
		
		List<record> re=new ArrayList<record>();
		
		record r = null;
		
		while(rs.next()) {
			r = new record();
			r.setGame_id(rs.getInt("game_id"));
			r.setGame_user1name(rs.getString("game_user1name"));
			r.setGame_user2name(rs.getString("game_user2name"));
			r.setGame_user1cards(rs.getInt("game_user1cards"));
			r.setGame_user2cards(rs.getInt("game_user2cards"));
			r.setGame_winnername(rs.getString("game_winnername"));
			r.setGame_begintime(rs.getDate("game_begintime"));
			r.setGame_exittime(rs.getDate("game_exittime"));
			
			re.add(r);
		}
		return re;
	}
	
	
	public record get(Integer game_id) throws SQLException {
		record r= null;
		Connection conn=DBUtil.getConnection();
		String sql="" +
		" selete * from 2333_record"+
		" where id=?";
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ptmt.setInt(1,game_id);
		ResultSet rs= ptmt.executeQuery();
		while(rs.next()) {
			r= new record();
			r.setGame_id(rs.getInt("game_id"));
			r.setGame_user1name(rs.getString("game_user1name"));
			r.setGame_user2name(rs.getString("game_user2name"));
			r.setGame_user1cards(rs.getInt("game_user1cards"));
			r.setGame_user2cards(rs.getInt("game_user2cards"));
			r.setGame_winnername(rs.getString("game_winnername"));
			r.setGame_begintime(rs.getDate("game_begintime"));
			r.setGame_exittime(rs.getDate("game_exittime"));
		}
		return r;
		
	}
	
	public game get(String player_username) throws SQLException {
		game g= null;
		Connection conn=DBUtil.getConnection();
		String sql="" +
		" selete * from 2333_user"+
		" where id=?";
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ptmt.setString(1,player_username);
		ResultSet rs= ptmt.executeQuery();
		while(rs.next()) {
			g= new game();
			g.setId(rs.getInt("id"));
			g.setPlayer_username(rs.getString("player_username"));
			g.setPlayer_password(rs.getInt("player_password"));
			g.setPlay_createtime(rs.getDate("play_createtime"));
		}
		return g;
		
	}
	
}
