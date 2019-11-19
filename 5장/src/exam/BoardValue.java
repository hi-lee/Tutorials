package exam;

import java.util.Date;

public class BoardValue {
	private int board_num;
	private String board_subj, board_writer, board_pw, board_cont;
	private Date board_date;
	
	public BoardValue(int board_num, String board_subj, String board_writer, String board_pw, String board_cont,
			Date board_date) {
		
		this.board_num = board_num;	//this.->클래스의 멤버변수
		this.board_subj = board_subj;
		this.board_writer = board_writer;
		this.board_pw = board_pw;
		this.board_cont = board_cont;
		this.board_date = board_date;
	}

	public BoardValue() {
		// TODO Auto-generated constructor stub
	}



	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getBoard_subj() {
		return board_subj;
	}

	public void setBoard_subj(String board_subj) {
		this.board_subj = board_subj;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public String getBoard_pw() {
		return board_pw;
	}

	public void setBoard_pw(String board_pw) {
		this.board_pw = board_pw;
	}

	public String getBoard_cont() {
		return board_cont;
	}

	public void setBoard_cont(String board_cont) {
		this.board_cont = board_cont;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	
}
