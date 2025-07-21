package com.facebook.internal.instrument;

import android.os.Build;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.g29;
import defpackage.km3;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class InstrumentData {
    public static final b h = new b(null);
    private String a;
    private Type b;
    private JSONArray c;
    private String d;
    private String e;
    private String f;
    private Long g;

    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Type.valuesCustom().length];
                iArr[Type.Analysis.ordinal()] = 1;
                iArr[Type.AnrReport.ordinal()] = 2;
                iArr[Type.CrashReport.ordinal()] = 3;
                iArr[Type.CrashShield.ordinal()] = 4;
                iArr[Type.ThreadCheck.ordinal()] = 5;
                a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String getLogPrefix() {
            int i = a.a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = a.a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final InstrumentData a(String str, String str2) {
            return new InstrumentData(str, str2, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData b(Throwable th, Type type2) {
            zq3.h(type2, QueryKeys.TOKEN);
            return new InstrumentData(th, type2, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData c(JSONArray jSONArray) {
            zq3.h(jSONArray, "features");
            return new InstrumentData(jSONArray, (DefaultConstructorMarker) null);
        }

        public static final InstrumentData d(File file) {
            zq3.h(file, TransferTable.COLUMN_FILE);
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type b(String str) {
            return h.K(str, "crash_log_", false, 2, null) ? Type.CrashReport : h.K(str, "shield_log_", false, 2, null) ? Type.CrashShield : h.K(str, "thread_check_log_", false, 2, null) ? Type.ThreadCheck : h.K(str, "analysis_log_", false, 2, null) ? Type.Analysis : h.K(str, "anr_log_", false, 2, null) ? Type.AnrReport : Type.Unknown;
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            iArr[Type.Analysis.ordinal()] = 1;
            iArr[Type.AnrReport.ordinal()] = 2;
            iArr[Type.CrashReport.ordinal()] = 3;
            iArr[Type.CrashShield.ordinal()] = 4;
            iArr[Type.ThreadCheck.ordinal()] = 5;
            a = iArr;
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            Type type2 = this.b;
            if (type2 != null) {
                jSONObject.put(TransferTable.COLUMN_TYPE, type2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        Type type2 = this.b;
        int i = type2 == null ? -1 : c.a[type2.ordinal()];
        if (i == 1) {
            return c();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        km3 km3Var = km3.a;
        km3.d(this.a);
    }

    public final int b(InstrumentData instrumentData) {
        zq3.h(instrumentData, "data");
        Long l = this.g;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = instrumentData.g;
        if (l2 == null) {
            return 1;
        }
        return zq3.k(l2.longValue(), longValue);
    }

    public final boolean f() {
        Type type2 = this.b;
        int i = type2 == null ? -1 : c.a[type2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if ((i != 3 && i != 4 && i != 5) || this.f == null || this.g == null) {
                    return false;
                }
            } else if (this.f == null || this.e == null || this.g == null) {
                return false;
            }
        } else if (this.c == null || this.g == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            km3 km3Var = km3.a;
            km3.s(this.a, toString());
        }
    }

    public String toString() {
        JSONObject e = e();
        if (e == null) {
            String jSONObject = new JSONObject().toString();
            zq3.g(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = e.toString();
        zq3.g(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type2);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.b = Type.Analysis;
        this.g = Long.valueOf(System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        this.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        zq3.g(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    private InstrumentData(Throwable th, Type type2) {
        this.b = type2;
        this.d = g29.v();
        this.e = km3.e(th);
        this.f = km3.h(th);
        this.g = Long.valueOf(System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type2.getLogPrefix());
        stringBuffer.append(String.valueOf(this.g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        zq3.g(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.a = stringBuffer2;
    }

    private InstrumentData(String str, String str2) {
        this.b = Type.AnrReport;
        this.d = g29.v();
        this.e = str;
        this.f = str2;
        this.g = Long.valueOf(System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        zq3.g(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    private InstrumentData(File file) {
        String name = file.getName();
        zq3.g(name, "file.name");
        this.a = name;
        this.b = h.b(name);
        km3 km3Var = km3.a;
        JSONObject q = km3.q(this.a, true);
        if (q != null) {
            this.g = Long.valueOf(q.optLong("timestamp", 0L));
            this.d = q.optString("app_version", null);
            this.e = q.optString("reason", null);
            this.f = q.optString("callstack", null);
            this.c = q.optJSONArray("feature_names");
        }
    }
}
