package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Stacktraces {
    private final String context;
    private String flutterStacktrace;
    private String javascriptStacktrace;
    private List<String> jvmStacktrace;
    private final String library;
    private String unityStacktrace;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Embrace.AppFramework.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Embrace.AppFramework.REACT_NATIVE.ordinal()] = 1;
            int[] iArr2 = new int[Embrace.AppFramework.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[Embrace.AppFramework.UNITY.ordinal()] = 1;
            int[] iArr3 = new int[Embrace.AppFramework.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[Embrace.AppFramework.FLUTTER.ordinal()] = 1;
        }
    }

    public Stacktraces() {
        this(null, null, null, null, null, 31, null);
    }

    @bt3(name = QueryKeys.VISIT_FREQUENCY)
    public static /* synthetic */ void getFlutterStacktrace$annotations() {
    }

    @bt3(name = "jsk")
    public static /* synthetic */ void getJavascriptStacktrace$annotations() {
    }

    @bt3(name = "tt")
    public static /* synthetic */ void getJvmStacktrace$annotations() {
    }

    @bt3(name = QueryKeys.USER_ID)
    public static /* synthetic */ void getUnityStacktrace$annotations() {
    }

    public final String getContext() {
        return this.context;
    }

    public final String getFlutterStacktrace() {
        return this.flutterStacktrace;
    }

    public final String getJavascriptStacktrace() {
        return this.javascriptStacktrace;
    }

    public final List<String> getJvmStacktrace() {
        return this.jvmStacktrace;
    }

    public final String getLibrary() {
        return this.library;
    }

    public final String getUnityStacktrace() {
        return this.unityStacktrace;
    }

    public final void setFlutterStacktrace(String str) {
        this.flutterStacktrace = str;
    }

    public final void setJavascriptStacktrace(String str) {
        this.javascriptStacktrace = str;
    }

    public final void setJvmStacktrace(List<String> list) {
        this.jvmStacktrace = list;
    }

    public final void setUnityStacktrace(String str) {
        this.unityStacktrace = str;
    }

    public Stacktraces(List<String> list) {
        this(list, null, null, null, null, 30, null);
    }

    public Stacktraces(List<String> list, String str) {
        this(list, str, null, null, null, 28, null);
    }

    public Stacktraces(List<String> list, String str, Embrace.AppFramework appFramework) {
        this(list, str, appFramework, null, null, 24, null);
    }

    public Stacktraces(List<String> list, String str, Embrace.AppFramework appFramework, @bt3(name = "c") String str2) {
        this(list, str, appFramework, str2, null, 16, null);
    }

    public Stacktraces(List<String> list, String str, Embrace.AppFramework appFramework, @bt3(name = "c") String str2, @bt3(name = "l") String str3) {
        zq3.h(appFramework, "framework");
        this.context = str2;
        this.library = str3;
        this.javascriptStacktrace = WhenMappings.$EnumSwitchMapping$0[appFramework.ordinal()] != 1 ? null : str;
        this.unityStacktrace = WhenMappings.$EnumSwitchMapping$1[appFramework.ordinal()] != 1 ? null : str;
        this.flutterStacktrace = WhenMappings.$EnumSwitchMapping$2[appFramework.ordinal()] != 1 ? null : str;
        this.jvmStacktrace = str != null ? null : list;
    }

    public /* synthetic */ Stacktraces(List list, String str, Embrace.AppFramework appFramework, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? Embrace.AppFramework.NATIVE : appFramework, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
