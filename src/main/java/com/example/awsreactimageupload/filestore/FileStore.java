package com.example.awsreactimageupload.filestore;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@Service
public class FileStore {
//    private final AmazonS3 s3;

    public FileStore(){}

//    @Autowired
//    public FileStore(AmazonS3 s3) {
//        this.s3 = s3;
//    }

    public void save(
            String path,
            String fileName,
            Optional<Map<String, String>> optionalMetadata,
            InputStream inputStream
    ) {
        // save the optional metadata to a new object
        ObjectMetadata objectMetadata = new ObjectMetadata();
        optionalMetadata.ifPresent(map -> {
            if(!map.isEmpty()) {
//                map.forEach((key, value) -> {
//                    objectMetadata.addUserMetadata(key, value);
//                });
                map.forEach(objectMetadata::addUserMetadata);
            }
        });

//        try {
//            s3.putObject(path, fileName, inputStream, objectMetadata);
//        }
//        catch(AmazonServiceException e) {
//            throw new IllegalStateException("Failed to store file to s3", e);
//        }
    }

    public byte[] download(String path, String key) {
        try {
//            S3Object object = s3.getObject(path, key);
//            S3ObjectInputStream inputStream = object.getObjectContent();
//            IOUtils.toByteArray(inputStream);

//        } catch(AmazonServiceException | IOException e) {
//            throw new IllegalStateException("Failed to download file to s3", e);
//        }
            return null;
        } catch(AmazonServiceException e) {
            throw new IllegalStateException("Failed to download file to s3", e);
        }
    }
}
