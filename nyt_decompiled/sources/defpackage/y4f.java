package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class y4f extends ContentObserver {
    y4f(z4f z4fVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        d6f.d();
    }
}
