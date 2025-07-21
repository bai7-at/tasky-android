package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import com.comscore.streaming.AdvertisementType;
import defpackage.a2f;
import defpackage.yze;
import defpackage.zze;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzhbx extends zzgyl {
    static final int[] d = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgyl zzd;
    private final zzgyl zze;
    private final int zzf;
    private final int zzg;

    static zzgyl K(zzgyl zzgylVar, zzgyl zzgylVar2) {
        if (zzgylVar2.g() == 0) {
            return zzgylVar;
        }
        if (zzgylVar.g() == 0) {
            return zzgylVar2;
        }
        int g = zzgylVar.g() + zzgylVar2.g();
        if (g < 128) {
            return L(zzgylVar, zzgylVar2);
        }
        if (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            if (zzhbxVar.zze.g() + zzgylVar2.g() < 128) {
                return new zzhbx(zzhbxVar.zzd, L(zzhbxVar.zze, zzgylVar2));
            }
            if (zzhbxVar.zzd.k() > zzhbxVar.zze.k() && zzhbxVar.zzg > zzgylVar2.k()) {
                return new zzhbx(zzhbxVar.zzd, new zzhbx(zzhbxVar.zze, zzgylVar2));
            }
        }
        return g >= M(Math.max(zzgylVar.k(), zzgylVar2.k()) + 1) ? new zzhbx(zzgylVar, zzgylVar2) : zi.a(new zi(null), zzgylVar, zzgylVar2);
    }

    private static zzgyl L(zzgyl zzgylVar, zzgyl zzgylVar2) {
        int g = zzgylVar.g();
        int g2 = zzgylVar2.g();
        byte[] bArr = new byte[g + g2];
        zzgylVar.I(bArr, 0, 0, g);
        zzgylVar2.I(bArr, 0, g, g2);
        return new zzgyh(bArr);
    }

    static int M(int i) {
        int[] iArr = d;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    /* renamed from: A */
    public final zze iterator() {
        return new yi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final byte c(int i) {
        zzgyl.H(i, this.zzc);
        return e(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    final byte e(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.e(i) : this.zze.e(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyl)) {
            return false;
        }
        zzgyl zzgylVar = (zzgyl) obj;
        if (this.zzc != zzgylVar.g()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int z = z();
        int z2 = zzgylVar.z();
        if (z != 0 && z2 != 0 && z != z2) {
            return false;
        }
        a2f a2fVar = null;
        aj ajVar = new aj(this, a2fVar);
        zzgyg next = ajVar.next();
        aj ajVar2 = new aj(zzgylVar, a2fVar);
        zzgyg next2 = ajVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int g = next.g() - i;
            int g2 = next2.g() - i2;
            int min = Math.min(g, g2);
            if (!(i == 0 ? next.J(next2, i2, min) : next2.J(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == g) {
                next = ajVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == g2) {
                next2 = ajVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int g() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final void j(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.j(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.j(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.j(bArr, i, i2, i6);
            this.zze.j(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final int k() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final boolean n() {
        return this.zzc >= M(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final int o(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.o(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.o(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.o(this.zzd.o(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final int p(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.p(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.p(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.p(this.zzd.p(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyl q(int i, int i2) {
        int y = zzgyl.y(i, i2, this.zzc);
        if (y == 0) {
            return zzgyl.a;
        }
        if (y == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.q(i, i2);
        }
        if (i >= i3) {
            return this.zze.q(i - i3, i2 - i3);
        }
        zzgyl zzgylVar = this.zzd;
        return new zzhbx(zzgylVar.q(i, zzgylVar.g()), this.zze.q(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgyl
    public final gh t() {
        boolean z = true;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        aj ajVar = new aj(this, null);
        while (ajVar.hasNext()) {
            arrayList.add(ajVar.next().v());
        }
        int i = gh.e;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new eh(arrayList, i3, z, objArr == true ? 1 : 0) : gh.g(new bi(arrayList), ProgressEvent.PART_FAILED_EVENT_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final String u(Charset charset) {
        return new String(a(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    final void w(yze yzeVar) {
        this.zzd.w(yzeVar);
        this.zze.w(yzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean x() {
        zzgyl zzgylVar = this.zzd;
        zzgyl zzgylVar2 = this.zze;
        return zzgylVar2.p(zzgylVar.p(0, 0, this.zzf), 0, zzgylVar2.g()) == 0;
    }

    private zzhbx(zzgyl zzgylVar, zzgyl zzgylVar2) {
        this.zzd = zzgylVar;
        this.zze = zzgylVar2;
        int g = zzgylVar.g();
        this.zzf = g;
        this.zzc = g + zzgylVar2.g();
        this.zzg = Math.max(zzgylVar.k(), zzgylVar2.k()) + 1;
    }
}
