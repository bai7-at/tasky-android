package defpackage;

import rx.internal.operators.NotificationLite;

/* loaded from: classes5.dex */
public abstract class y47 implements gb8 {
    private static final NotificationLite a = NotificationLite.b();
    static int b;
    public static final int c;
    public static bc5 d;
    public static bc5 e;

    static class a extends bc5 {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.bc5
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public rz7 a() {
            return new rz7(y47.c);
        }
    }

    static class b extends bc5 {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.bc5
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ez7 a() {
            return new ez7(y47.c);
        }
    }

    static {
        b = 128;
        if (gu5.c()) {
            b = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                b = Integer.parseInt(property);
            } catch (Exception e2) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e2.getMessage());
            }
        }
        c = b;
        d = new a();
        e = new b();
    }
}
