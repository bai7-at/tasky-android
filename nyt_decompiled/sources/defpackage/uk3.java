package defpackage;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import defpackage.bw0;

/* loaded from: classes.dex */
public abstract class uk3 {

    class a extends InputConnectionWrapper {
        final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z, b bVar) {
            super(inputConnection, z);
            this.a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(vk3.f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    public interface b {
        boolean a(vk3 vk3Var, int i, Bundle bundle);
    }

    private static b b(final View view) {
        h16.g(view);
        return new b() { // from class: tk3
            @Override // uk3.b
            public final boolean a(vk3 vk3Var, int i, Bundle bundle) {
                boolean e;
                e = uk3.e(view, vk3Var, i, bundle);
                return e;
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        ic5.d(inputConnection, "inputConnection must be non-null");
        ic5.d(editorInfo, "editorInfo must be non-null");
        ic5.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(View view, vk3 vk3Var, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                vk3Var.d();
                Parcelable parcelable = (Parcelable) vk3Var.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return k99.b0(view, new bw0.a(new ClipData(vk3Var.b(), new ClipData.Item(vk3Var.a())), 2).d(vk3Var.c()).b(bundle).a()) == null;
    }
}
