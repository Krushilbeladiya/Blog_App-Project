package com.Blog.app.Service_imlements;

import com.Blog.app.Service.FileService;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileServiceimp implements FileService {
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public InputStream getResource(String path, String fileName) throws FileNotFoundException {
        return null;
    }
}
