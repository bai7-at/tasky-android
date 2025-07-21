package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.hybrid.bridge.BridgeCache;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public final class lc0 implements ba2 {
    private final p76 a;
    private final p76 b;

    public lc0(p76 p76Var, p76 p76Var2) {
        this.a = p76Var;
        this.b = p76Var2;
    }

    public static lc0 a(p76 p76Var, p76 p76Var2) {
        return new lc0(p76Var, p76Var2);
    }

    public static BridgeCache c(SharedPreferences sharedPreferences, i iVar) {
        return new BridgeCache(sharedPreferences, iVar);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BridgeCache get() {
        return c((SharedPreferences) this.a.get(), (i) this.b.get());
    }
}
