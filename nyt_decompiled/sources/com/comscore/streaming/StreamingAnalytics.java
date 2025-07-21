package com.comscore.streaming;

import com.comscore.streaming.StreamingConfiguration;
import com.comscore.util.cpp.CppJavaBinder;

/* loaded from: classes2.dex */
public class StreamingAnalytics extends CppJavaBinder {
    private final Object b;
    private long c;
    private StreamingConfiguration d;
    private StreamingExtendedAnalytics e;

    public StreamingAnalytics() {
        this(null);
    }

    private native void addListenerNative(long j, StreamingListener streamingListener);

    private native void createPlaybackSessionNative(long j);

    private native void destroyCppInstanceNative(long j);

    private native String getPlaybackSessionIdNative(long j);

    private native void loopPlaybackSessionNative(long j);

    private native long newCppInstanceNative(long j);

    private native void notifyBufferStartNative(long j);

    private native void notifyBufferStopNative(long j);

    private native void notifyChangePlaybackRateNative(long j, float f);

    private native void notifyEndNative(long j);

    private native void notifyPauseNative(long j);

    private native void notifyPlayNative(long j);

    private native void notifySeekStartNative(long j);

    private native void removeListenerNative(long j, StreamingListener streamingListener);

    private native void setDvrWindowLengthNative(long j, long j2);

    private native void setImplementationIdNative(long j, String str);

    private native void setMediaPlayerNameNative(long j, String str);

    private native void setMediaPlayerVersionNative(long j, String str);

    private native void setMetadataNative(long j, long j2);

    private native void setProjectIdNative(long j, String str);

    private native void startFromDvrWindowOffsetNative(long j, long j2);

    private native void startFromPositionNative(long j, long j2);

    private native void startFromSegmentNative(long j, int i);

    long a() {
        return this.c;
    }

    public void addListener(StreamingListener streamingListener) {
        try {
            addListenerNative(this.c, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void createPlaybackSession() {
        try {
            createPlaybackSessionNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.c);
            this.c = 0L;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof StreamingAnalytics) && ((StreamingAnalytics) obj).c == this.c;
    }

    public StreamingConfiguration getConfiguration() {
        return this.d;
    }

    public StreamingExtendedAnalytics getExtendedAnalytics() {
        if (this.e == null) {
            synchronized (this.b) {
                try {
                    if (this.e == null) {
                        this.e = new StreamingExtendedAnalytics(this);
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public String getPlaybackSessionId() {
        try {
            return getPlaybackSessionIdNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return null;
        }
    }

    public void loopPlaybackSession() {
        try {
            loopPlaybackSessionNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyBufferStart() {
        try {
            notifyBufferStartNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyBufferStop() {
        try {
            notifyBufferStopNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangePlaybackRate(float f) {
        try {
            notifyChangePlaybackRateNative(this.c, f);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyEnd() {
        try {
            notifyEndNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyPause() {
        try {
            notifyPauseNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyPlay() {
        try {
            notifyPlayNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifySeekStart() {
        try {
            notifySeekStartNative(this.c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeListener(StreamingListener streamingListener) {
        try {
            removeListenerNative(this.c, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setDvrWindowLength(long j) {
        try {
            setDvrWindowLengthNative(this.c, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setImplementationId(String str) {
        try {
            setImplementationIdNative(this.c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setMediaPlayerName(String str) {
        try {
            setMediaPlayerNameNative(this.c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setMediaPlayerVersion(String str) {
        try {
            setMediaPlayerVersionNative(this.c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setMetadata(AssetMetadata assetMetadata) {
        if (assetMetadata == null) {
            return;
        }
        try {
            setMetadataNative(this.c, assetMetadata.a());
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setProjectId(String str) {
        try {
            setProjectIdNative(this.c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromDvrWindowOffset(long j) {
        try {
            startFromDvrWindowOffsetNative(this.c, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromPosition(long j) {
        try {
            startFromPositionNative(this.c, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromSegment(int i) {
        try {
            startFromSegmentNative(this.c, i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public StreamingAnalytics(StreamingConfiguration streamingConfiguration) {
        this.b = new Object();
        this.c = 0L;
        streamingConfiguration = streamingConfiguration == null ? new StreamingConfiguration.Builder().build() : streamingConfiguration;
        this.d = streamingConfiguration;
        try {
            this.c = newCppInstanceNative(streamingConfiguration.b());
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
