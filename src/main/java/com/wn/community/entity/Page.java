package com.wn.community.entity;


import lombok.Data;

/**
 * @author jt
 * @version 1.0
 * @description: TODO
 * @date 2023/2/9 17:01
 */
@Data
public class Page {
    //默认显示第一页
    private int current = 1;

    //一个页面默认放10条帖子
    private int limit = 10;

    private int rows;

    private String path;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1 && limit <= 100){
            this.limit = limit;
        }

    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current > 0){
            this.current = current;
        }
    }

    public int getOffset(){
        return current * limit - limit;
    }

    public int getTotal(){
        if(rows % limit == 0){
            return rows / limit;
        }
        else{
            return rows / limit + 1;
        }
    }


}
