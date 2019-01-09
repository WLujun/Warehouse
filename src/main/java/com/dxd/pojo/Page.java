package com.dxd.pojo;
/**
 * 分页
 * @author lujun created at 2018年11月17日 15点12分15秒
 *
 */
public class Page {

	private final int PAGE_SIZE = 10;//分页大小
	private int totalSize;//总条数
	private int currPage;//当前页数
	private int totalPage;//总页数

	public int getPAGE_SIZE() {
		return PAGE_SIZE;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
		if(totalSize > 0) {
			this.totalPage = (int) Math.ceil((totalSize/PAGE_SIZE)*1.00);
		}
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public Page(int totalSize, int currPage) {
		super();
		this.totalSize = totalSize;
		this.currPage = currPage;
	}

	public Page() {
		super();
	}

	@Override
	public String toString() {
		return "Page [PAGE_SIZE=" + PAGE_SIZE + ", totalSize=" + totalSize + ", currPage=" + currPage + ", totalPage="
				+ totalPage + "]";
	}





}
