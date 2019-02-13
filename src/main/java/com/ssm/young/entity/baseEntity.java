package com.ssm.young.entity;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * @Auther:dep
 * @Date: 2019/2/13 16:41
 * @Description:
 */
public class baseEntity  implements Serializable{

    private Long id;

    private Long createTime;

    private Integer version;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



    private void dealOriginalTimes(){
        this.createTime= this.createTime==null? System.currentTimeMillis():this.createTime;
        this.version= 0;
        this.status= 1;
    }
}
