package kotlin.text;

import defpackage.an3;
import defpackage.gf4;
import defpackage.hf4;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* loaded from: classes5.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection implements hf4 {
    final /* synthetic */ MatcherMatchResult a;

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.a = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.a.e().groupCount() + 1;
    }

    public /* bridge */ boolean c(gf4 gf4Var) {
        return super.contains(gf4Var);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof gf4) {
            return c((gf4) obj);
        }
        return false;
    }

    @Override // defpackage.hf4
    public gf4 get(int i) {
        an3 d;
        d = f.d(this.a.e(), i);
        if (d.a().intValue() < 0) {
            return null;
        }
        String group = this.a.e().group(i);
        zq3.g(group, "group(...)");
        return new gf4(group, d);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.d.r(kotlin.collections.i.Z(kotlin.collections.i.m(this)), new ss2() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            public final gf4 b(int i) {
                return MatcherMatchResult$groups$1.this.get(i);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }).iterator();
    }
}
