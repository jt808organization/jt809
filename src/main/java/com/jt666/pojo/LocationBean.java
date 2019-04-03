package com.jt666.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 作者 cl
 * @version 创建时间：2018年10月12日 下午4:27:24 类说明 位置汇报信息类
 */
public class LocationBean {
    private static final long serialVersionUID = 1L;

    // 主键
    private Long id;

    // 手机号
    private String simNumber;

    // 报警标志
    // byte[0-3]
    private Integer alarmFlag;

    // 状态标志
    // byte[4-7] 状态(DWORD(32))
    private Integer statusFlag;

    // 纬度
    // byte[8-11] 纬度(DWORD(32))
    private Double lati;

    // 经度
    // byte[12-15] 经度(DWORD(32))
    private Double longti;

    // 高程
    // byte[16-17] 高程(WORD(16)) 海拔高度，单位为米（ m）
    private Integer elevation;

    // 速度
    // byte[18-19] 速度(WORD)
    private Float speed;

    // 方向
    // byte[20-21] 方向(WORD) 0-359，正北为 0，顺时针
    private Integer direction;

    // byte[22-28] 时间(BCD[6]) YY-MM-DD-hh-mm-ss
    // GMT+8 时间，本标准中之后涉及的时间均采用此时区
    // 位置信息上报时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date locationTime;

    // 附加信息 存在附加信息时，添加；默认为空。
    // byte
    private byte[] extendMsg;

    // 信息记录时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date recordTime;

    /**
     * 百度转换后的经度
     */
    private BigDecimal baiduLongti;
    /**
     * 百度转换后的纬度
     */
    private BigDecimal baiduLati;

    private String baiduAddress;

    private double mileage1;
    private double mileage2;
    private Integer time;

    private Integer shache;

    public Integer getShache() {
        return shache;
    }

    public void setShache(Integer shache) {
        this.shache = shache;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public Integer getAlarmFlag() {
        return alarmFlag;
    }

    public void setAlarmFlag(Integer alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Double getLati() {
        return lati;
    }

    public void setLati(Double lati) {
        this.lati = lati;
    }

    public Double getLongti() {
        return longti;
    }

    public void setLongti(Double longti) {
        this.longti = longti;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Date getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(Date locationTime) {
        this.locationTime = locationTime;
    }

    public byte[] getExtendMsg() {
        return extendMsg;
    }

    public void setExtendMsg(byte[] extendMsg) {
        this.extendMsg = extendMsg;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public BigDecimal getBaiduLongti() {
        return baiduLongti;
    }

    public void setBaiduLongti(BigDecimal baiduLongti) {
        this.baiduLongti = baiduLongti;
    }

    public BigDecimal getBaiduLati() {
        return baiduLati;
    }

    public void setBaiduLati(BigDecimal baiduLati) {
        this.baiduLati = baiduLati;
    }

    public String getBaiduAddress() {
        return baiduAddress;
    }

    public void setBaiduAddress(String baiduAddress) {
        this.baiduAddress = baiduAddress;
    }

    public double getMileage1() {
        return mileage1;
    }

    public void setMileage1(double mileage1) {
        this.mileage1 = mileage1;
    }

    public double getMileage2() {
        return mileage2;
    }

    public void setMileage2(double mileage2) {
        this.mileage2 = mileage2;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LocationBean [id=" + id + ", simNumber=" + simNumber + ", alarmFlag=" + alarmFlag + ", statusFlag="
                + statusFlag + ", lati=" + lati + ", longti=" + longti + ", elevation=" + elevation + ", speed=" + speed
                + ", direction=" + direction + ", locationTime=" + locationTime + ", extendMsg="
                + Arrays.toString(extendMsg) + ", recordTime=" + recordTime + ", baiduLongti=" + baiduLongti
                + ", baiduLati=" + baiduLati + ", baiduAddress=" + baiduAddress + ", mileage1=" + mileage1
                + ", mileage2=" + mileage2 + ", time=" + time + ", shache=" + shache + "]";
    }
}
