package com.example.awsreactimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("bucket-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
