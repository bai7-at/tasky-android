package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.VectorConvertersKt;
import defpackage.ci;
import defpackage.i49;
import defpackage.ii;
import defpackage.wk2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class UpdatableAnimationState {
    private static final a f = new a(null);
    public static final int g = 8;
    private static final ii h = new ii(0.0f);
    private final i49 a;
    private long b = Long.MIN_VALUE;
    private ii c = h;
    private boolean d;
    private float e;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ii a() {
            return UpdatableAnimationState.h;
        }

        public final boolean b(float f) {
            return Math.abs(f) < 0.01f;
        }

        private a() {
        }
    }

    public UpdatableAnimationState(ci ciVar) {
        this.a = ciVar.a(VectorConvertersKt.d(wk2.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r14 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009a -> B:24:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ss2 r12, defpackage.qs2 r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.h(ss2, qs2, by0):java.lang.Object");
    }

    public final float i() {
        return this.e;
    }

    public final void j(float f2) {
        this.e = f2;
    }
}
