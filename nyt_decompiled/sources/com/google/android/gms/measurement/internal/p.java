package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final zzau f;

    p(a5 a5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            a5Var.o().v().b("Event created with reverse previous/current timestamps. appId", x3.y(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next == null) {
                    a5Var.o().n().a("Param name can't be null");
                    it2.remove();
                } else {
                    Object k = a5Var.M().k(next, bundle2.get(next));
                    if (k == null) {
                        a5Var.o().v().b("Param value can't be null", a5Var.C().e(next));
                        it2.remove();
                    } else {
                        a5Var.M().B(bundle2, next, k);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        }
        this.f = zzauVar;
    }

    final p a(a5 a5Var, long j) {
        return new p(a5Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.b + "', params=" + this.f.toString() + "}";
    }

    private p(a5 a5Var, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            a5Var.o().v().c("Event created with reverse previous/current timestamps. appId, name", x3.y(str2), x3.y(str3));
        }
        this.f = zzauVar;
    }
}
