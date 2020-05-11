package com.numberone.project.system.product.mapper;

import java.util.List;
import com.numberone.project.system.product.domain.Product;

/**
 * 产品Mapper接口
 *
 * @author numberone
 * @date 2020-05-08
 */
public interface ProductMapper
{
    /**
     * 查询产品
     *
     * @param productId 产品ID
     * @return 产品
     */
    public Product selectProductById(Long productId);

    /**
     * 查询产品列表
     *
     * @param product 产品
     * @return 产品集合
     */
    public List<Product> selectProductList(Product product);

    /**
     * 新增产品
     *
     * @param product 产品
     * @return 结果
     */
    public int insertProduct(Product product);

    /**
     * 修改产品
     *
     * @param product 产品
     * @return 结果
     */
    public int updateProduct(Product product);

    /**
     * 删除产品
     *
     * @param productId 产品ID
     * @return 结果
     */
    public int deleteProductById(Long productId);

    /**
     * 批量删除产品
     *
     * @param productIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteProductByIds(String[] productIds);
}