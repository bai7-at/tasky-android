package io.embrace.android.embracesdk;

@Deprecated
/* loaded from: classes5.dex */
public enum LogType {
    INFO,
    WARNING,
    ERROR;

    /* renamed from: io.embrace.android.embracesdk.LogType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$embrace$android$embracesdk$LogType;

        static {
            int[] iArr = new int[LogType.values().length];
            $SwitchMap$io$embrace$android$embracesdk$LogType = iArr;
            try {
                iArr[LogType.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$embrace$android$embracesdk$LogType[LogType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    final EventType toEventType() {
        int i = AnonymousClass1.$SwitchMap$io$embrace$android$embracesdk$LogType[ordinal()];
        return i != 1 ? i != 2 ? EventType.INFO_LOG : EventType.ERROR_LOG : EventType.WARNING_LOG;
    }
}
