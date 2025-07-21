package defpackage;

import com.nytimes.android.utils.retrofitutils.NetworkResultCall;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* loaded from: classes4.dex */
public final class v45 implements CallAdapter {
    private final Type a;

    public v45(Type type2) {
        zq3.h(type2, "resultType");
        this.a = type2;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkResultCall adapt(Call call) {
        zq3.h(call, "call");
        return new NetworkResultCall(call);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.a;
    }
}
