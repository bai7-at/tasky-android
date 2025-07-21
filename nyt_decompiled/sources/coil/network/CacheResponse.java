package coil.network;

import defpackage.c04;
import defpackage.qd0;
import defpackage.qs2;
import defpackage.s;
import defpackage.sd0;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class CacheResponse {
    private final c04 a;
    private final c04 b;
    private final long c;
    private final long d;
    private final boolean e;
    private final Headers f;

    public CacheResponse(sd0 sd0Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = c.b(lazyThreadSafetyMode, new qs2() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CacheControl mo865invoke() {
                return CacheControl.Companion.parse(CacheResponse.this.d());
            }
        });
        this.b = c.b(lazyThreadSafetyMode, new qs2() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MediaType mo865invoke() {
                String str = CacheResponse.this.d().get("Content-Type");
                if (str != null) {
                    return MediaType.Companion.parse(str);
                }
                return null;
            }
        });
        this.c = Long.parseLong(sd0Var.g0());
        this.d = Long.parseLong(sd0Var.g0());
        this.e = Integer.parseInt(sd0Var.g0()) > 0;
        int parseInt = Integer.parseInt(sd0Var.g0());
        Headers.Builder builder = new Headers.Builder();
        for (int i = 0; i < parseInt; i++) {
            s.b(builder, sd0Var.g0());
        }
        this.f = builder.build();
    }

    public final CacheControl a() {
        return (CacheControl) this.a.getValue();
    }

    public final MediaType b() {
        return (MediaType) this.b.getValue();
    }

    public final long c() {
        return this.d;
    }

    public final Headers d() {
        return this.f;
    }

    public final long e() {
        return this.c;
    }

    public final boolean f() {
        return this.e;
    }

    public final void g(qd0 qd0Var) {
        qd0Var.p0(this.c).D0(10);
        qd0Var.p0(this.d).D0(10);
        qd0Var.p0(this.e ? 1L : 0L).D0(10);
        qd0Var.p0(this.f.size()).D0(10);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            qd0Var.V(this.f.name(i)).V(": ").V(this.f.value(i)).D0(10);
        }
    }

    public CacheResponse(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = c.b(lazyThreadSafetyMode, new qs2() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CacheControl mo865invoke() {
                return CacheControl.Companion.parse(CacheResponse.this.d());
            }
        });
        this.b = c.b(lazyThreadSafetyMode, new qs2() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MediaType mo865invoke() {
                String str = CacheResponse.this.d().get("Content-Type");
                if (str != null) {
                    return MediaType.Companion.parse(str);
                }
                return null;
            }
        });
        this.c = response.sentRequestAtMillis();
        this.d = response.receivedResponseAtMillis();
        this.e = response.handshake() != null;
        this.f = response.headers();
    }
}
