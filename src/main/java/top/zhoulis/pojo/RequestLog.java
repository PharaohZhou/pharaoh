package top.zhoulis.pojo;

import java.util.Arrays;

/**
 * @ClassName RequestLog
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/23
 * @Version V1.0
 **/
public class RequestLog {
    private String url;
    private String ip;
    private String classMethod;
    private Object[] args;

    @Override
    public String toString() {
        return "{" +
                "url='" + url + '\'' +
                ", ip='" + ip + '\'' +
                ", classMethod='" + classMethod + '\'' +
                ", args=" + Arrays.toString(args) +
                '}';
    }

    public RequestLog() {
    }

    public RequestLog(String url, String ip, String classMethod, Object[] args) {
        this.url = url;
        this.ip = ip;
        this.classMethod = classMethod;
        this.args = args;
    }
}
