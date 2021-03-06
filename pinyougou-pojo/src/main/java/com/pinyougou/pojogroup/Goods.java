package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author congzi
 * @Description: 商品组合实体类 (多表操作时使用)
 * @create 2018-05-13
 * @Version 1.0
 */
public class Goods implements Serializable{

    /**
     * SPU 标准产品单位(iphone7 就是一个 SPU，与商家，与颜色、款式、套餐都无关。)
     * tb_Goods表对应实体 - 代表某一类的商品(例如:iPhone)
     */
    private TbGoods goods;

    /**
     * tb_goods_desc表对应实体 - 与tb_goods表为一对一的关系,保存数据量比较大的字段
     * 例如:包装列表  方便查询优化
     */
    private TbGoodsDesc goodsDesc;

    /**
     * SKU 商品列表 (例如：纺织品中一个 SKU 通常表示：规格、颜色、款式)
     */
    private List<TbItem> itemList;


    /**
     * 添加扩展属性,用户页面静态化时 保存分类的名称
     */
    private Map map;

    private List skuList;


    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getSkuList() {
        return skuList;
    }

    public void setSkuList(List skuList) {
        this.skuList = skuList;
    }

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public List<TbItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbItem> itemList) {
        this.itemList = itemList;
    }
}
