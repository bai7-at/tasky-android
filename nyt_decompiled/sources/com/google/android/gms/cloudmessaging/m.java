package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class m extends l {
    m(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.l
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.l
    final boolean b() {
        return false;
    }
}
