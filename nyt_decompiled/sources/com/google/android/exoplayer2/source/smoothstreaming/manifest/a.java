package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.t0;
import defpackage.kh2;
import defpackage.rp8;
import defpackage.ur;
import defpackage.yy8;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class a implements kh2 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final C0192a e;
    public final b[] f;
    public final long g;
    public final long h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    public static class C0192a {
        public final UUID a;
        public final byte[] b;
        public final rp8[] c;

        public C0192a(UUID uuid, byte[] bArr, rp8[] rp8VarArr) {
            this.a = uuid;
            this.b = bArr;
            this.c = rp8VarArr;
        }
    }

    public a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C0192a c0192a, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : z19.Q0(j2, 1000000L, j), j3 != 0 ? z19.Q0(j3, 1000000L, j) : -9223372036854775807L, i3, z, c0192a, bVarArr);
    }

    @Override // defpackage.kh2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            b bVar2 = this.f[streamKey.groupIndex];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((t0[]) arrayList3.toArray(new t0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[streamKey.streamIndex]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((t0[]) arrayList3.toArray(new t0[0])));
        }
        return new a(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (b[]) arrayList2.toArray(new b[0]));
    }

    public static class b {
        public final int a;
        public final String b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final String i;
        public final t0[] j;
        public final int k;
        private final String l;
        private final String m;
        private final List n;
        private final long[] o;
        private final long p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, t0[] t0VarArr, List list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, t0VarArr, list, z19.R0(list, 1000000L, j), z19.Q0(j2, 1000000L, j));
        }

        public Uri a(int i, int i2) {
            ur.g(this.j != null);
            ur.g(this.n != null);
            ur.g(i2 < this.n.size());
            String num = Integer.toString(this.j[i].h);
            String l = ((Long) this.n.get(i2)).toString();
            return yy8.e(this.l, this.m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        public b b(t0[] t0VarArr) {
            return new b(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, t0VarArr, this.n, this.o, this.p);
        }

        public long c(int i) {
            if (i == this.k - 1) {
                return this.p;
            }
            long[] jArr = this.o;
            return jArr[i + 1] - jArr[i];
        }

        public int d(long j) {
            return z19.i(this.o, j, true, true);
        }

        public long e(int i) {
            return this.o[i];
        }

        private b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, t0[] t0VarArr, List list, long[] jArr, long j2) {
            this.l = str;
            this.m = str2;
            this.a = i;
            this.b = str3;
            this.c = j;
            this.d = str4;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = str5;
            this.j = t0VarArr;
            this.n = list;
            this.o = jArr;
            this.p = j2;
            this.k = list.size();
        }
    }

    private a(int i, int i2, long j, long j2, int i3, boolean z, C0192a c0192a, b[] bVarArr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = c0192a;
        this.f = bVarArr;
    }
}
