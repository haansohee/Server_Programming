package com.inhatc.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

  private int totalCount; //전체 데이터 수
  private int startPage; //현재 페이지범위에서 시작페이지
  private int endPage;  //현재 페이지범위에서 마지막페이지
  private boolean prev;  //이전페이지
  private boolean next;  //다음페이지

  private int displayPageNum = 10;  //현재 페이지범위에서 출력할 페이지의 수

  private Criteria cri;

  public void setCri(Criteria cri) {
    this.cri = cri;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;

    calcData();
  }

  private void calcData() {

    endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);

    startPage = (endPage - displayPageNum) + 1;

    int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));

    if (endPage > tempEndPage) {
      endPage = tempEndPage;
    }

    prev = startPage == 1 ? false : true; //다항연산자 
  
    

    next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
    
  }

  public int getTotalCount() {
    return totalCount;
  }

  public int getStartPage() {
    return startPage;
  }

  public int getEndPage() {
    return endPage;
  }

  public boolean isPrev() {
    return prev;
  }

  public boolean isNext() {
    return next;
  }

  public int getDisplayPageNum() {
    return displayPageNum;
  }

  public Criteria getCri() {
    return cri;
  }

  public String makeQuery(int page) {

    UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam("page", page)
        .queryParam("perPageNum", cri.getPerPageNum()).build();

    return uriComponents.toUriString();
  }
  

}
