package kang.demo.demo.vo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("resultMap")
public class ResultMap<T> {
    private boolean status; //标志：true成功/false失败
    private String message; //错误提示
    private Object object;
    private List<T> list = new ArrayList<T>();
    private long total;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
