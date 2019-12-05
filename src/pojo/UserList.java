package pojo;

import java.io.Serializable;
import java.util.List;

public class UserList {

    /**
     * code : 0
     * msg :
     * count : 3
     * data : [{"usersId":"1","userName":"杜鑫","userEmail":"mage@layui.com","userSex":"男","userStatus":"0","userGrade":"4","userEndTime":"2018-01-31 10:00","userDesc":"考试系统作者，原名\u2018三金\u2019"},{"usersId":"2","userName":"贤心","userEmail":"xianxin@layui.com","userSex":"保密","userStatus":"0","userGrade":"3","userEndTime":"2018-01-14 15:35","userDesc":"layui框架作者，性别至今是个谜。。。"},{"usersId":"3","userName":"纸飞机","userEmail":"fly@layui.com","userSex":"男","userStatus":"1","userGrade":"2","userEndTime":"2018-01-25 16:25","userDesc":"fly社区管理员，据传与layui作者有奸情，故帐号被封。"}]
     */

    private int code;
    private String msg;
    private int count;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * usersId : 1
         * userName : 杜鑫
         * userEmail : mage@layui.com
         * userSex : 男
         * userStatus : 0
         * userGrade : 4
         * userEndTime : 2018-01-31 10:00
         * userDesc : 考试系统作者，原名‘三金’
         */

        private String usersId;
        private String userName;
        private String userEmail;
        private String userSex;
        private String userStatus;
        private String userGrade;
        private String userEndTime;
        private String userDesc;

        public String getUsersId() {
            return usersId;
        }

        public void setUsersId(String usersId) {
            this.usersId = usersId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserSex() {
            return userSex;
        }

        public void setUserSex(String userSex) {
            this.userSex = userSex;
        }

        public String getUserStatus() {
            return userStatus;
        }

        public void setUserStatus(String userStatus) {
            this.userStatus = userStatus;
        }

        public String getUserGrade() {
            return userGrade;
        }

        public void setUserGrade(String userGrade) {
            this.userGrade = userGrade;
        }

        public String getUserEndTime() {
            return userEndTime;
        }

        public void setUserEndTime(String userEndTime) {
            this.userEndTime = userEndTime;
        }

        public String getUserDesc() {
            return userDesc;
        }

        public void setUserDesc(String userDesc) {
            this.userDesc = userDesc;
        }
    }
}
