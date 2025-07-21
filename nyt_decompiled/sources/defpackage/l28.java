package defpackage;

import io.reactivex.Observable;
import io.reactivex.Single;

/* loaded from: classes4.dex */
public interface l28 {
    void clear();

    void clear(Object obj);

    void clearMemory();

    void clearMemory(Object obj);

    Single fetch(Object obj);

    Single fetchWithResult(Object obj);

    Single get(Object obj);

    Observable getRefreshing(Object obj);

    Single getWithResult(Object obj);

    Observable stream();

    Observable stream(Object obj);
}
