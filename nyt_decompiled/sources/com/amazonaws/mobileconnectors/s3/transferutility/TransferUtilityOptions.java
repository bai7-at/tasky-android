package com.amazonaws.mobileconnectors.s3.transferutility;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;

/* loaded from: classes.dex */
public class TransferUtilityOptions implements Serializable {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferUtilityOptions.class);
    private static final int MILLIS_IN_MINUTE = 60000;
    private static final long serialVersionUID = 1;
    private long minimumUploadPartSizeInBytes;
    protected TransferNetworkConnectionType transferNetworkConnectionType;

    @Deprecated
    private long transferServiceCheckTimeInterval;
    private int transferThreadPoolSize;

    public TransferUtilityOptions() {
        this.transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
        this.transferThreadPoolSize = getDefaultThreadPoolSize();
        this.transferNetworkConnectionType = getDefaultTransferNetworkConnectionType();
        this.minimumUploadPartSizeInBytes = 5242880L;
    }

    @Deprecated
    static long getDefaultCheckTimeInterval() {
        return 60000L;
    }

    static int getDefaultThreadPoolSize() {
        return (Runtime.getRuntime().availableProcessors() + 1) * 2;
    }

    static TransferNetworkConnectionType getDefaultTransferNetworkConnectionType() {
        return TransferNetworkConnectionType.ANY;
    }

    protected long getMinimumUploadPartSizeInBytes() {
        return this.minimumUploadPartSizeInBytes;
    }

    public int getMinimumUploadPartSizeInMB() {
        return (int) (this.minimumUploadPartSizeInBytes / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public TransferNetworkConnectionType getTransferNetworkConnectionType() {
        return this.transferNetworkConnectionType;
    }

    @Deprecated
    public long getTransferServiceCheckTimeInterval() {
        return this.transferServiceCheckTimeInterval;
    }

    public int getTransferThreadPoolSize() {
        return this.transferThreadPoolSize;
    }

    public void setMinimumUploadPartSizeInMB(int i) {
        long j = i * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        if (j > 5368709120L) {
            LOGGER.warn("The provided minimumUploadPartSize is greater than the maximum upload part size limit. Setting upload part size to the maximum allowed value of5MB.");
            this.minimumUploadPartSizeInBytes = 5368709120L;
        } else if (j >= 5242880) {
            this.minimumUploadPartSizeInBytes = j;
        } else {
            LOGGER.warn("The provided minimumUploadPartSize is less than the minimum upload part size limit. Setting upload part size to the minimum allowed value of5MB.");
            this.minimumUploadPartSizeInBytes = 5242880L;
        }
    }

    @Deprecated
    public void setTransferServiceCheckTimeInterval(long j) {
    }

    public void setTransferThreadPoolSize(int i) {
        if (i < 0) {
            this.transferThreadPoolSize = getDefaultThreadPoolSize();
        } else {
            this.transferThreadPoolSize = i;
        }
    }

    public TransferUtilityOptions(int i, TransferNetworkConnectionType transferNetworkConnectionType) {
        this.transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
        this.transferThreadPoolSize = i;
        this.transferNetworkConnectionType = transferNetworkConnectionType;
        this.minimumUploadPartSizeInBytes = 5242880L;
    }
}
