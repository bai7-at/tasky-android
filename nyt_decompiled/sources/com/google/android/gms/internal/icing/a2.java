package com.google.android.gms.internal.icing;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a2 {
    private final String a;
    private String b;
    private boolean c;
    private boolean d;
    private final List e = new ArrayList();
    private String f;

    public a2(String str) {
        this.a = str;
    }

    public final a2 a(String str) {
        this.b = "blob";
        return this;
    }

    public final a2 b(boolean z) {
        this.c = true;
        return this;
    }

    public final a2 c(boolean z) {
        this.d = true;
        return this;
    }

    public final a2 d(String str) {
        this.f = str;
        return this;
    }

    public final zzs e() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        List list = this.e;
        return new zzs(str, str2, z, 1, z2, null, (zzm[]) list.toArray(new zzm[list.size()]), this.f, null);
    }
}
