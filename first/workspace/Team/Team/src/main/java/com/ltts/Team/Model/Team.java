package com.ltts.Team.Model;

public class Team{
		
		private int teamNo;
		private String teamName;
		private String ownerName;
		public Team() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Team(int teamNo, String teamName, String ownerName) {
			super();
			this.teamNo = teamNo;
			this.teamName = teamName;
			this.ownerName = ownerName;
		}
		public int getTeamNo() {
			return teamNo;
		}
		public void setTeamNo(int teamNo) {
			this.teamNo = teamNo;
		}
		public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		
		
	}
	

/*public class Player {
	private int playerNo;
	private String playerName;
	private String ownerName;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(int playerNo, String playerName, String ownerName) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.ownerName = ownerName;
	}


	public int getPlayerNo() {
		return playerNo;
	}


	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", ownerName=" + ownerName + "]";
	}
	


}
	
	
	
	
	/*public Player() {
		super();
	}
	public Player(int teamNo, String teamName, String ownerName) {
		super();
		this.teamNo = teamNo;
		this.teamName = teamName;
		this.ownerName = ownerName;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Team teamNo=" + teamNo + ", teamName=" + teamName + ", ownerName=" + ownerName;
	}
	

	

}*/