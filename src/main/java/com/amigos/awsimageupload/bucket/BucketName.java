package com.amigos.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("amigoscode-image-upload-123-dh");

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
