package com.adam.enums;

public enum OrderStatusEnum {
    NewOrder("新建订单", 0),
    SupplierConfirmed("已确认", 1),
    PendingSupplierConfirm("待确认", 2),
    CheckInConfirmed("确认入住", 3),
    PurInProgress("采购中", 4),
    Canceled("取消", 5),
    CheckInSucceed("成功入住", 6),
    NoShow("noshow", 7),
    PendingCreateSupplierOrder("待补单", 8),
    SupplierConfirmFailed("确认失败", 9),
    CancelInProgress("取消中", 10),
    CreateFailed("下单失败", 11),
    PendingQuery("待查询", 12);

    public String getDescription() {
        return description;
    }

    public int getIndex() {
        return index;
    }

    //成员变量
    private String description;
    private int index;
    private OrderStatusEnum(String description,int index)
    {
        this.description = description;
        this.index = index;
    }
    //覆盖方法
    @Override
    public String toString() {
        return this.index+"_"+this.description;
    }
}
