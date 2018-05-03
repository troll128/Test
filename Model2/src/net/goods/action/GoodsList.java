package net.goods.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodsList implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("GoodsList execute()");
		// GoodsDAO 객체생성
		//List goodsList= getGoodsList()호출
		// request "goodsList" 저장
		// 이동 ./goods/goods_list.jsp
		return null;
	}
}
