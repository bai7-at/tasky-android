package com.datadog.android.core.configuration;

/* loaded from: classes2.dex */
public enum BatchProcessingLevel {
    LOW(1),
    MEDIUM(10),
    HIGH(100);

    private final int maxBatchesPerUploadJob;

    BatchProcessingLevel(int i) {
        this.maxBatchesPerUploadJob = i;
    }

    public final int getMaxBatchesPerUploadJob() {
        return this.maxBatchesPerUploadJob;
    }
}
