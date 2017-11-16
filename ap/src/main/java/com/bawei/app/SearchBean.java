package com.bawei.app;

import java.io.Serializable;
import java.util.List;


public class SearchBean implements Serializable {
    /**
     * msg : 查询成功
     * code : 0
     * data : [{"bargainPrice":11800,"createtime":"2017-10-10T17:33:37","detailUrl":"https://item.m.jd.com/product/4338107.html?utm#_source=androidapp&utm#_medium=appshare&utm#_campaign=t#_335139774&utm#_term=QQfriends","images":"https://m.360buyimg.com/n0/jfs/t6700/155/2098998076/156185/6cf95035/595dd5a5Nc3a7dab5.jpg!q70.jpg","itemtype":0,"pid":57,"price":5199,"pscid":40,"salenum":4343,"sellerid":1,"subhead":"【i5 MX150 2G显存】全高清窄边框 8G内存 256固态硬盘 支持指纹识别 预装WIN10系统","title":"小米(MI)Air 13.3英寸全金属轻薄笔记本(i5-7200U 8G 256G PCle SSD MX150 2G独显 FHD 指纹识别 Win10）银\r\n"},{"bargainPrice":11800,"createtime":"2017-10-14T21:38:26","detailUrl":"https://item.m.jd.com/product/5025518.html?utm#_source=androidapp&utm#_medium=appshare&utm#_campaign=t#_335139774&utm#_term=QQfriends","images":"https://m.360buyimg.com/n0/jfs/t8830/106/1760940277/195595/5cf9412f/59bf2ef5N5ab7dc16.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5428/70/1520969931/274676/b644dd0d/591128e7Nd2f70da0.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5566/365/1519564203/36911/620c750c/591128eaN54ac3363.jpg!q70.jpg","itemtype":1,"pid":58,"price":6399,"pscid":40,"salenum":545,"sellerid":2,"subhead":"升级4G大显存！Nvme协议Pcie SSD,速度快人一步】GTX1050Ti就选拯救者！专业游戏键盘&新模具全新设计！","title":"联想(Lenovo)拯救者R720 15.6英寸游戏笔记本电脑(i5-7300HQ 8G 1T+128G SSD GTX1050Ti 4G IPS 黑)"},{"bargainPrice":5599,"createtime":"2017-10-10T17:30:32","detailUrl":"https://item.m.jd.com/product/4824715.html?utm#_source=androidapp&utm#_medium=appshare&utm#_campaign=t#_335139774&utm#_term=QQfriends","images":"https://m.360buyimg.com/n12/jfs/t7768/184/1153704394/148460/f42e1432/599a930fN8a85626b.jpg!q70.jpg","itemtype":0,"pid":59,"price":5599,"pscid":40,"salenum":675,"sellerid":3,"subhead":"游戏本选择4G独显，拒绝掉帧】升级版IPS全高清防眩光显示屏，WASD方向键颜色加持，三大出风口立体散热！","title":"戴尔DELL灵越游匣15PR-6648B GTX1050 15.6英寸游戏笔记本电脑(i5-7300HQ 8G 128GSSD+1T 4G独显 IPS)黑"},{"bargainPrice":11800,"createtime":"2017-10-14T21:48:08","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":2,"pid":60,"price":13888,"pscid":40,"salenum":466,"sellerid":4,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"},{"bargainPrice":11800,"createtime":"2017-10-14T21:38:26","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":1,"pid":61,"price":14999,"pscid":40,"salenum":5535,"sellerid":5,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"},{"bargainPrice":11800,"createtime":"2017-10-03T23:53:28","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":0,"pid":62,"price":15999,"pscid":40,"salenum":43,"sellerid":6,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"},{"bargainPrice":11800,"createtime":"2017-10-14T21:38:26","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":1,"pid":63,"price":10000,"pscid":40,"salenum":3232,"sellerid":7,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"},{"bargainPrice":11800,"createtime":"2017-10-03T23:43:53","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":0,"pid":64,"price":11000,"pscid":40,"salenum":0,"sellerid":8,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"},{"bargainPrice":11800,"createtime":"2017-10-14T21:48:08","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":2,"pid":65,"price":12000,"pscid":40,"salenum":868,"sellerid":9,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"},{"bargainPrice":11800,"createtime":"2017-10-14T21:38:26","detailUrl":"https://mitem.jd.hk/ware/view.action?wareId=1988853309&cachekey=1acb07a701ece8d2434a6ae7fa6870a1","images":"https://m.360buyimg.com/n0/jfs/t6130/97/1370670410/180682/1109582a/593276b1Nd81fe723.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5698/110/2617517836/202970/c9388feb/593276b7Nbd94ef1f.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5815/178/2614671118/51656/7f52d137/593276c7N107b725a.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t5878/60/2557817477/30873/4502b606/593276caN5a7d6357.jpg!q70.jpg","itemtype":1,"pid":66,"price":13000,"pscid":40,"salenum":7676,"sellerid":10,"subhead":"购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）","title":"全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G"}]
     * page : 1
     */

