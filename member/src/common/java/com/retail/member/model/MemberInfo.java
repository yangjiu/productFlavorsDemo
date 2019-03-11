package com.retail.member.model;

import com.retail.service.member.model.IMemberInfo;

public class MemberInfo implements IMemberInfo {
    /**
     * 会员id
     */
    private long id ;

    /**
     * 会员名称
     */
    private String name ;

    /**
     * 余额
     */
    private Long balance ;

    public MemberInfo(long id, String name, Long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "MemberInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
