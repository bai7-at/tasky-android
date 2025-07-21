package defpackage;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class zm1 implements Converter {
    private final ym1 a;
    private final qk7 b;

    public zm1(ym1 ym1Var, qk7 qk7Var) {
        zq3.h(ym1Var, "loader");
        zq3.h(qk7Var, "serializer");
        this.a = ym1Var;
        this.b = qk7Var;
    }

    @Override // retrofit2.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(ResponseBody responseBody) {
        zq3.h(responseBody, "value");
        return this.b.a(this.a, responseBody);
    }
}
