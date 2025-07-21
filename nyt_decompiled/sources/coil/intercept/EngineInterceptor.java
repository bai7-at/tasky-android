package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.by0;
import defpackage.d42;
import defpackage.i94;
import defpackage.qp4;
import defpackage.s;
import defpackage.sy6;
import defpackage.uk5;
import defpackage.uv1;
import defpackage.vg3;
import defpackage.yo3;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
public final class EngineInterceptor implements yo3 {
    public static final a d = new a(null);
    private final ImageLoader a;
    private final sy6 b;
    private final qp4 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        private final Drawable a;
        private final boolean b;
        private final DataSource c;
        private final String d;

        public b(Drawable drawable, boolean z, DataSource dataSource, String str) {
            this.a = drawable;
            this.b = z;
            this.c = dataSource;
            this.d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = bVar.a;
            }
            if ((i & 2) != 0) {
                z = bVar.b;
            }
            if ((i & 4) != 0) {
                dataSource = bVar.c;
            }
            if ((i & 8) != 0) {
                str = bVar.d;
            }
            return bVar.a(drawable, z, dataSource, str);
        }

        public final b a(Drawable drawable, boolean z, DataSource dataSource, String str) {
            return new b(drawable, z, dataSource, str);
        }

        public final DataSource c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final Drawable e() {
            return this.a;
        }

        public final boolean f() {
            return this.b;
        }
    }

    public EngineInterceptor(ImageLoader imageLoader, sy6 sy6Var, i94 i94Var) {
        this.a = imageLoader;
        this.b = sy6Var;
        this.c = new qp4(imageLoader, sy6Var, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap g(Drawable drawable, uk5 uk5Var, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (d.W(s.o(), defpackage.a.c(bitmap))) {
                return bitmap;
            }
        }
        return uv1.a.a(drawable, uk5Var.f(), uk5Var.o(), uk5Var.n(), uk5Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0096 -> B:10:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.sx7 r9, defpackage.or0 r10, defpackage.vg3 r11, java.lang.Object r12, defpackage.uk5 r13, defpackage.d42 r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.h(sx7, or0, vg3, java.lang.Object, uk5, d42, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:26:0x0054, B:27:0x0192, B:40:0x007a, B:42:0x0153, B:44:0x015e, B:48:0x0196, B:50:0x019a, B:52:0x020f, B:53:0x0214), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:26:0x0054, B:27:0x0192, B:40:0x007a, B:42:0x0153, B:44:0x015e, B:48:0x0196, B:50:0x019a, B:52:0x020f, B:53:0x0214), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, or0] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, uk5] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, or0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.vg3 r35, java.lang.Object r36, defpackage.uk5 r37, defpackage.d42 r38, defpackage.by0 r39) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.i(vg3, java.lang.Object, uk5, d42, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0090 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.or0 r9, defpackage.vg3 r10, java.lang.Object r11, defpackage.uk5 r12, defpackage.d42 r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.j(or0, vg3, java.lang.Object, uk5, d42, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.yo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(yo3.a r14, defpackage.by0 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof coil.intercept.EngineInterceptor$intercept$1
            if (r0 == 0) goto L13
            r0 = r15
            coil.intercept.EngineInterceptor$intercept$1 r0 = (coil.intercept.EngineInterceptor$intercept$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.intercept.EngineInterceptor$intercept$1 r0 = new coil.intercept.EngineInterceptor$intercept$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r13 = r0.L$1
            r14 = r13
            yo3$a r14 = (yo3.a) r14
            java.lang.Object r13 = r0.L$0
            coil.intercept.EngineInterceptor r13 = (coil.intercept.EngineInterceptor) r13
            kotlin.f.b(r15)     // Catch: java.lang.Throwable -> L32
            goto L9c
        L32:
            r15 = move-exception
            goto L9d
        L34:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3c:
            kotlin.f.b(r15)
            vg3 r6 = r14.c()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> L32
            au7 r2 = r14.a()     // Catch: java.lang.Throwable -> L32
            d42 r9 = defpackage.s.g(r14)     // Catch: java.lang.Throwable -> L32
            sy6 r4 = r13.b     // Catch: java.lang.Throwable -> L32
            uk5 r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> L32
            coil.size.Scale r4 = r8.n()     // Catch: java.lang.Throwable -> L32
            r9.q(r6, r15)     // Catch: java.lang.Throwable -> L32
            coil.ImageLoader r5 = r13.a     // Catch: java.lang.Throwable -> L32
            or0 r5 = r5.getComponents()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> L32
            r9.e(r6, r7)     // Catch: java.lang.Throwable -> L32
            qp4 r15 = r13.c     // Catch: java.lang.Throwable -> L32
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L78
            qp4 r15 = r13.c     // Catch: java.lang.Throwable -> L32
            coil.memory.MemoryCache$b r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L32
            goto L79
        L78:
            r15 = 0
        L79:
            if (r15 == 0) goto L82
            qp4 r0 = r13.c     // Catch: java.lang.Throwable -> L32
            cc8 r13 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L32
            return r13
        L82:
            kotlinx.coroutines.CoroutineDispatcher r15 = r6.v()     // Catch: java.lang.Throwable -> L32
            coil.intercept.EngineInterceptor$intercept$2 r2 = new coil.intercept.EngineInterceptor$intercept$2     // Catch: java.lang.Throwable -> L32
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L32
            r0.L$0 = r13     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r14     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r15 != r1) goto L9c
            return r1
        L9c:
            return r15
        L9d:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lac
            sy6 r13 = r13.b
            vg3 r14 = r14.c()
            a32 r13 = r13.b(r14, r15)
            return r13
        Lac:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.a(yo3$a, by0):java.lang.Object");
    }

    public final Object k(b bVar, vg3 vg3Var, uk5 uk5Var, d42 d42Var, by0 by0Var) {
        List O = vg3Var.O();
        return O.isEmpty() ? bVar : ((bVar.e() instanceof BitmapDrawable) || vg3Var.g()) ? BuildersKt.withContext(vg3Var.N(), new EngineInterceptor$transform$3(this, bVar, uk5Var, O, d42Var, vg3Var, null), by0Var) : bVar;
    }
}
