package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class StreamingConfiguration extends CppJavaBinder {
    private long b;
    private WeakHashMap<String, StreamingPublisherConfiguration> c;
    private final Object d;

    public static class Builder extends CppJavaBinder {
        long b;

        public Builder() {
            this.b = 0L;
            try {
                this.b = StreamingConfiguration.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder autoResumeStateOnAssetChange(boolean z) {
            try {
                StreamingConfiguration.autoResumeStateOnAssetChangeNative(this.b, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public StreamingConfiguration build() {
            try {
                return new StreamingConfiguration(StreamingConfiguration.buildNative(this.b));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new StreamingConfiguration(0L);
            }
        }

        public Builder customStartMinimumPlayback(long j) {
            try {
                StreamingConfiguration.customStartMinimumPlaybackNative(this.b, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        protected void destroyCppObject() {
            try {
                StreamingConfiguration.destroyCppInstanceBuilderNative(this.b);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder heartbeatIntervals(List<Map<String, Long>> list) {
            if (list == null) {
                return this;
            }
            Iterator<Map<String, Long>> it2 = list.iterator();
            while (it2.hasNext()) {
                for (Map.Entry<String, Long> entry : it2.next().entrySet()) {
                    if (!(entry.getKey() instanceof String) || !(entry.getValue() instanceof Long)) {
                        throw new IllegalArgumentException("intervals must be and object of type ArrayList<HashMap<String, Long>>");
                    }
                }
            }
            try {
                StreamingConfiguration.heartbeatIntervalsNative(this.b, list);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder heartbeatMeasurement(boolean z) {
            try {
                StreamingConfiguration.heartbeatMeasurementNative(this.b, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder includedPublishers(List<String> list) {
            try {
                StreamingConfiguration.includedPublishersNative(this.b, list);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder keepAliveInterval(long j) {
            try {
                StreamingConfiguration.keepAliveIntervalNative(this.b, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder keepAliveMeasurement(boolean z) {
            try {
                StreamingConfiguration.keepAliveMeasurementNative(this.b, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder labels(Map<String, String> map) {
            try {
                StreamingConfiguration.labelsNative(this.b, map);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder pauseOnBuffering(boolean z) {
            try {
                StreamingConfiguration.pauseOnBufferingNative(this.b, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder pauseOnBufferingInterval(long j) {
            try {
                StreamingConfiguration.pauseOnBufferingIntervalNative(this.b, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder playbackIntervalMergeTolerance(long j) {
            try {
                StreamingConfiguration.playbackIntervalMergeToleranceNative(this.b, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder includedPublishers(String... strArr) {
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            includedPublishers(arrayList);
            return this;
        }
    }

    private StreamingConfiguration(long j) {
        this.d = new Object();
        this.b = j;
        this.c = new WeakHashMap<>();
    }

    private native void addLabelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void autoResumeStateOnAssetChangeNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j);

    private native long copyNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customStartMinimumPlaybackNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void heartbeatIntervalsNative(long j, List<Map<String, Long>> list);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void heartbeatMeasurementNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void includedPublishersNative(long j, List<String> list);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void keepAliveIntervalNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void keepAliveMeasurementNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void labelsNative(long j, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void pauseOnBufferingIntervalNative(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void pauseOnBufferingNative(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void playbackIntervalMergeToleranceNative(long j, long j2);

    private native void removeAllLabelsNative(long j);

    private native void removeLabelNative(long j, String str);

    private native void setLabelNative(long j, String str, String str2);

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.b, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    long b() {
        return this.b;
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.b);
            this.b = 0L;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public StreamingPublisherConfiguration getStreamingPublisherConfiguration(String str) {
        synchronized (this.d) {
            try {
                StreamingPublisherConfiguration streamingPublisherConfiguration = this.c.get(str);
                if (streamingPublisherConfiguration != null) {
                    return streamingPublisherConfiguration;
                }
                StreamingPublisherConfiguration streamingPublisherConfiguration2 = new StreamingPublisherConfiguration(this, str);
                this.c.put(str, streamingPublisherConfiguration2);
                return streamingPublisherConfiguration2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllLabels() {
        try {
            removeAllLabelsNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        try {
            setLabelNative(this.b, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public StreamingConfiguration(StreamingConfiguration streamingConfiguration) {
        this.b = 0L;
        this.d = new Object();
        try {
            this.b = copyNative(streamingConfiguration.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
