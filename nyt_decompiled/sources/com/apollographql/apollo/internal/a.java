package com.apollographql.apollo.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.apollographql.apollo.exception.DefaultApolloException;
import defpackage.ad0;
import defpackage.pm8;
import defpackage.px7;
import defpackage.sd0;
import defpackage.tk5;
import defpackage.va3;
import defpackage.wd5;
import defpackage.zq3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class a implements Closeable {
    private static final C0141a j = new C0141a(null);
    private final sd0 a;
    private final String b;
    private final ByteString c;
    private final ByteString d;
    private int e;
    private boolean f;
    private boolean g;
    private c h;
    private final tk5 i;

    /* renamed from: com.apollographql.apollo.internal.a$a, reason: collision with other inner class name */
    private static final class C0141a {
        public /* synthetic */ C0141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(sd0 sd0Var) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String g0 = sd0Var.g0();
                if (g0.length() == 0) {
                    return arrayList;
                }
                int a0 = h.a0(g0, ':', 0, false, 6, null);
                if (a0 == -1) {
                    throw new IllegalStateException(("Unexpected header: " + g0).toString());
                }
                String substring = g0.substring(0, a0);
                zq3.g(substring, "substring(...)");
                String obj = h.c1(substring).toString();
                String substring2 = g0.substring(a0 + 1);
                zq3.g(substring2, "substring(...)");
                arrayList.add(new va3(obj, h.c1(substring2).toString()));
            }
        }

        private C0141a() {
        }
    }

    public static final class b implements Closeable {
        private final List a;
        private final sd0 b;

        public b(List list, sd0 sd0Var) {
            zq3.h(list, "headers");
            zq3.h(sd0Var, "body");
            this.a = list;
            this.b = sd0Var;
        }

        public final sd0 a() {
            return this.b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }
    }

    private final class c implements px7 {
        public c() {
        }

        @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
        public void close() {
            if (zq3.c(a.this.h, this)) {
                a.this.h = null;
            }
        }

        @Override // defpackage.px7
        public long read(ad0 ad0Var, long j) {
            zq3.h(ad0Var, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!zq3.c(a.this.h, this)) {
                throw new IllegalStateException("closed");
            }
            long i = a.this.i(j);
            if (i == 0) {
                return -1L;
            }
            return a.this.a.read(ad0Var, i);
        }

        @Override // defpackage.px7, defpackage.yt7
        public pm8 timeout() {
            return a.this.a.timeout();
        }
    }

    public a(sd0 sd0Var, String str) {
        zq3.h(sd0Var, "source");
        zq3.h(str, "boundary");
        this.a = sd0Var;
        this.b = str;
        this.c = new ad0().V("--").V(str).a1();
        this.d = new ad0().V("\r\n--").V(str).a1();
        tk5.a aVar = tk5.d;
        ByteString.a aVar2 = ByteString.c;
        this.i = aVar.d(aVar2.d("\r\n--" + str + "--"), aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long i(long j2) {
        this.a.o0(this.d.E());
        long J = this.a.g().J(this.d);
        return J == -1 ? Math.min(j2, (this.a.g().h1() - this.d.E()) + 1) : Math.min(j2, J);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.h = null;
        this.a.close();
    }

    public final b j() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        if (this.g) {
            return null;
        }
        if (this.e == 0 && this.a.W(0L, this.c)) {
            this.a.skip(this.c.E());
        } else {
            while (true) {
                long i = i(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (i == 0) {
                    break;
                }
                this.a.skip(i);
            }
            this.a.skip(this.d.E());
        }
        boolean z = false;
        while (true) {
            int y0 = this.a.y0(this.i);
            if (y0 == -1) {
                if (this.a.C0()) {
                    throw new DefaultApolloException("premature end of multipart body", null, 2, null);
                }
                throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (y0 == 0) {
                if (this.e == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.g = true;
                return null;
            }
            if (y0 == 1) {
                this.e++;
                List b2 = j.b(this.a);
                c cVar = new c();
                this.h = cVar;
                return new b(b2, wd5.d(cVar));
            }
            if (y0 == 2) {
                if (z) {
                    throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.e == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.g = true;
                return null;
            }
            if (y0 == 3 || y0 == 4) {
                z = true;
            }
        }
    }
}
