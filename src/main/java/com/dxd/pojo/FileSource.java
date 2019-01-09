package com.dxd.pojo;

import java.util.Date;
/**
 * 上传文件实体
 * @author lujun created at 2018年11月01日 17点13分20秒
 *
 */
public class FileSource {

	private Integer id;
	private String pid;
	private Integer sign;//标志
	private String filetype;//文件类型
	private String fileurl;//文件路径
	private String sku;
	private Integer isdelete;//0- 存在 1-删除
	private Date createtime;//上传时间

	public FileSource() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Integer getSign() {
		return sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "FileSource [id=" + id + ", pid=" + pid + ", sign=" + sign + ", filetype=" + filetype + ", fileurl="
				+ fileurl + ", sku=" + sku + ", isdelete=" + isdelete + ", createtime=" + createtime + "]";
	}





}
