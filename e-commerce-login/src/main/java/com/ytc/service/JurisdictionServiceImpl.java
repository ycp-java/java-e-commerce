/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: JurisdictionServiceImpl
 * Author:   ycp
 * Date:     2020/10/7 15:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.JurisdictionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class JurisdictionServiceImpl implements JurisdictionService {

    @Autowired
    private JurisdictionMapper jurisdictionMapper;
}