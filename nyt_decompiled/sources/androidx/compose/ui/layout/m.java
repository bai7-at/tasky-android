package androidx.compose.ui.layout;

import defpackage.ln0;
import defpackage.yu3;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface m {

    public static final class a implements Collection, yu3 {
        private final Set a;

        public a(Set set) {
            this.a = set;
        }

        @Override // java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.a.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int c() {
            return this.a.size();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.a.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.a.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.a.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return ln0.a(this);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ln0.b(this, objArr);
        }

        public /* synthetic */ a(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
