package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes3.dex */
final class k5g implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ k6g a;

    k5g(m5g m5gVar, k6g k6gVar) {
        this.a = k6gVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.v();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.v();
    }
}
