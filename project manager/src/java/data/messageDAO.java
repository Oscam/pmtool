/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.message;
import database.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mugusca
 */
public class messageDAO {

    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;

public static int insertmeso(message bean){
    String query= "INSERT INTO chats (`messageId`,`pid`,`meso`,`staffId`)" +
            "VALUES(?,?,?,?)";
      // int pid = ;
    try{
        con=connect.getConnection();
        ps=con.prepareStatement(query);
        ps.setInt(1, bean.getMessageId());
        ps.setInt(2, bean.getPid());// pid is a projects id
        ps.setString(3,bean.getMeso());
        ps.setString(4,bean.getStaffId());
        int ins = ps.executeUpdate();
        return ins;
    }
    
    catch(SQLException e){
        e.getMessage();
        return 0;
    }
        
}

public static List<message> getChats(int pid){
    List<message> chat = new ArrayList<>();
    String query = "select * from chats,employees where chats.staffId=employees.staffId && pid=?";
    try{
        con = connect.getConnection();
        ps = con.prepareStatement(query);
        ps.setInt(1, pid);
        rs=ps.executeQuery();
        while(rs.next()){
            message bean = new message();
            bean.setMeso(rs.getString("meso"));
            bean.setMessageId(rs.getInt("messageId"));
            bean.setPid(rs.getInt("pid"));
            bean.setMessageTime(rs.getTimestamp("messageTime"));
            bean.setFname(rs.getString("fname"));
            bean.setStaffId(rs.getString("staffId"));
            
            chat.add(bean);
        }
        return chat;
    }
    catch(SQLException e){
        e.getMessage();
        return null;
    }
}




}
