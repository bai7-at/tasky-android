package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class YieldContext extends kotlin.coroutines.a {
    public static final Key Key = new Key(null);
    public boolean dispatcherWasUnconfined;

    public static final class Key implements CoroutineContext.b {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public YieldContext() {
        super(Key);
    }
}
