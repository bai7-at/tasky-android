package com.amazonaws.services.s3.model;

@Deprecated
/* loaded from: classes2.dex */
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {
    public ProgressEvent(int i) {
        super(i);
    }

    @Deprecated
    public int getBytesTransfered() {
        return (int) getBytesTransferred();
    }

    @Deprecated
    public void setBytesTransfered(int i) {
        setBytesTransferred(i);
    }

    public ProgressEvent(int i, long j) {
        super(i, j);
    }
}
