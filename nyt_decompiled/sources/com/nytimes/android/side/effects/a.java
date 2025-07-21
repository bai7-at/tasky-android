package com.nytimes.android.side.effects;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.nytimes.android.side.effects.a$a, reason: collision with other inner class name */
    public static final class C0405a {
        public static /* synthetic */ void a(a aVar, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScrollingInvoked");
            }
            if ((i3 & 1) != 0) {
                i = -1;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            aVar.a(i, i2);
        }
    }

    void a(int i, int i2);
}
