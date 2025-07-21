package com.google.android.gms.internal.ads;

import defpackage.b2f;
import defpackage.z1f;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zi {
    private final ArrayDeque a = new ArrayDeque();

    /* synthetic */ zi(z1f z1fVar) {
    }

    static /* bridge */ /* synthetic */ zzgyl a(zi ziVar, zzgyl zzgylVar, zzgyl zzgylVar2) {
        ziVar.b(zzgylVar);
        ziVar.b(zzgylVar2);
        zzgyl zzgylVar3 = (zzgyl) ziVar.a.pop();
        while (!ziVar.a.isEmpty()) {
            zzgylVar3 = new zzhbx((zzgyl) ziVar.a.pop(), zzgylVar3);
        }
        return zzgylVar3;
    }

    private final void b(zzgyl zzgylVar) {
        b2f b2fVar;
        if (!zzgylVar.n()) {
            if (!(zzgylVar instanceof zzhbx)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgylVar.getClass())));
            }
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            b(zzhbxVar.zzd);
            b(zzhbxVar.zze);
            return;
        }
        int c = c(zzgylVar.g());
        ArrayDeque arrayDeque = this.a;
        int M = zzhbx.M(c + 1);
        if (arrayDeque.isEmpty() || ((zzgyl) this.a.peek()).g() >= M) {
            this.a.push(zzgylVar);
            return;
        }
        int M2 = zzhbx.M(c);
        zzgyl zzgylVar2 = (zzgyl) this.a.pop();
        while (true) {
            b2fVar = null;
            if (this.a.isEmpty() || ((zzgyl) this.a.peek()).g() >= M2) {
                break;
            } else {
                zzgylVar2 = new zzhbx((zzgyl) this.a.pop(), zzgylVar2);
            }
        }
        zzhbx zzhbxVar2 = new zzhbx(zzgylVar2, zzgylVar);
        while (!this.a.isEmpty()) {
            int c2 = c(zzhbxVar2.g()) + 1;
            ArrayDeque arrayDeque2 = this.a;
            if (((zzgyl) arrayDeque2.peek()).g() >= zzhbx.M(c2)) {
                break;
            } else {
                zzhbxVar2 = new zzhbx((zzgyl) this.a.pop(), zzhbxVar2);
            }
        }
        this.a.push(zzhbxVar2);
    }

    private static final int c(int i) {
        int binarySearch = Arrays.binarySearch(zzhbx.d, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
