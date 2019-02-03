package entity;

import java.io.Serializable;

/**
 * 返回结果
 * @author Smile
 * Created at 2019/2/2
 */
public class Result implements Serializable {
    //是否成功
    private boolean success;
    //返回信息
    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public Result setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }
}
