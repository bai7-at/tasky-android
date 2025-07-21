package defpackage;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class ok7 implements Converter {
    private final MediaType a;
    private final nk7 b;
    private final qk7 c;

    public ok7(MediaType mediaType, nk7 nk7Var, qk7 qk7Var) {
        zq3.h(mediaType, "contentType");
        zq3.h(nk7Var, "saver");
        zq3.h(qk7Var, "serializer");
        this.a = mediaType;
        this.b = nk7Var;
        this.c = qk7Var;
    }

    @Override // retrofit2.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(Object obj) {
        return this.c.d(this.a, this.b, obj);
    }
}
