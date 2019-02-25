package com.adam.dto.dsfagentplus;

import java.util.List;

public class RoomInfo {

    /**
     * 供应商的床型id，目前只有ean有用
     */
    private String bedTypeId;
    /**
     * 床型名称
     **/
    private String bedTypeName;

    /**
     * 房间吸烟偏好
     */
    private String smokingPreference;

    /**
     * 房间入住成人数
     */

    private Integer roomNumberOfAdults;

    /**
     * 房间儿童数
     */
    private Integer roomNumberOfChildren;

    /**
     * 房间儿童年龄 有0岁的情况
     */

    private List<String> roomChildAges;

    /**
     * 入住人信息集合
     */

    private List<GuestInfo> guestInfoList;

    public String getBedTypeId() {
        return bedTypeId;
    }

    public void setBedTypeId(String bedTypeId) {
        this.bedTypeId = bedTypeId;
    }

    public String getBedTypeName() {
        return bedTypeName;
    }

    public void setBedTypeName(String bedTypeName) {
        this.bedTypeName = bedTypeName;
    }

    public String getSmokingPreference() {
        return smokingPreference;
    }

    public void setSmokingPreference(String smokingPreference) {
        this.smokingPreference = smokingPreference;
    }

    public Integer getRoomNumberOfAdults() {
        return roomNumberOfAdults;
    }

    public void setRoomNumberOfAdults(Integer roomNumberOfAdults) {
        this.roomNumberOfAdults = roomNumberOfAdults;
    }

    public Integer getRoomNumberOfChildren() {
        return roomNumberOfChildren;
    }

    public void setRoomNumberOfChildren(Integer roomNumberOfChildren) {
        this.roomNumberOfChildren = roomNumberOfChildren;
    }

    public List<String> getRoomChildAges() {
        return roomChildAges;
    }

    public void setRoomChildAges(List<String> roomChildAges) {
        this.roomChildAges = roomChildAges;
    }

    public List<GuestInfo> getGuestInfoList() {
        return guestInfoList;
    }

    public void setGuestInfoList(List<GuestInfo> guestInfoList) {
        this.guestInfoList = guestInfoList;
    }
}
