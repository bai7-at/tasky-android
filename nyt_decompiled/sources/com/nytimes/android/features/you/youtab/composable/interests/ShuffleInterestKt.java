package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.snapping.e;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.SaveOrigin;
import defpackage.ap0;
import defpackage.bc0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fv0;
import defpackage.g14;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.j14;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.lm9;
import defpackage.m37;
import defpackage.n37;
import defpackage.py1;
import defpackage.qk2;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.s87;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t5;
import defpackage.t87;
import defpackage.ww8;
import defpackage.x08;
import defpackage.y25;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class ShuffleInterestKt {
    public static final void a(final Interest.ShuffleInterest shuffleInterest, final int i, final gt2 gt2Var, final SaveHandler saveHandler, final ss2 ss2Var, final qs2 qs2Var, final gt2 gt2Var2, Modifier modifier, Composer composer, final int i2, final int i3) {
        by0 by0Var;
        InterestAsset b;
        s87 h;
        String str;
        int i4;
        j Q0;
        InterestAsset b2;
        String j;
        InterestAsset b3;
        zq3.h(shuffleInterest, "interest");
        zq3.h(gt2Var, "onAssetClick");
        zq3.h(saveHandler, "saveHandler");
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(qs2Var, "sendAddInterestImpression");
        zq3.h(gt2Var2, "sendAssetImpressionEvent");
        Composer h2 = composer.h(-1150305070);
        Modifier modifier2 = (i3 & 128) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1150305070, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterest (ShuffleInterest.kt:76)");
        }
        float f = 16;
        Modifier k = PaddingKt.k(modifier2, bu1.g(f), 0.0f, 2, null);
        h2.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g = arrangement.g();
        Alignment.a aVar = Alignment.a;
        rg4 a = d.a(g, aVar.k(), h2, 0);
        h2.z(-1323940314);
        int a2 = cs0.a(h2, 0);
        et0 o = h2.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(k);
        if (h2.j() == null) {
            cs0.c();
        }
        h2.G();
        if (h2.f()) {
            h2.D(a3);
        } else {
            h2.p();
        }
        Composer a4 = Updater.a(h2);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b4 = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b4);
        }
        c.invoke(ju7.a(ju7.b(h2)), h2, 0);
        h2.z(2058660585);
        ap0 ap0Var = ap0.a;
        ww8 ww8Var = ww8.a;
        h2.z(550876667);
        boolean z = (((458752 & i2) ^ 196608) > 131072 && h2.S(qs2Var)) || (196608 & i2) == 131072;
        Object A = h2.A();
        if (z || A == Composer.a.a()) {
            A = new ShuffleInterestKt$ShuffleInterest$1$1$1(qs2Var, null);
            h2.q(A);
        }
        h2.R();
        py1.d(ww8Var, (gt2) A, h2, 70);
        final float g2 = bu1.g(240);
        final float g3 = g2 / bu1.g((float) 1.25d);
        final LazyListState c2 = LazyListStateKt.c(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (int) (bu1.g(-g2) / bu1.g((float) 2.2d)), h2, 6, 0);
        final ComponentActivity d = t5.d(h2, 0);
        h2.z(550877190);
        Object A2 = h2.A();
        Composer.a aVar2 = Composer.a;
        if (A2 == aVar2.a()) {
            A2 = y.d(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$currentItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
                
                    r0 = com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt.f(r0, r2);
                 */
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.nytimes.android.interests.db.Interest.PersonalizedItem mo865invoke() {
                    /*
                        r3 = this;
                        androidx.compose.foundation.lazy.LazyListState r0 = androidx.compose.foundation.lazy.LazyListState.this
                        j14 r0 = r0.x()
                        java.util.List r1 = r0.k()
                        boolean r1 = r1.isEmpty()
                        r2 = 0
                        if (r1 == 0) goto L12
                        return r2
                    L12:
                        float r1 = r2
                        g14 r0 = com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt.d(r0, r1)
                        if (r0 == 0) goto L36
                        int r0 = r0.getIndex()
                        com.nytimes.android.interests.db.Interest$ShuffleInterest r1 = r3
                        java.util.List r1 = r1.d()
                        com.nytimes.android.interests.db.Interest$ShuffleInterest r3 = r3
                        java.util.List r3 = r3.d()
                        int r3 = r3.size()
                        int r0 = r0 % r3
                        java.lang.Object r3 = r1.get(r0)
                        com.nytimes.android.interests.db.Interest$PersonalizedItem r3 = (com.nytimes.android.interests.db.Interest.PersonalizedItem) r3
                        return r3
                    L36:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$currentItem$2$1.mo865invoke():com.nytimes.android.interests.db.Interest$PersonalizedItem");
                }
            });
            h2.q(A2);
        }
        final x08 x08Var = (x08) A2;
        h2.R();
        Modifier.a aVar3 = Modifier.a;
        final Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.a(PaddingKt.m(aVar3, 0.0f, bu1.g(8), 0.0f, bu1.g(20), 5, null), null, false, zr0.b(h2, 837064838, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(final bc0 bc0Var, Composer composer2, int i5) {
                int i6;
                zq3.h(bc0Var, "$this$BoxWithConstraints");
                if ((i5 & 14) == 0) {
                    i6 = i5 | (composer2.S(bc0Var) ? 4 : 2);
                } else {
                    i6 = i5;
                }
                if ((i6 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(837064838, i6, -1, "com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterest.<anonymous>.<anonymous> (ShuffleInterest.kt:107)");
                }
                Arrangement.f n = Arrangement.a.n(bu1.g(-bu1.g(g3)));
                Alignment.c i7 = Alignment.a.i();
                qk2 e = e.e(c2, composer2, 0);
                Modifier y = SizeKt.y(Modifier.a, null, false, 3, null);
                final LazyListState lazyListState = c2;
                final Interest.ShuffleInterest shuffleInterest2 = shuffleInterest;
                final gt2 gt2Var3 = gt2Var2;
                final gt2 gt2Var4 = gt2Var;
                final int i8 = i;
                final ComponentActivity componentActivity = d;
                final float f2 = g2;
                final ss2 ss2Var2 = ss2Var;
                LazyDslKt.b(y, lazyListState, null, false, n, i7, e, false, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2.1

                    /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C03121 extends Lambda implements kt2 {
                        final /* synthetic */ ComponentActivity $activity;
                        final /* synthetic */ ss2 $assetHasBeenViewed;
                        final /* synthetic */ float $contentWidth;
                        final /* synthetic */ Interest.ShuffleInterest $interest;
                        final /* synthetic */ int $interestID;
                        final /* synthetic */ LazyListState $listState;
                        final /* synthetic */ gt2 $onAssetClick;
                        final /* synthetic */ gt2 $sendAssetImpressionEvent;
                        final /* synthetic */ bc0 $this_BoxWithConstraints;

                        @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2$1$1$1", f = "ShuffleInterest.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C03131 extends SuspendLambda implements gt2 {
                            final /* synthetic */ sy4 $hasSentImpression$delegate;
                            final /* synthetic */ Interest.ShuffleInterest $interest;
                            final /* synthetic */ x08 $isCenteredItem$delegate;
                            final /* synthetic */ Interest.PersonalizedItem $item;
                            final /* synthetic */ gt2 $sendAssetImpressionEvent;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C03131(gt2 gt2Var, Interest.PersonalizedItem personalizedItem, Interest.ShuffleInterest shuffleInterest, x08 x08Var, sy4 sy4Var, by0 by0Var) {
                                super(2, by0Var);
                                this.$sendAssetImpressionEvent = gt2Var;
                                this.$item = personalizedItem;
                                this.$interest = shuffleInterest;
                                this.$isCenteredItem$delegate = x08Var;
                                this.$hasSentImpression$delegate = sy4Var;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final by0 create(Object obj, by0 by0Var) {
                                return new C03131(this.$sendAssetImpressionEvent, this.$item, this.$interest, this.$isCenteredItem$delegate, this.$hasSentImpression$delegate, by0Var);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                a.h();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                                if (C03121.i(this.$isCenteredItem$delegate) && !C03121.j(this.$hasSentImpression$delegate)) {
                                    C03121.k(this.$hasSentImpression$delegate, true);
                                    this.$sendAssetImpressionEvent.invoke(this.$item, cc0.c(this.$interest.d().indexOf(this.$item)));
                                }
                                return ww8.a;
                            }

                            @Override // defpackage.gt2
                            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                return ((C03131) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C03121(Interest.ShuffleInterest shuffleInterest, bc0 bc0Var, LazyListState lazyListState, gt2 gt2Var, gt2 gt2Var2, int i, ComponentActivity componentActivity, float f, ss2 ss2Var) {
                            super(4);
                            this.$interest = shuffleInterest;
                            this.$this_BoxWithConstraints = bc0Var;
                            this.$listState = lazyListState;
                            this.$sendAssetImpressionEvent = gt2Var;
                            this.$onAssetClick = gt2Var2;
                            this.$interestID = i;
                            this.$activity = componentActivity;
                            this.$contentWidth = f;
                            this.$assetHasBeenViewed = ss2Var;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final float h(x08 x08Var) {
                            return ((Number) x08Var.getValue()).floatValue();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final boolean i(x08 x08Var) {
                            return ((Boolean) x08Var.getValue()).booleanValue();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final boolean j(sy4 sy4Var) {
                            return ((Boolean) sy4Var.getValue()).booleanValue();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void k(sy4 sy4Var, boolean z) {
                            sy4Var.setValue(Boolean.valueOf(z));
                        }

                        @Override // defpackage.kt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, final int i, Composer composer, int i2) {
                            int i3;
                            zq3.h(h04Var, "$this$items");
                            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                i3 = i2 | (composer.d(i) ? 32 : 16);
                            } else {
                                i3 = i2;
                            }
                            if ((i3 & 721) == 144 && composer.i()) {
                                composer.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1649745969, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterest.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShuffleInterest.kt:115)");
                            }
                            final Interest.PersonalizedItem personalizedItem = (Interest.PersonalizedItem) this.$interest.d().get(i % this.$interest.d().size());
                            final int n = fv0.n(this.$this_BoxWithConstraints.b()) / 2;
                            composer.z(668026008);
                            final LazyListState lazyListState = this.$listState;
                            Object A = composer.A();
                            Composer.a aVar = Composer.a;
                            if (A == aVar.a()) {
                                A = y.d(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007f: INVOKE (r6v8 'A' java.lang.Object) = 
                                      (wrap:qs2:0x007c: CONSTRUCTOR 
                                      (r5v1 'lazyListState' androidx.compose.foundation.lazy.LazyListState A[DONT_INLINE])
                                      (r3v10 'n' int A[DONT_INLINE])
                                      (r19v0 'i' int A[DONT_INLINE])
                                     A[MD:(androidx.compose.foundation.lazy.LazyListState, int, int):void (m), WRAPPED] (LINE:9) call: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2$1$1$scale$2$1.<init>(androidx.compose.foundation.lazy.LazyListState, int, int):void type: CONSTRUCTOR)
                                     STATIC call: androidx.compose.runtime.y.d(qs2):x08 A[MD:(qs2):x08 (m)] (LINE:9) in method: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt.ShuffleInterest.1.2.1.1.invoke(h04, int, androidx.compose.runtime.Composer, int):void, file: classes4.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2$1$1$scale$2$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 140 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 347
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$2.AnonymousClass1.C03121.invoke(h04, int, androidx.compose.runtime.Composer, int):void");
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LazyListScope) obj);
                            return ww8.a;
                        }

                        public final void invoke(LazyListScope lazyListScope) {
                            zq3.h(lazyListScope, "$this$LazyRow");
                            LazyListScope.e(lazyListScope, Integer.MAX_VALUE, null, null, zr0.c(1649745969, true, new C03121(Interest.ShuffleInterest.this, bc0Var, lazyListState, gt2Var3, gt2Var4, i8, componentActivity, f2, ss2Var2)), 6, null);
                        }
                    }, composer2, 196614, 140);
                    if (b.G()) {
                        b.R();
                    }
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((bc0) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }
            }), h2, 3072, 6);
            Interest.PersonalizedItem b5 = b(x08Var);
            h2.z(550882651);
            boolean S = h2.S(b5);
            Object A3 = h2.A();
            if (S || A3 == aVar2.a()) {
                Interest.PersonalizedItem b6 = b(x08Var);
                by0Var = null;
                A3 = b0.e(Boolean.valueOf((b6 == null || (b = b6.b()) == null || (h = h(b)) == null) ? false : saveHandler.p(h)), null, 2, null);
                h2.q(A3);
            } else {
                by0Var = null;
            }
            final sy4 sy4Var = (sy4) A3;
            h2.R();
            py1.d(b(x08Var), new ShuffleInterestKt$ShuffleInterest$1$3(x08Var, saveHandler, sy4Var, by0Var), h2, 72);
            Modifier h3 = SizeKt.h(PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(f), 7, null), 0.0f, 1, null);
            Arrangement.f d2 = arrangement.d();
            h2.z(693286680);
            rg4 a5 = m.a(d2, aVar.l(), h2, 6);
            h2.z(-1323940314);
            int a6 = cs0.a(h2, 0);
            et0 o2 = h2.o();
            qs2 a7 = companion.a();
            it2 c3 = LayoutKt.c(h3);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a7);
            } else {
                h2.p();
            }
            Composer a8 = Updater.a(h2);
            Updater.c(a8, a5, companion.e());
            Updater.c(a8, o2, companion.g());
            gt2 b7 = companion.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b7);
            }
            c3.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            n37 n37Var = n37.a;
            Interest.PersonalizedItem b8 = b(x08Var);
            if (b8 == null || (b3 = b8.b()) == null || (str = b3.h()) == null) {
                str = "";
            }
            String str2 = str;
            Interest.PersonalizedItem b9 = b(x08Var);
            if (b9 == null || (b2 = b9.b()) == null || (j = b2.j()) == null || !((Boolean) ss2Var.invoke(j)).booleanValue()) {
                i4 = 8;
                h2.z(1530406815);
                Q0 = eb5.Companion.c(h2, 8).Q0();
                h2.R();
            } else {
                h2.z(1530406638);
                eb5.a aVar4 = eb5.Companion;
                i4 = 8;
                Q0 = r43.f((r48 & 1) != 0 ? r43.a.i() : aVar4.b(h2, 8).e(), (r48 & 2) != 0 ? r43.a.m() : 0L, (r48 & 4) != 0 ? r43.a.p() : null, (r48 & 8) != 0 ? r43.a.n() : null, (r48 & 16) != 0 ? r43.a.o() : null, (r48 & 32) != 0 ? r43.a.k() : null, (r48 & 64) != 0 ? r43.a.l() : null, (r48 & 128) != 0 ? r43.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r43.a.g() : null, (r48 & 512) != 0 ? r43.a.w() : null, (r48 & 1024) != 0 ? r43.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r43.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r43.a.u() : null, (r48 & 8192) != 0 ? r43.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r43.a.j() : null, (r48 & 32768) != 0 ? r43.b.h() : 0, (r48 & 65536) != 0 ? r43.b.i() : 0, (r48 & 131072) != 0 ? r43.b.e() : 0L, (r48 & 262144) != 0 ? r43.b.j() : null, (r48 & 524288) != 0 ? r43.c : null, (r48 & Constants.MB) != 0 ? r43.b.f() : null, (r48 & 2097152) != 0 ? r43.b.d() : 0, (r48 & 4194304) != 0 ? r43.b.c() : 0, (r48 & 8388608) != 0 ? aVar4.c(h2, 8).Q0().b.k() : null);
                h2.R();
            }
            TextKt.b(str2, ClickableKt.e(m37.b(n37Var, aVar3, 1.0f, false, 2, null), false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m514invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m514invoke() {
                    Interest.PersonalizedItem b10;
                    Interest.PersonalizedItem b11;
                    y25 g4;
                    b10 = ShuffleInterestKt.b(x08Var);
                    if (b10 != null) {
                        int i5 = i;
                        List d3 = shuffleInterest.d();
                        b11 = ShuffleInterestKt.b(x08Var);
                        g4 = ShuffleInterestKt.g(b10, i5, i.p0(d3, b11));
                        if (g4 != null) {
                            gt2Var.invoke(g4, d);
                        }
                    }
                }
            }, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 3, 3, null, Q0, h2, 0, 27648, 40956);
            IconKt.b(do5.d(((Boolean) sy4Var.getValue()).booleanValue() ? re6.ic_saved : re6.ic_save, h2, 0), null, ClickableKt.e(SizeKt.n(aVar3, bu1.g(24)), false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$4$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m515invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m515invoke() {
                    Interest.PersonalizedItem b10;
                    InterestAsset b11;
                    b10 = ShuffleInterestKt.b(x08Var);
                    s87 h4 = (b10 == null || (b11 = b10.b()) == null) ? null : ShuffleInterestKt.h(b11);
                    if (h4 != null) {
                        if (((Boolean) sy4.this.getValue()).booleanValue()) {
                            SaveHandler saveHandler2 = saveHandler;
                            SaveOrigin saveOrigin = SaveOrigin.SHUFFLE_INTEREST;
                            final sy4 sy4Var2 = sy4.this;
                            saveHandler2.t(null, h4, saveOrigin, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$4$3.1
                                {
                                    super(1);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke(((Boolean) obj).booleanValue());
                                    return ww8.a;
                                }

                                public final void invoke(boolean z2) {
                                    sy4.this.setValue(Boolean.valueOf(z2));
                                }
                            });
                            return;
                        }
                        SaveHandler saveHandler3 = saveHandler;
                        SaveOrigin saveOrigin2 = SaveOrigin.SHUFFLE_INTEREST;
                        final sy4 sy4Var3 = sy4.this;
                        saveHandler3.m(null, h4, saveOrigin2, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$1$4$3.2
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return ww8.a;
                            }

                            public final void invoke(boolean z2) {
                                sy4.this.setValue(Boolean.valueOf(z2));
                            }
                        });
                    }
                }
            }, 7, null), eb5.Companion.a(h2, i4).S(), h2, 56, 0);
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            if (b.G()) {
                b.R();
            }
            cc7 k2 = h2.k();
            if (k2 != null) {
                k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ShuffleInterestKt$ShuffleInterest$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ShuffleInterestKt.a(Interest.ShuffleInterest.this, i, gt2Var, saveHandler, ss2Var, qs2Var, gt2Var2, modifier3, composer2, gt6.a(i2 | 1), i3);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Interest.PersonalizedItem b(x08 x08Var) {
            return (Interest.PersonalizedItem) x08Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g14 f(j14 j14Var, float f) {
            List<g14> a1 = i.a1(j14Var.k());
            if (a1.isEmpty()) {
                return null;
            }
            int i = ((int) f) / 3;
            int g = (j14Var.g() / 2) - i;
            int g2 = (j14Var.g() / 2) + i;
            for (g14 g14Var : a1) {
                int b = g14Var.b() + (g14Var.a() / 2);
                if (g + 1 <= b && b < g2) {
                    return g14Var;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y25 g(Interest.PersonalizedItem personalizedItem, int i, int i2) {
            String k = personalizedItem.b().k();
            InterestType interestType = InterestType.SHUFFLE;
            return new y25(k, interestType.getType(), personalizedItem.b().j(), interestType.getType(), interestType.getType(), zq3.c(personalizedItem.b().i(), AssetConstants.PROMO_TYPE) || zq3.c(personalizedItem.b().i(), AssetConstants.INTERACTIVE_TYPE), false, null, Integer.valueOf(i2), NavigationSource.YOU_TAB_SHUFFLE, null, String.valueOf(i), "you tab", "interests-hub", interestType.getType(), null, lm9.a(personalizedItem.c()), null, null, 425984, null);
        }

        public static final s87 h(InterestAsset interestAsset) {
            zq3.h(interestAsset, "<this>");
            return new t87(interestAsset.j(), interestAsset.k());
        }
    }
