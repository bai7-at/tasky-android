package kotlinx.coroutines;

/* loaded from: classes5.dex */
final class Active implements NotCompleted {
    public static final Active INSTANCE = new Active();

    private Active() {
    }

    public String toString() {
        return "Active";
    }
}
