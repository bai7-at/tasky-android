package kotlinx.coroutines.test;

import defpackage.ss2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* loaded from: classes5.dex */
public final class TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1 extends Lambda implements ss2 {
    public static final TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1 INSTANCE = new TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1();

    public TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1() {
        super(1);
    }

    @Override // defpackage.ss2
    public final Boolean invoke(Job job) {
        return Boolean.valueOf(job.isActive());
    }
}
