package com.coderman.system.converter;

import com.coderman.common.model.system.Department;
import com.coderman.common.vo.system.DepartmentVO;
import org.springframework.beans.BeanUtils;

/**
 * @Author wrh
 * @Date 2021/3/7 19:56
 * @Version 1.0
 **/
public class DepartmentConverter {


    /**
     * 转vo
     * @return
     */
    public static DepartmentVO converterToDepartmentVO(Department department){
        DepartmentVO departmentVO = new DepartmentVO();
        BeanUtils.copyProperties(department,departmentVO);
        return departmentVO;
    }
}
