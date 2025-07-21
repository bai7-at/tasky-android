package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaig;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class JavaScriptMsgData {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public AdImpl adData;
    public double adPeriodDuration;

    @KeepForSdk
    public AdPodInfoImpl adPodInfo;
    public int adPosition;

    @KeepForSdk
    public long adTimeUpdateMs;
    public long appSetIdTimeoutMs;

    @KeepForSdk
    public double bufferedTime;
    public Map<String, CompanionData> companions;

    @KeepForSdk
    public List<CuePointData> cuepoints;
    public double currentTime;
    public boolean disableAppSetId;
    public double duration;
    public boolean enableGks;
    public boolean enableInstrumentation;
    public boolean enableTrustlessGksBc;
    public boolean enableTrustlessGksDai;
    public int errorCode;
    public String errorMessage;
    public Integer espAdapterTimeoutMs;
    public List<String> espAdapters;
    public String eventId;
    public List<String> gksFirstPartyAdServers;
    public int gksTimeoutMs;
    public List<zzbb> iconClickFallbackImages;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public String ln;

    @KeepForSdk
    public LogData logData;
    public String m;
    public boolean monitorAppLifecycle;
    public String n;
    public NetworkRequestData networkRequest;
    public Integer platformSignalCollectorTimeoutMs;
    public String queryId;
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public boolean useAndroidAdshieldV2;

    @KeepForSdk
    public String vastEvent;
    public String videoUrl;

    public static class LogData {
        public int errorCode;
        public String errorMessage;
        public String innerError;

        /* renamed from: type, reason: collision with root package name */
        public String f40type;

        public Map<String, String> constructMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(TransferTable.COLUMN_TYPE, this.f40type);
            hashMap.put("errorCode", String.valueOf(this.errorCode));
            hashMap.put("errorMessage", this.errorMessage);
            String str = this.innerError;
            if (str != null) {
                hashMap.put("innerError", str);
            }
            return hashMap;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return zzaie.zzf(this, obj, false, null, false, new String[0]);
        }

        public int hashCode() {
            return zzaig.zza(this, new String[0]);
        }

        public String toString() {
            return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", this.f40type, Integer.valueOf(this.errorCode), this.errorMessage, this.innerError);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, new String[0]);
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JavaScriptMsgData[");
        for (Field field : JavaScriptMsgData.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb.append(field.getName());
                sb.append(":");
                sb.append(obj);
                sb.append(",");
            } catch (IllegalAccessException e) {
                Log.e("IMASDK", "IllegalAccessException occurred", e);
            } catch (IllegalArgumentException e2) {
                Log.e("IMASDK", "IllegalArgumentException occurred", e2);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
