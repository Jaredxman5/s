package com.rm.book.file;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FilesUtils {
    public static byte[] readFileFromLocation(String fileUrl) {
        if (StringUtils.isBlank(fileUrl)) {
            return null;
        }
        try {
            Path filePath = new File(fileUrl).toPath() ;
            return Files.readAllBytes(filePath);
        } catch (Exception e) {
            log.warn("No file found in the path {}", fileUrl);
        }
        return null;
    }
}
