package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.runtime.Composer;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class InterestDisplayKt$InterestCard$1 extends Lambda implements gt2 {
    final /* synthetic */ gt2 $content;
    final /* synthetic */ String $description;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ boolean $isNewlyAdded;
    final /* synthetic */ qs2 $onRemoveClick;
    final /* synthetic */ qs2 $onReorderClick;
    final /* synthetic */ qs2 $onTitleClick;
    final /* synthetic */ qs2 $sendNewlyAddedLabelImpression;
    final /* synthetic */ qs2 $sendTabOnKebabMenuInteraction;
    final /* synthetic */ qs2 $sendUpdatedInterestDotImpression;
    final /* synthetic */ boolean $showNewContentBadge;
    final /* synthetic */ x08 $sortOrder$delegate;
    final /* synthetic */ String $title;
    final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestDisplayKt$InterestCard$1(boolean z, qs2 qs2Var, boolean z2, qs2 qs2Var2, gt2 gt2Var, String str, qs2 qs2Var3, String str2, String str3, qs2 qs2Var4, qs2 qs2Var5, qs2 qs2Var6, String str4, x08 x08Var) {
        super(2);
        this.$isNewlyAdded = z;
        this.$sendNewlyAddedLabelImpression = qs2Var;
        this.$showNewContentBadge = z2;
        this.$sendUpdatedInterestDotImpression = qs2Var2;
        this.$content = gt2Var;
        this.$uri = str;
        this.$onTitleClick = qs2Var3;
        this.$imageUrl = str2;
        this.$description = str3;
        this.$onRemoveClick = qs2Var4;
        this.$onReorderClick = qs2Var5;
        this.$sendTabOnKebabMenuInteraction = qs2Var6;
        this.$title = str4;
        this.$sortOrder$delegate = x08Var;
    }

    private static final boolean c(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return ww8.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 ??, still in use, count: 1, list:
          (r2v8 ?? I:java.lang.Object) from 0x0066: INVOKE (r83v0 ?? I:androidx.compose.runtime.Composer), (r2v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.q(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:8)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 ??, still in use, count: 1, list:
          (r2v8 ?? I:java.lang.Object) from 0x0066: INVOKE (r83v0 ?? I:androidx.compose.runtime.Composer), (r2v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.q(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:8)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r83v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
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
        */
}
