package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class l5c extends cq9 implements dtd {
    l5c(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // defpackage.dtd
    public final void q5(String str, Bundle bundle, w0f w0fVar) {
        Parcel O = O();
        O.writeString(str);
        bbb.c(O, bundle);
        bbb.d(O, w0fVar);
        Q1(2, O);
    }
}