    private String msg;
    private String code;
    private String page;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        /**
         * bargainPrice : 11800
         * createtime : 2017-10-10T17:33:37
         * detailUrl : https://item.m.jd.com/product/4338107.html?utm#_source=androidapp&utm#_medium=appshare&utm#_campaign=t#_335139774&utm#_term=QQfriends
         * images : https://m.360buyimg.com/n0/jfs/t6700/155/2098998076/156185/6cf95035/595dd5a5Nc3a7dab5.jpg!q70.jpg
         * itemtype : 0
         * pid : 57
         * price : 5199
         * pscid : 40
         * salenum : 4343
         * sellerid : 1
         * subhead : 【i5 MX150 2G显存】全高清窄边框 8G内存 256固态硬盘 支持指纹识别 预装WIN10系统
         * title : 小米(MI)Air 13.3英寸全金属轻薄笔记本(i5-7200U 8G 256G PCle SSD MX150 2G独显 FHD 指纹识别 Win10）银

         */

        private int bargainPrice;
        private String createtime;
        private String detailUrl;
        private String images;
        private int itemtype;
        private int pid;
        private int price;
        private int pscid;
        private int salenum;
        private int sellerid;
        private String subhead;
        private String title;

        public int getBargainPrice() {
            return bargainPrice;
        }

