package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeCrash {
    private final String crashMessage;
    private final Integer crashNumber;
    private final List<NativeCrashDataError> errors;
    private final String id;
    private final String map;
    private final Map<String, String> symbols;
    private final Integer unwindError;

    public NativeCrash(@bt3(name = "id") String str, @bt3(name = "m") String str2, @bt3(name = "sb") Map<String, String> map, @bt3(name = "er") List<NativeCrashDataError> list, @bt3(name = "ue") Integer num, @bt3(name = "ma") String str3, @bt3(name = "crash_number") Integer num2) {
        this.id = str;
        this.crashMessage = str2;
        this.symbols = map;
        this.errors = list;
        this.unwindError = num;
        this.map = str3;
        this.crashNumber = num2;
    }

    public final String getCrashMessage() {
        return this.crashMessage;
    }

    public final Integer getCrashNumber() {
        return this.crashNumber;
    }

    public final List<NativeCrashDataError> getErrors() {
        return this.errors;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMap() {
        return this.map;
    }

    public final Map<String, String> getSymbols() {
        return this.symbols;
    }

    public final Integer getUnwindError() {
        return this.unwindError;
    }

    public /* synthetic */ NativeCrash(String str, String str2, Map map, List list, Integer num, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, list, num, str3, (i & 64) != 0 ? null : num2);
    }
}
