package com.bawei.app.apresentr;

import android.text.TextUtils;

import com.bawei.app.amodle.IRegisterModel;
import com.bawei.app.amodle.RegisterModel;
import com.bawei.app.anet.OnNetListener;
import com.bawei.app.aview.IRegisterActivity;
import com.bawei.app.redisterbean.BaseBean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 于俊建 on 2017/11/13.
 */

public class RegisterPresenter {
       private IRegisterActivity iRegisterActivity;
       private final IRegisterModel iRegisterModel;

       public RegisterPresenter(IRegisterActivity iRegisterActivity){
               this.iRegisterActivity=iRegisterActivity;

           iRegisterModel = new RegisterModel();
       }
       public boolean checkPwd(String pwd) {
          if (TextUtils.isEmpty(pwd)){
              iRegisterActivity.show("请输入密码");
              return false;
          }
          if (pwd.length()!=6){
              iRegisterActivity.show("请输入流位密码");
              return false;
          }
           return true;
       }
    /***
     * 验证手机号是否正确
     */
     private boolean checkAccount(String account){
         if(TextUtils.isEmpty(account)){
             iRegisterActivity.show("请输入账号");
             return false;
         }
         if (isMobileNO(account)){
             iRegisterActivity.show("请输入正确的手机号");
             return false;

         }

         return true;
     }
    /*
  判断是否是手机号
   */
    public static boolean isMobileNO(String mobiles) {
        Pattern p = Pattern.compile("^(13[0-9]|14[57]|15[0-35-9]|17[6-8]|18[0-9])[0-9]{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
    public void register(){
        String account = iRegisterActivity.getAccount();
        String pwd = iRegisterActivity.getPwd();
        if(checkAccount(account)&&checkPwd(pwd)){
            iRegisterModel.register(account, pwd, new OnNetListener<BaseBean>() {
                @Override
                public void onSuccess(BaseBean baseBean) {
                    //成功以后，回到登陆界面
                    if (baseBean.getCode().equals("1")) {
                        iRegisterActivity.show(baseBean.getMsg());
                    } else {
                        iRegisterActivity.show(baseBean.getMsg());
                        iRegisterActivity.finishAc();
                    }
                }

                @Override
                public void onFailure(Exception e) {

                }
            });

        }



    }

}

