package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class t81 implements kh2 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final q19 i;
    public final cl7 j;
    public final Uri k;
    public final q46 l;
    private final List m;

    public t81(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, q46 q46Var, q19 q19Var, cl7 cl7Var, Uri uri, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = q46Var;
        this.i = q19Var;
        this.k = uri;
        this.j = cl7Var;
        this.m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList c(List list, LinkedList linkedList) {
        StreamKey streamKey = (StreamKey) linkedList.poll();
        int i = streamKey.periodIndex;
        ArrayList arrayList = new ArrayList();
        do {
            int i2 = streamKey.groupIndex;
            f8 f8Var = (f8) list.get(i2);
            List list2 = f8Var.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((cy6) list2.get(streamKey.streamIndex));
                streamKey = (StreamKey) linkedList.poll();
                if (streamKey.periodIndex != i) {
                    break;
                }
            } while (streamKey.groupIndex == i2);
            arrayList.add(new f8(f8Var.a, f8Var.b, arrayList2, f8Var.d, f8Var.e, f8Var.f));
        } while (streamKey.periodIndex == i);
        linkedList.addFirst(streamKey);
        return arrayList;
    }

    @Override // defpackage.kh2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t81 a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i) {
                long f = f(i);
                if (f != -9223372036854775807L) {
                    j += f;
                }
            } else {
                dr5 d = d(i);
                arrayList.add(new dr5(d.a, d.b - j, c(d.c, linkedList), d.d));
            }
            i++;
        }
        long j2 = this.b;
        return new t81(this.a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final dr5 d(int i) {
        return (dr5) this.m.get(i);
    }

    public final int e() {
        return this.m.size();
    }

    public final long f(int i) {
        long j;
        long j2;
        if (i == this.m.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((dr5) this.m.get(i)).b;
        } else {
            j = ((dr5) this.m.get(i + 1)).b;
            j2 = ((dr5) this.m.get(i)).b;
        }
        return j - j2;
    }

    public final long g(int i) {
        return z19.D0(f(i));
    }
}
