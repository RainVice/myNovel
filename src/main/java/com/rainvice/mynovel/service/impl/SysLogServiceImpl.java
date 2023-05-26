package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.SysLog;
import com.rainvice.mynovel.service.SysLogService;
import com.rainvice.mynovel.dao.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【sys_log(系统日志)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog>
    implements SysLogService{

}




