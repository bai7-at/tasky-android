package kotlin.text;

import defpackage.hf4;
import defpackage.zq3;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.text.e;

/* loaded from: classes5.dex */
final class MatcherMatchResult implements e {
    private final Matcher a;
    private final CharSequence b;
    private final hf4 c;
    private List d;

    public static final class a extends kotlin.collections.a {
        a() {
        }

        @Override // kotlin.collections.AbstractCollection
        public int a() {
            return MatcherMatchResult.this.e().groupCount() + 1;
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return c((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.a, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String group = MatcherMatchResult.this.e().group(i);
            return group == null ? "" : group;
        }

        public /* bridge */ int g(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.a, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.a, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return j((String) obj);
            }
            return -1;
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        zq3.h(matcher, "matcher");
        zq3.h(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new MatcherMatchResult$groups$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult e() {
        return this.a;
    }

    @Override // kotlin.text.e
    public e.b a() {
        return e.a.a(this);
    }

    @Override // kotlin.text.e
    public List b() {
        if (this.d == null) {
            this.d = new a();
        }
        List list = this.d;
        zq3.e(list);
        return list;
    }

    @Override // kotlin.text.e
    public hf4 c() {
        return this.c;
    }
}
