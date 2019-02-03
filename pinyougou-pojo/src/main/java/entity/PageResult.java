package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果类
 * @author Smile
 * Created at 2019/2/2
 */
public class PageResult implements Serializable {
    //总页数
    private long total;
    //当前页记录
    private List rows;

    public PageResult(long total, List rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public PageResult setTotal(long total) {
        this.total = total;
        return this;
    }

    public List getRows() {
        return rows;
    }

    public PageResult setRows(List rows) {
        this.rows = rows;
        return this;
    }
}
