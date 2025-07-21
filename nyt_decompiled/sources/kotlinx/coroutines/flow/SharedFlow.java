package kotlinx.coroutines.flow;

import defpackage.by0;
import java.util.List;

/* loaded from: classes5.dex */
public interface SharedFlow<T> extends Flow<T> {
    @Override // kotlinx.coroutines.flow.Flow
    Object collect(FlowCollector<? super T> flowCollector, by0<?> by0Var);

    List<T> getReplayCache();
}
