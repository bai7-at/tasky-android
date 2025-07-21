package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zoa {
    private final int a;
    private final String b;
    private final Object c;

    /* synthetic */ zoa(int i, String str, Object obj, yoa yoaVar) {
        this.a = i;
        this.b = str;
        this.c = obj;
        pla.a().d(this);
    }

    public static zoa f(int i, String str, float f) {
        return new woa(1, str, Float.valueOf(f));
    }

    public static zoa g(int i, String str, int i2) {
        return new uoa(1, str, Integer.valueOf(i2));
    }

    public static zoa h(int i, String str, long j) {
        return new voa(1, str, Long.valueOf(j));
    }

    public static zoa i(int i, String str, Boolean bool) {
        return new toa(i, str, bool);
    }

    public static zoa j(int i, String str, String str2) {
        return new xoa(1, str, str2);
    }

    public static zoa k(int i, String str) {
        zoa j = j(1, "gads:sdk_core_constants:experiment_id", null);
        pla.a().c(j);
        return j;
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.a;
    }

    public final Object l() {
        return pla.c().a(this);
    }

    public final Object m() {
        return this.c;
    }

    public final String n() {
        return this.b;
    }
}
