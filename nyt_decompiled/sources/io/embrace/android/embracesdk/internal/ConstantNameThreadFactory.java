package io.embrace.android.embracesdk.internal;

import defpackage.zq3;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ConstantNameThreadFactory implements ThreadFactory {
    private final ThreadFactory defaultFactory;
    private final String threadName;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantNameThreadFactory() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.defaultFactory.newThread(runnable);
        newThread.setName(this.threadName);
        zq3.g(newThread, "defaultFactory.newThread…ply { name = threadName }");
        return newThread;
    }

    public ConstantNameThreadFactory(String str, boolean z) {
        String str2;
        zq3.h(str, "namePrefix");
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        zq3.g(defaultThreadFactory, "Executors.defaultThreadFactory()");
        this.defaultFactory = defaultThreadFactory;
        StringBuilder sb = new StringBuilder();
        sb.append("emb-");
        sb.append(str);
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append(hashCode());
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        this.threadName = sb.toString();
    }

    public /* synthetic */ ConstantNameThreadFactory(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "thread" : str, (i & 2) != 0 ? false : z);
    }
}
