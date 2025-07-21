package defpackage;

import com.squareup.moshi.JsonAdapter;

/* loaded from: classes4.dex */
public final class cc3 implements ba2 {
    private final p76 a;

    public cc3(p76 p76Var) {
        this.a = p76Var;
    }

    public static cc3 a(p76 p76Var) {
        return new cc3(p76Var);
    }

    public static bc3 c(JsonAdapter jsonAdapter) {
        return new bc3(jsonAdapter);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bc3 get() {
        return c((JsonAdapter) this.a.get());
    }
}
