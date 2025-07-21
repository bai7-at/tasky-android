package defpackage;

import com.datadog.android.api.context.NetworkInfo;

/* loaded from: classes2.dex */
public final class w35 implements pk7 {
    @Override // defpackage.pk7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String serialize(NetworkInfo networkInfo) {
        zq3.h(networkInfo, "model");
        String jsonElement = networkInfo.g().getAsJsonObject().toString();
        zq3.g(jsonElement, "model.toJson().asJsonObject.toString()");
        return jsonElement;
    }
}
