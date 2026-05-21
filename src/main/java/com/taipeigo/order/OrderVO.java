package com.taipeigo.order;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OrderVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_DETAIL_ID", updatable = false)
	private Integer orderDetailId;

	@Column(name = "ORDER_ID")
	private Integer orderDetail;

	@Column(name = "PRODUCT_ID")
	private Integer productId;

	@Column(name = "PRODUCT_QUANTITY")
	private Integer productQuantity;

	@Column(name = "ORDER_DETAIL_SUBTOTAL")
	private Integer orderDetailSubtotal;

	@Column(name = "ORDER_DETAIL_REMARK")
	private String orderDetailRemark;

//	public OrderDetail() {
//		super();
//	}
//
//	public OrderDetail(Integer orderDetailId, Integer orderDetail, Integer productId, Integer productQuantity,
//			Integer orderDetailSubtotal, String orderDetailRemark) {
//		super();
//		this.orderDetailId = orderDetailId;
//		this.orderDetail = orderDetail;
//		this.productId = productId;
//		this.productQuantity = productQuantity;
//		this.orderDetailSubtotal = orderDetailSubtotal;
//		this.orderDetailRemark = orderDetailRemark;
//	}

	public Integer getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Integer getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Integer orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Integer getOrderDetailSubtotal() {
		return orderDetailSubtotal;
	}

	public void setOrderDetailSubtotal(Integer orderDetailSubtotal) {
		this.orderDetailSubtotal = orderDetailSubtotal;
	}

	public String getOrderDetailRemark() {
		return orderDetailRemark;
	}

	public void setOrderDetailRemark(String orderDetailRemark) {
		this.orderDetailRemark = orderDetailRemark;
	}

}
