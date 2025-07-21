package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class bie extends ala implements w0f {
    public bie() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // defpackage.ala
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) bbb.a(parcel, Bundle.CREATOR);
        bbb.b(parcel);
        k0(bundle);
        return true;
    }
}
