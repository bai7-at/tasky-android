package defpackage;

import io.reactivex.functions.Function;
import java.util.AbstractMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class tq6 implements Function {
    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return ((AbstractMap.SimpleEntry) obj).getValue();
    }
}
