package com.yc.SellStore.bean;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodsid
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    private Integer goodsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodsname
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    private String goodsname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.status
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.pic
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.type
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodsid
     *
     * @return the value of goods.goodsid
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodsid
     *
     * @param goodsid the value for goods.goodsid
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodsname
     *
     * @return the value of goods.goodsname
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodsname
     *
     * @param goodsname the value for goods.goodsname
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.status
     *
     * @return the value of goods.status
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
 
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.pic
     *
     * @return the value of goods.pic
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.pic
     *
     * @param pic the value for goods.pic
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.type
     *
     * @return the value of goods.type
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.type
     *
     * @param type the value for goods.type
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "Goods [goodsid=" + goodsid + ", goodsname=" + goodsname + ", price=" + price + ", pic=" + pic + ", type=" + type + "]";
	}
    
}