package com.zhm.dao;

import com.zhm.entity.CnArea;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 赵红明 on 2019/6/3.
 */
public interface CnAreaDao extends PagingAndSortingRepository<CnArea,Integer>,JpaSpecificationExecutor<CnArea> {
    
}
