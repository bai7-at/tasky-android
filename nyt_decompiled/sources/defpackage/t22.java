package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t22 {
    public static final a d = new a(null);
    private String a;
    private String b;
    private Long c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t22(String str) {
        this.c = Long.valueOf(System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.c;
        if (l == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        zq3.g(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public final void a() {
        km3 km3Var = km3.a;
        km3.d(this.a);
    }

    public final int b(t22 t22Var) {
        zq3.h(t22Var, "data");
        Long l = this.c;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = t22Var.c;
        if (l2 == null) {
            return 1;
        }
        return zq3.k(l2.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.b == null || this.c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            km3 km3Var = km3.a;
            km3.s(this.a, toString());
        }
    }

    public String toString() {
        JSONObject c = c();
        if (c == null) {
            return super.toString();
        }
        String jSONObject = c.toString();
        zq3.g(jSONObject, "params.toString()");
        return jSONObject;
    }

    public t22(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        String name = file.getName();
        zq3.g(name, "file.name");
        this.a = name;
        JSONObject q = km3.q(name, true);
        if (q != null) {
            this.c = Long.valueOf(q.optLong("timestamp", 0L));
            this.b = q.optString("error_message", null);
        }
    }
}
