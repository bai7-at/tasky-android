package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.t0;
import defpackage.e93;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d extends e93 {
    public static final d n = new d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final t0 j;
    public final List k;
    public final Map l;
    public final List m;

    public static final class a {
        public final Uri a;
        public final t0 b;
        public final String c;
        public final String d;

        public a(Uri uri, t0 t0Var, String str, String str2) {
            this.a = uri;
            this.b = t0Var;
            this.c = str;
            this.d = str2;
        }
    }

    public static final class b {
        public final Uri a;
        public final t0 b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, t0 t0Var, String str, String str2, String str3, String str4) {
            this.a = uri;
            this.b = t0Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new t0.b().U("0").M("application/x-mpegURL").G(), null, null, null, null);
        }

        public b a(t0 t0Var) {
            return new b(this.a, t0Var, this.c, this.d, this.e, this.f);
        }
    }

    public d(String str, List list, List list2, List list3, List list4, List list5, List list6, t0 t0Var, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        this.d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = t0Var;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    private static void b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((a) list.get(i)).a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static List d(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i3);
                    if (streamKey.groupIndex == i && streamKey.streamIndex == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public static d e(String str) {
        return new d("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((b) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // defpackage.kh2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d a(List list) {
        return new d(this.a, this.b, d(this.e, 0, list), Collections.emptyList(), d(this.g, 1, list), d(this.h, 2, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }
}
