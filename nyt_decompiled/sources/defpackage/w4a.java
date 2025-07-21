package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class w4a implements tx9 {
    private final tx9 a;
    private final r4a b;
    private t4a h;
    private l6a i;
    private final l4a c = new l4a();
    private int e = 0;
    private int f = 0;
    private byte[] g = khe.f;
    private final b9e d = new b9e();

    public w4a(tx9 tx9Var, r4a r4aVar) {
        this.a = tx9Var;
        this.b = r4aVar;
    }

    private final void h(int i) {
        int length = this.g.length;
        int i2 = this.f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.e;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.e, bArr2, 0, i3);
        this.e = 0;
        this.f = i3;
        this.g = bArr2;
    }

    @Override // defpackage.tx9
    public final /* synthetic */ int a(xyf xyfVar, int i, boolean z) {
        return kx9.a(this, xyfVar, i, z);
    }

    @Override // defpackage.tx9
    public final /* synthetic */ void b(b9e b9eVar, int i) {
        kx9.b(this, b9eVar, i);
    }

    @Override // defpackage.tx9
    public final void c(final long j, final int i, int i2, int i3, lx9 lx9Var) {
        if (this.h == null) {
            this.a.c(j, i, i2, i3, lx9Var);
            return;
        }
        wad.e(lx9Var == null, "DRM on subtitles is not supported");
        int i4 = (this.f - i3) - i2;
        this.h.a(this.g, i4, i2, s4a.a(), new pgd() { // from class: v4a
            @Override // defpackage.pgd
            public final void zza(Object obj) {
                w4a.this.g(j, i, (m4a) obj);
            }
        });
        int i5 = i4 + i2;
        this.e = i5;
        if (i5 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // defpackage.tx9
    public final void d(b9e b9eVar, int i, int i2) {
        if (this.h == null) {
            this.a.d(b9eVar, i, i2);
            return;
        }
        h(i);
        b9eVar.g(this.g, this.f, i);
        this.f += i;
    }

    @Override // defpackage.tx9
    public final int e(xyf xyfVar, int i, boolean z, int i2) {
        if (this.h == null) {
            return this.a.e(xyfVar, i, z, 0);
        }
        h(i);
        int b = xyfVar.b(this.g, this.f, i);
        if (b != -1) {
            this.f += b;
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.tx9
    public final void f(l6a l6aVar) {
        String str = l6aVar.l;
        str.getClass();
        wad.d(qcb.b(str) == 3);
        if (!l6aVar.equals(this.i)) {
            this.i = l6aVar;
            this.h = this.b.b(l6aVar) ? this.b.c(l6aVar) : null;
        }
        if (this.h == null) {
            this.a.f(l6aVar);
            return;
        }
        tx9 tx9Var = this.a;
        x3a b = l6aVar.b();
        b.w("application/x-media3-cues");
        b.l0(l6aVar.l);
        b.B(Long.MAX_VALUE);
        b.d(this.b.a(l6aVar));
        tx9Var.f(b.D());
    }

    final /* synthetic */ void g(long j, int i, m4a m4aVar) {
        wad.b(this.i);
        zzgaa zzgaaVar = m4aVar.a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgaaVar.size());
        Iterator<E> it2 = zzgaaVar.iterator();
        while (it2.hasNext()) {
            arrayList.add(((e2d) it2.next()).a());
        }
        long j2 = m4aVar.c;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(QueryKeys.TIME_ON_VIEW_IN_MINUTES, arrayList);
        bundle.putLong(QueryKeys.SUBDOMAIN, j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        b9e b9eVar = this.d;
        int length = marshall.length;
        b9eVar.i(marshall, length);
        this.a.b(this.d, length);
        int i2 = i & Integer.MAX_VALUE;
        long j3 = m4aVar.b;
        if (j3 == -9223372036854775807L) {
            wad.f(this.i.p == Long.MAX_VALUE);
        } else {
            long j4 = this.i.p;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.a.c(j, i2, length, 0, null);
    }
}
