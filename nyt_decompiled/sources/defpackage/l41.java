package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* loaded from: classes.dex */
final class l41 {
    public static final l41 a = new l41();

    private l41() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, kt6 kt6Var) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = g41.a().setEditorBounds(mt6.a(kt6Var));
        handwritingBounds = editorBounds.setHandwritingBounds(mt6.a(kt6Var));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
