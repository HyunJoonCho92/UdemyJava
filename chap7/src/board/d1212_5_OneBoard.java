package board;

class d1212_5_OneBoard  { //게시물 1개 정보 저장 객체
	private int seq;
	private String title;
	private String contents;
	private String writer;
	private int viewcount;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public int getSeq() {
		return this.seq;
	}
}