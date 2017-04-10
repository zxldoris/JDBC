package com.hxlxz.zxl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hxlxz.zxl.DBUtil;
import com.hxlxz.zxl.model.ModelMapping;

public class ModelFunction {
	public void add(ModelMapping mm) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = "" + "insert into pene" + "(name,MAC)" + "values(" + "?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, mm.getName());
		ps.setString(2, mm.getMAC());
		ps.execute();
	}

	public void del(ModelMapping mm) throws SQLException {
		Connection conn = DBUtil.getConnection();
		String sql = "" + " delete from pene " + " where num=? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, mm.getNum());
		ps.execute();
	}

	public void update(ModelMapping mm) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = "" + " update pene " + " set name=?" + " where num=? ";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, mm.getName());
		ps.setInt(2, mm.getNum());
		ps.execute();
	}

	public List<ModelMapping> queryList() throws SQLException {
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select num,name from pene");
		List<ModelMapping> mm = new ArrayList<ModelMapping>();
		ModelMapping m = null;
		while (rs.next()) {
			m = new ModelMapping();
			m.setNum(rs.getInt("num"));
			m.setName(rs.getString("name"));
			mm.add(m);
		}
		return mm;

	}

	public ModelMapping query(Integer num) throws Exception {
		ModelMapping mm = null;
		Connection conn = DBUtil.getConnection();
		String sql = "" + " select * from pene " + " where num=? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, num);
		ResultSet rs = ps.executeQuery();	
		while(rs.next())
		{
			mm = new ModelMapping();
			mm.setNum(rs.getInt("num"));
			mm.setName(rs.getString("name"));
			mm.setMAC(rs.getString("MAC"));
		}
		
		return mm;

	}
	public List<ModelMapping> queryListName(String name) throws Exception {
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "" + " select * from pene " + " where name=? ";
		/*StringBuilder sb = new StringBuilder();
		sb.append("select * from pene  ");
		sb.append(" where name=?");*/
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		List<ModelMapping> mm = new ArrayList<ModelMapping>();
		ModelMapping m = null;
		while (rs.next()) {
			m = new ModelMapping();
			m.setNum(rs.getInt("num"));
			m.setName(rs.getString("name"));
			m.setMAC(rs.getString("MAC"));			
			mm.add(m);
		}
		return mm;

	}
}