        public void setBargainPrice(int bargainPrice) {
            this.bargainPrice = bargainPrice;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public int getItemtype() {
            return itemtype;
        }

        public void setItemtype(int itemtype) {
            this.itemtype = itemtype;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPscid() {
            return pscid;
        }

        public void setPscid(int pscid) {
            this.pscid = pscid;
        }

        public int getSalenum() {
            return salenum;
        }

        public void setSalenum(int salenum) {
            this.salenum = salenum;
        }

        public int getSellerid() {
            return sellerid;
        }

        public void setSellerid(int sellerid) {
            this.sellerid = sellerid;
        }

        public String getSubhead() {
            return subhead;
        }

        public void setSubhead(String subhead) {
            this.subhead = subhead;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }


//    /**
//     * code : 200
//     * hasmore : false
//     * page_total : 1
//     * datas : {"goods_list":[{"goods_id":"100009","store_id":"1","goods_name":"劳力士Rolex 日志型系列 116200 63200 自动机械钢带男表联保正品","goods_jingle":"【雅欧国际】：所有商品全新原装正品　　","goods_price":"42800.00","goods_marketprice":"52800.00","goods_image":"1_04752627958339099.jpg","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":true,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627958339099_360.jpg"},{"goods_id":"100008","store_id":"1","goods_name":"劳力士Rolex 宇宙计型迪通拿 自动机械皮带男表 正品116519 CR.TB","goods_jingle":"【雅欧国际】：所有商品全新原装正品　　","goods_price":"188550.00","goods_marketprice":"209500.00","goods_image":"1_04752627931531971.jpg","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":true,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627931531971_360.jpg"},{"goods_id":"100007","store_id":"1","goods_name":"劳力士Rolex 蚝式恒动系列自动机械钢带男表正品116523-8DI-78593","goods_jingle":"","goods_price":"146300.00","goods_marketprice":"146300.00","goods_image":"1_04752627900055146.png","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627900055146_360.png"},{"goods_id":"100006","store_id":"1","goods_name":"劳力士Rolex 蚝式恒动系列 自动机械钢带男表 正品116231-G-63201","goods_jingle":"","goods_price":"100500.00","goods_marketprice":"100500.00","goods_image":"1_04752627871532105.png","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627871532105_360.png"},{"goods_id":"100005","store_id":"1","goods_name":"劳力士Rolex 蚝式恒动 115234-CA-72190自动机械钢带男表联保正品","goods_jingle":"","goods_price":"65900.00","goods_marketprice":"65900.00","goods_image":"1_04752627843241680.jpg","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627843241680_360.jpg"},{"goods_id":"100004","store_id":"1","goods_name":"劳力士Rolex 日志型系列 自动机械钢带男表 联保正品 116233","goods_jingle":"【雅欧国际】：所有商品全新原装正品　　","goods_price":"97800.00","goods_marketprice":"97800.00","goods_image":"1_04752627799921979.jpg","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627799921979_360.jpg"},{"goods_id":"100003","store_id":"1","goods_name":"劳力士Rolex 日志型系列 自动机械钢带男士表 联保正品 116333","goods_jingle":"【雅欧国际】：所有商品全新原装正品　　","goods_price":"89200.00","goods_marketprice":"89200.00","goods_image":"1_04752627769865296.jpg","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627769865296_360.jpg"},{"goods_id":"100002","store_id":"1","goods_name":"劳力士Rolex MILGAUSS 116400GV-72400 自动机械钢带男表联保正品","goods_jingle":"","goods_price":"63200.00","goods_marketprice":"63200.00","goods_image":"1_04752627750479728.png","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627750479728_360.png"},{"goods_id":"100001","store_id":"1","goods_name":"劳力士Rolex 深海系列 自动机械钢带男士表 联保正品116660 98210","goods_jingle":"【雅欧国际】：所有商品全新原装正品　　","goods_price":"87500.00","goods_marketprice":"87500.00","goods_image":"1_04752627707766698.png","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627707766698_360.png"},{"goods_id":"100000","store_id":"1","goods_name":"劳力士ROLEX-潜航者型 116610-LV-97200自动机械钢带男表联保正品","goods_jingle":"","goods_price":"70000.00","goods_marketprice":"70000.00","goods_image":"1_04752627678636481.jpg","goods_salenum":"0","evaluation_good_star":"5","evaluation_count":"0","is_virtual":"0","is_presell":"0","is_fcode":"0","have_gift":"0","store_name":"好商城V5","is_own_shop":"1","sole_flag":false,"group_flag":false,"xianshi_flag":false,"goods_image_url":"http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627678636481_360.jpg"}]}
//     */
//
//    private int code;
//    private boolean hasmore;
//    private int page_total;
//    private DatasBean datas;
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public boolean isHasmore() {
//        return hasmore;
//    }
//
//    public void setHasmore(boolean hasmore) {
//        this.hasmore = hasmore;
//    }
//
//    public int getPage_total() {
//        return page_total;
//    }
//
//    public void setPage_total(int page_total) {
//        this.page_total = page_total;
//    }
//
//    public DatasBean getDatas() {
//        return datas;
//    }
//
//    public void setDatas(DatasBean datas) {
//        this.datas = datas;
//    }
//
//    public static class DatasBean implements Serializable {
//        private List<GoodsListBean> goods_list;
//
//        public List<GoodsListBean> getGoods_list() {
//            return goods_list;
//        }
//
//        public void setGoods_list(List<GoodsListBean> goods_list) {
//            this.goods_list = goods_list;
//        }
//
//        public static class GoodsListBean implements Serializable {
//            /**
//             * goods_id : 100009
//             * store_id : 1
//             * goods_name : 劳力士Rolex 日志型系列 116200 63200 自动机械钢带男表联保正品
//             * goods_jingle : 【雅欧国际】：所有商品全新原装正品　　
//             * goods_price : 42800.00
//             * goods_marketprice : 52800.00
//             * goods_image : 1_04752627958339099.jpg
//             * goods_salenum : 0
//             * evaluation_good_star : 5
//             * evaluation_count : 0
//             * is_virtual : 0
//             * is_presell : 0
//             * is_fcode : 0
//             * have_gift : 0
//             * store_name : 好商城V5
//             * is_own_shop : 1
//             * sole_flag : false
//             * group_flag : true
//             * xianshi_flag : false
//             * goods_image_url : http://169.254.131.247/data/upload/shop/store/goods/1/1_04752627958339099_360.jpg
//             */
//
//            private String goods_id;
//            private String store_id;
//            private String goods_name;
//            private String goods_jingle;
//            private String goods_price;
//            private String goods_marketprice;
//            private String goods_image;
//            private String goods_salenum;
//            private String evaluation_good_star;
//            private String evaluation_count;
//            private String is_virtual;
//            private String is_presell;
//            private String is_fcode;
//            private String have_gift;
//            private String store_name;
//            private String is_own_shop;
//            private boolean sole_flag;
//            private boolean group_flag;
//            private boolean xianshi_flag;
//            private String goods_image_url;
//
//            public String getGoods_id() {
//                return goods_id;
//            }
//
//            public void setGoods_id(String goods_id) {
//                this.goods_id = goods_id;
//            }
//
//            public String getStore_id() {
//                return store_id;
//            }
//
//            public void setStore_id(String store_id) {
//                this.store_id = store_id;
//            }
//
//            public String getGoods_name() {
//                return goods_name;
//            }
//
//            public void setGoods_name(String goods_name) {
//                this.goods_name = goods_name;
//            }
//
//            public String getGoods_jingle() {
//                return goods_jingle;
//            }
//
//            public void setGoods_jingle(String goods_jingle) {
//                this.goods_jingle = goods_jingle;
//            }
//
//            public String getGoods_price() {
//                return goods_price;
//            }
//
//            public void setGoods_price(String goods_price) {
//                this.goods_price = goods_price;
//            }
//
//            public String getGoods_marketprice() {
//                return goods_marketprice;
//            }
//
//            public void setGoods_marketprice(String goods_marketprice) {
//                this.goods_marketprice = goods_marketprice;
//            }
//
//            public String getGoods_image() {
//                return goods_image;
//            }
//
//            public void setGoods_image(String goods_image) {
//                this.goods_image = goods_image;
//            }
//
//            public String getGoods_salenum() {
//                return goods_salenum;
//            }
//
//            public void setGoods_salenum(String goods_salenum) {
//                this.goods_salenum = goods_salenum;
//            }
//
//            public String getEvaluation_good_star() {
//                return evaluation_good_star;
//            }
//
//            public void setEvaluation_good_star(String evaluation_good_star) {
//                this.evaluation_good_star = evaluation_good_star;
//            }
//
//            public String getEvaluation_count() {
//                return evaluation_count;
//            }
//
//            public void setEvaluation_count(String evaluation_count) {
//                this.evaluation_count = evaluation_count;
//            }
//
//            public String getIs_virtual() {
//                return is_virtual;
//            }
//
//            public void setIs_virtual(String is_virtual) {
//                this.is_virtual = is_virtual;
//            }
//
//            public String getIs_presell() {
//                return is_presell;
//            }
//
//            public void setIs_presell(String is_presell) {
//                this.is_presell = is_presell;
//            }
//
//            public String getIs_fcode() {
//                return is_fcode;
//            }
//
//            public void setIs_fcode(String is_fcode) {
//                this.is_fcode = is_fcode;
//            }
//
//            public String getHave_gift() {
//                return have_gift;
//            }
//
//            public void setHave_gift(String have_gift) {
//                this.have_gift = have_gift;
//            }
//
//            public String getStore_name() {
//                return store_name;
//            }
//
//            public void setStore_name(String store_name) {
//                this.store_name = store_name;
//            }
//
//            public String getIs_own_shop() {
//                return is_own_shop;
//            }
//
//            public void setIs_own_shop(String is_own_shop) {
//                this.is_own_shop = is_own_shop;
//            }
//
//            public boolean isSole_flag() {
//                return sole_flag;
//            }
//
//            public void setSole_flag(boolean sole_flag) {
//                this.sole_flag = sole_flag;
//            }
//
//            public boolean isGroup_flag() {
//                return group_flag;
//            }
//
//            public void setGroup_flag(boolean group_flag) {
//                this.group_flag = group_flag;
//            }
//
//            public boolean isXianshi_flag() {
//                return xianshi_flag;
//            }
//
//            public void setXianshi_flag(boolean xianshi_flag) {
//                this.xianshi_flag = xianshi_flag;
//            }
//
//            public String getGoods_image_url() {
//                return goods_image_url;
//            }
//
//            public void setGoods_image_url(String goods_image_url) {
//                this.goods_image_url = goods_image_url;
//            }
//        }
//    }
}
