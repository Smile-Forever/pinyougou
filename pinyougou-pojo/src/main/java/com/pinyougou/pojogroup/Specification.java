package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 规格组合实体类
 * @author Smile
 * Created at 2019/2/6
 */
public class Specification implements Serializable {

    private TbSpecification specification;
    private List<TbSpecificationOption> specificationOptionList;

    public TbSpecification getSpecification() {
        return specification;
    }

    public Specification setSpecification(TbSpecification specification) {
        this.specification = specification;
        return this;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public Specification setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
        return this;
    }
}
