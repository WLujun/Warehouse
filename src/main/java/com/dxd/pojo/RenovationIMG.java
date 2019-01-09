package com.dxd.pojo;

/**
 * 精装修页面返回图片模板
 * @author lujun created at 2018年11月28日 11点55分18秒
 *
 */
public class RenovationIMG {

	private Integer position;
	private String spic;
	private String amusementId;

	public RenovationIMG() {
		super();
	}

	public RenovationIMG(Integer position, String spic, String amusementId) {
		super();
		this.position = position;
		this.spic = spic;
		this.amusementId = amusementId;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getSpic() {
		return spic;
	}

	public void setSpic(String spic) {
		this.spic = spic;
	}

	public String getAmusementId() {
		return amusementId;
	}

	public void setAmusementId(String amusementId) {
		this.amusementId = amusementId;
	}

	@Override
	public String toString() {
		return "RenovationIMG [position=" + position + ", spic=" + spic + ", amusementId=" + amusementId + "]";
	}







}
