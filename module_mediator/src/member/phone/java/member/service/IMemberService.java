package member.service;

import android.support.v4.app.Fragment;

/**
 * 会员phone服务
 */
public interface IMemberService extends IMemberWrapperService {

    /**
     * 获取会员登录view
     */
    Fragment getLoginView( );
}
