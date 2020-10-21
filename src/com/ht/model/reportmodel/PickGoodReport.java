package com.ht.model.reportmodel;


public class PickGoodReport {

	//订单编号
	private String orderId;
	
	//电子订单编号
	private String eOrderId;
	
	private String entRecordName;
	
	private String ordername;

	private String orderdocid;

	private String orderaddress;
	
	// 商品序号
	private String gNo;

	// 子订单编号
	private String childOrderNo;
	
	// 电商商户企业备案号
	private String storeRecordNo;
	
	// 电商商户企业名称
	private String storeRecordName;
	
	// 商品货号
	private String copGNo;
	
	//商品海关备案号
	private String customsListNO;
	
	// 商品单价
	private String decPrice;
	
	// 计量单位
	private String unit;
	
	// 商品数量
	private String gQty;
	
	// 商品总价
	private String declTotal;
	
	
	// 商品总价
	private String instKey;
	
	private String ewayno;
	
	
	public String getEwayno() {
		return ewayno;
	}

	public void setEwayno(String ewayno) {
		this.ewayno = ewayno;
	}

	public String getInstKey() {
		return instKey;
	}

	public void setInstKey(String instKey) {
		this.instKey = instKey;
	}

	// 备注
	private String notes;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String geteOrderId() {
		return eOrderId;
	}

	public void seteOrderId(String eOrderId) {
		this.eOrderId = eOrderId;
	}

	public String getEntRecordName() {
		return entRecordName;
	}

	public void setEntRecordName(String entRecordName) {
		this.entRecordName = entRecordName;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrderdocid() {
		return orderdocid;
	}

	public void setOrderdocid(String orderdocid) {
		this.orderdocid = orderdocid;
	}

	public String getOrderaddress() {
		return orderaddress;
	}

	public void setOrderaddress(String orderaddress) {
		this.orderaddress = orderaddress;
	}

	public String getgNo() {
		return gNo;
	}

	public void setgNo(String gNo) {
		this.gNo = gNo;
	}

	public String getChildOrderNo() {
		return childOrderNo;
	}

	public void setChildOrderNo(String childOrderNo) {
		this.childOrderNo = childOrderNo;
	}

	public String getStoreRecordNo() {
		return storeRecordNo;
	}

	public void setStoreRecordNo(String storeRecordNo) {
		this.storeRecordNo = storeRecordNo;
	}

	public String getStoreRecordName() {
		return storeRecordName;
	}

	public void setStoreRecordName(String storeRecordName) {
		this.storeRecordName = storeRecordName;
	}

	public String getCopGNo() {
		return copGNo;
	}

	public void setCopGNo(String copGNo) {
		this.copGNo = copGNo;
	}

	public String getCustomsListNO() {
		return customsListNO;
	}

	public void setCustomsListNO(String customsListNO) {
		this.customsListNO = customsListNO;
	}

	public String getDecPrice() {
		return decPrice;
	}

	public void setDecPrice(String decPrice) {
		this.decPrice = decPrice;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getgQty() {
		return gQty;
	}

	public void setgQty(String gQty) {
		this.gQty = gQty;
	}

	public String getDeclTotal() {
		return declTotal;
	}

	public void setDeclTotal(String declTotal) {
		this.declTotal = declTotal;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
