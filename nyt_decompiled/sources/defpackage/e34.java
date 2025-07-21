package defpackage;

import androidx.activity.ComponentActivity;

/* loaded from: classes4.dex */
public final class e34 implements sr7 {
    private final ComponentActivity a;

    public e34(ComponentActivity componentActivity) {
        zq3.h(componentActivity, "activity");
        this.a = componentActivity;
    }

    @Override // defpackage.sr7
    public void a() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.a.getWindow().getDecorView().getSystemUiVisibility() & (-2));
    }

    @Override // defpackage.sr7
    public void b() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.a.getWindow().getDecorView().getSystemUiVisibility() | 1);
    }
}
