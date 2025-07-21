package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.c;
import com.airbnb.lottie.o;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.hc1;
import defpackage.hm2;
import defpackage.it2;
import defpackage.j94;
import defpackage.jc4;
import defpackage.l29;
import defpackage.lc4;
import defpackage.py1;
import defpackage.rc4;
import defpackage.sc4;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import java.io.IOException;
import java.io.InputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public abstract class RememberLottieCompositionKt {

    static final class a implements sc4 {
        final /* synthetic */ CancellableContinuation a;

        a(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.sc4
        public final void onResult(Object obj) {
            if (this.a.isCompleted()) {
                return;
            }
            this.a.resumeWith(Result.b(obj));
        }
    }

    static final class b implements sc4 {
        final /* synthetic */ CancellableContinuation a;

        b(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.sc4
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th) {
            if (this.a.isCompleted()) {
                return;
            }
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            zq3.e(th);
            cancellableContinuation.resumeWith(Result.b(f.a(th)));
        }
    }

    private static final Object h(o oVar, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        oVar.d(new a(cancellableContinuationImpl)).c(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str) {
        if (h.d0(str) || h.K(str, InstructionFileId.DOT, false, 2, null)) {
            return str;
        }
        return InstructionFileId.DOT + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String str) {
        if (str == null || h.d0(str)) {
            return null;
        }
        if (h.S(str, '/', false, 2, null)) {
            return str;
        }
        return str + "/";
    }

    private static final Object k(Context context, LottieComposition lottieComposition, String str, String str2, by0 by0Var) {
        Object withContext;
        return (!lottieComposition.g().isEmpty() && (withContext = BuildersKt.withContext(Dispatchers.getIO(), new RememberLottieCompositionKt$loadFontsFromAssets$2(lottieComposition, context, str, str2, null), by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? withContext : ww8.a;
    }

    private static final Object l(Context context, LottieComposition lottieComposition, String str, by0 by0Var) {
        Object withContext;
        return (lottieComposition.r() && (withContext = BuildersKt.withContext(Dispatchers.getIO(), new RememberLottieCompositionKt$loadImagesFromAssets$2(lottieComposition, context, str, null), by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? withContext : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(android.content.Context r6, com.airbnb.lottie.compose.c r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.m(android.content.Context, com.airbnb.lottie.compose.c, java.lang.String, java.lang.String, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    private static final o n(Context context, c cVar, String str, boolean z) {
        if (cVar instanceof c.a) {
            return zq3.c(str, "__LottieInternalDefaultCacheKey__") ? jc4.s(context, ((c.a) cVar).f()) : jc4.t(context, ((c.a) cVar).f(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(rc4 rc4Var) {
        if (rc4Var.b() != null) {
            return;
        }
        String c = rc4Var.c();
        zq3.e(c);
        if (!h.K(c, "data:", false, 2, null) || h.b0(c, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            String substring = c.substring(h.a0(c, ',', 0, false, 6, null) + 1);
            zq3.g(substring, "substring(...)");
            byte[] decode = Base64.decode(substring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            rc4Var.g(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e) {
            j94.d("data URL did not have correct base64 format.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Context context, rc4 rc4Var, String str) {
        if (rc4Var.b() != null || str == null) {
            return;
        }
        String c = rc4Var.c();
        try {
            InputStream open = context.getAssets().open(str + c);
            zq3.e(open);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                rc4Var.g(l29.l(BitmapFactory.decodeStream(open, null, options), rc4Var.f(), rc4Var.d()));
            } catch (IllegalArgumentException e) {
                j94.d("Unable to decode image.", e);
            }
        } catch (IOException e2) {
            j94.d("Unable to open asset.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Context context, hm2 hm2Var, String str, String str2) {
        String str3 = str + hm2Var.a() + str2;
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                zq3.e(createFromAsset);
                String c = hm2Var.c();
                zq3.g(c, "getStyle(...)");
                hm2Var.e(t(createFromAsset, c));
            } catch (Exception e) {
                j94.b("Failed to create " + hm2Var.a() + " typeface with style=" + hm2Var.c() + "!", e);
            }
        } catch (Exception e2) {
            j94.b("Failed to find typeface in assets with path " + str3 + InstructionFileId.DOT, e2);
        }
    }

    public static final lc4 r(c cVar, String str, String str2, String str3, String str4, it2 it2Var, Composer composer, int i, int i2) {
        zq3.h(cVar, "spec");
        composer.z(-1248473602);
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i2 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i2 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        it2 rememberLottieCompositionKt$rememberLottieComposition$1 = (i2 & 32) != 0 ? new RememberLottieCompositionKt$rememberLottieComposition$1(null) : it2Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1248473602, i, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:81)");
        }
        Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        composer.z(1388713885);
        int i3 = i & 14;
        int i4 = i3 ^ 6;
        boolean z = (i4 > 4 && composer.S(cVar)) || (i & 6) == 4;
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = b0.e(new LottieCompositionResultImpl(), null, 2, null);
            composer.q(A);
        }
        sy4 sy4Var = (sy4) A;
        composer.R();
        composer.z(1388714176);
        boolean z2 = ((i4 > 4 && composer.S(cVar)) || (i & 6) == 4) | ((((57344 & i) ^ 24576) > 16384 && composer.S(str8)) || (i & 24576) == 16384);
        Object A2 = composer.A();
        if (z2 || A2 == Composer.a.a()) {
            A2 = n(context, cVar, str8, true);
            composer.q(A2);
        }
        composer.R();
        py1.e(cVar, str8, new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, cVar, str5, str6, str7, str8, sy4Var, null), composer, i3 | 512 | ((i >> 9) & ContentType.LONG_FORM_ON_DEMAND));
        LottieCompositionResultImpl s = s(sy4Var);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResultImpl s(sy4 sy4Var) {
        return (LottieCompositionResultImpl) sy4Var.getValue();
    }

    private static final Typeface t(Typeface typeface, String str) {
        int i = 0;
        boolean P = h.P(str, "Italic", false, 2, null);
        boolean P2 = h.P(str, "Bold", false, 2, null);
        if (P && P2) {
            i = 3;
        } else if (P) {
            i = 2;
        } else if (P2) {
            i = 1;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
