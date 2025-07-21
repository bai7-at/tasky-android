package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.nq0;
import defpackage.u34;
import java.util.List;
import kotlin.collections.i;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nq0> getComponents() {
        return i.e(u34.b("fire-cls-ktx", "18.2.10"));
    }
}
