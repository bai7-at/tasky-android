package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class x5a {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final d6a f;
    private final String[] g;
    public final String h;
    public final String i;
    public final x5a j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    private x5a(String str, String str2, long j, long j2, d6a d6aVar, String[] strArr, String str3, String str4, x5a x5aVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = d6aVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = x5aVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static x5a b(String str, long j, long j2, d6a d6aVar, String[] strArr, String str2, String str3, x5a x5aVar) {
        return new x5a(str, null, j, j2, d6aVar, strArr, str2, str3, x5aVar);
    }

    public static x5a c(String str) {
        return new x5a(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            zzc zzcVar = new zzc();
            zzcVar.l(new SpannableStringBuilder());
            map.put(str, zzcVar);
        }
        CharSequence q = ((zzc) map.get(str)).q();
        q.getClass();
        return (SpannableStringBuilder) q;
    }

    private final void j(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                x5a x5aVar = (x5a) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                x5aVar.j(treeSet, z2);
            }
        }
    }

    private final void k(long j, String str, List list) {
        String str2;
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (g(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            d(i).k(j, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5a.l(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void m(long j, boolean z, String str, Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            SpannableStringBuilder i = i(str, map);
            String str2 = this.b;
            str2.getClass();
            i.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.a) && z) {
            i(str, map).append('\n');
            return;
        }
        if (g(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap = this.k;
                String str3 = (String) entry.getKey();
                CharSequence q = ((zzc) entry.getValue()).q();
                q.getClass();
                hashMap.put(str3, Integer.valueOf(q.length()));
            }
            boolean equals = "p".equals(this.a);
            for (int i2 = 0; i2 < a(); i2++) {
                d(i2).m(j, z || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder i3 = i(str, map);
                int length = i3.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (i3.charAt(length) == ' ');
                if (length >= 0 && i3.charAt(length) != '\n') {
                    i3.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap hashMap2 = this.l;
                String str4 = (String) entry2.getKey();
                CharSequence q2 = ((zzc) entry2.getValue()).q();
                q2.getClass();
                hashMap2.put(str4, Integer.valueOf(q2.length()));
            }
        }
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final x5a d(int i) {
        List list = this.m;
        if (list != null) {
            return (x5a) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List e(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        k(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        m(j, false, this.h, treeMap);
        l(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                b6a b6aVar = (b6a) map2.get(pair.first);
                b6aVar.getClass();
                zzc zzcVar = new zzc();
                zzcVar.c(decodeByteArray);
                zzcVar.h(b6aVar.b);
                zzcVar.i(0);
                zzcVar.e(b6aVar.c, 0);
                zzcVar.f(b6aVar.e);
                zzcVar.k(b6aVar.f);
                zzcVar.d(b6aVar.g);
                zzcVar.o(b6aVar.j);
                arrayList2.add(zzcVar.p());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            b6a b6aVar2 = (b6a) map2.get(entry.getKey());
            b6aVar2.getClass();
            zzc zzcVar2 = (zzc) entry.getValue();
            CharSequence q = zzcVar2.q();
            q.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) q;
            for (v5a v5aVar : (v5a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), v5a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(v5aVar), spannableStringBuilder.getSpanEnd(v5aVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcVar2.e(b6aVar2.c, b6aVar2.d);
            zzcVar2.f(b6aVar2.e);
            zzcVar2.h(b6aVar2.b);
            zzcVar2.k(b6aVar2.f);
            zzcVar2.n(b6aVar2.i, b6aVar2.h);
            zzcVar2.o(b6aVar2.j);
            arrayList2.add(zzcVar2.p());
        }
        return arrayList2;
    }

    public final void f(x5a x5aVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(x5aVar);
    }

    public final boolean g(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L) {
            if (this.e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }

    public final long[] h() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            jArr[i] = ((Long) it2.next()).longValue();
            i++;
        }
        return jArr;
    }
}
