package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b0;

/* loaded from: classes.dex */
public interface ad1 {
    View A();

    void B(b0 b0Var);

    void C(Drawable drawable);

    void D(int i);

    void E(int i);

    void F(j.a aVar, e.a aVar2);

    void G(int i);

    void H(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    CharSequence I();

    int J();

    void K(View view);

    void L();

    void M(Drawable drawable);

    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, j.a aVar);

    boolean e();

    void f();

    void g(Drawable drawable);

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    boolean i();

    boolean j();

    void k(int i);

    void l(CharSequence charSequence);

    void m(CharSequence charSequence);

    void n(int i);

    Menu o();

    int p();

    ab9 q(int i, long j);

    void r(int i);

    ViewGroup s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z);

    int u();

    void v(int i);

    void w();

    int x();

    void y(boolean z);

    void z();
}
