package com.amazonaws.event;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ProgressListenerChain implements ProgressListener {
    private static final Log log = LogFactory.getLog((Class<?>) ProgressListenerChain.class);
    private final List<ProgressListener> listeners;
    private final ProgressEventFilter progressEventFilter;

    public interface ProgressEventFilter {
        ProgressEvent filter(ProgressEvent progressEvent);
    }

    public ProgressListenerChain(ProgressListener... progressListenerArr) {
        this(null, progressListenerArr);
    }

    public synchronized void addProgressListener(ProgressListener progressListener) {
        if (progressListener == null) {
            return;
        }
        this.listeners.add(progressListener);
    }

    protected List<ProgressListener> getListeners() {
        return this.listeners;
    }

    @Override // com.amazonaws.event.ProgressListener
    public void progressChanged(ProgressEvent progressEvent) {
        ProgressEventFilter progressEventFilter = this.progressEventFilter;
        if (progressEventFilter == null || (progressEvent = progressEventFilter.filter(progressEvent)) != null) {
            Iterator<ProgressListener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().progressChanged(progressEvent);
                } catch (RuntimeException e) {
                    log.warn("Couldn't update progress listener", e);
                }
            }
        }
    }

    public synchronized void removeProgressListener(ProgressListener progressListener) {
        if (progressListener == null) {
            return;
        }
        this.listeners.remove(progressListener);
    }

    public ProgressListenerChain(ProgressEventFilter progressEventFilter, ProgressListener... progressListenerArr) {
        this.listeners = new CopyOnWriteArrayList();
        if (progressListenerArr == null) {
            throw new IllegalArgumentException("Progress Listeners cannot be null.");
        }
        for (ProgressListener progressListener : progressListenerArr) {
            addProgressListener(progressListener);
        }
        this.progressEventFilter = progressEventFilter;
    }
}
