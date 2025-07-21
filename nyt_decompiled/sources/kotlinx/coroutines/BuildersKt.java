package kotlinx.coroutines;

import defpackage.by0;
import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, coroutineContext, coroutineStart, gt2Var);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, gt2 gt2Var, by0<? super T> by0Var) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, gt2Var, by0Var);
    }

    public static final Job launch(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, coroutineContext, coroutineStart, gt2Var);
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$4(ClassGen.java:360)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:196)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:361)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
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
    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, gt2 gt2Var, int i, Object obj) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, coroutineStart, gt2Var, i, obj);
    }

    public static final <T> T runBlocking(CoroutineContext coroutineContext, gt2 gt2Var) throws InterruptedException {
        return (T) BuildersKt__BuildersKt.runBlocking(coroutineContext, gt2Var);
    }

    public static final <T> Object withContext(CoroutineContext coroutineContext, gt2 gt2Var, by0<? super T> by0Var) {
        return BuildersKt__Builders_commonKt.withContext(coroutineContext, gt2Var, by0Var);
    }
}
