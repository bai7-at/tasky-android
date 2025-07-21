package defpackage;

import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public interface q62 {
    ExecutorService a(ThreadFactory threadFactory, ThreadPriority threadPriority);
}
