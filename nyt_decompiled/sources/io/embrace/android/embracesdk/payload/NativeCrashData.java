package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeCrashData {
    private final String appState;
    private final String crash;
    private List<NativeCrashDataError> errors;
    private String map;
    private final NativeCrashMetadata metadata;
    private final String nativeCrashId;
    private final String sessionId;
    private Map<String, String> symbols;
    private final long timestamp;
    private final Integer unwindError;

    public NativeCrashData(@bt3(name = "report_id") String str, @bt3(name = "sid") String str2, @bt3(name = "ts") long j, @bt3(name = "state") String str3, @bt3(name = "meta") NativeCrashMetadata nativeCrashMetadata, @bt3(name = "ue") Integer num, @bt3(name = "crash") String str4, @bt3(name = "symbols") Map<String, String> map, @bt3(name = "errors") List<NativeCrashDataError> list, @bt3(name = "map") String str5) {
        zq3.h(str, "nativeCrashId");
        zq3.h(str2, "sessionId");
        this.nativeCrashId = str;
        this.sessionId = str2;
        this.timestamp = j;
        this.appState = str3;
        this.metadata = nativeCrashMetadata;
        this.unwindError = num;
        this.crash = str4;
        this.symbols = map;
        this.errors = list;
        this.map = str5;
    }

    public final String getAppState() {
        return this.appState;
    }

    public final NativeCrash getCrash(int i) {
        return new NativeCrash(this.nativeCrashId, this.crash, this.symbols, this.errors, this.unwindError, this.map, Integer.valueOf(i));
    }

    public final String getCrash$embrace_android_sdk_release() {
        return this.crash;
    }

    public final List<NativeCrashDataError> getErrors() {
        return this.errors;
    }

    public final String getMap() {
        return this.map;
    }

    public final NativeCrashMetadata getMetadata() {
        return this.metadata;
    }

    public final String getNativeCrashId() {
        return this.nativeCrashId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Map<String, String> getSymbols() {
        return this.symbols;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Integer getUnwindError() {
        return this.unwindError;
    }

    public final void setErrors(List<NativeCrashDataError> list) {
        this.errors = list;
    }

    public final void setMap(String str) {
        this.map = str;
    }

    public final void setSymbols(Map<String, String> map) {
        this.symbols = map;
    }
}
