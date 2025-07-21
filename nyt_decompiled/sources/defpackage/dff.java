package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dff {
    private Bundle a = new Bundle();
    private List b = new ArrayList();
    private boolean c = false;
    private int d = -1;
    private final Bundle e = new Bundle();
    private final Bundle f = new Bundle();
    private final List g = new ArrayList();
    private int h = -1;
    private String i = null;
    private final List j = new ArrayList();
    private int k = 60000;
    private final int l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    public final zzl a() {
        Bundle bundle = this.e;
        Bundle bundle2 = this.a;
        Bundle bundle3 = this.f;
        return new zzl(8, -1L, bundle2, -1, this.b, this.c, this.d, false, null, null, null, null, bundle, bundle3, this.g, null, null, false, null, this.h, this.i, this.j, this.k, null, this.l);
    }

    public final dff b(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public final dff c(int i) {
        this.k = i;
        return this;
    }

    public final dff d(boolean z) {
        this.c = z;
        return this;
    }

    public final dff e(List list) {
        this.b = list;
        return this;
    }

    public final dff f(String str) {
        this.i = str;
        return this;
    }

    public final dff g(int i) {
        this.d = i;
        return this;
    }

    public final dff h(int i) {
        this.h = i;
        return this;
    }
}
