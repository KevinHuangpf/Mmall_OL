package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by KevinHuang on 2019/4/3.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
