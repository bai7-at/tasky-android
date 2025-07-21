package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.dg4;
import defpackage.du7;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.in3;
import defpackage.lh4;
import defpackage.ma7;
import defpackage.ph0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.vm3;
import defpackage.wb4;
import defpackage.wd;
import defpackage.ww8;
import defpackage.xb4;
import defpackage.zq3;
import defpackage.zt7;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class LottieAnimationKt {
    public static final void a(final LottieComposition lottieComposition, final float f, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, boolean z6, AsyncUpdates asyncUpdates, Composer composer, final int i, final int i2, final int i3) {
        Composer h = composer.h(847508402);
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.a : modifier;
        final boolean z7 = (i3 & 8) != 0 ? false : z;
        boolean z8 = (i3 & 16) != 0 ? false : z2;
        boolean z9 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z10 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : lottieDynamicProperties;
        Alignment e = (i3 & 512) != 0 ? Alignment.a.e() : alignment;
        ContentScale e2 = (i3 & 1024) != 0 ? ContentScale.a.e() : contentScale;
        boolean z11 = (i3 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? true : z5;
        boolean z12 = (i3 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z6;
        AsyncUpdates asyncUpdates2 = (i3 & 8192) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(847508402, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:161)");
        }
        h.z(185155112);
        boolean z13 = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.b(f)) || (i & 48) == 32;
        Object A = h.A();
        if (z13 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Float mo865invoke() {
                    return Float.valueOf(f);
                }
            };
            h.q(A);
        }
        h.R();
        b(lottieComposition, (qs2) A, modifier2, z7, z8, z9, renderMode2, z10, lottieDynamicProperties2, e, e2, z11, false, null, asyncUpdates2, z12, h, (i & 896) | 134217736 | (i & 7168) | (i & 57344) | (i & 458752) | (i & 3670016) | (i & 29360128) | (i & 1879048192), (i2 & WebSocketProtocol.PAYLOAD_SHORT) | ((i2 << 3) & 57344) | ((i2 << 9) & 458752), 12288);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final boolean z14 = z8;
            final boolean z15 = z9;
            final RenderMode renderMode3 = renderMode2;
            final boolean z16 = z10;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final Alignment alignment2 = e;
            final ContentScale contentScale2 = e2;
            final boolean z17 = z11;
            final boolean z18 = z12;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            k.a(new gt2(f, modifier2, z7, z14, z15, renderMode3, z16, lottieDynamicProperties3, alignment2, contentScale2, z17, z18, asyncUpdates3, i, i2, i3) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$5
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ Alignment $alignment;
                final /* synthetic */ boolean $applyOpacityToLayers;
                final /* synthetic */ AsyncUpdates $asyncUpdates;
                final /* synthetic */ boolean $clipToCompositionBounds;
                final /* synthetic */ ContentScale $contentScale;
                final /* synthetic */ LottieDynamicProperties $dynamicProperties;
                final /* synthetic */ boolean $enableMergePaths;
                final /* synthetic */ boolean $maintainOriginalImageBounds;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ boolean $outlineMasksAndMattes;
                final /* synthetic */ float $progress;
                final /* synthetic */ RenderMode $renderMode;
                final /* synthetic */ boolean $safeMode;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$alignment = alignment2;
                    this.$contentScale = contentScale2;
                    this.$clipToCompositionBounds = z17;
                    this.$safeMode = z18;
                    this.$asyncUpdates = asyncUpdates3;
                    this.$$changed = i;
                    this.$$changed1 = i2;
                    this.$$default = i3;
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    LottieAnimationKt.a(LottieComposition.this, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, null, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$safeMode, this.$asyncUpdates, composer2, gt6.a(this.$$changed | 1), gt6.a(this.$$changed1), this.$$default);
                }
            });
        }
    }

    public static final void b(final LottieComposition lottieComposition, final qs2 qs2Var, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, boolean z6, Map map, AsyncUpdates asyncUpdates, boolean z7, Composer composer, final int i, final int i2, final int i3) {
        zq3.h(qs2Var, "progress");
        Composer h = composer.h(-674272918);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.a : modifier;
        boolean z8 = (i3 & 8) != 0 ? false : z;
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z11 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : lottieDynamicProperties;
        Alignment e = (i3 & 512) != 0 ? Alignment.a.e() : alignment;
        ContentScale e2 = (i3 & 1024) != 0 ? ContentScale.a.e() : contentScale;
        boolean z12 = (i3 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? true : z5;
        boolean z13 = (i3 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z6;
        Map map2 = (i3 & 8192) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z14 = (32768 & i3) != 0 ? false : z7;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-674272918, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:94)");
        }
        h.z(185152052);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = new LottieDrawable();
            h.q(A);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) A;
        h.R();
        h.z(185152099);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = new Matrix();
            h.q(A2);
        }
        final Matrix matrix = (Matrix) A2;
        h.R();
        h.z(185152179);
        boolean S = h.S(lottieComposition);
        Object A3 = h.A();
        if (S || A3 == aVar.a()) {
            A3 = b0.e(null, null, 2, null);
            h.q(A3);
        }
        final sy4 sy4Var = (sy4) A3;
        h.R();
        h.z(185152231);
        if (lottieComposition == null || lottieComposition.d() == 0.0f) {
            final Modifier modifier3 = modifier2;
            BoxKt.a(modifier3, h, (i >> 6) & 14);
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                final boolean z15 = z8;
                final boolean z16 = z9;
                final boolean z17 = z10;
                final RenderMode renderMode3 = renderMode2;
                final boolean z18 = z11;
                final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
                final Alignment alignment2 = e;
                final ContentScale contentScale2 = e2;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final Map map3 = map2;
                final AsyncUpdates asyncUpdates3 = asyncUpdates2;
                final boolean z21 = z14;
                k.a(new gt2(qs2Var, modifier3, z15, z16, z17, renderMode3, z18, lottieDynamicProperties3, alignment2, contentScale2, z19, z20, map3, asyncUpdates3, z21, i, i2, i3) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                    final /* synthetic */ int $$changed;
                    final /* synthetic */ int $$changed1;
                    final /* synthetic */ int $$default;
                    final /* synthetic */ Alignment $alignment;
                    final /* synthetic */ boolean $applyOpacityToLayers;
                    final /* synthetic */ AsyncUpdates $asyncUpdates;
                    final /* synthetic */ boolean $clipTextToBoundingBox;
                    final /* synthetic */ boolean $clipToCompositionBounds;
                    final /* synthetic */ ContentScale $contentScale;
                    final /* synthetic */ LottieDynamicProperties $dynamicProperties;
                    final /* synthetic */ boolean $enableMergePaths;
                    final /* synthetic */ Map<String, Typeface> $fontMap;
                    final /* synthetic */ boolean $maintainOriginalImageBounds;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ boolean $outlineMasksAndMattes;
                    final /* synthetic */ qs2 $progress;
                    final /* synthetic */ RenderMode $renderMode;
                    final /* synthetic */ boolean $safeMode;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                        this.$alignment = alignment2;
                        this.$contentScale = contentScale2;
                        this.$clipToCompositionBounds = z19;
                        this.$clipTextToBoundingBox = z20;
                        this.$fontMap = map3;
                        this.$asyncUpdates = asyncUpdates3;
                        this.$safeMode = z21;
                        this.$$changed = i;
                        this.$$changed1 = i2;
                        this.$$default = i3;
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        LottieAnimationKt.b(LottieComposition.this, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, null, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, composer2, gt6.a(this.$$changed | 1), gt6.a(this.$$changed1), this.$$default);
                    }
                });
                return;
            }
            return;
        }
        h.R();
        final Rect b = lottieComposition.b();
        final ContentScale contentScale3 = e2;
        final Alignment alignment3 = e;
        final boolean z22 = z10;
        final boolean z23 = z14;
        final RenderMode renderMode4 = renderMode2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final Modifier modifier4 = modifier2;
        final Map map4 = map2;
        final LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
        final boolean z24 = z8;
        final boolean z25 = z9;
        final boolean z26 = z11;
        final boolean z27 = z12;
        final boolean z28 = z13;
        CanvasKt.a(wb4.a(modifier2, b.width(), b.height()), new ss2(b, contentScale3, alignment3, matrix, lottieDrawable, z22, z23, renderMode4, asyncUpdates4, lottieComposition, map4, lottieDynamicProperties4, z24, z25, z26, z27, z28, qs2Var, sy4Var) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
            final /* synthetic */ Alignment $alignment;
            final /* synthetic */ boolean $applyOpacityToLayers;
            final /* synthetic */ AsyncUpdates $asyncUpdates;
            final /* synthetic */ Rect $bounds;
            final /* synthetic */ boolean $clipTextToBoundingBox;
            final /* synthetic */ boolean $clipToCompositionBounds;
            final /* synthetic */ LottieComposition $composition;
            final /* synthetic */ ContentScale $contentScale;
            final /* synthetic */ LottieDrawable $drawable;
            final /* synthetic */ LottieDynamicProperties $dynamicProperties;
            final /* synthetic */ boolean $enableMergePaths;
            final /* synthetic */ Map<String, Typeface> $fontMap;
            final /* synthetic */ boolean $maintainOriginalImageBounds;
            final /* synthetic */ Matrix $matrix;
            final /* synthetic */ boolean $outlineMasksAndMattes;
            final /* synthetic */ qs2 $progress;
            final /* synthetic */ RenderMode $renderMode;
            final /* synthetic */ boolean $safeMode;
            final /* synthetic */ sy4 $setDynamicProperties$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.$outlineMasksAndMattes = z24;
                this.$applyOpacityToLayers = z25;
                this.$maintainOriginalImageBounds = z26;
                this.$clipToCompositionBounds = z27;
                this.$clipTextToBoundingBox = z28;
                this.$progress = qs2Var;
                this.$setDynamicProperties$delegate = sy4Var;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((fv1) obj);
                return ww8.a;
            }

            public final void invoke(fv1 fv1Var) {
                long i4;
                zq3.h(fv1Var, "$this$Canvas");
                Rect rect = this.$bounds;
                ContentScale contentScale4 = this.$contentScale;
                Alignment alignment4 = this.$alignment;
                Matrix matrix2 = this.$matrix;
                LottieDrawable lottieDrawable2 = this.$drawable;
                boolean z29 = this.$enableMergePaths;
                boolean z30 = this.$safeMode;
                RenderMode renderMode5 = this.$renderMode;
                AsyncUpdates asyncUpdates5 = this.$asyncUpdates;
                LottieComposition lottieComposition2 = this.$composition;
                Map<String, Typeface> map5 = this.$fontMap;
                boolean z31 = this.$outlineMasksAndMattes;
                boolean z32 = this.$applyOpacityToLayers;
                boolean z33 = this.$maintainOriginalImageBounds;
                boolean z34 = this.$clipToCompositionBounds;
                boolean z35 = this.$clipTextToBoundingBox;
                qs2 qs2Var2 = this.$progress;
                sy4 sy4Var2 = this.$setDynamicProperties$delegate;
                ph0 c = fv1Var.i1().c();
                long a = du7.a(rect.width(), rect.height());
                long a2 = in3.a(dg4.d(zt7.i(fv1Var.b())), dg4.d(zt7.g(fv1Var.b())));
                long a3 = contentScale4.a(a, fv1Var.b());
                i4 = LottieAnimationKt.i(a, a3);
                long a4 = alignment4.a(i4, a2, fv1Var.getLayoutDirection());
                matrix2.reset();
                matrix2.preTranslate(vm3.j(a4), vm3.k(a4));
                matrix2.preScale(ma7.b(a3), ma7.c(a3));
                lottieDrawable2.A(z29);
                lottieDrawable2.e1(z30);
                lottieDrawable2.b1(renderMode5);
                lottieDrawable2.E0(asyncUpdates5);
                lottieDrawable2.H0(lottieComposition2);
                lottieDrawable2.K0(map5);
                LottieAnimationKt.f(sy4Var2);
                lottieDrawable2.Y0(z31);
                lottieDrawable2.D0(z32);
                lottieDrawable2.P0(z33);
                lottieDrawable2.G0(z34);
                lottieDrawable2.F0(z35);
                lottieDrawable2.a1(((Number) qs2Var2.mo865invoke()).floatValue());
                lottieDrawable2.setBounds(0, 0, rect.width(), rect.height());
                lottieDrawable2.y(wd.d(c), matrix2);
            }
        }, h, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            final boolean z29 = z8;
            final boolean z30 = z9;
            final boolean z31 = z10;
            final RenderMode renderMode5 = renderMode2;
            final boolean z32 = z11;
            final LottieDynamicProperties lottieDynamicProperties5 = lottieDynamicProperties2;
            final Alignment alignment4 = e;
            final ContentScale contentScale4 = e2;
            final boolean z33 = z12;
            final boolean z34 = z13;
            final Map map5 = map2;
            final AsyncUpdates asyncUpdates5 = asyncUpdates2;
            final boolean z35 = z14;
            k2.a(new gt2(qs2Var, modifier4, z29, z30, z31, renderMode5, z32, lottieDynamicProperties5, alignment4, contentScale4, z33, z34, map5, asyncUpdates5, z35, i, i2, i3) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ Alignment $alignment;
                final /* synthetic */ boolean $applyOpacityToLayers;
                final /* synthetic */ AsyncUpdates $asyncUpdates;
                final /* synthetic */ boolean $clipTextToBoundingBox;
                final /* synthetic */ boolean $clipToCompositionBounds;
                final /* synthetic */ ContentScale $contentScale;
                final /* synthetic */ LottieDynamicProperties $dynamicProperties;
                final /* synthetic */ boolean $enableMergePaths;
                final /* synthetic */ Map<String, Typeface> $fontMap;
                final /* synthetic */ boolean $maintainOriginalImageBounds;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ boolean $outlineMasksAndMattes;
                final /* synthetic */ qs2 $progress;
                final /* synthetic */ RenderMode $renderMode;
                final /* synthetic */ boolean $safeMode;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$alignment = alignment4;
                    this.$contentScale = contentScale4;
                    this.$clipToCompositionBounds = z33;
                    this.$clipTextToBoundingBox = z34;
                    this.$fontMap = map5;
                    this.$asyncUpdates = asyncUpdates5;
                    this.$safeMode = z35;
                    this.$$changed = i;
                    this.$$changed1 = i2;
                    this.$$default = i3;
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    LottieAnimationKt.b(LottieComposition.this, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, null, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, composer2, gt6.a(this.$$changed | 1), gt6.a(this.$$changed1), this.$$default);
                }
            });
        }
    }

    public static final void c(final LottieComposition lottieComposition, Modifier modifier, boolean z, boolean z2, LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, RenderMode renderMode, boolean z6, boolean z7, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z8, boolean z9, Map map, boolean z10, AsyncUpdates asyncUpdates, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        Composer h = composer.h(-1151869807);
        final Modifier modifier2 = (i5 & 2) != 0 ? Modifier.a : modifier;
        final boolean z11 = (i5 & 4) != 0 ? true : z;
        boolean z12 = (i5 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i5 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z13 = (i5 & 128) != 0 ? false : z3;
        boolean z14 = (i5 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z4;
        boolean z15 = (i5 & 512) != 0 ? false : z5;
        RenderMode renderMode2 = (i5 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z16 = (i5 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? false : z6;
        boolean z17 = (i5 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z7;
        LottieDynamicProperties lottieDynamicProperties2 = (i5 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment e = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Alignment.a.e() : alignment;
        ContentScale e2 = (32768 & i5) != 0 ? ContentScale.a.e() : contentScale;
        boolean z18 = (65536 & i5) != 0 ? true : z8;
        boolean z19 = (131072 & i5) != 0 ? false : z9;
        Map map2 = (262144 & i5) != 0 ? null : map;
        boolean z20 = (524288 & i5) != 0 ? false : z10;
        AsyncUpdates asyncUpdates2 = (1048576 & i5) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1151869807, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:211)");
        }
        int i7 = i2 >> 3;
        final xb4 c = AnimateLottieCompositionAsStateKt.c(lottieComposition, z11, z12, z16, lottieClipSpec2, f2, i6, null, false, false, h, (i7 & 896) | (i7 & ContentType.LONG_FORM_ON_DEMAND) | 8 | ((i3 << 6) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        h.z(185157078);
        boolean S = h.S(c);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Float mo865invoke() {
                    float e3;
                    e3 = LottieAnimationKt.e(xb4.this);
                    return Float.valueOf(e3);
                }
            };
            h.q(A);
        }
        qs2 qs2Var = (qs2) A;
        h.R();
        int i8 = i2 >> 12;
        int i9 = ((i2 << 3) & 896) | 134217736 | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | ((i3 << 18) & 3670016);
        int i10 = i3 << 15;
        int i11 = i9 | (29360128 & i10) | (i10 & 1879048192);
        int i12 = i3 >> 15;
        b(lottieComposition, qs2Var, modifier2, z13, z14, z15, renderMode2, z17, lottieDynamicProperties2, e, e2, z18, z19, map2, asyncUpdates2, z20, h, i11, (i12 & 896) | (i12 & 14) | ProgressEvent.PART_FAILED_EVENT_CODE | (i12 & ContentType.LONG_FORM_ON_DEMAND) | (57344 & (i4 << 12)) | ((i3 >> 12) & 458752), 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final boolean z21 = z12;
            final LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
            final float f3 = f2;
            final int i13 = i6;
            final boolean z22 = z13;
            final boolean z23 = z14;
            final boolean z24 = z15;
            final RenderMode renderMode3 = renderMode2;
            final boolean z25 = z16;
            final boolean z26 = z17;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final Alignment alignment2 = e;
            final ContentScale contentScale2 = e2;
            final boolean z27 = z18;
            final boolean z28 = z19;
            final Map map3 = map2;
            final boolean z29 = z20;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            k.a(new gt2(modifier2, z11, z21, lottieClipSpec3, f3, i13, z22, z23, z24, renderMode3, z25, z26, lottieDynamicProperties3, alignment2, contentScale2, z27, z28, map3, z29, asyncUpdates3, i2, i3, i4, i5) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$changed2;
                final /* synthetic */ int $$default;
                final /* synthetic */ Alignment $alignment;
                final /* synthetic */ boolean $applyOpacityToLayers;
                final /* synthetic */ AsyncUpdates $asyncUpdates;
                final /* synthetic */ LottieClipSpec $clipSpec;
                final /* synthetic */ boolean $clipTextToBoundingBox;
                final /* synthetic */ boolean $clipToCompositionBounds;
                final /* synthetic */ ContentScale $contentScale;
                final /* synthetic */ LottieDynamicProperties $dynamicProperties;
                final /* synthetic */ boolean $enableMergePaths;
                final /* synthetic */ Map<String, Typeface> $fontMap;
                final /* synthetic */ boolean $isPlaying;
                final /* synthetic */ int $iterations;
                final /* synthetic */ boolean $maintainOriginalImageBounds;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ boolean $outlineMasksAndMattes;
                final /* synthetic */ RenderMode $renderMode;
                final /* synthetic */ boolean $restartOnPlay;
                final /* synthetic */ boolean $reverseOnRepeat;
                final /* synthetic */ boolean $safeMode;
                final /* synthetic */ float $speed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$speed = f3;
                    this.$iterations = i13;
                    this.$outlineMasksAndMattes = z22;
                    this.$applyOpacityToLayers = z23;
                    this.$enableMergePaths = z24;
                    this.$renderMode = renderMode3;
                    this.$reverseOnRepeat = z25;
                    this.$maintainOriginalImageBounds = z26;
                    this.$alignment = alignment2;
                    this.$contentScale = contentScale2;
                    this.$clipToCompositionBounds = z27;
                    this.$clipTextToBoundingBox = z28;
                    this.$fontMap = map3;
                    this.$safeMode = z29;
                    this.$asyncUpdates = asyncUpdates3;
                    this.$$changed = i2;
                    this.$$changed1 = i3;
                    this.$$changed2 = i4;
                    this.$$default = i5;
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i14) {
                    LottieAnimationKt.c(LottieComposition.this, this.$modifier, this.$isPlaying, this.$restartOnPlay, null, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, null, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$safeMode, this.$asyncUpdates, composer2, gt6.a(this.$$changed | 1), gt6.a(this.$$changed1), gt6.a(this.$$changed2), this.$$default);
                }
            });
        }
    }

    private static final LottieDynamicProperties d(sy4 sy4Var) {
        lh4.a(sy4Var.getValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(xb4 xb4Var) {
        return ((Number) xb4Var.getValue()).floatValue();
    }

    public static final /* synthetic */ LottieDynamicProperties f(sy4 sy4Var) {
        d(sy4Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j, long j2) {
        return in3.a((int) (zt7.i(j) * ma7.b(j2)), (int) (zt7.g(j) * ma7.c(j2)));
    }
}
