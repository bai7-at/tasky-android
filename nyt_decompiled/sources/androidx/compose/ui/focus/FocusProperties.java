package androidx.compose.ui.focus;

import defpackage.ss2;

/* loaded from: classes.dex */
public interface FocusProperties {
    default FocusRequester a() {
        return FocusRequester.b.b();
    }

    default FocusRequester b() {
        return FocusRequester.b.b();
    }

    default ss2 c() {
        return new ss2() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            public final FocusRequester b(int i) {
                return FocusRequester.b.b();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((d) obj).o());
            }
        };
    }

    default FocusRequester d() {
        return FocusRequester.b.b();
    }

    default FocusRequester e() {
        return FocusRequester.b.b();
    }

    default FocusRequester f() {
        return FocusRequester.b.b();
    }

    void g(boolean z);

    default FocusRequester getNext() {
        return FocusRequester.b.b();
    }

    default ss2 h() {
        return new ss2() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            public final FocusRequester b(int i) {
                return FocusRequester.b.b();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((d) obj).o());
            }
        };
    }

    boolean i();

    default FocusRequester j() {
        return FocusRequester.b.b();
    }

    default FocusRequester y() {
        return FocusRequester.b.b();
    }
}
