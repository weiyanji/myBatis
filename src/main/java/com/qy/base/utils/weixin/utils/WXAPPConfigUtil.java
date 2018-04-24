package com.qy.base.utils.weixin.utils;


/**
 * 微信开放平台配置工具类
 * @author 武亚洲
 * @date 2014-11-21下午9:10:30
 */
public class WXAPPConfigUtil {
	/**
	 * 服务号相关信息
	 */
	 public final static String APPID = "wx0b184176785e6447";//服务号的应用号
	 public final static String MCH_ID = "1491783642";//商户号
	 public final static String API_KEY = "eoFvOzi5HV5XDDrWedCbJet301m6S9O1";//支付密钥
	 public final static String SIGN_TYPE = "MD5";//签名加密方式


	public final static String BASE_URL = "http://www.huozhuhui.com/";
//	public final static String BASE_URL = "http://q.hnqingyun.com/";

	//微信支付成功回调
	public final static String WX_PAY_NOTIFY_URL = BASE_URL + "wyhy/api/driver/wx_notify";
public final static String WX_PAY_NOTIFY_VIP_URL = BASE_URL + "wyhy/api/driver/vip/wx_notify";

	/**
	 * 微信支付接口地址
	 */
	//微信支付统一接口(POST)
	public final static String UNIFIED_ORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	//微信退款接口(POST)
	public final static String REFUND_URL = "https://api.mch.weixin.qq.com/secapi/pay/refund";
	//订单查询接口(POST)
	public final static String CHECK_ORDER_URL = "https://api.mch.weixin.qq.com/pay/orderquery";
	//关闭订单接口(POST)
	public final static String CLOSE_ORDER_URL = "https://api.mch.weixin.qq.com/pay/closeorder";
	//退款查询接口(POST)
	public final static String CHECK_REFUND_URL = "https://api.mch.weixin.qq.com/pay/refundquery";
	//对账单接口(POST)
	public final static String DOWNLOAD_BILL_URL = "https://api.mch.weixin.qq.com/pay/downloadbill";
	//短链接转换接口(POST)
	public final static String SHORT_URL = "https://api.mch.weixin.qq.com/tools/shorturl";
	//接口调用上报接口(POST)
	public final static String REPORT_URL = "https://api.mch.weixin.qq.com/payitil/report";
}
