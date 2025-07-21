package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bn3;

/* loaded from: classes.dex */
public final class e {
    public static final e a = new e();

    public interface a {
        int a(bn3 bn3Var, long j, int i, LayoutDirection layoutDirection);
    }

    public interface b {
        int a(bn3 bn3Var, long j, int i);
    }

    private e() {
    }

    public final b a(int i) {
        Alignment.a aVar = Alignment.a;
        return new androidx.compose.material3.b(aVar.a(), aVar.l(), i);
    }

    public final b b(int i) {
        return new i(Alignment.a.a(), i);
    }

    public final b c(int i) {
        Alignment.a aVar = Alignment.a;
        return new androidx.compose.material3.b(aVar.i(), aVar.l(), i);
    }

    public final a d(int i) {
        Alignment.a aVar = Alignment.a;
        return new androidx.compose.material3.a(aVar.j(), aVar.j(), i);
    }

    public final a e(int i) {
        return new h(androidx.compose.ui.a.a.a(), i);
    }

    public final a f(int i) {
        return new h(androidx.compose.ui.a.a.b(), i);
    }

    public final a g(int i) {
        Alignment.a aVar = Alignment.a;
        return new androidx.compose.material3.a(aVar.k(), aVar.k(), i);
    }

    public final b h(int i) {
        Alignment.a aVar = Alignment.a;
        return new androidx.compose.material3.b(aVar.l(), aVar.a(), i);
    }

    public final b i(int i) {
        return new i(Alignment.a.l(), i);
    }
}
