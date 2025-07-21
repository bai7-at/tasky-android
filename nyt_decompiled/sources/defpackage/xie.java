package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class xie {
    private final int a;
    private final String b;
    private final Object c;

    /* synthetic */ xie(int i, String str, Object obj, rie rieVar) {
        this.a = i;
        this.b = str;
        this.c = obj;
        lee.a().b(this);
    }

    public static xie e(int i, String str, float f) {
        return new mhe(1, str, Float.valueOf(f));
    }

    public static xie f(int i, String str, int i2) {
        return new nge(1, str, Integer.valueOf(i2));
    }

    public static xie g(int i, String str, long j) {
        return new jhe(1, str, Long.valueOf(j));
    }

    public static xie h(int i, String str, Boolean bool) {
        return new nfe(i, str, bool);
    }

    public static xie i(int i, String str, String str2) {
        return new oie(1, str, str2);
    }

    public static xie j(int i, String str) {
        xie i2 = i(1, "gads:sdk_core_constants:experiment_id", null);
        lee.a().a(i2);
        return i2;
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.a;
    }

    public final Object k() {
        return this.c;
    }

    public final String l() {
        return this.b;
    }
}
