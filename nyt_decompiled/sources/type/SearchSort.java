package type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SearchSort {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SearchSort[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f295type;
    private final String rawValue;
    public static final SearchSort best = new SearchSort("best", 0, "best");
    public static final SearchSort newest = new SearchSort("newest", 1, "newest");
    public static final SearchSort oldest = new SearchSort("oldest", 2, "oldest");
    public static final SearchSort UNKNOWN__ = new SearchSort("UNKNOWN__", 3, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<SearchSort> getKnownEntries() {
            return i.o(SearchSort.best, SearchSort.newest, SearchSort.oldest);
        }

        public final c22 getType() {
            return SearchSort.f295type;
        }

        public final SearchSort[] knownValues() {
            return (SearchSort[]) getKnownEntries().toArray(new SearchSort[0]);
        }

        public final SearchSort safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = SearchSort.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((SearchSort) obj).getRawValue(), str)) {
                    break;
                }
            }
            SearchSort searchSort = (SearchSort) obj;
            return searchSort == null ? SearchSort.UNKNOWN__ : searchSort;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SearchSort[] $values() {
        return new SearchSort[]{best, newest, oldest, UNKNOWN__};
    }

    static {
        SearchSort[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f295type = new c22("SearchSort", i.o("best", "newest", "oldest"));
    }

    private SearchSort(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SearchSort valueOf(String str) {
        return (SearchSort) Enum.valueOf(SearchSort.class, str);
    }

    public static SearchSort[] values() {
        return (SearchSort[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
