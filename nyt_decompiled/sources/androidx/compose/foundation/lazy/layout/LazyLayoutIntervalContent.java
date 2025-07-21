package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.a;
import defpackage.ss2;

/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent {

    public interface Interval {
        ss2 getKey();

        default ss2 getType() {
            return new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                public final Void b(int i) {
                    return null;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            };
        }
    }

    public final Object g(int i) {
        a.C0029a c0029a = h().get(i);
        return ((Interval) c0029a.c()).getType().invoke(Integer.valueOf(i - c0029a.b()));
    }

    public abstract a h();

    public final int i() {
        return h().a();
    }

    public final Object j(int i) {
        Object invoke;
        a.C0029a c0029a = h().get(i);
        int b = i - c0029a.b();
        ss2 key = ((Interval) c0029a.c()).getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(b))) == null) ? g.a(i) : invoke;
    }
}
