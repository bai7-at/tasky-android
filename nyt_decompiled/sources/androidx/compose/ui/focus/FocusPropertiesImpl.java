package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import defpackage.ss2;

/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    private boolean a = true;
    private FocusRequester b;
    private FocusRequester c;
    private FocusRequester d;
    private FocusRequester e;
    private FocusRequester f;
    private FocusRequester g;
    private FocusRequester h;
    private FocusRequester i;
    private ss2 j;
    private ss2 k;

    public FocusPropertiesImpl() {
        FocusRequester.a aVar = FocusRequester.b;
        this.b = aVar.b();
        this.c = aVar.b();
        this.d = aVar.b();
        this.e = aVar.b();
        this.f = aVar.b();
        this.g = aVar.b();
        this.h = aVar.b();
        this.i = aVar.b();
        this.j = new ss2() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
            public final FocusRequester b(int i) {
                return FocusRequester.b.b();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((d) obj).o());
            }
        };
        this.k = new ss2() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
            public final FocusRequester b(int i) {
                return FocusRequester.b.b();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((d) obj).o());
            }
        };
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester a() {
        return this.h;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester b() {
        return this.d;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public ss2 c() {
        return this.k;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester d() {
        return this.f;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester e() {
        return this.i;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester f() {
        return this.e;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void g(boolean z) {
        this.a = z;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.b;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public ss2 h() {
        return this.j;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean i() {
        return this.a;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester j() {
        return this.c;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester y() {
        return this.g;
    }
}
