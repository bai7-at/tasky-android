package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.c;
import androidx.compose.ui.text.input.d;
import androidx.compose.ui.text.input.f;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import defpackage.ny1;
import java.util.concurrent.Executor;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class f {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: ti8
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                f.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: ui8
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                f.f(runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j) {
        runnable.run();
    }

    private static final boolean g(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void h(EditorInfo editorInfo, b bVar, TextFieldValue textFieldValue) {
        int d = bVar.d();
        a.C0067a c0067a = a.b;
        int i = 6;
        if (a.l(d, c0067a.a())) {
            if (!bVar.g()) {
                i = 0;
            }
        } else if (a.l(d, c0067a.e())) {
            i = 1;
        } else if (a.l(d, c0067a.c())) {
            i = 2;
        } else if (a.l(d, c0067a.d())) {
            i = 5;
        } else if (a.l(d, c0067a.f())) {
            i = 7;
        } else if (a.l(d, c0067a.g())) {
            i = 3;
        } else if (a.l(d, c0067a.h())) {
            i = 4;
        } else if (!a.l(d, c0067a.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        bVar.f();
        int e = bVar.e();
        d.a aVar = d.a;
        if (d.k(e, aVar.h())) {
            editorInfo.inputType = 1;
        } else if (d.k(e, aVar.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= RecyclerView.UNDEFINED_DURATION;
        } else if (d.k(e, aVar.d())) {
            editorInfo.inputType = 2;
        } else if (d.k(e, aVar.g())) {
            editorInfo.inputType = 3;
        } else if (d.k(e, aVar.i())) {
            editorInfo.inputType = 17;
        } else if (d.k(e, aVar.c())) {
            editorInfo.inputType = 33;
        } else if (d.k(e, aVar.f())) {
            editorInfo.inputType = 129;
        } else if (d.k(e, aVar.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!d.k(e, aVar.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!bVar.g() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (a.l(bVar.d(), c0067a.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c = bVar.c();
            c.a aVar2 = c.a;
            if (c.f(c, aVar2.a())) {
                editorInfo.inputType |= ProgressEvent.PART_FAILED_EVENT_CODE;
            } else if (c.f(c, aVar2.d())) {
                editorInfo.inputType |= 8192;
            } else if (c.f(c, aVar2.c())) {
                editorInfo.inputType |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (bVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = i.n(textFieldValue.g());
        editorInfo.initialSelEnd = i.i(textFieldValue.g());
        ny1.e(editorInfo, textFieldValue.h());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e.c().x(editorInfo);
        }
    }
}
