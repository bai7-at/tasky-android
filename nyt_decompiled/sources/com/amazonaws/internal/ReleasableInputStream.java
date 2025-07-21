package com.amazonaws.internal;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ReleasableInputStream extends SdkFilterInputStream implements Releasable {
    private static final Log log = LogFactory.getLog((Class<?>) ReleasableInputStream.class);
    private boolean closeDisabled;

    protected ReleasableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    private void doRelease() {
        try {
            ((FilterInputStream) this).in.close();
        } catch (Exception e) {
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("FYI", e);
            }
        }
        if (((FilterInputStream) this).in instanceof Releasable) {
            ((Releasable) ((FilterInputStream) this).in).release();
        }
        abortIfNeeded();
    }

    public static ReleasableInputStream wrap(InputStream inputStream) {
        return inputStream instanceof ReleasableInputStream ? (ReleasableInputStream) inputStream : inputStream instanceof FileInputStream ? ResettableInputStream.newResettableInputStream((FileInputStream) inputStream) : new ReleasableInputStream(inputStream);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closeDisabled) {
            return;
        }
        doRelease();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ReleasableInputStream> T disableClose() {
        this.closeDisabled = true;
        return this;
    }

    public final boolean isCloseDisabled() {
        return this.closeDisabled;
    }

    @Override // com.amazonaws.internal.Releasable
    public final void release() {
        doRelease();
    }
}
