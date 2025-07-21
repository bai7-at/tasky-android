package com.comscore.streaming;

import com.comscore.util.ArrayUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public class StreamingExtendedAnalytics extends CppJavaBinder {
    private WeakReference<StreamingAnalytics> b;

    StreamingExtendedAnalytics(StreamingAnalytics streamingAnalytics) {
        this.b = new WeakReference<>(streamingAnalytics);
    }

    private StreamingAnalytics a() {
        StreamingAnalytics streamingAnalytics = this.b.get();
        if (streamingAnalytics != null) {
            return streamingAnalytics;
        }
        throw new IllegalStateException("Class " + StreamingExtendedAnalytics.class.getName() + " was created by " + StreamingAnalytics.class.getName() + " but the creator instance is not allocated in memory.");
    }

    private native void notifyCallToActionNative(long j, Map<String, String> map);

    private native void notifyChangeAudioTrackNative(long j, String str, Map<String, String> map);

    private native void notifyChangeBitrateNative(long j, int i, Map<String, String> map);

    private native void notifyChangeCdnNative(long j, String str, Map<String, String> map);

    private native void notifyChangeSubtitleTrackNative(long j, String str, Map<String, String> map);

    private native void notifyChangeVideoTrackNative(long j, String str, Map<String, String> map);

    private native void notifyChangeVolumeNative(long j, float f, Map<String, String> map);

    private native void notifyChangeWindowStateNative(long j, int i, Map<String, String> map);

    private native void notifyCustomEventNative(long j, String str, Map<String, String> map);

    private native void notifyDrmApproveNative(long j, Map<String, String> map);

    private native void notifyDrmDenyNative(long j, Map<String, String> map);

    private native void notifyDrmFailNative(long j, Map<String, String> map);

    private native void notifyEngageNative(long j, Map<String, String> map);

    private native void notifyErrorNative(long j, String str, Map<String, String> map);

    private native void notifyLoadNative(long j, Map<String, String> map);

    private native void notifySkipAdNative(long j, Map<String, String> map);

    private native void notifyTransferPlaybackNative(long j, String str, Map<String, String> map);

    private native void setLoadTimeOffsetNative(long j, long j2);

    private native void setPlaybackSessionExpectedLengthNative(long j, long j2);

    private native void setPlaybackSessionExpectedNumberOfItemsNative(long j, int i);

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
    }

    public void notifyCallToAction() {
        notifyCallToAction(null);
    }

    public void notifyChangeAudioTrack(String str) {
        notifyChangeAudioTrack(str, null);
    }

    public void notifyChangeBitrate(int i) {
        notifyChangeBitrate(i, null);
    }

    public void notifyChangeCdn(String str) {
        notifyChangeCdn(str, null);
    }

    public void notifyChangeSubtitleTrack(String str) {
        notifyChangeSubtitleTrack(str, null);
    }

    public void notifyChangeVideoTrack(String str) {
        notifyChangeVideoTrack(str, null);
    }

    public void notifyChangeVolume(float f) {
        notifyChangeVolume(f, null);
    }

    public void notifyChangeWindowState(int i) {
        notifyChangeWindowState(i, null);
    }

    public void notifyCustomEvent(String str) {
        notifyCustomEvent(str, null);
    }

    public void notifyDrmApprove() {
        notifyDrmApprove(null);
    }

    public void notifyDrmDeny() {
        notifyDrmDeny(null);
    }

    public void notifyDrmFail() {
        notifyDrmFail(null);
    }

    public void notifyEngage() {
        notifyEngage(null);
    }

    public void notifyError(String str) {
        notifyError(str, null);
    }

    public void notifyLoad() {
        notifyLoad(null);
    }

    public void notifySkipAd() {
        notifySkipAd(null);
    }

    public void notifyTransferPlayback(String str) {
        notifyTransferPlayback(str, null);
    }

    public void setLoadTimeOffset(long j) {
        try {
            setLoadTimeOffsetNative(a().a(), j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPlaybackSessionExpectedLength(long j) {
        try {
            setPlaybackSessionExpectedLengthNative(a().a(), j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPlaybackSessionExpectedNumberOfItems(int i) {
        try {
            setPlaybackSessionExpectedNumberOfItemsNative(a().a(), i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyCallToAction(Map<String, String> map) {
        try {
            notifyCallToActionNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeAudioTrack(String str, Map<String, String> map) {
        try {
            notifyChangeAudioTrackNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeBitrate(int i, Map<String, String> map) {
        try {
            notifyChangeBitrateNative(a().a(), i, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeCdn(String str, Map<String, String> map) {
        try {
            notifyChangeCdnNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeSubtitleTrack(String str, Map<String, String> map) {
        try {
            notifyChangeSubtitleTrackNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeVideoTrack(String str, Map<String, String> map) {
        try {
            notifyChangeVideoTrackNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeVolume(float f, Map<String, String> map) {
        try {
            notifyChangeVolumeNative(a().a(), f, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangeWindowState(int i, Map<String, String> map) {
        if (ArrayUtils.contains(WindowState.ALLOWED_VALUES, i)) {
            try {
                notifyChangeWindowStateNative(a().a(), i, map);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void notifyCustomEvent(String str, Map<String, String> map) {
        try {
            notifyCustomEventNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyDrmApprove(Map<String, String> map) {
        try {
            notifyDrmApproveNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyDrmDeny(Map<String, String> map) {
        try {
            notifyDrmDenyNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyDrmFail(Map<String, String> map) {
        try {
            notifyDrmFailNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyEngage(Map<String, String> map) {
        try {
            notifyEngageNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyError(String str, Map<String, String> map) {
        try {
            notifyErrorNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyLoad(Map<String, String> map) {
        try {
            notifyLoadNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifySkipAd(Map<String, String> map) {
        try {
            notifySkipAdNative(a().a(), map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyTransferPlayback(String str, Map<String, String> map) {
        try {
            notifyTransferPlaybackNative(a().a(), str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
