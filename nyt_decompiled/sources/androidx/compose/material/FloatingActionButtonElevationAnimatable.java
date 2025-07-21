package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import defpackage.bo3;
import defpackage.bu1;
import defpackage.by0;
import defpackage.e26;
import defpackage.ka3;
import defpackage.sl2;
import defpackage.ww8;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class FloatingActionButtonElevationAnimatable {
    private float a;
    private float b;
    private float c;
    private float d;
    private final Animatable e;
    private bo3 f;
    private bo3 g;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    private final float d(bo3 bo3Var) {
        return bo3Var instanceof e26 ? this.b : bo3Var instanceof ka3 ? this.c : bo3Var instanceof sl2 ? this.d : this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.compose.material.FloatingActionButtonElevationAnimatable r4 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r4
            kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L63
        L2d:
            r5 = move-exception
            goto L68
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            bo3 r5 = r4.g
            float r5 = r4.d(r5)
            androidx.compose.animation.core.Animatable r2 = r4.e
            java.lang.Object r2 = r2.k()
            bu1 r2 = (defpackage.bu1) r2
            float r2 = r2.n()
            boolean r2 = defpackage.bu1.j(r2, r5)
            if (r2 != 0) goto L6d
            androidx.compose.animation.core.Animatable r2 = r4.e     // Catch: java.lang.Throwable -> L2d
            bu1 r5 = defpackage.bu1.d(r5)     // Catch: java.lang.Throwable -> L2d
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r2.t(r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L63
            return r1
        L63:
            bo3 r5 = r4.g
            r4.f = r5
            goto L6d
        L68:
            bo3 r0 = r4.g
            r4.f = r0
            throw r5
        L6d:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.e(by0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, ww8] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bo3 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            r6 = r5
            bo3 r6 = (defpackage.bo3) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.material.FloatingActionButtonElevationAnimatable r5 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r5
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L68
        L32:
            r7 = move-exception
            goto L6d
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.f.b(r7)
            float r7 = r5.d(r6)
            r5.g = r6
            androidx.compose.animation.core.Animatable r2 = r5.e     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.k()     // Catch: java.lang.Throwable -> L32
            bu1 r2 = (defpackage.bu1) r2     // Catch: java.lang.Throwable -> L32
            float r2 = r2.n()     // Catch: java.lang.Throwable -> L32
            boolean r2 = defpackage.bu1.j(r2, r7)     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L68
            androidx.compose.animation.core.Animatable r2 = r5.e     // Catch: java.lang.Throwable -> L32
            bo3 r4 = r5.f     // Catch: java.lang.Throwable -> L32
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = defpackage.yy1.d(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L68
            return r1
        L68:
            r5.f = r6
            ww8 r5 = defpackage.ww8.a
            return r5
        L6d:
            r5.f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.b(bo3, by0):java.lang.Object");
    }

    public final x08 c() {
        return this.e.g();
    }

    public final Object f(float f, float f2, float f3, float f4, by0 by0Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        Object e = e(by0Var);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new Animatable(bu1.d(this.a), VectorConvertersKt.b(bu1.b), null, null, 12, null);
    }
}
