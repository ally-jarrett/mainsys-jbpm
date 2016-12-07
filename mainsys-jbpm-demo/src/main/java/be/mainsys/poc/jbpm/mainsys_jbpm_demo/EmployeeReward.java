package be.mainsys.poc.jbpm.mainsys_jbpm_demo;

import java.io.Serializable;

public class EmployeeReward implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String recipient; 
	private String rewardReason;
	private Integer rewardAmount;
	private String rewardManagerComment;
	private boolean rewardManagerApproval; ;
	private boolean rewardHRApproval;
	
	public String getRewardReason() {
		return rewardReason;
	}
	public void setRewardReason(String rewardReason) {
		this.rewardReason = rewardReason;
	}
	public Integer getRewardAmount() {
		return rewardAmount;
	}
	public void setRewardAmount(Integer rewardAmount) {
		this.rewardAmount = rewardAmount;
	}
	public String getRewardManagerComment() {
		return rewardManagerComment;
	}
	public void setRewardManagerComment(String rewardManagerComment) {
		this.rewardManagerComment = rewardManagerComment;
	}
	public boolean isRewardManagerApproval() {
		return rewardManagerApproval;
	}
	public void setRewardManagerApproval(boolean rewardManagerApproval) {
		this.rewardManagerApproval = rewardManagerApproval;
	}
	public boolean isRewardHRApproval() {
		return rewardHRApproval;
	}
	public void setRewardHRApproval(boolean rewardHRApproval) {
		this.rewardHRApproval = rewardHRApproval;
	}
	
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public EmployeeReward(String recipient, String rewardReason, Integer rewardAmount, String rewardManagerComment,
			boolean rewardManagerApproval, boolean rewardHRApproval) {
		this.recipient = recipient; 
		this.rewardReason = rewardReason;
		this.rewardAmount = rewardAmount;
		this.rewardManagerComment = rewardManagerComment;
		this.rewardManagerApproval = rewardManagerApproval;
		this.rewardHRApproval = rewardHRApproval;
	}

	@Override
	public String toString() {
		return "EmployeeReward [rewardReason=" + rewardReason + ", rewardAmount=" + rewardAmount
				+ ", rewardManagerComment=" + rewardManagerComment + ", rewardManagerApproval=" + rewardManagerApproval
				+ ", rewardHRApproval=" + rewardHRApproval + "]";
	}
}
