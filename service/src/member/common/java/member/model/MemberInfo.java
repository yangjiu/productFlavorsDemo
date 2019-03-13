package com.retail.service.member.model;

/**
 * 会员信息
 */
public class MemberInfo {
    /**
     * 会员id
     */
    public long id;

    /**
     * 会员名称
     */
    public String name;

    /**
     * 余额
     */
    public long balance;

    @Override
    public String toString() {
        return "MemberInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
