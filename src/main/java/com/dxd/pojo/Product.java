package com.dxd.pojo;

public class Product {

	private Integer id;
	private String sku;
	private String duckweedTitle;//美萍标题
	private String barcode;//条形码
	private Integer totalInventory;//全部仓净库存
	private Integer cdTotalInventory;//成都仓净库存
	private Integer cdAllInventory;//成都仓总库存
	private String dielectric;//所属介质
	private String spacking;//包装材质
	private String dialogue;//对白
	private String subtitle;//字幕
	private String kiwi;//2D or 3D
	private String videocoding;//视频编码
	private String vocaltract;//声道
	private String movietype;//电影类型
	private String director;//导演
	private String actor;//演员
	private String senclosure;// 进出口
	private Long donsale; //上市日期
	private String updateTime;//更新时间
	private String state;//状态

	public Product() {
		super();
	}

	public Product(Integer id, String sku, String duckweedTitle, String barcode, Integer totalInventory,
			Integer cdTotalInventory, Integer cdAllInventory, String dielectric, String spacking, String dialogue,
			String subtitle, String kiwi, String videocoding, String vocaltract, String movietype, String director,
			String actor, String senclosure, Long donsale, String updateTime) {
		super();
		this.id = id;
		this.sku = sku;
		this.duckweedTitle = duckweedTitle;
		this.barcode = barcode;
		this.totalInventory = totalInventory;
		this.cdTotalInventory = cdTotalInventory;
		this.cdAllInventory = cdAllInventory;
		this.dielectric = dielectric;
		this.spacking = spacking;
		this.dialogue = dialogue;
		this.subtitle = subtitle;
		this.kiwi = kiwi;
		this.videocoding = videocoding;
		this.vocaltract = vocaltract;
		this.movietype = movietype;
		this.director = director;
		this.actor = actor;
		this.senclosure = senclosure;
		this.donsale = donsale;
		this.updateTime = updateTime;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDuckweedTitle() {
		return duckweedTitle;
	}

	public void setDuckweedTitle(String duckweedTitle) {
		this.duckweedTitle = duckweedTitle;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public void setTotalInventory(Integer totalInventory) {
		this.totalInventory = totalInventory;
	}


	public void setCdTotalInventory(Integer cdTotalInventory) {
		this.cdTotalInventory = cdTotalInventory;
	}

	public void setCdAllInventory(Integer cdAllInventory) {
		this.cdAllInventory = cdAllInventory;
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

	public String getVocaltract() {
		return vocaltract;
	}

	public void setVocaltract(String vocaltract) {
		this.vocaltract = vocaltract;
	}

	public String getMovietype() {
		return movietype;
	}

	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getSenclosure() {
		return senclosure;
	}

	public void setSenclosure(String senclosure) {
		this.senclosure = senclosure;
	}

	public void setDonsale(Long donsale) {
		this.donsale = donsale;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getState() {
		if (donsale != null && cdAllInventory > 0) {
			this.state = "<font color='red'>现货</font>";
		} else {
			this.state = "非现货";
		}
		return state;
	}
















}
