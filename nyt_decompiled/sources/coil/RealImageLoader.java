package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.HttpUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import defpackage.bf0;
import defpackage.by0;
import defpackage.c04;
import defpackage.d42;
import defpackage.de8;
import defpackage.dj1;
import defpackage.ee2;
import defpackage.fx0;
import defpackage.hb3;
import defpackage.hf0;
import defpackage.hh5;
import defpackage.i48;
import defpackage.i94;
import defpackage.if2;
import defpackage.je2;
import defpackage.k07;
import defpackage.ks1;
import defpackage.l07;
import defpackage.lb9;
import defpackage.nv1;
import defpackage.or0;
import defpackage.rg3;
import defpackage.s;
import defpackage.s80;
import defpackage.sy6;
import defpackage.vg3;
import defpackage.wt;
import defpackage.wy8;
import defpackage.zz6;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class RealImageLoader implements ImageLoader {
    public static final a q = new a(null);
    private final Context a;
    private final dj1 b;
    private final c04 c;
    private final c04 d;
    private final c04 e;
    private final d42.d f;
    private final or0 g;
    private final rg3 h;
    private final CoroutineScope i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new b(CoroutineExceptionHandler.Key, this)));
    private final de8 j;
    private final sy6 k;
    private final c04 l;
    private final c04 m;
    private final or0 n;
    private final List o;
    private final AtomicBoolean p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ RealImageLoader a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, RealImageLoader realImageLoader) {
            super(key);
            this.a = realImageLoader;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            this.a.h();
        }
    }

    public RealImageLoader(Context context, dj1 dj1Var, c04 c04Var, c04 c04Var2, c04 c04Var3, d42.d dVar, or0 or0Var, rg3 rg3Var, i94 i94Var) {
        this.a = context;
        this.b = dj1Var;
        this.c = c04Var;
        this.d = c04Var2;
        this.e = c04Var3;
        this.f = dVar;
        this.g = or0Var;
        this.h = rg3Var;
        de8 de8Var = new de8(this, context, rg3Var.d());
        this.j = de8Var;
        sy6 sy6Var = new sy6(this, de8Var, null);
        this.k = sy6Var;
        this.l = c04Var;
        this.m = c04Var2;
        this.n = or0Var.h().d(new hb3(), HttpUrl.class).d(new i48(), String.class).d(new if2(), Uri.class).d(new l07(), Uri.class).d(new zz6(), Integer.class).d(new bf0(), byte[].class).c(new wy8(), Uri.class).c(new je2(rg3Var.a()), File.class).b(new HttpUriFetcher.b(c04Var3, c04Var2, rg3Var.e()), Uri.class).b(new ee2.a(), File.class).b(new wt.a(), Uri.class).b(new fx0.a(), Uri.class).b(new k07.b(), Uri.class).b(new nv1.a(), Drawable.class).b(new s80.a(), Bitmap.class).b(new hf0.a(), ByteBuffer.class).a(new BitmapFactoryDecoder.c(rg3Var.c(), rg3Var.b())).e();
        this.o = i.G0(getComponents().c(), new EngineInterceptor(this, sy6Var, null));
        this.p = new AtomicBoolean(false);
        de8Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0193 A[Catch: all -> 0x019e, TryCatch #6 {all -> 0x019e, blocks: (B:16:0x018d, B:18:0x0193, B:22:0x01a0, B:24:0x01a4), top: B:15:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a0 A[Catch: all -> 0x019e, TryCatch #6 {all -> 0x019e, blocks: (B:16:0x018d, B:18:0x0193, B:22:0x01a0, B:24:0x01a4), top: B:15:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104 A[Catch: all -> 0x00fa, TryCatch #3 {all -> 0x00fa, blocks: (B:63:0x00fe, B:65:0x0104, B:67:0x010a, B:69:0x0112, B:71:0x011a, B:72:0x012c, B:74:0x0132, B:75:0x0135, B:77:0x013e, B:78:0x0141, B:82:0x0128, B:90:0x00cf, B:92:0x00db, B:94:0x00e0, B:98:0x01b6, B:99:0x01bb), top: B:89:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a A[Catch: all -> 0x00fa, TryCatch #3 {all -> 0x00fa, blocks: (B:63:0x00fe, B:65:0x0104, B:67:0x010a, B:69:0x0112, B:71:0x011a, B:72:0x012c, B:74:0x0132, B:75:0x0135, B:77:0x013e, B:78:0x0141, B:82:0x0128, B:90:0x00cf, B:92:0x00db, B:94:0x00e0, B:98:0x01b6, B:99:0x01bb), top: B:89:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132 A[Catch: all -> 0x00fa, TryCatch #3 {all -> 0x00fa, blocks: (B:63:0x00fe, B:65:0x0104, B:67:0x010a, B:69:0x0112, B:71:0x011a, B:72:0x012c, B:74:0x0132, B:75:0x0135, B:77:0x013e, B:78:0x0141, B:82:0x0128, B:90:0x00cf, B:92:0x00db, B:94:0x00e0, B:98:0x01b6, B:99:0x01bb), top: B:89:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e A[Catch: all -> 0x00fa, TryCatch #3 {all -> 0x00fa, blocks: (B:63:0x00fe, B:65:0x0104, B:67:0x010a, B:69:0x0112, B:71:0x011a, B:72:0x012c, B:74:0x0132, B:75:0x0135, B:77:0x013e, B:78:0x0141, B:82:0x0128, B:90:0x00cf, B:92:0x00db, B:94:0x00e0, B:98:0x01b6, B:99:0x01bb), top: B:89:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128 A[Catch: all -> 0x00fa, TryCatch #3 {all -> 0x00fa, blocks: (B:63:0x00fe, B:65:0x0104, B:67:0x010a, B:69:0x0112, B:71:0x011a, B:72:0x012c, B:74:0x0132, B:75:0x0135, B:77:0x013e, B:78:0x0141, B:82:0x0128, B:90:0x00cf, B:92:0x00db, B:94:0x00e0, B:98:0x01b6, B:99:0x01bb), top: B:89:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vg3 r20, int r21, defpackage.by0 r22) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.g(vg3, int, by0):java.lang.Object");
    }

    private final void i(vg3 vg3Var, d42 d42Var) {
        d42Var.a(vg3Var);
        vg3.b A = vg3Var.A();
        if (A != null) {
            A.a(vg3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(defpackage.a32 r3, defpackage.dg8 r4, defpackage.d42 r5) {
        /*
            r2 = this;
            vg3 r2 = r3.b()
            boolean r0 = r4 instanceof defpackage.sr8
            if (r0 != 0) goto Lb
            if (r4 == 0) goto L37
            goto L1e
        Lb:
            vg3 r0 = r3.b()
            jr8$a r0 = r0.P()
            r1 = r4
            sr8 r1 = (defpackage.sr8) r1
            jr8 r0 = r0.a(r1, r3)
            boolean r1 = r0 instanceof defpackage.f85
            if (r1 == 0) goto L26
        L1e:
            android.graphics.drawable.Drawable r0 = r3.a()
            r4.c(r0)
            goto L37
        L26:
            vg3 r4 = r3.b()
            r5.h(r4, r0)
            r0.a()
            vg3 r4 = r3.b()
            r5.m(r4, r0)
        L37:
            r5.c(r2, r3)
            vg3$b r4 = r2.A()
            if (r4 == 0) goto L43
            r4.c(r2, r3)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.j(a32, dg8, d42):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(defpackage.cc8 r3, defpackage.dg8 r4, defpackage.d42 r5) {
        /*
            r2 = this;
            vg3 r2 = r3.b()
            r3.c()
            boolean r0 = r4 instanceof defpackage.sr8
            if (r0 != 0) goto Le
            if (r4 == 0) goto L3a
            goto L21
        Le:
            vg3 r0 = r3.b()
            jr8$a r0 = r0.P()
            r1 = r4
            sr8 r1 = (defpackage.sr8) r1
            jr8 r0 = r0.a(r1, r3)
            boolean r1 = r0 instanceof defpackage.f85
            if (r1 == 0) goto L29
        L21:
            android.graphics.drawable.Drawable r0 = r3.a()
            r4.a(r0)
            goto L3a
        L29:
            vg3 r4 = r3.b()
            r5.h(r4, r0)
            r0.a()
            vg3 r4 = r3.b()
            r5.m(r4, r0)
        L3a:
            r5.d(r2, r3)
            vg3$b r4 = r2.A()
            if (r4 == 0) goto L46
            r4.d(r2, r3)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.k(cc8, dg8, d42):void");
    }

    @Override // coil.ImageLoader
    public dj1 a() {
        return this.b;
    }

    @Override // coil.ImageLoader
    public ks1 b(vg3 vg3Var) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.i, null, null, new RealImageLoader$enqueue$job$1(this, vg3Var, null), 3, null);
        return vg3Var.M() instanceof lb9 ? s.l(((lb9) vg3Var.M()).getView()).b(async$default) : new hh5(async$default);
    }

    @Override // coil.ImageLoader
    public Object c(vg3 vg3Var, by0 by0Var) {
        return CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(vg3Var, this, null), by0Var);
    }

    @Override // coil.ImageLoader
    public MemoryCache d() {
        return (MemoryCache) this.l.getValue();
    }

    @Override // coil.ImageLoader
    public or0 getComponents() {
        return this.n;
    }

    public final i94 h() {
        return null;
    }

    public final void l(int i) {
        MemoryCache memoryCache;
        c04 c04Var = this.c;
        if (c04Var == null || (memoryCache = (MemoryCache) c04Var.getValue()) == null) {
            return;
        }
        memoryCache.a(i);
    }
}
