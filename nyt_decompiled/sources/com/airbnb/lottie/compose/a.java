package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.by0;
import defpackage.xb4;

/* loaded from: classes.dex */
public interface a extends xb4 {

    /* renamed from: com.airbnb.lottie.compose.a$a, reason: collision with other inner class name */
    public static final class C0136a {
        public static /* synthetic */ Object a(a aVar, LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, by0 by0Var, int i3, Object obj) {
            LottieClipSpec lottieClipSpec2;
            float f3;
            float c;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int u = (i3 & 2) != 0 ? aVar.u() : i;
            int p = (i3 & 4) != 0 ? aVar.p() : i2;
            boolean m = (i3 & 8) != 0 ? aVar.m() : z;
            float q = (i3 & 16) != 0 ? aVar.q() : f;
            if ((i3 & 32) != 0) {
                aVar.w();
                lottieClipSpec2 = null;
            } else {
                lottieClipSpec2 = lottieClipSpec;
            }
            if ((i3 & 64) != 0) {
                c = b.c(lottieComposition, lottieClipSpec2, q);
                f3 = c;
            } else {
                f3 = f2;
            }
            return aVar.l(lottieComposition, u, p, m, q, lottieClipSpec2, f3, (i3 & 128) != 0 ? false : z2, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, by0Var);
        }

        public static /* synthetic */ Object b(a aVar, LottieComposition lottieComposition, float f, int i, boolean z, by0 by0Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i2 & 1) != 0) {
                lottieComposition = aVar.v();
            }
            LottieComposition lottieComposition2 = lottieComposition;
            if ((i2 & 2) != 0) {
                f = aVar.s();
            }
            float f2 = f;
            if ((i2 & 4) != 0) {
                i = aVar.u();
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = !(f2 == aVar.s());
            }
            return aVar.i(lottieComposition2, f2, i3, z, by0Var);
        }
    }

    Object i(LottieComposition lottieComposition, float f, int i, boolean z, by0 by0Var);

    Object l(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, by0 by0Var);
}
