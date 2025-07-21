package com.amazonaws.services.s3.iterable;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class S3Objects implements Iterable<S3ObjectSummary> {
    private String bucketName;
    private AmazonS3 s3;
    private String prefix = null;
    private Integer batchSize = null;

    private class S3ObjectIterator implements Iterator<S3ObjectSummary> {
        private Iterator<S3ObjectSummary> currentIterator;
        private ObjectListing currentListing;

        private S3ObjectIterator() {
            this.currentListing = null;
            this.currentIterator = null;
        }

        private void prepareCurrentListing() {
            while (true) {
                if (this.currentListing != null && (this.currentIterator.hasNext() || !this.currentListing.isTruncated())) {
                    return;
                }
                if (this.currentListing == null) {
                    ListObjectsRequest listObjectsRequest = new ListObjectsRequest();
                    listObjectsRequest.setBucketName(S3Objects.this.getBucketName());
                    listObjectsRequest.setPrefix(S3Objects.this.getPrefix());
                    listObjectsRequest.setMaxKeys(S3Objects.this.getBatchSize());
                    this.currentListing = S3Objects.this.getS3().listObjects(listObjectsRequest);
                } else {
                    this.currentListing = S3Objects.this.getS3().listNextBatchOfObjects(this.currentListing);
                }
                this.currentIterator = this.currentListing.getObjectSummaries().iterator();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            prepareCurrentListing();
            return this.currentIterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public S3ObjectSummary next() {
            prepareCurrentListing();
            return this.currentIterator.next();
        }
    }

    private S3Objects(AmazonS3 amazonS3, String str) {
        this.s3 = amazonS3;
        this.bucketName = str;
    }

    public static S3Objects inBucket(AmazonS3 amazonS3, String str) {
        return new S3Objects(amazonS3, str);
    }

    public static S3Objects withPrefix(AmazonS3 amazonS3, String str, String str2) {
        S3Objects s3Objects = new S3Objects(amazonS3, str);
        s3Objects.prefix = str2;
        return s3Objects;
    }

    public Integer getBatchSize() {
        return this.batchSize;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public AmazonS3 getS3() {
        return this.s3;
    }

    @Override // java.lang.Iterable
    public Iterator<S3ObjectSummary> iterator() {
        return new S3ObjectIterator();
    }

    public S3Objects withBatchSize(int i) {
        this.batchSize = Integer.valueOf(i);
        return this;
    }
}
