package com.google.android.gms.internal.icing;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class b1 {
    private List a;
    private String b;
    private boolean c;
    private Account d;

    public final b1 a(zzk zzkVar) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(zzkVar);
        return this;
    }

    public final b1 b(String str) {
        this.b = str;
        return this;
    }

    public final b1 c(boolean z) {
        this.c = true;
        return this;
    }

    public final b1 d(Account account) {
        this.d = account;
        return this;
    }

    public final zzg e() {
        String str = this.b;
        boolean z = this.c;
        Account account = this.d;
        List list = this.a;
        return new zzg(str, z, account, list != null ? (zzk[]) list.toArray(new zzk[list.size()]) : null);
    }
}
