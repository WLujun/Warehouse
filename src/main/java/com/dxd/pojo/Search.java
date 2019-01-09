package com.dxd.pojo;

/**
 * 条件搜索模型
 * @author lujun created at 2018年11月20日 17点06分38秒
 *
 */
public class Search {

	private String sku;
	private String state;//状态
	private String type; //版本
	private String dielectric; //介质
	private String spacking; //包装
	private String subtitle; //字幕
	private String dialogue; //对白
	private String audio;//声道
	private String kiwi;//2D/3D
	private String videocoding;//视频编码
	private String keyword;//关键字

	public Search(String sku, String state, String type, String dielectric, String spacking, String subtitle,
			String dialogue, String audio, String kiwi, String videocoding, String keyword) {
		super();
		this.sku = sku;
		this.state = state;
		this.type = type;
		this.dielectric = dielectric;
		this.spacking = spacking;
		this.subtitle = subtitle;
		this.dialogue = dialogue;
		this.audio = audio;
		this.kiwi = kiwi;
		this.videocoding = videocoding;
		this.keyword = keyword;
	}

	public Search() {
		super();
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDielectric() {
		return dielectric;
	}

	public void setDielectric(String dielectric) {
		this.dielectric = dielectric;
	}

	public String getSpacking() {
		return spacking;
	}

	public void setSpacking(String spacking) {
		this.spacking = spacking;
	}

	public String getDialogue() {
		return dialogue;
	}

	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getKiwi() {
		return kiwi;
	}

	public void setKiwi(String kiwi) {
		this.kiwi = kiwi;
	}

	public String getVideocoding() {
		return videocoding;
	}

	public void setVideocoding(String videocoding) {
		this.videocoding = videocoding;
	}

	@Override
	public String toString() {
		return "SearchVO [state=" + state + ", type=" + type + ", dielectric=" + dielectric + ", spacking=" + spacking
				+ ", subtitle=" + subtitle + ", dialogue=" + dialogue + ", audio=" + audio + ", kiwi=" + kiwi
				+ ", videocoding=" + videocoding + ", keyword=" + keyword + "]";
	}





}
