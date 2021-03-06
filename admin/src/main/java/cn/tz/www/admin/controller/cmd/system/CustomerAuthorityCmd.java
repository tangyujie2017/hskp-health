package cn.tz.www.admin.controller.cmd.system;

import cn.tz.www.admin.controller.service.detail.system.CustomerAuthorityDetails;

public class CustomerAuthorityCmd {

	
	private Long id;
	
	private String name;
	
	private String code;
	
	private String details;
	
	private Long parentId;
	
	private String parentName;
	
	private Integer sort;
	
	public CustomerAuthorityDetails toDetails(){
		return new CustomerAuthorityDetails(id,name,code,details,parentId,parentName,sort,null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}



}
