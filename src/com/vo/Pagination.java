package com.vo;

public class Pagination {

	/** �� �������� �Խñ� �� **/
	private int pageSize = 12;

	/** �� ��(range)�� ������ �� **/
	private int rangeSize = 5;

	/** ���� ������ **/
	private int curPage = 1;

	/** ���� ��(range) **/
	private int curRange = 1;

	/** �� �Խñ� �� **/
	private int listCnt;

	/** �� ������ �� **/
	private int pageCnt;

	/** �� ��(range) �� **/
	private int rangeCnt;

	/** ���� ������ **/
	private int startPage = 1;

	/** �� ������ **/
	private int endPage = 1;

	/** ���� index **/
	private int startIndex = 0;

	/** ���� ������ **/
	private int prevPage;

	/** ���� ������ **/
	private int nextPage;
	/** ��ŸƮ�ε��� + pageSize **/
	private int endIndex;
	
	private int nextsection = rangeSize;

	private boolean endcheck;



	Pagination() {

	}

	

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRangeSize() {
		return rangeSize;
	}

	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getCurRange() {
		return curRange;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public int getRangeCnt() {
		return rangeCnt;
	}

	public int getStartIndex() {
		return startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}

	  public Pagination(int listCnt, int curPage){
	        
	        /**
	         * ����¡ ó�� ����
	         * 1. �� ��������
	         * 2. �� ��(range)��
	         * 3. range setting
	         */
	        
	        // �� �Խù� ���� ���� �������� Controller�� ���� �޾ƿ´�.
	        /** ���������� **/
	        setCurPage(curPage);
	        /** �� �Խù� �� **/
	        setListCnt(listCnt);
	        
	        /** 1. �� ������ �� **/
	        setPageCnt(listCnt);
	        /** 2. �� ��(range)�� **/
	        setRangeCnt(pageCnt);
	        /** 3. ��(range) setting **/
	        rangeSetting(curPage);
	        
	        /** DB ���Ǹ� ���� startIndex ���� **/
	        setStartIndex(curPage);
	        setEndIndex(curPage);
	        setEndcheck(curPage);
	        
	       
	    }
	 
	    public void setPageCnt(int listCnt) {
	        this.pageCnt = (int) Math.ceil(listCnt*1.0/pageSize);
	    }
	    public void setRangeCnt(int pageCnt) {
	        this.rangeCnt = (int) Math.ceil(pageCnt*1.0/rangeSize);
	    }
	    public void rangeSetting(int curPage){
	        
	        setCurRange(curPage);        
	        this.startPage = (curRange - 1) * rangeSize + 1;
	        this.endPage = curRange * rangeSize ;
//	        
	        
	        if(endPage > pageCnt){
	            this.endPage = pageCnt;
	        }
	        
	        this.prevPage = curPage - 1;
	        this.nextPage = curPage + 1;
	    }
	    public void setCurRange(int curPage) {
	        this.curRange = (int)((curPage-1)/rangeSize) + 1;
	    }
	    public void setStartIndex(int curPage) {
	    		this.startIndex = (curPage-1) * pageSize;
	    }
	    public void setEndIndex(int curPage) {
	    	if(curPage==this.pageCnt)
	    		this.endIndex = this.listCnt;
	    	else
	    		this.endIndex = (curPage) * pageSize;
	        
	    }



		public int getNextsection() {
			return nextsection;
		}



		public void setNextsection(int nextsection) {
			this.nextsection = nextsection;
		}



		public boolean isEndcheck() {
			return endcheck;
		}



		public void setEndcheck(int curPage) {
			this.endcheck = curPage < this.pageCnt;
		}



		@Override
		public String toString() {
			return "Pagination [pageSize=" + pageSize + ", rangeSize=" + rangeSize + ", curPage=" + curPage
					+ ", curRange=" + curRange + ", listCnt=" + listCnt + ", pageCnt=" + pageCnt + ", rangeCnt="
					+ rangeCnt + ", startPage=" + startPage + ", endPage=" + endPage + ", startIndex=" + startIndex
					+ ", prevPage=" + prevPage + ", nextPage=" + nextPage + ", endIndex=" + endIndex + ", nextsection="
					+ nextsection + ", endcheck=" + endcheck + "]";
		}
	    
		
		

}