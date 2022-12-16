package BankingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

import DBC.Connections;

public class BankingSysImp implements BankingSys {
	
	boolean flag=false;
	int count=0;
	int act=0;
	
    public int getAct() {
		return act;
	}

	public void setAct(int act) {
		this.act = act;
	}

    public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean getFlag() {
		return flag;
	}
	
	public  void checkAct(String em,int ps) {
		count++;
		
		Connection con=Connections.getConnection();
		try {
			PreparedStatement act=con.prepareStatement("select * from Accountant");
			ResultSet rs= act.executeQuery();
			
			while(rs.next()) {
				
			String email=	rs.getString("email");
			
		int password=	rs.getInt("pass");
		
		
		if(em.equalsIgnoreCase(email)&& password==ps) {
			flag= true;
			System.out.println("login sucessful from accountant id ");
			
		}
		else System.out.println("invalid crediantials!!");
	}
		}
		catch(SQLException ex) {
			ex.getMessage();
	}
	
		
	}

	@Override
	public void insertCus(int cusId,String name, String cusEmail, int pass, int bal) {
		//System.out.println(count);
	 if(flag) {
		 Connection con=Connections.getConnection();
		 try {
			PreparedStatement act=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			act.setString(1, name);
			act.setString(2, cusEmail);
			act.setInt(3, pass);
			act.setInt(4, bal);
			act.setInt(5, cusId);
			
			int x=act.executeUpdate();
			System.out.println(x+"record added successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 else System.out.println("kindly login first!!!!");
	 
		
	}

	@Override
	public void deleteRecord(int actNo) {
	
	Connection con=	Connections.getConnection();
	
	
	
 try {
	PreparedStatement ps= con.prepareStatement("delete from customer where actNo=?");
	ps.setInt(1, actNo);
	int x=ps.executeUpdate();
	System.out.println(x+" record deleted sucessfully");
} catch (SQLException e) {
	System.out.println("Record not found");
}
	
	
		
	}

	@Override
	public void displayPerticular(int actNo) {
		Connection con=	Connections.getConnection();
		try {
			PreparedStatement ps= con.prepareStatement("select * from customer where actNo=?");
			ps.setInt(1, actNo);
		ResultSet rs=	ps.executeQuery();
		display(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void display(ResultSet rs) {
		if(rs==null)System.out.println("No record found");
		try {
			while(rs.next()) {
				System.out.println("customer account number- "+rs.getInt("actNo"));
				System.out.println("customer name- "+rs.getString("name"));
				System.out.println("customer email- "+rs.getString("email"));
				System.out.println("customer password- "+rs.getInt("pass"));
				System.out.println("customer balance - "+rs.getString("bal"));
				System.out.print("==========================================");
			}   
			    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
		Connection con=	Connections.getConnection();
		try {
			PreparedStatement ps= con.prepareStatement("select * from customer ");
			//ps.setInt(1, actNo);
		ResultSet rs=	ps.executeQuery();
		display(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
