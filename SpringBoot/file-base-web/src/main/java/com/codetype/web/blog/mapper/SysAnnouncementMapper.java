package com.codetype.web.blog.mapper;



import com.codetype.web.blog.entity.SysAnnouncement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysAnnouncementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_announcement
     *  删除
     * @mbg.generated Sun Apr 10 10:40:31 CST 2022
     */
    int deleteByPrimaryKey(Integer sysId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_announcement
     * 添加
     * @mbg.generated Sun Apr 10 10:40:31 CST 2022
     */
    int insert(SysAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_announcement
     * 按照id查询
     * @mbg.generated Sun Apr 10 10:40:31 CST 2022
     */
    SysAnnouncement selectByPrimaryKey(Integer sysId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_announcement
     * 查询所有
     * @mbg.generated Sun Apr 10 10:40:31 CST 2022
     */
    List<SysAnnouncement> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_announcement
     * 更新数据
     * @mbg.generated Sun Apr 10 10:40:31 CST 2022
     */
    int updateByPrimaryKey(SysAnnouncement record);
}