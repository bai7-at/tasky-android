package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public interface kke extends ExecutorService {
    j64 j(Callable callable);

    j64 l(Runnable runnable);
}
