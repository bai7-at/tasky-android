package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class i2f extends ContentObserver {
    final /* synthetic */ o2f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i2f(o2f o2fVar, Handler handler) {
        super(null);
        this.a = o2fVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
