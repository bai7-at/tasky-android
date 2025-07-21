package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import defpackage.gu1;
import defpackage.hu1;
import defpackage.it2;
import defpackage.iu1;
import defpackage.ku1;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.vo;
import java.util.Iterator;

/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, hu1 {
    private final it2 a;
    private final DragAndDropNode b = new DragAndDropNode(new ss2() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$rootDragAndDropNode$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ku1 invoke(gu1 gu1Var) {
            return null;
        }
    });
    private final vo c = new vo(0, 1, null);
    private final Modifier d = new ov4() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.ov4
        public int hashCode() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.b;
            return dragAndDropNode.hashCode();
        }

        @Override // defpackage.ov4
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public DragAndDropNode l() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.b;
            return dragAndDropNode;
        }

        @Override // defpackage.ov4
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void r(DragAndDropNode dragAndDropNode) {
        }
    };

    public DragAndDropModifierOnDragListener(it2 it2Var) {
        this.a = it2Var;
    }

    @Override // defpackage.hu1
    public void a(iu1 iu1Var) {
        this.c.add(iu1Var);
    }

    @Override // defpackage.hu1
    public boolean b(iu1 iu1Var) {
        return this.c.contains(iu1Var);
    }

    public Modifier d() {
        return this.d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        gu1 gu1Var = new gu1(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean e2 = this.b.e2(gu1Var);
                Iterator<E> it2 = this.c.iterator();
                while (it2.hasNext()) {
                    ((iu1) it2.next()).h0(gu1Var);
                }
                break;
            case 2:
                this.b.p1(gu1Var);
                break;
            case 4:
                this.b.H(gu1Var);
                break;
            case 5:
                this.b.C(gu1Var);
                break;
            case 6:
                this.b.g1(gu1Var);
                break;
        }
        return false;
    }
}
