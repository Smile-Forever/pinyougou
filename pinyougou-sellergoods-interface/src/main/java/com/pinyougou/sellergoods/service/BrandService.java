package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;


/**
 * 品牌接口
 * @author Smile
 *
 */
public interface BrandService {

	 List<TbBrand> findAll();

	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	 PageResult findPage(int pageNum, int pageSize);

	/**
	 * 添加品牌
	 * @param tbBrand
	 */
	 void add(TbBrand tbBrand);

	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	 TbBrand findOne(Long id);

	/**
	 * 修改
	 * @param tbBrand
	 */
	 void update(TbBrand tbBrand);

	/**
	 * 删除
	 * @param ids
	 */
	 void delete(Long[] ids);

	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	PageResult findPage(TbBrand tbBrand ,int pageNum, int pageSize);

	/**
	 * 返回下拉列表数据
	 * @return
	 */
	List<Map> selectOptionList();
}