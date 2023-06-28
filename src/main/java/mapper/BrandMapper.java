package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();

    Brand selectById(int id);

    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
    List<Brand> selectByCondition(Map map);

    /**
     * 单条件动态查询
     * @param brand
     * @return
     */
    List<Brand> selectBySingleCondition(Brand brand);

    /**
     * 添加方法
     */
    void add(Brand brand);

    /**
     * 修改功能
     */
    int update(Brand brand);

    /**
     * 删除功能
     */
    void deleteById(int id);

    /**
     * 批量删除
     */
    void deleteByIds(@Param("ids") int[] ids);
}
