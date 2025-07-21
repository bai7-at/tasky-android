package defpackage;

import com.nytimes.android.logging.NYTLogger;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class g05 implements Consumer {
    private final Class a;

    public g05(Class cls) {
        this.a = cls;
    }

    @Override // io.reactivex.functions.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        NYTLogger.i(th, "Error in " + this.a, new Object[0]);
    }
}
