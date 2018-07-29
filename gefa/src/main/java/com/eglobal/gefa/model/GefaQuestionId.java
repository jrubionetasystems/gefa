package com.eglobal.gefa.model;
// Generated 25/07/2018 08:37:44 PM by Hibernate Tools 5.0.6.Final

/**
 * GefaQuestionId generated by hbm2java
 */
public class GefaQuestionId implements java.io.Serializable {

	private String workOrderId;
	private int questionId;

	public GefaQuestionId() {
	}

	public GefaQuestionId(String workOrderId, int questionId) {
		this.workOrderId = workOrderId;
		this.questionId = questionId;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GefaQuestionId))
			return false;
		GefaQuestionId castOther = (GefaQuestionId) other;

		return ((this.getWorkOrderId() == castOther.getWorkOrderId()) || (this.getWorkOrderId() != null
				&& castOther.getWorkOrderId() != null && this.getWorkOrderId().equals(castOther.getWorkOrderId())))
				&& (this.getQuestionId() == castOther.getQuestionId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWorkOrderId() == null ? 0 : this.getWorkOrderId().hashCode());
		result = 37 * result + this.getQuestionId();
		return result;
	}

}