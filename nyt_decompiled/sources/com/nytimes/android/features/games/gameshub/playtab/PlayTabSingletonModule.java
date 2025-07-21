package com.nytimes.android.features.games.gameshub.playtab;

import android.content.Context;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupAlwaysExpanded;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.features.games.gameshub.PlayTabPreferencesStore;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fv5;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.wn1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface PlayTabSingletonModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final wn1 a(fv5 fv5Var, final PlayTabPreferencesStore playTabPreferencesStore) {
            DevSettingSwitchItem a2;
            DevSettingSwitchItem a3;
            DevSettingSwitchItem a4;
            zq3.h(fv5Var, "experiments");
            zq3.h(playTabPreferencesStore, "playTabPreferencesStore");
            DevSettingGroupAlwaysExpanded i = fv5Var.i();
            DevSettingSwitchItem devSettingSwitchItem = new DevSettingSwitchItem("Badge", new ss2() { // from class: com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1

                @fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1$1", f = "PlayTabSingletonModule.kt", l = {55}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ PlayTabPreferencesStore $playTabPreferencesStore;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PlayTabPreferencesStore playTabPreferencesStore, by0 by0Var) {
                        super(2, by0Var);
                        this.$playTabPreferencesStore = playTabPreferencesStore;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass1(this.$playTabPreferencesStore, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            final Flow b = this.$playTabPreferencesStore.b();
                            Flow flow = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR (r1v1 'flow' kotlinx.coroutines.flow.Flow) = (r4v2 'b' kotlinx.coroutines.flow.Flow A[DONT_INLINE]) A[DECLARE_VAR, MD:(kotlinx.coroutines.flow.Flow):void (m)] call: com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1$1$invokeSuspend$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow):void type: CONSTRUCTOR in method: com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes4.dex
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
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1$1$invokeSuspend$$inlined$map$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 109 more
                                */
                            /*
                                this = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                                int r1 = r3.label
                                r2 = 1
                                if (r1 == 0) goto L17
                                if (r1 != r2) goto Lf
                                kotlin.f.b(r4)
                                goto L2e
                            Lf:
                                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                                r3.<init>(r4)
                                throw r3
                            L17:
                                kotlin.f.b(r4)
                                com.nytimes.android.features.games.gameshub.PlayTabPreferencesStore r4 = r3.$playTabPreferencesStore
                                kotlinx.coroutines.flow.Flow r4 = r4.b()
                                com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1$1$invokeSuspend$$inlined$map$1 r1 = new com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1$1$invokeSuspend$$inlined$map$1
                                r1.<init>(r4)
                                r3.label = r2
                                java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.first(r1, r3)
                                if (r4 != r0) goto L2e
                                return r0
                            L2e:
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.playtab.PlayTabSingletonModule$Companion$provideDevSettingItem$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(Context context) {
                        Object runBlocking$default;
                        zq3.h(context, "it");
                        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(PlayTabPreferencesStore.this, null), 1, null);
                        return (Boolean) runBlocking$default;
                    }
                }, new PlayTabSingletonModule$Companion$provideDevSettingItem$2(playTabPreferencesStore, null), "Badge for new tab", "No badge", null, null, null, false, 480, null);
                a2 = DevSettingSwitchItemKt.a("Show a dialog after opening a game on the home", (r23 & 2) != 0 ? null : "Will show the dialog", (r23 & 4) != 0 ? null : "Dialog already shown", "playtab.onboarding.dialog", (r23 & 16) != 0 ? false : true, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Show a dialog after opening a game on the home" : null, (r23 & 512) != 0 ? null : null);
                a3 = DevSettingSwitchItemKt.a("Use Local Games Config", (r23 & 2) != 0 ? null : "Local Config Active", (r23 & 4) != 0 ? null : "Remote Config Active", "playtab.use.local.config", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Use Local Games Config" : null, (r23 & 512) != 0 ? null : null);
                a4 = DevSettingSwitchItemKt.a("Use Debug Data Use Case", (r23 & 2) != 0 ? null : "Debug Use Case Active", (r23 & 4) != 0 ? null : "Main Use Case Active", "playtab.use.debug.usecase", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Use Debug Data Use Case" : null, (r23 & 512) != 0 ? null : null);
                boolean z = false;
                return new DevSettingGroupExpandable("Play Tab", i.o(i, devSettingSwitchItem, a2, a3, a4), null, z, yn1.c.b, null, false, false, 236, null);
            }
        }
    }
