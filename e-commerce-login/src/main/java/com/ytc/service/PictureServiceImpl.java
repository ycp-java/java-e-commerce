/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PictureServiceImpl
 * Author:   ycp
 * Date:     2020/10/7 15:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.PictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class PictureServiceImpl implements PictureService {
@Autowired
    private PictureMapper pictureMapper;

}