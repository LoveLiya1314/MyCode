package com.xmu.mall.goodsindex.zjh.service;

import java.util.List;

import com.xmu.mall.goodsindex.zjh.model.AjaxReturnResult;
import com.xmu.mall.goodsindex.zjh.model.ShoppingCart;

public interface IShoppingCartService
{	
	/**
	 * 通过用户id查找购物车列表
	 * @param userId
	 * @return
	 */
	List<ShoppingCart> getShoppingCartListByUserId(Long userId);

	/**
	 * 通过商品id和用户id查找购物车
	 * 用于确定某商品是否被加入购物车
	 * @param goodsId
	 * @param userId
	 * @return
	 */
	ShoppingCart selectCartByGoodsIdAndUserId(Long goodsId,Long userId);
	
	/**
	 * 添加购物车
	 * @param shopppingCart
	 * @return
	 */
	AjaxReturnResult add(ShoppingCart shopppingCart);
	
	/**
	 * 更新购物车
	 * @param shoppingCarts
	 * @return
	 */
	AjaxReturnResult update(List<ShoppingCart> shoppingCarts);
	
	/**
	 * 删除购物车
	 * @param shoppingCarts
	 * @return
	 */
	AjaxReturnResult delete(List<ShoppingCart> shoppingCarts);
	
	int deleteByUserIdAndGoodsId(long user_id, long goods_id);
}
