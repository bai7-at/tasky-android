package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ak7;
import defpackage.ns8;
import defpackage.ss2;
import defpackage.yu3;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ViewGroupKt {

    public static final class a implements ak7 {
        final /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            return ViewGroupKt.d(this.a);
        }
    }

    public static final class b implements Iterator, yu3 {
        private int a;
        final /* synthetic */ ViewGroup b;

        b(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.b;
            int i = this.a;
            this.a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.b;
            int i = this.a - 1;
            this.a = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final class c implements ak7 {
        final /* synthetic */ ViewGroup a;

        public c(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            return new ns8(ViewGroupKt.b(this.a).iterator(), new ss2() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Iterator invoke(View view) {
                    ak7 b;
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup == null || (b = ViewGroupKt.b(viewGroup)) == null) {
                        return null;
                    }
                    return b.iterator();
                }
            });
        }
    }

    public static final View a(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final ak7 b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final ak7 c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final Iterator d(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
