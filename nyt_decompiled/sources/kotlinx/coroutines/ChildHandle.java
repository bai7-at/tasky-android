package kotlinx.coroutines;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface ChildHandle extends DisposableHandle {

    public static final class DefaultImpls {
        @InternalCoroutinesApi
        public static /* synthetic */ void getParent$annotations() {
        }
    }

    @InternalCoroutinesApi
    boolean childCancelled(Throwable th);

    Job getParent();
}
