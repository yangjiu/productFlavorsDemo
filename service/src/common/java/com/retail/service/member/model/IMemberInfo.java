package com.retail.service.member.model;

/**
 * 会员信息
 */
public interface IMemberInfo {
    /**
     * 会员id
     */
    long getId();

    /**
     * 会员名称
     */
    String getName();

    /**
     * 余额
     */
    Long getBalance();
}
