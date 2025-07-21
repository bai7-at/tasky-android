package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public class f15 {
    public Scheduler a() {
        return Schedulers.io();
    }

    public Scheduler b() {
        return AndroidSchedulers.mainThread();
    }
}
