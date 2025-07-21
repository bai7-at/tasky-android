package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import defpackage.aj8;
import defpackage.al3;
import defpackage.c04;
import defpackage.d06;
import defpackage.dg4;
import defpackage.id5;
import defpackage.kt6;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vy4;
import defpackage.wk3;
import defpackage.ww8;
import defpackage.yu5;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements yu5 {
    private final View a;
    private final al3 b;
    private final Executor c;
    private boolean d;
    private ss2 e;
    private ss2 f;
    private TextFieldValue g;
    private androidx.compose.ui.text.input.b h;
    private List i;
    private final c04 j;
    private Rect k;
    private final CursorAnchorInfoController l;
    private final vy4 m;
    private Runnable n;

    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b implements wk3 {
        b() {
        }

        @Override // defpackage.wk3
        public void a(KeyEvent keyEvent) {
            TextInputServiceAndroid.this.o().sendKeyEvent(keyEvent);
        }

        @Override // defpackage.wk3
        public void b(e eVar) {
            int size = TextInputServiceAndroid.this.i.size();
            for (int i = 0; i < size; i++) {
                if (zq3.c(((WeakReference) TextInputServiceAndroid.this.i.get(i)).get(), eVar)) {
                    TextInputServiceAndroid.this.i.remove(i);
                    return;
                }
            }
        }

        @Override // defpackage.wk3
        public void c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            TextInputServiceAndroid.this.l.b(z, z2, z3, z4, z5, z6);
        }

        @Override // defpackage.wk3
        public void d(int i) {
            TextInputServiceAndroid.this.f.invoke(androidx.compose.ui.text.input.a.i(i));
        }

        @Override // defpackage.wk3
        public void e(List list) {
            TextInputServiceAndroid.this.e.invoke(list);
        }
    }

    public TextInputServiceAndroid(View view, d06 d06Var, al3 al3Var, Executor executor) {
        this.a = view;
        this.b = al3Var;
        this.c = executor;
        this.e = new ss2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void b(List list) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        };
        this.f = new ss2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            public final void b(int i) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((a) obj).o());
                return ww8.a;
            }
        };
        this.g = new TextFieldValue("", i.b.a(), (i) null, 4, (DefaultConstructorMarker) null);
        this.h = androidx.compose.ui.text.input.b.f.a();
        this.i = new ArrayList();
        this.j = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BaseInputConnection mo865invoke() {
                return new BaseInputConnection(TextInputServiceAndroid.this.p(), false);
            }
        });
        this.l = new CursorAnchorInfoController(d06Var, al3Var);
        this.m = new vy4(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection o() {
        return (BaseInputConnection) this.j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        vy4 vy4Var = this.m;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                s((TextInputCommand) p[i], ref$ObjectRef, ref$ObjectRef2);
                i++;
            } while (i < q);
        }
        this.m.h();
        if (zq3.c(ref$ObjectRef.element, Boolean.TRUE)) {
            t();
        }
        Boolean bool = (Boolean) ref$ObjectRef2.element;
        if (bool != null) {
            w(bool.booleanValue());
        }
        if (zq3.c(ref$ObjectRef.element, Boolean.FALSE)) {
            t();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void s(TextInputCommand textInputCommand, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        int i = a.a[textInputCommand.ordinal()];
        if (i == 1) {
            ?? r3 = Boolean.TRUE;
            ref$ObjectRef.element = r3;
            ref$ObjectRef2.element = r3;
        } else if (i == 2) {
            ?? r32 = Boolean.FALSE;
            ref$ObjectRef.element = r32;
            ref$ObjectRef2.element = r32;
        } else if ((i == 3 || i == 4) && !zq3.c(ref$ObjectRef.element, Boolean.FALSE)) {
            ref$ObjectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void t() {
        this.b.d();
    }

    private final void u(TextInputCommand textInputCommand) {
        this.m.b(textInputCommand);
        if (this.n == null) {
            Runnable runnable = new Runnable() { // from class: si8
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.v(TextInputServiceAndroid.this);
                }
            };
            this.c.execute(runnable);
            this.n = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.n = null;
        textInputServiceAndroid.r();
    }

    private final void w(boolean z) {
        if (z) {
            this.b.b();
        } else {
            this.b.e();
        }
    }

    @Override // defpackage.yu5
    public void a() {
        this.d = false;
        this.e = new ss2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            public final void b(List list) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        };
        this.f = new ss2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            public final void b(int i) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((a) obj).o());
                return ww8.a;
            }
        };
        this.k = null;
        u(TextInputCommand.StopInput);
    }

    @Override // defpackage.yu5
    public void b() {
        u(TextInputCommand.HideKeyboard);
    }

    @Override // defpackage.yu5
    public void c(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = (i.g(this.g.g(), textFieldValue2.g()) && zq3.c(this.g.f(), textFieldValue2.f())) ? false : true;
        this.g = textFieldValue2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) ((WeakReference) this.i.get(i)).get();
            if (eVar != null) {
                eVar.e(textFieldValue2);
            }
        }
        this.l.a();
        if (zq3.c(textFieldValue, textFieldValue2)) {
            if (z) {
                al3 al3Var = this.b;
                int l = i.l(textFieldValue2.g());
                int k = i.k(textFieldValue2.g());
                i f = this.g.f();
                int l2 = f != null ? i.l(f.r()) : -1;
                i f2 = this.g.f();
                al3Var.c(l, k, l2, f2 != null ? i.k(f2.r()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!zq3.c(textFieldValue.h(), textFieldValue2.h()) || (i.g(textFieldValue.g(), textFieldValue2.g()) && !zq3.c(textFieldValue.f(), textFieldValue2.f())))) {
            t();
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e eVar2 = (e) ((WeakReference) this.i.get(i2)).get();
            if (eVar2 != null) {
                eVar2.f(this.g, this.b);
            }
        }
    }

    @Override // defpackage.yu5
    public void d(kt6 kt6Var) {
        Rect rect;
        this.k = new Rect(dg4.d(kt6Var.i()), dg4.d(kt6Var.l()), dg4.d(kt6Var.j()), dg4.d(kt6Var.e()));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.yu5
    public void e(TextFieldValue textFieldValue, id5 id5Var, aj8 aj8Var, ss2 ss2Var, kt6 kt6Var, kt6 kt6Var2) {
        this.l.d(textFieldValue, id5Var, aj8Var, ss2Var, kt6Var, kt6Var2);
    }

    @Override // defpackage.yu5
    public void f() {
        u(TextInputCommand.ShowKeyboard);
    }

    @Override // defpackage.yu5
    public void g(TextFieldValue textFieldValue, androidx.compose.ui.text.input.b bVar, ss2 ss2Var, ss2 ss2Var2) {
        this.d = true;
        this.g = textFieldValue;
        this.h = bVar;
        this.e = ss2Var;
        this.f = ss2Var2;
        u(TextInputCommand.StartInput);
    }

    public final InputConnection n(EditorInfo editorInfo) {
        if (!this.d) {
            return null;
        }
        f.h(editorInfo, this.h, this.g);
        f.i(editorInfo);
        e eVar = new e(this.g, new b(), this.h.b());
        this.i.add(new WeakReference(eVar));
        return eVar;
    }

    public final View p() {
        return this.a;
    }

    public final boolean q() {
        return this.d;
    }

    public /* synthetic */ TextInputServiceAndroid(View view, d06 d06Var, al3 al3Var, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, d06Var, al3Var, (i & 8) != 0 ? f.d(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, d06 d06Var) {
        this(view, d06Var, new InputMethodManagerImpl(view), null, 8, null);
    }
}
